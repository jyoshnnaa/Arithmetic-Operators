import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter option to perfom operation:" + "\n" + " 1:Addition, 2:Subtraction, 3:Multiplication, 4:Division");
      
        int option = sc.nextInt();
        
        
        switch (option) {
            case 1:
                int sum = num1 + num2;
                System.out.println(sum);
                break;
            case 2:
                int diff = num1 - num2;
                System.out.println(diff);
                break;
            case 3:
                int product = num1 * num2;
                System.out.println(product);
                break;
            case 4:
                int div = num1 / num2;
                System.out.println(div);
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        sc.close();
    }
}
