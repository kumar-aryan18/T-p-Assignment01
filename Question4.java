//Student Result Analyzer 
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int total = 0;
        double Average = 0;
        int Failed_Subject = 0;
        int[] arr = {65,72,55,80,68};
        for(int i=0;i<arr.length;i++){
            total+= arr[i];
            Average = total/arr.length;
            
        }
        System.out.println("Total : " + total);
        System.out.println("Average : "+ Average);
        for(int j=0;j<arr.length;j++){
            if(arr[j] <40)Failed_Subject++;
        }
        System.out.println("Failed Subject :"+ Failed_Subject);

        if (Average < 50) {
           System.out.println("result :"+ "Fail");
        } 
        else System.out.println("Result :" + "Pass");
       
    }
}
