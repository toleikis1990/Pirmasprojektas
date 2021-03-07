package namu_darbai_02_13.trecias;

public class CarMain {
    public static void main(String[] args) {
        Car[] carArray;
        carArray = new Car[3];
        carArray[0] = new Car("BMW", "Diesel", 2003, 5000, "sedan");
        carArray[1] = new Car("Audi", "Hybrid", 2018, 20000, "Universal");
        carArray[2] = new Car("Toyota", "Diesel", 2014, 8500, "Suv");

        System.out.println(findNewestCar(carArray));
        System.out.println(findAverageCarPrice(carArray));
        System.out.println(findBigestPriceCar(carArray));
    }

    private static int findNewestCar(Car[] carArray) {
    int newestCar = 0;
    for (int i = 0; i < carArray.length; i++) {
        if (carArray[i].getYear() > newestCar) {
            newestCar = carArray[i].getYear();
        }
    }

        return newestCar;
    }
    private static String findAverageCarPrice(Car[] carArray){
        int sum = 0;
        for (int j = 0; j < carArray.length; j++){
            sum = sum + carArray[j].getPrice();
        }
        return "Average car price is: " + sum/carArray.length;
    }

    //private static String findCarTypeSedan(Car[] carArray){}


    private static int findBigestPriceCar(Car[] carArray){
        int bigestPrice = 0;
        for (int k = 0; k<carArray.length; k++){
            if (carArray[k].getPrice() > bigestPrice){
                bigestPrice = carArray[k].getPrice();
            }
        }
        return bigestPrice;
    }
}
