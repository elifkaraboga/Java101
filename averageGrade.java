import java.util.Scanner;

public class averageGrade {

    public static void main(String[] args) {
	// Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        // Scanner sınıfını dahil et
        // Scanner sınıfını tanımlarız
        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan değer al
        System.out.println("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();
        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6;

        System.out.println("Not ortalamanız: " + ortalama);
        System.out.println(ortalama > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");
    }
}
