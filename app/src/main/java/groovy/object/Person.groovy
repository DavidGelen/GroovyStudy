package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class Person {
    String name
    int age

    def fetchAge = { age }

    def test() {
        def p = new Person()
        assert p.properties.keySet().containsAll(['name','age'])
    }

    def test2() {
        def p = new Person(name:'david')
        def cl = { name.toUpperCase() }
        cl.delegate = p
        assert cl() == 'DAVID'
    }

    def test3() {
        def p = new Person(name:'Jessica', age:42)
        def cl = p.fetchAge
        cl.delegate = p
        assert cl() == 42


    }
}