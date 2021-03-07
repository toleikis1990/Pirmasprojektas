package namu_darbai_02_13.ketvirtas;

 class Mobile {
     private String model;
     private String manufacturer;
     private int price;

     Mobile(String model, String manufacturer, int price){
         this.model = model;
         this.manufacturer = manufacturer;
         this.price = price;
     }

     public int getPrice() { return price; }
     public String getManufacturer() { return manufacturer; }
     public String getModel() { return model; }
 }
