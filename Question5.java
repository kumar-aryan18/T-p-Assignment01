import java.util.*;
public class Question5 {
    //ATM Transaction Simulator 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("InitialBalance : ");
        int initialBalance = sc.nextInt();
        System.out.println("DepositedBalance" + "D : ");
        int depositBalance = sc.nextInt();
        System.out.println("withdrawAmount " + "w :");
        int withdrawAmount = sc.nextInt();
        System.out.println("withdrawAmount " + "w :");
        int withdrawAmount01 = sc.nextInt();
        int balance =0;
        int finalBalance = 0;
        
       
        initialBalance += depositBalance;
        System.out.println("Deposit SuccessFul");
        if(withdrawAmount<initialBalance){
            System.out.println("WithDrawl SuccessFul");
            initialBalance -= withdrawAmount;
            if(withdrawAmount01<initialBalance){
                System.out.println("WithDrawl SuccessFul");
                initialBalance -= withdrawAmount01;
            }
            else System.out.println("Insuffient Balance");
        }
       

        else System.out.println("Insuffient Balance");
        finalBalance = initialBalance;
        balance = initialBalance;
        System.out.println("Balance :" + balance);
        System.out.println("finalBalance :" + finalBalance);

        


           
            


    }
}
