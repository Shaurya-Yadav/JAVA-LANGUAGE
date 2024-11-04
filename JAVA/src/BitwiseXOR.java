import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to bitwise XOR Operator:");
        System.out.print("Please enter your first number:");
        int first = input.nextInt();
        System.out.print("Now, enter your second number:");
        int second = input.nextInt();

        int result = first ^ second;

        System.out.println("Result is:" + result);
    }
}
