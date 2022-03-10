import java.util.Scanner;

public class gecmeDurumu {

    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double average = (matematik + fizik + turkce + kimya + muzik)/5;

        if (average > 55) {
            System.out.println("Sınıfı geçtiniz !");
        }else {
            System.out.println("Sınıfta kaldınız !");

            
        }

    }
}
