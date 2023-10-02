import java.util.Scanner;

public class ModifikasiPemilihanPercobaan218 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Nilai uas  :");
        float uas = input18.nextFloat();
        System.out.print("Milai uts  :");
        float uts = input18.nextFloat();
        System.out.print("Nilai kuis   : ");
        float kuis = input18.nextFloat();
        System.out.print("Nilai tugas  :");
        float tugas = input18.nextFloat();
    
    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
    if (total > 80 && total <= 100 ){
        System.out.println("Nilai akhir = " + total + " kategori A (Sangat Baik)");
    }
    else if (total > 73 && total <= 80 ){
        System.out.println("Nilai akhir = " + total + "kategori B+ (Lebih Dari Baik)");
    }
    else if (total > 65 && total <= 73 ){
        System.out.println("Nilai akhir = " + total + "kategori B (Baik)");
    }
    else if (total > 60 && total <= 65 ){
        System.out.println("Nilai akhir = " + total + "kategori C+ (Lebih Dari Cukup)");
    }
    else if (total > 50 && total <= 60 ){
        System.out.println("Nilai akhir = " + total + "kategori C (Cukup)");
    }
    else if (total > 39 && total <= 50 ){
        System.out.println("Nilai akhir = " + total + "kategori D (Kurang)");
    }
    else if (total <= 39 ){
        System.out.println("Nilai akhir = " + total + "kategori E (Gagal)");
    }
   
    String message = total < 65 ? "Remidi" : "Tidak remidi";
    System.out.println ("Nilai akhir =" + total + "sehingga" + message);
    
    
    input18.close();
    
    }
}
        