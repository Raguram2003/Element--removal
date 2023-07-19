import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ElementRemoval {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the array size: ");
            int size = sc.nextInt();
            System.out.println("enter the array elements: ");
            Integer[] arr=new Integer[size];
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println(findAnswer(arr,size));
        }
        public static int findAnswer(Integer[] arr,int size){
            List<Integer> lst = Arrays.asList(arr);
            Collections.sort(lst, Collections.reverseOrder());

            arr = lst.toArray(new Integer[0]);
            int sum=0;
            for(int i=0;i<size;i++) {
                sum = sum + (arr[i].intValue()*(i+1)) ;
            }
            return sum;
    }
}

