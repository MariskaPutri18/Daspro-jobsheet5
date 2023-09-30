import java.util.Scanner;

public class PemilihanPercobaan118{
    public static void main(String[] args) {
        Scanner input118 = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = input118.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" bilangan genap");
        } else {
            System.out.println("Angka "+angka+" bilangan ganjil");
        }

        input118.close();
    }
}
