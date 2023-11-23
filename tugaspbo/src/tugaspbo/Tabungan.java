package tugaspbo;
import java.util.Scanner;

public class Tabungan {
	public static void main(String[] args) {
        // Membuat objek Scanner untuk masukan pengguna
        Scanner input = new Scanner(System.in);

        // Memasukkan saldo awal
        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = input.nextDouble();

        // Memasukkan jumlah uang yang akan ditarik
        System.out.print("Masukkan jumlah uang yang akan ditarik: ");
        double jumlahPenarikan = input.nextDouble();

        // Memeriksa apakah saldo cukup untuk penarikan
        if (saldoAwal >= jumlahPenarikan) {
            // Melakukan penarikan
            double saldoAkhir = saldoAwal - jumlahPenarikan;
            System.out.println("Penarikan sukses. Saldo anda sekarang: " + saldoAkhir);
        } else {
            System.out.println("Maaf, saldo tidak mencukupi untuk melakukan penarikan.");
        }

        // Menutup objek Scanner
        input.close();
    }
}
