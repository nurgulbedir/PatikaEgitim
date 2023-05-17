import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        int sicaklik=k.nextInt();

        if(sicaklik<5) System.out.println("Kayak öneriyorum");

        else if (sicaklik >= 5 && sicaklik <= 15) System.out.println("Sinema öneriyorum");

        else if (sicaklik > 15 && sicaklik <= 25) System.out.println("Piknik öneriyorum");

        else System.out.println("Yüzme öneriyorum");
    }
}

