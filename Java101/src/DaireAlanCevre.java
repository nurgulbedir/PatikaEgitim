import java.util.Scanner;
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//𝜋 sayısını = 3.14 alınız.
//Formül : (𝜋 * (r*r) * 𝛼) / 360
public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        double pi=3.14;
        System.out.print("Yarıçapı giriniz: ");
        int r=k.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        double aci=k.nextInt();
        double alan=(pi*r*r);
        double cevre=(2*pi*r);
        double olcuAlan=pi*(r*r)*aci/360;
        System.out.println("Alan: "+alan);
        System.out.println("Çevre: "+cevre);
        System.out.println("Merkez açı ölçüsü ile alan: "+olcuAlan);

    }
}
