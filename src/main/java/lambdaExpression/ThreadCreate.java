package lambdaExpression;

public class ThreadCreate {
    public static void main(String[] args) {

        Runnable thread1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value of i is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("Manish");
//        t.start();


        Runnable thread2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(thread2);
        t1.start();

    }
}
