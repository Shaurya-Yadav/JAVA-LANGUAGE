import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to BITWISE Left Shift Operator....");
        System.out.print("Enter your number:");
        int num = input.nextInt();

        int result = num >> 1;

        System.out.println("Result is:" + result);
    }
}
