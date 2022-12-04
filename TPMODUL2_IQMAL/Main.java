public class Main {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("KingStone", 8, 3F);
        System.out.println("");
        perangkat.informasi();



        Laptop laptop = new Laptop("Western Design", 32, 2.5F, true);
        System.out.println("");
        laptop.informasi();
        laptop.Game("Call of Duty : Modern Warfare II");
        laptop.Email("TlkomUNiv@365.telkomuniversity.ac.id");
        laptop.Email("BojongSoang@gmail.com", "Sukabirus@gmail.com");

        

        Handphone handphone = new Handphone("Samsung S20", 12, 15F, false);
        System.out.println("");
        handphone.informasi();
        handphone.panggilan(0452522435);
        handphone.SMS(0451334324);
        handphone.SMS(0453243367, 04123721);
    }
    
}
