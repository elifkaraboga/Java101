import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double kilo, boy;

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        double indeks = (kilo/(boy*boy));

        System.out.println("Vücut kitle indeksiniz: " + indeks);

    }
}
