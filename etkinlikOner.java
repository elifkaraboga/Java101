import java.util.Scanner;

public class etkinlikOner {

    public static void main(String[] args) {

        int havaDurumu;

        Scanner inp = new Scanner(System.in);
        System.out.println("Hava durumunu giriniz: ");
        havaDurumu = inp.nextInt();

        if (havaDurumu < 5) {
            System.out.println("Etkinlik önerisi: Kayak");
    }else if (havaDurumu >= 5 && havaDurumu <= 15 ) {

        System.out.println("Etkinlik önerisi: Sinema");
    }else if (havaDurumu >= 15 && havaDurumu <= 25) {


        System.out.println("Etkinlik önerisi: Piknik");
    }else {
            System.out.println("Etkinlik önerisi: Yüzme");
        }
    }
}
