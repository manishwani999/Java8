package optional;

import java.util.Optional;

public class Practice {
    public static void main(String[] args) {
        String s = null;
        Optional<String> name = Optional.ofNullable(s);
        System.out.println(name);
    }
}
