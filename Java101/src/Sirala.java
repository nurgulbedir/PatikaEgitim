import java.util.Scanner;

public class Sirala {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        int a=k.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        int b=k.nextInt();

        System.out.print("3.sayıyı giriniz: ");
        int c=k.nextInt();

        if(a>b && a>c)
            if(b>c) System.out.println("a>b>c");
            else System.out.println("a>c>b");

        else if(b>a && b>c)
            if(a>c) System.out.println("b>a>c");
            else System.out.println("b>c>a");

        else if(c>a && c>b)
            if(a>b) System.out.println("c>a>b");
            else System.out.println("c>b>a");
    }
}
