import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner k = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = k.nextLine();
            System.out.print("Parolanız : ");
            password = k.nextLine();

            if (userName.equals("nurgul") && password.equals("bed123")) {
                System.out.println(":) :) :)Merhaba, Bedristan Bankasına Hoşgeldiniz(: (: (:");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = k.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = k.nextInt();
                            balance += price;
                            System.out.println("Yatırılmış olan parayla biriken toplam miktar : "+balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarı : ");
                            price = k.nextInt();
                            if (price > balance)
                                System.out.println("Bakiye yetersiz. Başka işlem yapınız!");
                            else
                                balance -= price;
                            System.out.println("Kalan para miktarı"+balance);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        default:
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }

            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            right--;

            if (right == 0)
                System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
            else
                System.out.println("Kalan Hakkınız: " + right);
        }
    }
}

