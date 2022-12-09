public class kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    public void informasi(){
        System.out.println("Transportasi Air dengan jenis kapal dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis kapal sedang belayar menggunakan mesin " + mesin + " dengan kecepatan yang tidak stabil" );
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis kapal sedang belayar menggunakan mesin " + mesin + " dengan kecepatan yang stabil kisaran " + kecepatan +" knot" );
    }
    public void berlabuh(){
        System.out.println("Transportasi jenis kapal berlabuh di pantai");
    }
    }

}



    





    }






















}
