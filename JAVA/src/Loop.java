import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 100) {
            System.out.println(a);
            a = a + 1;
        }
        int num = 900;
        while (num >= 500) {
            System.out.println(num);
            num -= 1;
        }
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("The Number is:" + inp);
            i++;
        }
    }
}