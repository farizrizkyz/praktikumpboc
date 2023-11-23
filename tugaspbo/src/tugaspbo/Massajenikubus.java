package tugaspbo;

public class Massajenikubus {
	public static void main(String args[]) {
        // Input sisi dan massa
        double sisi = 5.0; // Sisi kubus
        double massa = 250.0; // Massa kubus

        // Hitung volume kubus
        double volume = Math.pow(sisi, 3);

        // Hitung massa jenis
        double massaJenis = massa / volume;

        // Menampilkan hasil perhitungan
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Massa kubus: " + massa);
        System.out.println(" ");
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume kubus: " + volume);
        System.out.println("Massa jenis kubus: " + massaJenis);
    }
}
