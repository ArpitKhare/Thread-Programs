import java.util.Scanner;

/**
 * Created by arpitkhare on 10/23/15.
 */
public class WrapperClass {
    public static void main(String args[]){
        System.out.println("Enter a value");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int multiply = Integer.parseInt(str)*10;
        System.out.println("++++"+multiply);


        String ss = new String(str);
        WrapperClass wc = new WrapperClass();
        wc.add(ss);

    }

    public void add(Object obj){

        System.out.println("obj: "+obj);
    }

}
