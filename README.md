# Test Pack Template

Test pack Template that provides integration and smoke tests. 

### How to run project

use these commands below:

* Run Smoke Test: use `set ENV=dev && gradlew clean test --tests "com.ak.project.smoketest.*"` to clean and run tests
* Run Integration Test: use `set ENV=dev && gradlew clean test --tests "com.ak.project.integrationtest.*"` to clean and run tests

## Pre-requisites / Tech

* Java 11
* Groovy
* Gradle 6
* Spring Boot
* Lombok
* Spock Mock