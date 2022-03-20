import java.util.Scanner;

public class sumofDigits {

    public static void main(String[] args) {

        int number, digit, sum=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        number = inp.nextInt();

        while (number>0) {

            digit = number % 10;  //finds the last digit of the number

            sum = sum + digit;

            number = number / 10 ;

            System.out.println("The result is: " + sum);



        }



    }
}
