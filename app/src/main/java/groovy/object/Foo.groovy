package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class Foo {

    static int i

    def test() {
        assert Foo.class.getDeclaredField('i').type == int.class
        assert Foo.i.class != int.class && Foo.i.class == Integer.class
    }

}