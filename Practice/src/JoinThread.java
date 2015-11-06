/**
 * Created by arpitkhare on 10/24/15.
 */
public class JoinThread extends Thread{

    public static void main(String args[]){
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();


        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        t2.start();

    }

    public void run(){
        Thread t = new Thread();

        for(int i =  0;i<3;i++){


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hi: "+t.getName());
        }

    }
}
