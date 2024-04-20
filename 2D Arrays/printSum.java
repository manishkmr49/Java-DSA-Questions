public class printSum {
    public static void main(String[] args) {
        int[][] nums = {{1,4,9} , {11,4,3}, {2,2,3}};
        int sum = 0;

        for(int j=0; j<nums[0].length; j++){
            sum += nums[j][j];
        }

        System.out.println("sum is : " + sum);
    }
}
