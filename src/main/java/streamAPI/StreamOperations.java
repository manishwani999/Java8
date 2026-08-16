package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {


        List<Integer> list = Arrays
                .asList(10, 5, 4, 3, 2, 1, 9, 7, 8, 2, 10, 9, 7, 8, 5, 6);

        List<Integer> l = Arrays
                .asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> unsortedList = Arrays
                .asList(1, 3, 10, 5, 2, 6, 4, 7, 8, 9);


        // intermediate operations of Stream api -- no final result produced yet
        /*
            filter()    - Select elements based on condition
            map()       - Transform each element
            sorted()    - Sort elements
            distinct()  - Remove duplicates
            limit()     - Take limited elements
            skip()      - Skip elements
        */

        // Terminal operations -- final result produced
        /*
            forEach()   - Perform action on each element
            collect()   - Convert stream result into collection
            count()     - Count elements
            reduce()    - Combine elements into one result
            min()       - Find minimum
            max()       - Find maximum
        */

//        filter --> numbers >= 5
        l.stream().filter(i -> i >= 5)
                .forEach(i -> System.out.print(i + " "));

        System.out.println();

//        map --> find square of each element
        l.stream().map(i -> i * i)
                .forEach(i -> System.out.print(i + " "));

        System.out.println();

//        sorted --> sort list
        unsortedList.stream().sorted()
                .forEach(i -> System.out.print(i + " "));

        System.out.println();

//        distinct --> remove duplicates
        list.stream().distinct()
                .forEach(i -> System.out.print(i + " "));

        System.out.println();

//        count --> count numbers in list
        long count = list.stream().count();
        System.out.println("number of elements in list = " + count);

//        count even numbers in list
        count = l.stream().filter(i -> i % 2 == 0)
                .count();
        System.out.println("count of even numbers : " + count);

//        min --> find minimum value
        Optional<Integer> min = l.stream().min(Integer::compare);
        System.out.println("min: " + min);

//        find maximum value
        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println("max: " + max);

//        reduce --> it combines multiple elements of stream into a single result
        Optional<Integer> sumOfAllElements = l.stream()
                .reduce((a, b) -> a + b);
        System.out.println("sum of all elements: " + sumOfAllElements);


    }
}
