package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class GreetingMachine implements Greeter {

    def test() {

        def g = new GreetingMachine()
        assert g.greet() == "Hello from a private method!"
        try {
            //assert g.greetingMessage() //Traits only support public and private methods
        } catch (MissingMethodException e) {
            println "greetingMessage is private in trait"
        }



    }



}