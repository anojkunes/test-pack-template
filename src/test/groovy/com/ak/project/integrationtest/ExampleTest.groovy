package com.ak.project.integrationtest

import com.ak.project.BaseTest
import com.ak.project.config.TestLogging

@TestLogging
class ExampleTest extends BaseTest {

    def "basic test"() {
        when:
        String name = "Tester"

        then:
        name.size() == 6
    }
}
