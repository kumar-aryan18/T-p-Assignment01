public class Question2 {
    //Number Classification
    public static void main(String[] args) {
         int i = 250;
        int total = 0;
        
            if(i<=100){
                total =i*5;
            }
            else if(i<=200){
                total = 100*5;
                total +=(i-100)*7;
            }
            
            else if(i>200 && i<=400){
                total = 100*5;
                total += 100*7;
                total += (i-200)*10;
            }
            else {
                total = 100*5;
                total += 100*7;
                total += 200*10;
                total += (i-400)*15;
            }
        
        
        System.out.println(total);
    
    }
}
