import java.util.Scanner;
//traffic signal simulation
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int remaining = 0;
        int totalPassed = 0;

        for (int i = 1; i <= n; i++) {
            String signal = sc.next();
            int vehiclesWaiting = sc.nextInt();
            int totalVehicle = remaining + vehiclesWaiting;
            int passed = 0;
            if (signal.equalsIgnoreCase("R")) {
                passed = 0;
                remaining = totalVehicle;
            } 
            else if (signal.equalsIgnoreCase("Y")) {
                if (totalVehicle > 2) {
                    passed = 2;
                    remaining = totalVehicle - 2;
                } else {
                    passed = totalVehicle;
                    remaining = 0;
                }
            } 
            else if (signal.equalsIgnoreCase("G")) {
                if (totalVehicle > 10) {
                    passed = 10;
                    remaining = totalVehicle - 10;
                } else {
                    passed = totalVehicle;
                    remaining = 0;
                }
            }
            totalPassed += passed;
            System.out.println("Cycle " + i + ": Passed = " + passed + ", Remaining = " + remaining);
        }
        System.out.println("Total Passed: " + totalPassed);
        System.out.println("Final Queue: " + remaining);

       
    }
}