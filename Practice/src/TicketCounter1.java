/**
 * Created by arpitkhare on 10/24/15.
 */
public class TicketCounter1 extends Thread{

    int buy=0;
    public TicketCounter1(int input) {

        this.buy = input;
    }

     public void run(){
         System.out.println("My name is: " + this.getThreadGroup());
         System.out.println("run1");
         for(int i =0; i<10;i++) {System.out.println("Thread 1 start");
             try {
                 Thread.sleep(1000);
                 
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
        TotalTickets tt = new TotalTickets();
        tt.m(buy);
         System.out.println("Thread 1 ends");
         // tt.setTkt();
        /*
        System.out.println("run1: " +buy);
        TotalTickets tt = new TotalTickets();
        int tkt = tt.getTkt();
        System.out.println("tkt1 before deducting: "+tkt);

        tkt = tkt -buy;
        System.out.println("tkt1 after deducting: "+tkt);
        tt.setTkt(tkt);
        * */

    }
}
