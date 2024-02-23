import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter your number :");
        int n = read.nextInt();
        if (n > 4999 && n < 100000 && (n % 2 == 0 || n % 4 == 0)) {
            System.out.println("This is a five digit number and even as well.");
        }
        else {
            System.out.println("The number is not five digit and it is odd as well.");

        }
    }
}
