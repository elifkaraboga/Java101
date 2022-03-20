import java.util.Scanner;

public class javaExponential {

    public static void main(String[] args) {

        int num, exp;
        int total = 1;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number whose exponent is to be found: ");
        num = inp.nextInt();

        System.out.println("Üs olacak sayı: ");
        exp = inp.nextInt();

        for(int i=1; i <= exp; i++){

            total *=num;

            System.out.println("Exponentation is: " + total);

        }



    }
}
