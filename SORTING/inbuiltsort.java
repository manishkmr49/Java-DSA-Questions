import java.util.Arrays;


public class inbuiltsort {
    
    public static void main(String[] args) {
        int arr[]= {8,9,6,3,2,5,1,7,4};
       Arrays.sort(arr);
    
        //rrays.sort(arr,0,4);
        
        for (int sort : arr){
            System.out.print(sort+ " ");
        }
        
        
    }
}
