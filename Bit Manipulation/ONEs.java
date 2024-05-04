public class ONEs {
    public static void main(String[] args) {
        System.out.println(~ 5);
    }
}


// The reason you're getting -6 instead of 2 as output is because of how bitwise complement (~) works in Java.

// When you apply the bitwise complement operator to the integer 5, which is represented in binary as 0000 0000 0000 0000 0000 0000 0000 0101, the complement operation flips all the bits, resulting in 1111 1111 1111 1111 1111 1111 1111 1010 in two's complement form.

// Now, when you interpret this binary representation as a signed integer, it represents the value -6 due to the two's complement representation.

// So, the output of ~5 in Java is indeed -6, not 2.
