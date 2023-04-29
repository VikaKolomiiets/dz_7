
/*
Написати enum для планети сонячної системи. Клас повинен містити такі дані:
порядковий номер від сонця
віддаленість від попередньої планети (для меркурія 0) : Відстань від попередньої планети вказується явно.
віддаленість від сонця : Відстань від сонця обчислюється в конструкторі.
радіус
попередня планета
наступна планета

Точність даних не є важливою, допускається застосування невеликих чисел
 */
public enum SolarSystem {
    MERCURY(1, 0,2439.5, null),
    VENUS(2,50.3, 6052, MERCURY),
    EARTH(3,41.4,6378, VENUS),
    MARS(4, 78.6,  3396, EARTH),
    JUPITER(5, 550.5, 71492, MARS),
    SATURN(6, 653.5, 60268, JUPITER),
    URANUS(7, 1435, 25559, SATURN),
    NEPTUNE(8, 1648, 24764, URANUS);

    private final double DISTANCE_MERCURY_FROM_SUN_MLLN_KM = 57.9;
    int orderFromSun;
    double distanceFromPreviousPlanetMllnKm;
    double distanceFromSolarMllnKm;
    double radiusKm;
    SolarSystem previousPlanet;
    SolarSystem nextPlanet;

    private SolarSystem(int orderFromSun, double distanceFromPreviousPlanetMllnKm, double radiusKm, SolarSystem previousPlanet){
        this.orderFromSun = orderFromSun;
        this.distanceFromPreviousPlanetMllnKm = distanceFromPreviousPlanetMllnKm;
        this.radiusKm = radiusKm;
        this.previousPlanet = previousPlanet;
        if(previousPlanet != null){
            previousPlanet.nextPlanet = this;
        }
        this.distanceFromSolarMllnKm = getDistanceFromSolar(this.previousPlanet, this.distanceFromPreviousPlanetMllnKm);
    }

    private double getDistanceFromSolar(SolarSystem previousPlanet, double distanceFromPreviousPlanetMllnKm){
        return previousPlanet != null ? distanceFromPreviousPlanetMllnKm + previousPlanet.distanceFromSolarMllnKm : DISTANCE_MERCURY_FROM_SUN_MLLN_KM;
    }
}
