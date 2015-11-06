import java.util.Scanner;

/**
 * Created by arpitkhare on 10/24/15.
 */
public class SynchronisedMethodClass {
    public static void main (String args[]){


        System.out.println("Total tickets available:");
        Scanner ava = new Scanner(System.in);
        int inp = ava.nextInt();
        //TotalTickets tt = new TotalTickets(inp);
        //tt.setTkt(inp);

        System.out.println("Enter number of tickets you want to buy");
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        System.out.println("Enter number of tickets you want to buy");
        Scanner in1 = new Scanner(System.in);
        int input2 = in1.nextInt();

        ThreadGroup tg = new ThreadGroup("Group1");

        TicketCounter1 c1 = new TicketCounter1(input1);



        //c1.setName("ThreadArpit");
        c1.start();

        TicketCounter2 c2 = new TicketCounter2(input2);
        c2.start();


        //System.out.println("total tkt left: "+tt.getTkt());



    }
}
