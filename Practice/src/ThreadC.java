/**
 * Created by arpitkhare on 10/23/15.
 */
public class ThreadC implements Runnable{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Arpit");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
