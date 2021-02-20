package advanced.colections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();

        pokemons.offer("Charamander");
        pokemons.offer("Pikachu");

        //paziuri kuris pirmas eileje
        System.out.println(pokemons.peek());

        //isiema pirma elementa ir parodo ji
        System.out.println(pokemons.poll());

        //po isemimo atspausdina:
        System.out.println(pokemons.peek());
    }
}
