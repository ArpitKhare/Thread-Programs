/**
 * Created by arpitkhare on 10/24/15.
 */
public class TicketCounter2 extends Thread {
    int buy=0;
    public TicketCounter2(int input) {

        this.buy = input;
    }

    public void run(){
        System.out.println("run2");
        for(int i =0; i<10;i++) {System.out.println("Thread 2 start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        TotalTickets tt = new TotalTickets();
        tt.m(buy);
        System.out.println("Thread 2 ends");
        /*
        System.out.println("run2: " +buy);
        TotalTickets tt = new TotalTickets();
        int tkt = tt.getTkt();
        System.out.println("tkt2 before deducting: "+tkt);

        tkt = tkt -buy;
        System.out.println("tkt2 after deducting: "+tkt);
        tt.setTkt(tkt);

         */

    }
}
