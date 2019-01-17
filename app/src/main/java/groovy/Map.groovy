package groovy

//关键字 *： 用于修饰map

def m1 = [c:3, d:4]
def map = [a:1, b:2, *:m1]  //*: this operator spread the contents of m1 into map
assert map == [a:1, b:2, c:3, d:4]

def m2 = [c:3, d:4]
def map2 = [a:1, b:2, *:m2, d: 8] //d这个key重新定义了值
assert map2 == [a:1, b:2, c:3, d:8]