
import java.util.*;
public class Sumof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SumofEven=0, SumofOdd = 0;
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid Array Size");
        }
        int[] a = new int[n];
        System.out.println("Enter Your Values:");
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                System.out.println("Invalid Number");
            }
            else{
                a[i]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                SumofEven +=a[i];
            }
            else
            {
                SumofOdd +=a[i];
            }
        }
        if(SumofEven>SumofOdd)
        {
            System.out.println("Sum Of Even is Max:"+ SumofEven);
        }
        else{
            System.out.println("Sum Of odd is Max:"+ SumofOdd);
        }
    }    
}
