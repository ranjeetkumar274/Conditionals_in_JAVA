import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = read.nextInt();
        System.out.println((n%2 == 0 ? "Even" : "Odd"));
    }
}
