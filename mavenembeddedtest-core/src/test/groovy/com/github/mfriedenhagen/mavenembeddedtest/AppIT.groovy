package com.github.mfriedenhagen.mavenembeddedtest

import spock.lang.Specification
import spock.lang.Subject

class AppIT extends Specification {
    def "Check URL"() {
        given:
        @Subject
        def url = new URL("https://www.google.de/")
        when:
        def body = url.openStream().text
        then:
        body.contains('<input class="gsfi"')
    }
}
