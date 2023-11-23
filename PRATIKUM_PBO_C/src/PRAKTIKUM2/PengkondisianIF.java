package PRAKTIKUM2;
import java.util.Scanner; 

public class PengkondisianIF {
	public static void main (String args[]) {
//		inisialisasi 
		int angka; 
		Scanner input = new Scanner(System.in);
//		input user 
		System.out.print("Masukkan Angka : ");
		angka = input.nextInt();
//      kondisi IF 
		if(angka < 5) {
			System.out.print("Angka yang dimasukkan kurang dari 5");
		} else {
			System.out.print("Angka yang dimasukkan lebih dari 5");
		}
	}

}
