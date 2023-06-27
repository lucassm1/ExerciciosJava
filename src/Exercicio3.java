import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int EmployeeNumber, HoursWorked;
        double ValuePerHour, Wage;

        System.out.println("Enter your employee number:");
            EmployeeNumber = sc.nextInt();
        System.out.println("Enter the number of hours worked:");
            HoursWorked = sc.nextInt();

        Locale.setDefault(Locale.US);
        /*Use "," instead of "." Example: 10,50*/
        System.out.println("How much do you earn per hour worked: ");
            ValuePerHour = sc.nextDouble();
            Wage = ValuePerHour * HoursWorked;

        System.out.printf("Employee number: %d%nWage: $%.2f", EmployeeNumber, Wage);

        sc.close();
    }
}
