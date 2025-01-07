import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. :");
        int a = sc.nextInt();
        System.out.println("Enter second no. :");
        int b= sc.nextInt();
        System.out.println("Choose an Operation:");
        System.out.println("1. +(Addition)");
        System.out.println("2. -(Subtraction)");
        System.out.println("3. *(Multiplication)");
        System.out.println("4. /(Division)");
        System.out.println("5. %(Modulo)");

        int choice = sc.nextInt();
        double result;
        switch (choice) {
            case 1: result=a+b;
                System.out.println("Result = "+ result);
                break;
            case 2: result=a-b;
            System.out.println("Result = "+ result);
            break;
            case 3: result=a*b;
            System.out.println("Result = "+ result);
            break;
            case 4:
                if (b!=0){
                    result=a/b;
                    System.out.println("Result = "+ result);
                }
                else{
                    System.out.println("Error");
                }
                break;
            case 5: result=b%a;
            System.out.println("Result = "+ result);
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
