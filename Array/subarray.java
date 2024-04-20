public class subarray {
    
    public static void printSubarrays(int numbers[])
    {   
        int ts = 0; //Total Sub Array
        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            
            for(int j=i; j<numbers.length; j++)
            {
                    int end = j;
                    
                    for(int k = start; k<=end; k++)//print karana 
                {
                    System.out.print(numbers[k]+ "");//sub arrray
                    
                    
                }
                    ts++;
                    System.out.println();
            }
                System.out.println();
        }
            System.out.println("Total Sub Array = " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
    
}
