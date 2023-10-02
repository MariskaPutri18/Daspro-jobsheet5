import java.util.Scanner;

public class PemilihanLatihan51{
    public static void main(String[] args) {
        Scanner input118 = new Scanner(System.in);

        System.out.print("Masukkan jarak: ");
        int jarak = input118.nextInt();

        if (jarak <= 5 ) {
            System.out.println(" Senjata yang digunakan Melee weapon");
        } else {
            System.out.println("Senjata yang digunakan ranged weapon");
        }

        input118.close();
    }
}
