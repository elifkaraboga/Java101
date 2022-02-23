import java.util.Scanner;

public class daireAlaniveCevresi {
    public static void main(String[] args) {


        int r;
        
        Scanner inp  = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();
        double pi = 3.14;
        double alan = (pi*r*r);
        double cevre = (2*pi*r);
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi: " + cevre);






    }
}
