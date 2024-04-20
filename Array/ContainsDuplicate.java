import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainsDuplicate solution = new ContainsDuplicate();

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Does the array contain any duplicates? " + solution.containsDuplicate(nums));
    }
}
