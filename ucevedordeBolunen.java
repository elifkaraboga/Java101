import java.util.Scanner;

public class ucevedordeBolunen {

    public static void main(String[] args) {

        int number;
        float average;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        average = number/2;

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(average);
            }

        }
    }
}