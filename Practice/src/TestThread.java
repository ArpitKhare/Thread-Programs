/**
 * Created by arpitkhare on 10/23/15.
 */
public class TestThread {

    public static void main (String args[]){
        ThreadC c = new ThreadC();
        Thread thread = new Thread(c);
        thread.start();
       // ThreadD d = new ThreadD();
       // d.start();

        Runnable r = new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<5;i++){
                    if(i==3) {
                        try {
                            System.out.println("Wait");
                            wait(10000);
                            Thread.sleep(5000);
                            System.out.println("Resuming");
                            notify();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                        else {
                        System.out.println("India");

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        }
                    }

                }

        };

        Thread t = new Thread(r);
        t.start();

    }

}

