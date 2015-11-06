/**
 * Created by arpitkhare on 10/23/15.
 */
public class ThreadD extends Thread{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Khare");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
