public class MainAPP {

 public static void mainAPP(String[] args) throws Exception {
    TransportasiAir kendaraan = new TransportasiAir(167, 25000);
    kendaraan.informasi();
    kendaraan.berlayar();
    kendaraan.berlabuh();

    System.out.println("");
    Sampan ships = new Sampan(150,7000,5);
    ships.informasi();
    ships.berlayar();
    ships.berlabuh();
    ships.berlabuh(3);

    System.out.println("");

    Kapal ferry = new Kapal(50, 10000, "Turbine");
    ferry.informasi();
    ferry.berlayar();
    ferry.berlayar(43);
    ferry.berlabuh();
}
}
