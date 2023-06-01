public class Recursive {
    /* program şu adımları izler:
f(1) = 1;

f(2) = f(1) + 2;

f(3) = f(2) + 3;

f(4) = f(3) + 4;
     */
    public static void main(String[] args) {
        int sonuc = toplam(5);
        System.out.println(sonuc );
    }
    public static int toplam(int k) {
        if (k > 0) {
            return k + toplam(k - 1);
        } else {
            return 0;
        }
    }
}
/* public class Main {
    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }
    public static void main(String[] args){
        System.out.println("Basamak toplami: "+basamaklarToplami(45621));
    }
}

public class Main { //faktöriyel
    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }

    public static void main(String[] args) {
        System.out.println(as(4));
    }
}
 */
