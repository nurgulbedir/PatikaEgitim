public class Overloading {
    static void print(){
        System.out.println("Parametresiz Metot");
    }
    static void print(int a){
        System.out.println("Parametreler: "+a);
    }
    static void print(int a, int b) {
        System.out.println("Parametreler: " + a + " ve " + b);
    }
    public static void main(String[] args) {
        print(4);
        print(3,5);
    }
}
