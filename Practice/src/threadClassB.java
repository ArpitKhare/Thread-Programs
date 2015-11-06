/**
 * Created by arpitkhare on 10/17/15.
 */
public class threadClassB extends Thread{


    public void run()
    {
    show();
}

    public void show(){

        for(int i = 0; i<5;i++){

            System.out.println("Hello");

            try {
                 Thread.sleep(1000);
            }

            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
