package namu_darbai_02_13.antras;

 class Dog {
     private String name;
     private int age;
     private String color;

     Dog(String name, int age, String color) {
         this.name = name;
         this.age = age;
         this.color = color;
     }

     public int getAge () {return age;}
     public String getName () {return name;}
     public String getColor () {return color;}


}
