//Smart Grocery Checkout 
import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of items : ");
        int n = sc.nextInt();
        double FinalAmount =0;
        int subTotal = 0;
        for(int i=0;i<n;i++){
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            subTotal += price*quantity;
        }
    
        double discount;
        if(subTotal>=1000 && subTotal<5000){
           discount = subTotal * 0.05;
        }
        else if(subTotal>=5000&& subTotal<10000){
           discount = subTotal * 0.10;
        }
        else discount = subTotal * 0.15;
        double tax = (subTotal -discount) * 0.05;
        System.out.println("SubTotal : " + subTotal);
        System.out.println("Discount :"+discount );
        System.out.println("Tax : "+ tax);
        FinalAmount = (subTotal+tax)-discount;
        System.out.println("FinalAmount : "+ FinalAmount);

    }
}
