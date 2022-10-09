package requests.scenarios

import io.gatling.javaapi.core.CoreDsl.css
import io.gatling.javaapi.http.HttpDsl.*

val searchProduct = http("Search product")
    .get("/search/products?q=#{searchCriterion}")
    .check(
        css("a:contains('#{searchProductName}')", "href").saveAs("productUrl")
    )