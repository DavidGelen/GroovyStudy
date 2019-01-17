package groovy

int function(int x, int y, int z) {
    x*y + z
}

def args = [4,5,6]

assert function(*args) == 26 //* 操作符相当于做了拆分list的作用

args = [4]
assert function(*args,5,6) == 26

def test(String string) {
    def result = string ? 'Found' : 'Not found'

    //等价于 def result = (string!=null && string.length()>0) ? 'Found' : 'Not found'

    //displayName = user.name ? user.name : 'Anonymous'
    //displayName = user.name ?: 'Anonymous'
}

String takeString(String message) {
    assert message instanceof String
    return message
}

int fib(int n) {
    n < 2 ? 1 : fib(n-1) + fib(n-2)
}
assert fib(10) == 89

//====================================

def foo(Map args, Integer number) { "${args.name}: ${args.age}, and the number is ${number}" }
foo(name: 'Marie', age: 1, 23)
foo(23, name: 'Marie', age: 1)

//===============================

def foo(Object... args) { args.length }
assert foo() == 0
assert foo(1) == 1
assert foo(1, 2) == 2

def foo2(Object[] args) { args.length }
assert foo2() == 0
assert foo2(1) == 1
assert foo2(1, 2) == 2

















