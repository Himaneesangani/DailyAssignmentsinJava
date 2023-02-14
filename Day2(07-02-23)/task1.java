import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int salary = sc.nextInt();
            if(salary > 8000){
                System.out.println("Salary is too High");
                sc.close();
                return;
            } else if (salary < 0){
                System.out.println("Salary is too Small");
                sc.close();
                return;
            }
            int shifts = sc.nextInt();
            if (shifts<0){
                System.out.println("Shifts are too Small");
                sc.close();
                return;
            } 
            double index = 0.02*shifts*salary; 
            double savings= salary - (0.5*salary) + index;
            System.out.println("Your Savings is "+ savings);
            sc.close();

        }
    }
    
}
