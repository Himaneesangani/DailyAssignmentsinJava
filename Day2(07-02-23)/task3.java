import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0 || num> 32767)
        {
            System.out.println("Invalid Number");
            sc.close();
            return;
        }
        int temp, sum=0;
        while(num >0){
            temp= num%10;
        if(temp%2!=0){
            sum+=temp;
        }
            num/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
