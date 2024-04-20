import java.util.Scanner;

public class example1{
    public static void main(String[] args) {
        // char arr[] = {'a', 'b' , 'c' , 'd'};
        String str = "abcd";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any name : ");
        String Name;
        Name = sc.nextLine();
        System.out.println("Output String are : " + Name);
    }
}