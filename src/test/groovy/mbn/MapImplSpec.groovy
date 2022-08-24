package mbn

import spock.lang.Specification

class MapImplSpec extends Specification {

    def "should put key and value"() {
        given:
            MapImpl<String, Integer> map = new MapImpl<>();

        expect:
            map.size() == 0

        when:
            map.put("one", 1)

        then:
            map.size() == 1
    }

    def "should get value given key"() {
        given:
            MapImpl<String, Integer> map = new MapImpl<>();

        when:
            map.put("one", 1)

        then:
            map.get("one") == 1
    }

    def "should get null when key does not exist"() {
        given:
            MapImpl<String, Integer> map = new MapImpl<>();

        when:
            map.put("one", 1)

        then:
            map.get("two") == null
    }

    def "should remove value given key"() {
        given:
            MapImpl<String, Integer> map = new MapImpl<>()
            map.put("one", 1)
            map.put("two", 2)
            map.put("three", 3)

        expect:
            map.size() == 3

        when:
            map.remove("two")

        then:
            map.size() == 2
    }
}