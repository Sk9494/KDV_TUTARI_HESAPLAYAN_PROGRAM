import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double amount,kdvRate=0.18,kdv,kdvliAmount;
    Scanner input = new Scanner(System.in);
    System.out.println("enter the fee amount");

     amount = input.nextDouble();

     if (amount > 0 &&  amount < 1000) {
         kdvRate = 0.18;
     } else {
         kdvRate = 0.08;
     }

         kdv = amount * kdvRate;
         kdvliAmount = amount + kdv;



         System.out.println("kdvliAmount :" + kdvliAmount);
         System.out.println("kdvsizAmount :" + amount);
         System.out.println("KDV Rate: " + kdvRate);
         System.out.println("kdvliAmount :" + kdv);


    }
}