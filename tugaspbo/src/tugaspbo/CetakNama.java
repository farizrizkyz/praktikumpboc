package tugaspbo;

public class CetakNama {
	public static void main(String args[]) {
		Scanner input = New Scanner(System.in);
        // Memasukkan nama-nama
        System.out.print("Masukkan nama-nama (pisahkan dengan koma): ");
        String inputNama = input.nextLine();

        // Memisahkan nama-nama menjadi array
        String[] namaArray = inputNama.split(",");

        // Memasukkan jumlah pencetakan
        System.out.print("Mau mencetak nama-nama berapa kali? ");
        int jumlahCetak = input.nextInt();

        // Cetak nama-nama
        for (String nama : namaArray) {
            for (int i = 0; i < jumlahCetak; i++) {
                System.out.println("Cetak ke-" + (i + 1) + ": " + nama);
            }
        }

        input.close();
    }
}