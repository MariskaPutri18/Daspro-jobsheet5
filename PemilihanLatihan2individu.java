import java.util.Scanner;

public class PemilihanLatihan2individu {
    public static void main(String[] args) {
        String username = "cookie";
        String password = "0109";

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = input.nextLine();

        
        if (usernameInput.equals(username) && passwordInput.equals(password)) {
            System.out.println("Login berhasil. Selamat datang, " + usernameInput + "!");
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        // Menutup scanner
        input.close();
    }

}
    
