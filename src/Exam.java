import java.math.BigInteger;

public class Exam {
    public static void main(String[] args) {

        //How do you get the first character of "Hello World"? The last character?
        String chuoi = "Hello world";
        System.out.println(chuoi);
        System.out.println("First character: " + chuoi.substring(0, 1));
        String last = String.valueOf(chuoi.charAt(chuoi.length() - 1));
        System.out.println("Last character: " + last);

        //Using BigInt, compute
        BigInteger b;
        b = new BigInteger("2");
        int exponent = 21024;
        BigInteger result = b.pow(exponent);
        System.out.println("Gia tri cua "
                + b + " mu " + exponent + " la: " + result);


        //Write a procedure countdown(n: Int) that prints the numbers from n to 0.
        countdown(10);

        //Write a for loop for computing the product of the Unicode codes of all letters
        //in a string. For example, the product of the characters in "Hello" is 9415087488L
        convertUnicodeToAscii("Hello");

        //write String function
        take(2, "My name");
        takeRight(2, "My name");
        System.out.println("--------------------Drop----------------------");
        System.out.println(drop(2, "My name"));
        System.out.println(dropRight(2, "My name"));


    }

    static void countdown(int M) {
        while (M >= 0) {
            System.out.println(M);
            M--;
        }
    }

    static void convertUnicodeToAscii(String chuoiUnicode) {
        StringBuilder sb = new StringBuilder();
        for (char c : chuoiUnicode.toCharArray()) {
            sb.append((int) c);
        }

        BigInteger as = new BigInteger(sb.toString());
        System.out.println(as);
    }

    static void take(int Number, String chuoi) {
        for (int i = 0; i < chuoi.length(); i++) {
            if (Number == i) {
                System.out.println("Character thu " + Number + " la: " + chuoi.substring(Number - 1, Number));
            }
        }
    }

    static void takeRight(int Number, String chuoi) {
        String reverse = new StringBuffer(chuoi).reverse().toString();
        for (int i = 0; i < reverse.length(); i++) {
            if (Number == i) {
                System.out.println("Character thu " + Number + " ben phai la: " + reverse.substring(Number - 1, Number));
            }
        }
    }

    static String drop(int position, String chuoi) {
        return chuoi.substring(0, position - 1) + chuoi.substring(position);
    }

    static String dropRight(int position, String chuoi) {
        String reverse = new StringBuffer(chuoi).reverse().toString();
        String chuoi2 = reverse.substring(0, position - 1) + reverse.substring(position);
        String chuoi3 = new StringBuffer(chuoi2).reverse().toString();
        return chuoi3;
    }


}
