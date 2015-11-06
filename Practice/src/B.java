/**
 * Created by arpitkhare on 10/16/15.
 */
public class B extends A{

    public void display()
    {
        System.out.println("Hello !"+ super.i);
    }

    public B(int x)
    {
        super(x);
        System.out.println("Inside constructor B");
        System.out.println("BBB");
    }
}
