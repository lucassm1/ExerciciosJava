import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int EmployeeNumber, HoursWorked;
        double ValuePerHour, Salary;

        System.out.println("Enter your employee number:");
            EmployeeNumber = sc.nextInt();
        System.out.println("Enter the number of hours worked:");
            HoursWorked = sc.nextInt();

        Locale.setDefault(Locale.US);
        /*Use "," instead of "." Example: 10,50*/
        System.out.println("How much do you earn per hour worked: ");
            ValuePerHour = sc.nextDouble();
            Salary = ValuePerHour * HoursWorked;

        System.out.printf("Employee number: %d%nSalary: $%.2f", EmployeeNumber, Salary);

        sc.close();
    }
}
