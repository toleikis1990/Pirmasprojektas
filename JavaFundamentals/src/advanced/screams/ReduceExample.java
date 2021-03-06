package advanced.screams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

    //Norim padaryti taip:  "Tom : Brandon : Michael"

        String text = names.stream()
                .reduce("",(currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + " : ") + element );

        // 1-a iteracija: text = "", currentValue = "", element = "Tom"
        // 2-a iteracija: text = "", currentValue = "Tom:", element = "Brandon"
        // 3-a iteracija: text = "", currentValue = "Tom: Brandon", element = "Michael"
        // po visu iteraciju text = Tom : Brandon : Michael

        System.out.println(text);

        int num = names.stream()
                .map(name -> name.length())
                .reduce(0,
                        (currentSum, number) ->( number > 3 ? 1 : 0) + currentSum
        );
        System.out.println(num);

        // 1-a iteracija: currentSum = 0; number = 3      currentSum = 0
        // 2-a iteracija: currentSum = 0; number = 7      currentSum = 1
        // 3-a iteracija: currentSum = 1; number = 7      currentSum = 1

        // reduce(pradine reiksme, (sumine arba tarpine reiksme, iteruojama reiksme))
    }
}
