import java.util.Scanner;
public class Calcy {
     public static void main(String arga[]) {
    	 System.out.println("Hello");
    	 int num1;
    	 int num2;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter first number");
    	 num1 = sc.nextInt();
    	 System.out.println("Enter second number");
    	 num2 = sc.nextInt();
    	 System.out.println("Addition "+num1+" + "+num2+" = " +(num1+num2));
    	 System.out.println("Subraction "+num1+" - "+num2+" = " +(num1 - num2));
    	 System.out.println("Multiplication "+num1+" * "+num2+" = " +(num1 * num2));
    	 System.out.println("Division "+num1+" / "+num2+" = " +(num1 / num2));
     }
}
