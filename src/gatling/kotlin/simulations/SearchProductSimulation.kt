package simulations

import io.gatling.javaapi.core.*
import io.gatling.javaapi.core.CoreDsl.*
import io.gatling.javaapi.http.HttpDsl.*
import requests.httpProtocol
import requests.scenarios.*

class SearchProductSimulation : Simulation() {
    private val feeder = csv("search.csv").random()

    private val searchAndSelect =
        exec(http("Home").get("/"))
            .pause(1)
            .feed(feeder)
            .exec(searchProduct)
            .pause(1)
            .exec(selectProduct)

    private val users = scenario("Users").exec(searchAndSelect)

    init {
        setUp(
            users.injectOpen(rampUsers(10).during(10))
        ).protocols(httpProtocol)
    }
}