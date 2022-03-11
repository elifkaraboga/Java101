import java.util.Scanner;

public class sayiSiralama {

    public static void main(String[] args) {

        int a, b, c; // Üç sayıyı büyükten küçüğe sıralama.

        Scanner inp = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz: ");
        a = inp.nextInt();

        System.out.println("2. sayıyı giriniz : ");
        b = inp.nextInt();

        System.out.println("3. sayıyı giriniz: ");
        c = inp.nextInt();

        if ((a > b) && (a > c)) {  // A'nın en büyük olma ihtimali
            if (b > c) {

                System.out.println("a > b > c");


            } else
                System.out.println("a > c > b");

        } else if ((b > a) && (b > c)) {   // B'nin en büyük olma ihtimali
            if (a > c) {
                System.out.println("b > a > c");
            } else
                System.out.println("b > c > a");
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }
    }
}



