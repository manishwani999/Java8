package optional;

import java.util.Optional;

public class MethodsOfOptional {
    public static void main(String[] args) {
        /* ?
            isPresent() - checks whether value exist
            if empty nothing is print
        */

        Optional<String> name = Optional.of("Manish");
        Optional<String> state = Optional.empty();

        if (name.isPresent()) {
            System.out.println(name.get());
        }

        if (state.isPresent()) {
            System.out.println(state.get());
        }

        /* ?
            isEmpty() - it was introduced in Java 11
        */

        if (state.isEmpty()) {
            System.out.println("no state");
        }

        /* ?
            get() - retrieves the value
            if optional is empty you get : NoSuchElementException
        */

//  !      Bad Practice
        System.out.println(name.get());
//        System.out.println(state.get());

//   ?     Better way
        if (name.isPresent()) {
            System.out.println(name.get());
        }

        /* *
            orElse() - This is one of the most important methods
            it provides a default value if the optional is empty
        */

        String value = state.orElse("Not Available");
        System.out.println("state : "+value);




    }
}
