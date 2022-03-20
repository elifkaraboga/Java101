import java.util.Scanner;

public class negatifSayi {
    public static void main(String[] args) {

        int sayi;
        int total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Bir sayı giriniz: ");
            sayi = inp.nextInt();
            if (sayi % 4 == 0) {
                total += sayi;
            }
        }while (sayi % 2 == 1);
            System.out.println("Sayıların toplamı: " + total);




        }
    }

