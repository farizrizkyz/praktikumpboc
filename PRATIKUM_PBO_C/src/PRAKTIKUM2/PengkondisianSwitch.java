package PRAKTIKUM2;
import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main(String args[]) {
// insialisasi 
	Scanner input = new Scanner(System.in);
	int angka1, angka2, hasil, perhitungan;
	String Perhitungan; 
// input user 
	System.out.print("Masukkan Angka 1 : ");
	angka1 = input.nextInt();
	System.out.print("Masukkan Angka 2 : ");
	angka2 = input.nextInt();
	System.out.print("List perhitungan : "  
			+ "\n 1 : Pertambahan"
			+ "\n 2 : Pengurangan"
			+ "\n 3 : Perkalian"
			+ "\n 4 : Pembagian"
			+ "\n Masukkan Angka Perhitungan : ");
	Perhitungan = input.next();
//kondisi switch 
	switch(Perhitungan) { 
		case "+": 
			hasil = angka1 + angka2;
			System.out.print("hasilnya adalah : "+hasil);
			break; 
		case "+": 
			hasil = angka1 + angka2;
			System.out.print("hasilnya adalah : "+hasil);
			break; 
		case "+": 
			hasil = angka1 + angka2;
			System.out.print("hasilnya adalah : "+hasil);
			break; 
		case "+": 
			hasil = angka1 + angka2;
			System.out.print("hasilnya adalah : "+hasil);
			break; 
		default: 
			System.out.print("Simbol yang dimasukkan tidak sesuai");
	}			
	}
}
