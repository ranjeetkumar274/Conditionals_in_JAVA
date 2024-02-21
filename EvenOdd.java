import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt();

        if(n%2 == 0) System.out.println("The number is even.");
        if(n%2 == 1) System.out.println("The number is Odd.");


    }
}
