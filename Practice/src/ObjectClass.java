/**
 * Created by arpitkhare on 10/22/15.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class ObjectClass {

    protected String show(){System.out.println("hello"); return "hello";}

    public static void main(String args[]){

        Class cls = null;
        try {
            cls = Class.forName("ObjectClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Method []m = cls.getDeclaredMethods();
        for(int i = 0; i<m.length;i++) {
            System.out.println(m[i]);
        }
        ObjectClass oc = new ObjectClass();
        ObjectClass oc1 = new ObjectClass();
        System.out.println("####"+oc1.hashCode()); //1360875712
           System.out.println("CompareTo Strings");
        String A = "ckdcskc";
        String a = "ds";
        int val = a.compareTo(A);
        System.out.println("val: "+val);
        System.out.println("Enter any String");
        //Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Entered value is: "+str);


    }


}
