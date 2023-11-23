package tugaspbo;

public class Gajipegawai {
	public static void main(String[] args) {
        // Data karyawan
        String namaKaryawan = "Rizki Adam Kurniawan";
        String alamat = "Jalan Semar Dalam 4 No 72/66";
        double uangTransport = 250000;
        double uangTunjangan = 300000;
        double gajiPokok = 4500000;
        
        // Menghitung total gaji
        double totalGaji = gajiPokok + uangTransport + uangTunjangan;

        // Menampilkan informasi karyawan dan total gaji
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Alamat: " + alamat);
        System.out.println("Uang Transport: Rp." + uangTransport);
        System.out.println("Uang Tunjangan: Rp." + uangTunjangan);
        System.out.println("Gaji Pokok: Rp." + gajiPokok);
        System.out.println("Total Gaji: Rp." + totalGaji);
    }
}