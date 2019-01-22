package groovy.object

import groovy.transform.CompileStatic
import groovy.transform.Immutable

@CompileStatic
@Immutable
class Coordinates {
    double latitude
    double longitude

    double getAt(int idx) {
        switch (idx) {
            case 0:
                latitude
                break

            case 1:
                longitude
                break

            default:
                throw new Exception("Wrong coordinate index, use 0 or 1")
        }
    }

    def test() {
        def coordinates = new Coordinates(latitude: 43.23, longitude: 3.67)
        def (la, lo) = coordinates
        assert la == 43.23
        assert lo == 3.67
    }

}