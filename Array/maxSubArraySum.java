                                                 //Brute Force Approch  [TOC = O(n)^3]
public class maxSubArraySum {
    
    public static void MaxSum(int numbers[])
    {   
        int currentSum = 0;
        int maxSum =Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            
            for(int j=i; j<numbers.length; j++)
            {
                    int end = j;
                    currentSum = 0;
                    for(int k = start; k<=end; k++)//print karana 
                {
                    currentSum += numbers[k];
                }

                System.out.println(currentSum);
                    if(maxSum < currentSum)
                {
                    maxSum = currentSum;
                } 
            }
        }
        System.out.println("Maximum Sum Of SubArray = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        MaxSum(numbers);
    }
    
}


