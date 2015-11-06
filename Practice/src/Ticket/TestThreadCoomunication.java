package Ticket;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by arpitkhare on 10/25/15.
 */
public class TestThreadCoomunication {
    public static void main(String args[]){

        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Generator gen = new Generator(pos);
            AverageThreadCommunication atc = new AverageThreadCommunication(pis);
            gen.start();
            atc.start();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
