package Ticket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.Random;

/**
 * Created by arpitkhare on 10/25/15.
 */
public class Generator extends Thread {
    DataOutputStream dos;
    public Generator(PipedOutputStream pos){


        try {
            new DataOutputStream(pos);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void run(){
        Random r = new Random();
        double d;
        while(true){

            try {
            d = r.nextFloat()*1000;

                dos.writeDouble(d);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
