package advanced.colections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String > visitedCities = new HashSet<>();
        visitedCities.add("Vilnius");
        visitedCities.add("Kaunas");
        visitedCities.add("Klaipeda");
        visitedCities.add("Vilnius");
        visitedCities.add("Panevezys");
        visitedCities.add("Kaunas");

        System.out.println("Original set");
        for (String city : visitedCities) {
            System.out.println(city);
        }
        System.out.println("Edited set");
        visitedCities.remove("Kaunas");
        visitedCities.remove("Ryga");
        for (String city : visitedCities){
            System.out.println(city);
        }
        if (!visitedCities.contains("Madrid")){
            System.out.println("Set does not contain Madrid");
        }
    }
}
