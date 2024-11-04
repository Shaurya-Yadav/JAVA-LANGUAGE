import java.util.Scanner;

public class BitwiseAnd{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showing Bitwise And Operator: \n");
        System.out.print("Enter the first Number:");
        int first = input.nextInt();
        System.out.print("Now, Enter the second Number:");
        int second = input.nextInt();

        int result = first & second;

        System.out.println("Result is:" + result);
    }
}