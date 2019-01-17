import groovy.transform.CompileStatic

@CompileStatic
class Car {
    String make
    String model

    void test() {
        def cars = [
                new Car(make: 'Peugeot', model: '508'),
                new Car(make: 'Renault', model: 'Clio')]

        //The expression cars*.make is equivalent to cars.collect{ it.make }
        def makes = cars*.make
        assert makes == ['Peugeot', 'Renault']
    }

    def test2() {
        def cars = [
                new Car(make: 'Peugeot', model: '508'),
                null,
                new Car(make: 'Renault', model: 'Clio')]
        assert cars*.make == ['Peugeot', null, 'Renault']
        //assert null*.make == null
    }
}

