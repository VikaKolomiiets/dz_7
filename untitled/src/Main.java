import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(SolarSystem.MERCURY.distanceFromSolarMllnKm);
        System.out.println(SolarSystem.EARTH.distanceFromSolarMllnKm);
        System.out.println(SolarSystem.SATURN.distanceFromSolarMllnKm);
        System.out.println(SolarSystem.EARTH.nextPlanet.name());
        System.out.println(SolarSystem.MERCURY.nextPlanet.name());

    }



}