
import java.util.Scanner;;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid Array Size");
        }
        int[] a = new int[n];
        System.out.println("Enter Your Data:");
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
        System.out.println("Enter Cutoff Score");
        int MaxScore = sc.nextInt();
        if(MaxScore<0)
        {
            System.out.println("Invalid Score");
        }
        else{
            for(int i=1;i<n;i+=2)
            {
                if(a[i]>MaxScore)
                {
                    System.out.println(a[i-1]);
                }
            }
        }

    }
    
    
    
}
