public class Comprasion {
    public static void main(String[] args) {
        String S1 = "Tony";
        String S2 = "Tony";
        String S3 = new String("Tony");
        
        if(S1 == S2){
            System.out.println("S1 and S2 String are equal");
        }
        else{
            System.out.println("S1 and S2 String are not equal");
        }

        // if(S1 == S3) // ==  check at Object Level that's why here S1 aand 3 are not equal {
        //     System.out.println("S1 and S3 String are equal");
        // }
        // else{
        //     System.out.println("S1 and S3 String are Not  equal");
        // }

        if(S1.equals(S3)) //.equals check the value 
           {
               System.out.println("S1 and S3 String are equal");
           }
        else {
            System.out.println("S1 and S3 String are not equal");
        }
    }
}
