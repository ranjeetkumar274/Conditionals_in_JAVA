import java.util.Scanner;

public class greatestofthem {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the didgit a :");
        int a = read.nextInt();
        System.out.print("Enter the didgit b :");
        int b = read.nextInt();
        System.out.print("Enter the didgit c :");
        int c = read.nextInt();
        if(a>b && a >c){
            System.out.println("a is greatest.");
        }
        else if(b>a && b>c){
            System.out.println("b is greatest.");
        }
        else{
            System.out.println(c+" : c is greatest.");
        }
    }
}
