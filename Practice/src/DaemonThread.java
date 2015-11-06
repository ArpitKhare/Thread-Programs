/**
 * Created by arpitkhare on 10/24/15.
 */
public class DaemonThread extends Thread {
    public static void main(String args[]) {

        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();

        t1.setDaemon(true);
        t1.start();

        System.out.println("State of Daemon Thread: " + t1.getState());
        t2.start();
        t3.start();

        System.out.println("State of Daemon Thread: "+t1.getState());
    }

        public void run(){
            DaemonThread t = new DaemonThread();
            System.out.println("Thread is Daemon: " + t.isDaemon());
        if(Thread.currentThread().isDaemon()){

            System.out.println(Thread.currentThread().getName()+" is a Daemon Thread");
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+" is a normal Thread");
        }
    }


}

