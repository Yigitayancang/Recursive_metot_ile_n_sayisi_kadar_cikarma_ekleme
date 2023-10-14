import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("BİR SAYI GİRİNİZ: ");
        int n = inp.nextInt();
        islemYap(n);
    }

    public static void islemYap(int n) {
        if (n <= 0) {
            System.out.println("Son değer: " + n);
            return;
        }

        System.out.println("Çıkarma: " + n);
        islemYap(n - 5);
        System.out.println("Ekleme: " + n);
    }
}
