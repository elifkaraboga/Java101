import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, toplamtutar;

        Scanner inp = new Scanner(System.in);

        System.out.println("Armut kaç kilo ? : ");
        armut = inp.nextDouble();
        System.out.println("Elma kaç kilo ? : ");
        elma = inp.nextDouble();
        System.out.println("Domates kaç kilo ? : ");
        domates = inp.nextDouble();
        System.out.println("Muz kaç kilo ? : ");
        muz = inp.nextDouble();
        System.out.println("Patlıcan kaç kilo ? : ");
        patlican = inp.nextDouble();

        toplamtutar = (2.14)*armut + (3.67)*elma + (1.11)*domates + (0.95)*muz + (5)*patlican;
        System.out.println("Toplam tutar: " + toplamtutar);


    }

}
