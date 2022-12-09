public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    
        
    }
    public void informasi(){
        System.out.println("Transportasi Air berjenis tidak dikethaui dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp." +biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang belayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui sedang berlabuh");
    }
    
}





    }



}