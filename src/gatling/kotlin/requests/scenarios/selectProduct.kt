package requests.scenarios

import io.gatling.javaapi.http.HttpDsl.*

val selectProduct = http("Select product")
    .get("#{productUrl}")
    .check(
        status().shouldBe(200)
    )