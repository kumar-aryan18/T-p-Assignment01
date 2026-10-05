// Electricity Bill Calculator
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        ArrayList<Integer> prime = new ArrayList<>(s+1);
      
        for(int i=2;i<=s;i++){
              int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2) prime.add(i);
        }

        System.out.println(prime);

    }
}
