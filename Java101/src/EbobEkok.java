import java.util.Scanner;
//EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız. EKOK = (n1*n2) / EBOB
public class EbobEkok {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int ebob=1,ekok,x=2;
        System.out.print("1.sayıyı giriniz: ");
        int n1 = k.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        int n2 = k.nextInt();
        while(x<=n1 && x<=n2){
            if(n1%x==0 && n2%x==0)
                ebob=x;
                x++;
        }
        System.out.println("EBOB = " + ebob);
        ekok=(n1*n2)/ebob;
        System.out.println("EKOK = "+ ekok);
    }
}
