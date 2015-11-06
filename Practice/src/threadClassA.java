/**
 * Created by arpitkhare on 10/17/15.
 */
public class threadClassA extends Thread {


    public void run(){
        show();
    }

    public void show(){

        threadClassB b = new threadClassB();

        for(int i = 0; i<5;i++) {

            if (i == 3) {
                try {
                    System.out.println("let t2 complete first");
                    b.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else{
                    System.out.println("Hi");

                     try {
                             Thread.sleep(1000);
                          } catch (InterruptedException e) {
                                                           e.printStackTrace();
                                                            }
                    }
            }

    }

}
