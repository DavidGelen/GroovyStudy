package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class Person {
    String name
    int age

    def test() {
        def p = new Person()
        assert p.properties.keySet().containsAll(['name','age'])
    }
}