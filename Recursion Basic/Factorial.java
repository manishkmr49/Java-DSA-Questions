public class Factorial {
    
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        
        int fnm1 = Fact(n-1);   //Here fnm1 = F(n-1)
        int fn = n * Fact(n-1); 
        return fn;      
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial Of " + n + " = " + Fact(n));
    }
}
