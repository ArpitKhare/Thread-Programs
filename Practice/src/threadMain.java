/**
 * Created by arpitkhare on 10/17/15.
 */
public class threadMain {

    public static void main(String args[]){
    threadClassA a1 = new threadClassA();
    a1.start();

    threadClassB b1 = new threadClassB();
        //implementRunnableClassB b1 = new implementRunnableClassB();

      //  Thread t = new Thread(b1);
      //  t.start();
        b1.start();

}


}



