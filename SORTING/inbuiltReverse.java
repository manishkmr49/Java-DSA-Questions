import java.util.Arrays;
import java.util.Collections;

public class inbuiltReverse {
    
    public static void main(String[] args) {
        Integer arr[] = {8, 9, 6, 3, 2, 5, 1, 7, 4};
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int sort : arr) {
            System.out.print(sort + " ");
        }
    }
}

