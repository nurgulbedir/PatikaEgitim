import java.util.Scanner;
//Meyveler ve KG Fiyatları
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL
public class ManavKasa {
    public static void main(String[] args) {
    Scanner k= new Scanner(System.in);

    System.out.print("Armut kaç kilo ");
    double armut=k.nextInt();

    System.out.print("Elma kaç kilo ");
    double elma=k.nextInt();

    System.out.print("Domates kaç kilo ");
    double domates=k.nextInt();

    System.out.print("Muz kaç kilo ");
    double muz=k.nextInt();

    System.out.print("Patlıcan kaç kilo ");
    double pat=k.nextInt();


    double tutar=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5.0*pat);
        System.out.println("Toplam tutar: "+tutar+" TL");
    }
}
