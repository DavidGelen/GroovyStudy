package groovy


String[] arrStr = ['Ananas', 'Banana', 'Kiwi']

def numArr = [1, 2, 3] as int[]

def matrix3 = new Integer[3][3]
assert matrix3.size() == 3

Integer[][] matrix2
matrix2 = [[1, 2], [3, 4]]
assert matrix2 instanceof Integer[][]

String[] names = ['Cédric', 'Guillaume', 'Jochen', 'Paul']
assert names[0] == 'Cédric'
names[2] = 'Blackdrag'
assert names[2] == 'Blackdrag'

