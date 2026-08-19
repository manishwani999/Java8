package reference.methodReferences;

import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

//        Refer to static methods

        WorkInterface inter = Stuff::doStuff;
        inter.task();

        Runnable runnable = Stuff::threadTask;
        Thread d = new Thread(runnable);
        d.start();

//        Refer to non-static methods
        Stuff s = new Stuff();
        Runnable r = s::printNumbers;
        Thread t = new Thread(r);
        t.start();


//        Collection Example
        List l = List.of(10, 20, 50, 40, 42);

//      print list by lambda
        l.stream().forEach(e -> System.out.println(e));

//        print list by method reference
        l.stream().forEach(System.out::println);



    }
}
