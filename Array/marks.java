import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        
        int Total, Percentage;
        int subject[] = new int [100];
        Scanner sc = new Scanner(System.in);
        
        

        subject[0] = sc.nextInt();
        subject[1] = sc.nextInt();
        subject[2] = sc.nextInt();

        System.out.println("Marks of Phy :" + subject[0]);
        System.out.println("Marks of Che :" + subject[1]);
        System.out.println("Marks of Maths :" + subject[2]);

        Total = subject[0] + subject[1] + subject[3];
        Percentage = Total/3;
        System.out.println("Total Marks = " + Total);
        System.out.println("Percentage = " + Percentage + "%");
    }
}