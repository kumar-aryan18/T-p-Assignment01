//Parking Fee Calculator
import java.util.*;
public class Question06 {
    public static void main(String[] args) {
        int totalCollection = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the types of Vehicle : ");
        int n = sc.nextInt();
        System.out.println("Parking Hours for Car : ");
        int c = sc.nextInt();
        System.out.println("Parking Hpurs for Bike : ");
        int b = sc.nextInt();
        System.out.println("Parking Hpurs for Truck : ");
        int t = sc.nextInt();
        int collectionc =60;
        int collectionb =30;
        int collectiont = 100;
        if(c==0) collectionc=0;
        else collectionc += (c-2)*20;
        if(b==0) collectionb=0;
        else collectionb += (b-2)*10;
        if(t==0 )collectiont=0;
        else collectiont += (t-2)*40;
        totalCollection = collectionc +collectionb + collectiont;
        System.out.println("totalCollection : "+ totalCollection);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int totalCollection = 0;

        // for (int i = 0; i < n; i++) {
        //     char type = sc.next().charAt(0);
        //     int hours = sc.nextInt();
        //     int cost = 0;

        //     switch (type) {
        //         case 'c': // Car
        //             cost = 60;
        //             if (hours > 2) {
        //                 cost += (hours - 2) * 20;
        //             }
        //             break;

        //         case 'b': // Bike
        //             cost = 20;
        //             if (hours > 2) {
        //                 cost += (hours - 2) * 10;
        //             }
        //             break;

        //         case 't': // Truck
        //             cost = 100;
        //             if (hours > 2) {
        //                 cost += (hours - 2) * 40;
        //             }
        //             break;

               
        //     }

        //     totalCollection += cost;
        // }
        // System.out.println("Total Collection: " + totalCollection);
    }
}
