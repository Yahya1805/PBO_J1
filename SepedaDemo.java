public class SepedaDemo {
    public static void main(String[] args) {
        // Buat objek Sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        Sepeda spd3 = new Sepeda();

        // Sepeda 1
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();

        // Sepeda 2
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();

        // Sepeda 3
        spd3.setMerek("United");
        spd3.tambahKecepatan(20);
        spd3.gantiGear(1);
        spd3.cetakStatus();
    }
}
