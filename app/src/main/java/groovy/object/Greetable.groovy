package groovy.object

import groovy.transform.CompileStatic

//traits may declare abstract methods too
@CompileStatic
trait Greetable {
    abstract String name()
    String greeting() { "Hello, ${name()}!" }
}