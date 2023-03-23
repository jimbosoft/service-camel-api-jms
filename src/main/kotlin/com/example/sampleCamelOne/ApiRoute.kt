package com.example.sampleCamelOne

import org.apache.camel.builder.RouteBuilder
import org.apache.camel.model.rest.RestBindingMode
import org.springframework.stereotype.Component


@Component
class ApiRoute : RouteBuilder() {

    override fun configure() {
        restConfiguration()
            //.component("undertow")
            //.bindingMode(RestBindingMode.auto)
            .contextPath("/api")
            .port("8087")

        rest()
            .get("/send")
            .id("apiCall")
            .to("direct:hello")

        from("direct:hello").id("getProcess").transform().constant("G'day")

    }

}