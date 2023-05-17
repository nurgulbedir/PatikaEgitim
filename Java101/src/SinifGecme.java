import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int toplam=0,say=0;

        System.out.print("Matematik notunuzu giriniz: ");
        int mat = k.nextInt();
        if(0<=mat && mat<=100) {
            toplam+=mat;
            say++;}
        else System.out.println("Not 0-100 aralığında olmalı !");

        System.out.print("Fizik notunuzu giriniz: " );
        int fizik = k.nextInt();
        if(0<=fizik && fizik<=100) {
            toplam+=+fizik;
            say++;}
        else System.out.println("Not 0-100 aralığında olmalı !");

        System.out.print("Kimya notunuzu giriniz: " );
        int kimya = k.nextInt();
        if(0<=kimya && kimya<=100) {
            toplam+=+kimya;
            say++;}
        else System.out.println("Not 0-100 aralığında olmalı !");

        System.out.print("Türkçe notunuzu giriniz: " );
        int turkce=k.nextInt();
        if(0<=turkce && turkce<=100) {
            toplam+=+turkce;
            say++;}
        else System.out.println("Not 0-100 aralığında olmalı !");

        System.out.print("Müzik notunuzu giriniz: " );
        int muzik=k.nextInt();
        if(0<=muzik && muzik<=100) {
            toplam+=+muzik;
            say++;}
        else System.out.println("Not 0-100 aralığında olmalı !");

        double ort=(double)toplam/say;

        System.out.println("Ortalama: "+ort);
        System.out.println(ort >55 ? "Geçti": "Kaldı");
    }
}
