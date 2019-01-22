package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
trait Greeter {

    private String greetingMessage() {
        'Hello from a private method!'
    }

    String greet() {
        def m = greetingMessage()
        println m
        m
    }

}