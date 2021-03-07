package namu_darbai_02_13.antras;

public class DogMain {
    public static void main(String[] args) {
        Dog[] dogArray;
        dogArray = new Dog[3];
        dogArray[0] = new Dog("Meske", 4, "baltas");
        dogArray[1] = new Dog("Mirta", 8, "juodas");
        dogArray[2] = new Dog("Sargis", 6, "margas");

        System.out.println(findOldestDog(dogArray));
        System.out.println(findAverageDogAge(dogArray));
    }

    private static String findOldestDog(Dog[] dogArray) {
        String oldestDog = null;
        int oldestAge = 0;
        for (int i = 0; i < dogArray.length; i++) {
            if (dogArray[i].getAge() > oldestAge) {
            oldestAge = dogArray[i].getAge();
            oldestDog = dogArray[i].getName();
            }
        }
        return oldestDog;

    }
    private static String findAverageDogAge(Dog[] dogArray) {
        double sum = 0;
        for (int j = 0; j < dogArray.length; j++) {
            sum = sum + dogArray[j].getAge();
        }
        return "Average dog age is: " + sum/dogArray.length;
    }
}
