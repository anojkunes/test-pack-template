package com.ak.project

import spock.lang.Specification

abstract class BaseTest extends Specification {
    static final String ENV = System.getenv("ENV") != null ? System.getenv("ENV").toLowerCase() : "env"

    // List of all URLs to test
    static def urls = [
            "env": [
                    service1: "url",
                    service2: "url"
            ]
    ]

    // List all the static clients
    //static UserServiceClient userServiceClient

    // setups for first time Test Pack is run
    def "setupSpec"() {
        if (ENV == null || ENV.blank) {
            assert false: "Missing a command line ENV system variable"
        }
        if (urls[ENV] == null) {
            assert false: "Invalid command line ENV system variable. Valid values:${urls.keySet()}"
        }

        // initialize clients
    }

    // calls to purge data after each test has run
    def "cleanup"() {

    }
}
