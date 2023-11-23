package PRAKTIKUM1;
import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
//		System.out.println("hello World");
//		inisialisasi variable 
		int angka1, angka2, hasil;
//		inisialisasi input user 
		Scanner input = new Scanner(System.in);
//		inputan user 
		System.out.println("==================");
		System.out.print("Program Tambah Angka");
		System.out.print("===================");
		System.out.print("\nMasukkan Angka 1 : ");
		angka1 = input.nextInt();
		
		System.out.print("Masukkan Angka 2 : ");
		angka2 = input.nextInt();
		
		hasil = angka1 + angka2; 
		System.out.println("hasilnya : "+hasil);
		
		String namaDepan, namaBelakang, fullName; 
		System.out.println("\n==================");
		System.out.print("Input Nama");
		System.out.print("==================="); 		
		System.out.print("Masukkan nama depan : ");
		namaDepan = input.next();
		System.out.print("Masukkan nama belakang : ");
		namaBelakang = input.next();
		fullName = namaDepan + " " + namaBelakang;
		System.out.println(fullName);
	}
	
}
