package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class Teacher implements Greetable {

    @Override
    String name() {
        //since name was abstract, it is required to implement it
        return null
    }

    def test() {
        def p = new Teacher()
        assert p.greeting() == 'Hello, Bob!'
    }
}