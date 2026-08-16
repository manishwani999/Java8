package lambdaExpression;

import lambdaExpression.functionalInterfaces.StringLength;
import lambdaExpression.functionalInterfaces.Sum;

public class Lambda01 {
    public static void main(String[] args) {
        Sum s = (a, b) -> a + b;
        System.out.println("Sum is : "+s.sum(10, 20));

        StringLength length = (str) -> str.length();
        System.out.println("Length is : " + length.strLength("Manish"));
    }
}
