package praktikum5;

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}

class cat extends Hewan {
	String warna;
	int berat;
	public void identitas(String namakucing, String warnakucing, int beratkucing ) {
		cat.name = namakucing;
		warna = warnakucing;
		berat = beratkucing;
	}
	public void eat() {
		System.out.println(cat.name+" makan Wishkas");
	}
	String ambilNama() {
		return cat.name;
	}
	String ambilwarna() {
		return warna;
	}
	int ambilberat() {
		return berat;
	}
}
