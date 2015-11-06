/**
 * Created by arpitkhare on 10/22/15.
 */
import java.util.Scanner;
public class ArrayCopyClass {

    public static void main(String args[]){
        int arr[] = new int[5];
        int []arrCopy = {2,2,2,2,2};
        for(int i = 0; i<5; i++){
            Scanner in = new Scanner(System.in);
            int j = in.nextInt();
            arr[i] = j;
            System.out.println("arr["+i+"]"+"="+j);

        }
        System.arraycopy(arr,1,arrCopy,1,3); // source array, source start position, destination array, destination start position, destination end position
        for(int i =0;i<arrCopy.length;i++){
            System.out.println(arrCopy[i]);
        }

    }
}
