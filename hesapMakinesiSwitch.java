import java.util.Scanner;


public class hesapMakinesiSwitch {

    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch(select) {
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1*n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Sayılar 0'a bölünemez");
                } else
                System.out.println("Bölüm: " + (n1/n2));
                break;
            default:
                System.out.print("Tekrar deneyiniz ");
                break;
        }





    }
}
