package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        create list and filter even numbers only
        List<Integer> list = List.of(10, 25, 2, 4, 1, 17);

//        without stream api
        List<Integer> evenList = new ArrayList<>();
        for (Integer i : list) {
            if (i%2==0) {
                evenList.add(i);
            }
        }
        System.out.println(evenList);

//        using stream api
        Stream<Integer> stream = list.stream();
        List<Integer> filtered = stream.filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filtered);


//        print numbers >= 10
        List<Integer> filterList = list.stream().filter(i->i>= 10)
                .collect(Collectors.toList());
        System.out.println(filterList);


    }
}
