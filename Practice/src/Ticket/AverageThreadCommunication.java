package Ticket;

import java.io.DataInputStream;
import java.io.PipedInputStream;

/**
 * Created by arpitkhare on 10/25/15.
 */
public class AverageThreadCommunication extends Thread{
    DataInputStream dis;
    public AverageThreadCommunication(PipedInputStream pis){
        new DataInputStream(pis);
    }

    public void run(){
        try{
            double d;

            while(true){

                d = dis.readFloat();
                System.out.println(Math.round(d));
            }
        }
        catch(Exception e){
        }
    }
}
