import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {

        double tutar, kdvOran = 0.18; //Buraya kullanıcıdan alacağımız veri
        Scanner inp = new Scanner(System.in);
        System.out.println("Tutarı giriniz: ");
        tutar = inp.nextDouble();


        double kdvTutari = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
       

    }
}
