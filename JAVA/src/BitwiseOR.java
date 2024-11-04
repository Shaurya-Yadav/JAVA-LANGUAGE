import java.util.Scanner;

public class BitwiseOR {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our bitwise OR operator");
        System.out.println("Please enter your first Number:");
        int first = input.nextInt();
        System.out.println("Now, Enter your second Number:");
        int second = input.nextInt();

        int result = first | second;

        System.out.println("Result is:" + result);
    }
}
