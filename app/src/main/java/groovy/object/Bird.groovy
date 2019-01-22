package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class Bird implements FlyingAbility {

    def test() {
        def b = new Bird()
        assert b.fly() == "I'm flying!"
    }

}