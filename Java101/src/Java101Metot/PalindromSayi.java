public class PalindromSayi {
    static boolean isPolindrom(int number){
        int temp=number, reservenumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reservenumber=(reservenumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == reservenumber) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(isPolindrom(232));
    }
}
