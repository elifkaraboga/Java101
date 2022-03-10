import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.println("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız !");
        }else {
            System.out.println("Bilgileriniz yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? (Y/N)"); // Yes or No (Case sensitive!)
            char controller = input.next().charAt(0);

            switch (controller) {
                case 'Y':
                    System.out.println("Yeni şifrenizi giriniz");
                    Scanner inputControl = new Scanner(System.in);
                    newPassword = inputControl.nextLine();
                    if (newPassword.equals("java123"))
                    {
            System.out.println("Yeni şifreniz eskisiyle aynı olamaz ! Tekrar deneyiniz: ");
            newPassword = inputControl.nextLine();
        }
        else{
            System.out.println("Yeni şifreniz başarıyla oluşturuldu !");

        }
        break;

        case 'N':
            break;


            }
        }

    }

}
