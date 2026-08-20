package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args){
//        without optional
        String s = null;
//        System.out.println(s.length());  // NullPointerException

//        with optional
        Optional<String> nam = Optional.empty();
        System.out.println(nam);
        System.out.println(nam.isPresent()); // false

//        Three methods of Optional Creation
/*
        1. Optional.of()
        used only when you know the value is not null
        Optional.of() - is does not accept null
        if we provide null it throws NullPointerException
*/
        String name = "Manish Wani";
        Optional<String> optionalName = Optional.of(name);
        System.out.println(optionalName);

/*
        2. Optional.ofNullable()
        this is more flexible
        use: when the value might be null
        this is the most commonly used creation method
*/
        String state = null;
        Optional<String> optionalState = Optional.ofNullable(state);
        System.out.println(optionalState);  // Optional.empty

        state = "Maharashtra";
        Optional<String> optionalStatee = Optional.ofNullable(state);
        System.out.println(optionalStatee); // Optional[Maharashtra]

/*
        3. Optional.empty()
        - creates an Optional containing no value
*/
        Optional<String> optionalString = Optional.empty();
        System.out.println(optionalString); // Optional.empty





    }
}
