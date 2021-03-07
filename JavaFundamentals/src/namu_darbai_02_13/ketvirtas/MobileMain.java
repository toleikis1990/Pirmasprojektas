package namu_darbai_02_13.ketvirtas;

public class MobileMain {
    public static void main(String[] args) {
        Mobile[] mobileArray;
        mobileArray = new Mobile[3];
        mobileArray[0] = new Mobile("Iphone", "Apple", 900);
        mobileArray[1] = new Mobile("Galaxy", "Samsung", 650);
        mobileArray[2] = new Mobile("Lite", "Huawey", 799);

        System.out.println();
    }


}
