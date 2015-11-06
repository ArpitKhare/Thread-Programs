/**
 * Created by arpitkhare on 10/16/15.
 */
public class A {
    int i=0;
    //char ch;

    void set(int x)
    {
        i=x;
    }
    int get()
    {
        return i;
    }

    /*public A(int x)
    {
        i=x;
        System.out.print("inside constructor"+i);
    }*/

    public A(int x)
    {
        System.out.println("Inside Constructor A"+x);
        System.out.println("AAAA");
    }
}
