public class OR {
    public static void main(String[] args) {
        System.out.println(3 | 4);
    }
}


//          RULE
//      | A | B | A OR B |
//      |---|---|--------|
//      | 0 | 0 |   0    |
//      | 0 | 1 |   1    |
//      | 1 | 0 |   1    |
//      | 1 | 1 |   1    |
