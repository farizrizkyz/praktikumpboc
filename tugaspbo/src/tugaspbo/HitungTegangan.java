package tugaspbo;

public class HitungTegangan {
	    public static void main(String args[]) {
	        // Nilai-nilai yang diberikan
	        double kuatArus = 3.0; // dalam ampere
	        double hambatan = 12.0; // dalam ohm

	        // Menghitung tegangan menggunakan hukum Ohm (V = I * R)
	        double tegangan = kuatArus * hambatan;

	        // Menampilkan hasil perhitungan
	        System.out.println("Kuat Arus: " + kuatArus + " ampere");
	        System.out.println("Hambatan: " + hambatan + " ohm");
	        System.out.println("Tegangan: " + tegangan + " volt");
	    }
	}
