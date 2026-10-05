public class Question3 {
    //Digital Sum and Product 
    public static void main(String[] args) {
        int n = 12345;
        int sum  =0;
        int product =1;
        
        while(n>0){
            sum += n%10;
            product *= n%10; 
            n =n/10;
       
        }
        
        System.out.println("Sum : " + sum);
        System.out.println("Product : " + product);
        if(n%3==0){
            System.out.println("Divisible by 3 : Yes");
        }
        else  System.out.println("Divisible by 3 : No");
    }
}
