import java.util.Scanner;

public class ikininKuvvetleri {
    public static void main(String[] args) {

        int number;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sınır sayı giriniz: ");
        number = inp.nextInt();

        for (int i = 1; i <= 100; i *= 2) {
            System.out.println(i);
        }


    }
}

