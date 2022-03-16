import java.util.Scanner;

public class biletFiyat {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int mesafe, yas, yolculuk;
        double tutar = 0; //0'dan başlat


        System.out.println("Mesafeyi km türünden giriniz :");
        mesafe = inp.nextInt();
        if (mesafe <=0) {
            System.out.println("Hatalı değer girdiniz.");
        tutar += (mesafe*0.1);
        System.out.println("İndirimsiz bilet fiyatı: " + (mesafe*0.1) + "TL");
        System.out.println("Yaşınızı giriniz:");
        yas = inp.nextInt();
        if (yas < 0) {
            System.out.println("Hatalı giriş yaptınız.");
        }else if (yas>0 && yas<12) {
            tutar -= (tutar / 2);
            System.out.println("Yaş İndirimli Bilet fiyatı: " + (tutar) + "TL");
        }else if (yas>12 && yas<24) {
                tutar -= (tutar / 10);
                System.out.println("Yaş İndirimli Bilet Fiyatı: " + (tutar) + "TL");
        }else if (yas>65){
            tutar -= ((tutar*3) /10 );
                System.out.println("Yaş İndirimli Bilet Fiyatı: " + (tutar) + "TL");
        }
        }

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculuk = inp.nextInt();

        switch (yolculuk) {

            case 1:
                System.out.println("Bilet Türüne göre bir indirim uygulanmadı.");
                break;
            case 2:
                tutar -= ((tutar*2)/10);
                tutar *= 2;
                System.out.println("Bilet Türüne göre indirim sonucu tutar : " + tutar + "TL");
                break;
            default:
                System.out.println("Hatalı değer girdiniz.");
                break;
        }

        System.out.println("Ödenecek tutar: " + tutar + "TL");



    }
}
