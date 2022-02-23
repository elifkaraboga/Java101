import java.util.Scanner;

public class taksimetreHesapla {

    public static void main(String[] args) {

        double km;

        Scanner inp = new Scanner(System.in);
        System.out.println("Gideceğiniz mesafeyi km cinsinden giriniz: ");
        km = inp.nextDouble();

        double tutar = (km * 2.20) + 10;
        tutar = (tutar <20) ? 20 : tutar;
        System.out.println("Ödenecek tutar: " + tutar);

    }
}
