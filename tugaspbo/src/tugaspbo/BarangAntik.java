package tugaspbo;

public class BarangAntik {
	private String nama;
    private int umur;

    // Konstruktor untuk inisialisasi objek BarangAntik
    public BarangAntik(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi barang antik
    public void tampilkanInfo() {
        System.out.println("Nama Barang Antik: " + nama);
        System.out.println("Umur Barang Antik: " + umur + " tahun");
    }

    public static void main(String[] args) {
        BarangAntik radioAM = new BarangAntik("Radio AM", 234);
        radioAM.tampilkanInfo();
    }
}
