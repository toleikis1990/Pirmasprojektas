package namu_darbai_02_13.trecias;

 class Car {
          private String model;
          private String engine;
          private int year;
          private int price;
          private String type;

          Car(String model, String engine, int year, int price, String type) {
              this.model = model;
              this.engine = engine;
              this.year = year;
              this.price = price;
              this. type = type;
          }

     public int getPrice() { return price; }
     public int getYear() { return year; }
     public String getEngine() { return engine; }
     public String getModel() { return model; }
     public String getType() { return type; }
 }
