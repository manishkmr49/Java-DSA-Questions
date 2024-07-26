public class SumOfNaturalNumbers {

    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        int number = 10;
        int result = sumOfNaturalNumbers(number);
        System.out.println("The sum of the first " + number + " natural numbers is " + result);
    }
}
