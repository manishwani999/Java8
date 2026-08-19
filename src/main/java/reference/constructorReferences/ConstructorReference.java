package reference.constructorReferences;

public class ConstructorReference {
    public static void main(String[] args) {

//        by using lambda
        Provider provider = () -> {
            return new Student();
        };
        Student student = provider.getStudent();
        student.display();

//        using constructor reference
        Provider p = Student::new;
        Student s = p.getStudent();
        s.display();
    }
}
