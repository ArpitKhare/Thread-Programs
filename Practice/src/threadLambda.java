/**
 * Created by arpitkhare on 10/17/15.
 */
public class threadLambda {

    public static void main(String args[]){

        new Thread(() -> new threadLambda().show("Hi")).start();

        new Thread(() -> new threadLambda().show("Hello")).start();
    }

    public static void show(String str) {
        for (int i = 0; i < 5; i++) {

            System.out.println(str);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
