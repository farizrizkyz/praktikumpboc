package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String []args) {
		String nama, warna;
		int berat;
		Scanner input = new Scanner(System.in);
		cat KucingSaya = new cat();
		
		System.out.print("Masukkan nama kucing : ");
		nama = input.next();
		
		System.out.print("Masukkan warna kucing : ");
		warna = input.next();

		System.out.print("Masukkan berat kucing : ");
		berat = input.nextInt();
		
		KucingSaya.identitas(nama, warna, berat);
		KucingSaya.eat();
		
		System.out.println("kucing "+KucingSaya.ambilNama()
		+" warnanya "+KucingSaya.ambilwarna()
		+"beratnya "+KucingSaya.ambilberat()+" kg"
		+" ada di teras");  
	}
}
