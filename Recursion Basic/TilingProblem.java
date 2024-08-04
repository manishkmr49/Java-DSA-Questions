public class TilingProblem {
    
    public static int Problem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        //for vertical choice
        int fnm1 = Problem(n-1);

        //for Horizontal Choice
        int fnm2 = Problem(n-2);

        int toWays = fnm1+fnm2;
        return toWays;
    }
    public static void main(String[] args) {
        System.out.println(Problem(3));
    }

}
