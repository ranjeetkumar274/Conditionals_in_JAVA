import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the current price :");
        int cp = sc.nextInt();
        System.out.print("enter the selling price :");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println(sp-cp+" is the profit.");
        }
        if(sp<cp){
            System.out.println(-(sp-cp)+" is the Loss.");
        }
        if(sp == cp){
            System.out.println("there is no LOSS and no PROFIT.");
        }

    }
}
