package advanced.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.of("Hello");
        Optional<String> stringOptional2 = Optional.of("World");
        Optional<String> stringOptional3 = Optional.ofNullable(null);

        stringOptional1.ifPresent(variable -> System.out.println(variable));

        String text = stringOptional2.orElse("Tekstas");
        String value = stringOptional3.orElse("Hello World");

        System.out.println(text);
        System.out.println(value);
    }
}
