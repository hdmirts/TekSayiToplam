import java.util.Scanner;

public class teksayi {
    public static void main(String[] args) {
        int a;
        int total = 0;
        Scanner ent = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz :");
            a = ent.nextInt();
            if (a%4==0){
                total += a;
            }
        } while (a%2==0);
        System.out.print("Toplam :" + total);
    }      
}
