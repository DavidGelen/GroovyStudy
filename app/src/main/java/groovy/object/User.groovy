package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class User {
    Long id
    String name

    def test() {
        def u1 = new User(name: 'Xavier',id: 5)

    }
}