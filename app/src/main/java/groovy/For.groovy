package groovy

def case1() {
    def x = 0
    for (i in 0..9) {
        x += i
    }
    assert x == 45
}

def case2() {
    def x = 0
    for (i in [0, 1, 2, 3, 4]) {
        x += i
    }
    assert x == 10
}

def case3() {
    def array = (0..4).toArray()
    x = 0
    for (i in array) {
        x += i
    }
    assert x == 10
}

def case4() {
    def map = ['abc':1, 'def':2, 'xyz':3]
    x = 0
    for (e in map) {
        x += e.value
    }
    assert x == 6
}

def case5() {
    x = 0
    def map = ['abc':1, 'def':2, 'xyz':3]
    for (v in map.values()) {
        x += v
    }
    assert x == 6
}

def case6() {
    def text = "abc"
    def list = []
    for (c in text) {
        list.add(c)
    }
    assert list == ["a", "b", "c"]
}





























