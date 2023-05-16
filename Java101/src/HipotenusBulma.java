import java.util.Scanner;
//Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//𝑢 = (a+b+c) / 2
//Alan * Alan = kök 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("1.kenarı giriniz: ");
        int a=k.nextInt();
        System.out.println("2.kenarı giriniz: ");
        int b=k.nextInt();

        double c=Math.sqrt ((a*a)+(b*b));
        System.out.println("Hipotenus: "+c);

        double u= (a+b+c)/2;
        double alan=Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgen Alan: "+alan);
    }
}
