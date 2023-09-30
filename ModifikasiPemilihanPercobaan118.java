import java.util.Scanner;

public class ModifikasiPemilihanPercobaan118{
    public static void main(String[] args) {
        Scanner input118 = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = input118.nextInt();
        
    
        String jenisBilangan;
        jenisBilangan = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println("Angka " + angka + " bilangan " + jenisBilangan);


        input118.close();
    }
}

