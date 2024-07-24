public class PrintNum2 {
    public static void printInc(int n){
        if(n == 10){
            System.out.println(n);
            return;
        }
            System.out.print(n+ " ");
            printInc(n+1);

    }
    
    public static void main(String[] args) {
        int n = 1;
        printInc(n);
    }
}
