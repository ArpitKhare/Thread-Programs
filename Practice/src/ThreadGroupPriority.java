/**
 * Created by arpitkhare on 10/24/15.
 */
public class ThreadGroupPriority extends Thread{
    public static void main(String args[]){

        ThreadGroup tg = new ThreadGroup("Group1");
        Thread t1 = new Thread(tg,"Thread-1");

        Thread t2 = new Thread(tg,"Thread-2");
        Thread t3 = new Thread(tg, "Thread-3");

        t1.setPriority(9);
        tg.setMaxPriority(8);
        System.out.println("Priority: t1 :" + t1.getPriority()+ " : Thread Group: "+t1.getThreadGroup());

        t2.setPriority(6);
        System.out.println("Priority: t2: " + t2.getPriority()+" : Thread Group: "+t2.getThreadGroup());

        t1.setPriority(9);
        System.out.println("Priority: t1 :" + t1.getPriority());
        tg.destroy();
        System.out.println("destroyed? : "+tg.isDestroyed());

    }
}
