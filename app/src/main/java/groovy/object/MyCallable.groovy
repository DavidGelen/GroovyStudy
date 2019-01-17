package groovy.object

import groovy.transform.CompileStatic

@CompileStatic
class MyCallable {

    int call(int x) {
        2*x
    }

    def fun() {
        def mc = new MyCallable()
        assert mc.call(2) == 4
        assert mc(2) == 4
    }
}

