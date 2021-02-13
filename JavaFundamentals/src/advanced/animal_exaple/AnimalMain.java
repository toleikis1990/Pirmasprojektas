package advanced.animal_exaple;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat("white","miau",true);
        Dog dog = new Dog("samojedas","auuu",true);

        System.out.println(cat.yieldVoice());
        System.out.println(dog.yieldVoice());
    }
}
