package tugaspbo;
import java.util.Scanner;

public class Hehicle {
	private String brand;
    private String model;
    private int jumlahGear;

    public Bicycle(String brand,  String model, int jumlahGear) {
        this.brand = brand;
        this.model = model;
        this.jumlahGear = jumlahGear;
    }

    public void displayInfo() {
        System.out.println("Bicycle Brand: " + brand);
        System.out.println("Bicycle Model: " + model);
        System.out.println("Jumlah Gear: " + jumlahGear);
    }
}

class Skateboard {
    private String brand;
    private String model;
    private double panjangBoard;

    public Skateboard(String brand, String model, double panjangBoard) {
        this.brand = brand;
        this.model = model;
        this.panjangBoard = panjangBoard;
    }

    public void displayInfo() {
        System.out.println("Skateboard Brand: " + brand);
        System.out.println("Skateboard Model: " + model);
        System.out.println("Panjang Board: " + panjangBoard);
    }
}

public class Main {
    public static void main(String[] args) {
        Bicycle trekBike = new Bicycle("Trek Bike", "7.4FX", 23);
        Skateboard allySkate = new Skateboard("ALLy Skate", "Rocket", 54.5);

        System.out.println("Informasi Sepeda:");
        trekBike.displayInfo();

        System.out.println("\nInformasi Skateboard:");
        allySkate.displayInfo();
    }
}