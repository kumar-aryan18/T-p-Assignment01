//Bank Loan Eligibility & EMI Schedule
import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salary : ");
        int salary = sc.nextInt();
        System.out.println("ExistingEmi : ");
        int existingEmi= sc.nextInt();
        
        System.out.println("Credit Score : ");
        int creditScore = sc.nextInt();
        System.out.println("Enter Loan Amount : ");
        long LoanAmount  = sc.nextLong();
        System.out.println("Annul Interest : ");
        double AnnulInterest = sc.nextInt();
        System.out.println("Months : ");
        int months = sc.nextInt();
        if(salary>25000 && creditScore>=700 && salary*0.40>existingEmi){
            System.out.println("Loan Status : Eligible");
        }
        else System.out.println("Loan Status : Not Eligible");
        double maxEmi = 0.50*salary-existingEmi;
        System.out.println("MaxEmi :" + maxEmi);
        double monthlyRate = AnnulInterest / (12 * 100);

        double factor = Math.pow(1 + monthlyRate, months);
        double emi = (LoanAmount * monthlyRate * factor) / (factor - 1);

        double estimatedMonthly = (int) Math.round(emi);
        System.out.println("estimatedMonthly :" + estimatedMonthly);
    }
}
