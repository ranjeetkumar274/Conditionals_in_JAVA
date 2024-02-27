import java.util.Scanner;
public class triangle {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your 1st side : ");
        int a = read.nextInt();
        System.out.print("Enter your 2nd side : ");
        int b = read.nextInt();
        System.out.print("Enter your 3rd side : ");
        int c = read.nextInt();
        if((a+b > c) && (a+c > b) && (b+c > a)){
            System.out.println("this is a valid triangle.");

        }
        else{
            System.out.println("This is not a valid triangle.");
        }

    }
}
