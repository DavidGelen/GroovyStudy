package groovy

//关键字 *： 用于修饰map

def m1 = [c:3, d:4]
def map = [a:1, b:2, *:m1]  //*: this operator spread the contents of m1 into map
assert map == [a:1, b:2, c:3, d:4]

def m2 = [c:3, d:4]
def map2 = [a:1, b:2, *:m2, d: 8] //d这个key重新定义了值
assert map2 == [a:1, b:2, c:3, d:8]

def map3 = [:]
map3."an identifier with a space and double quotes" = "ALLOWED"
map3.'with-dash-signs-and-single-quotes' = "ALLOWED"

assert map3."an identifier with a space and double quotes" == "ALLOWED"
assert map3.'with-dash-signs-and-single-quotes' == "ALLOWED"

//=====================================================================
def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']
assert colors['red'] == '#FF0000'
assert colors.green  == '#00FF00'

colors['pink'] = '#FF00FF'
colors.yellow  = '#FFFF00'

assert colors.pink == '#FF00FF'
assert colors['yellow'] == '#FFFF00'
assert colors instanceof java.util.LinkedHashMap

assert colors.unknown == null //If you try to access a key which is not present in the map,You will retrieve a null result.

def numbers = [1: 'one', 2: 'two']
assert numbers[1] == 'one'

//=====================================

def key = 'name'
def person = [key: 'Guillaume']

assert !person.containsKey('name') //The map doesn’t contain the 'name' key
assert person.containsKey('key') //Instead, the map contains a 'key' key

person = [(key): 'Guillaume']
assert person.containsKey('name')
assert !person.containsKey('key')























