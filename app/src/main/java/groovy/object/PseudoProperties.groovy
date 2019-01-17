package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class PseudoProperties {

    // a pseudo property "name"
    void setName(String name) {}
    String getName() {}

    // a pseudo read-only property "age"
    int getAge() { 42 }

    // a pseudo write-only property "groovy"
    void setGroovy(boolean groovy) {  }

    def test() {
        def p = new PseudoProperties()
        p.name = 'Foo'
        assert p.age == 42
        p.groovy = true
    }

}