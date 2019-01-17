package groovy

Integer x = 123
String str = x as String //use of as will coerce it to a String

def f = 3
f **= 2
assert f == 9

def a = 2
def b = a++ * 3
assert a == 3 && b == 6

def c = 3
def d = c-- * 2
assert c == 2 && d == 6

def g = 4
def h = --g + 1
assert g == 3 && h == 4