package mbn

import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "1 + 1 = 2"() {
        given:
            int a = 1
            int b = 1

        when:
            int result = new Calculator(new AppLogger()).add(a, b)

        then:
            result == 2
    }
}