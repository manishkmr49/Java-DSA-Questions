public class MinValue {
    
    public static int getMinimum(int numbers[]) {
        int minimum = Integer.MAX_VALUE; // +infinity

        for(int i = 0; i < numbers.length; i++) {
            if(minimum > numbers[i]) {
                minimum = numbers[i];
            }
        }
        
        return minimum;
    }

    public static void main(String[] args) {
        int numbers[] = {45,24,35,26,67,43,34,21};
        System.out.println("Minimum Number is : " + getMinimum(numbers));
    } 
}
