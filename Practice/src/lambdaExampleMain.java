/**
 * Created by arpitkhare on 10/17/15.
 */
public class lambdaExampleMain {
    public static void main(String args[]) {
        threadClassA a1 = new threadClassA();
        a1.start();


        Thread t = new Thread( () ->

        {

            for (int i = 0; i < 5; i++) {

                System.out.println("Hello");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        );
        t.run();

    }
}
