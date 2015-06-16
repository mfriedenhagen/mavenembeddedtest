package com.github.mfriedenhagen.mavenembeddedtest

import spock.lang.Specification
import spock.lang.Subject

class AppTest extends Specification {
    def "executes main"() {
        given:
        @Subject
        App subjectUnderTest = new App()
        expect:
        subjectUnderTest != null
    }
}
