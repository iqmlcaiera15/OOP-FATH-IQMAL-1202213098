public class Handphone extends Perangkat {
    protected boolean sidikjari;



    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.sidikjari = sidikjari; }



    public void informasi(){
        if (sidikjari){
            System.out.println("Handphone ini memiliki drive tipe "+ driver +" dengan Ram sebanyak "+ Ram +" GB dan processor sebesar "+ processor +" Ghz. Selain itu handphone ini memiliki Fingerprint");}
        else{
            System.out.println("Handphone ini memiliki drive tipe "+ driver +" dengan Ram sebanyak "+ Ram +" GB dan processor sebesar "+ processor +" Ghz. Selain itu handphone ini TIDAK memiliki Fingerprint");}
    }

    
    public void panggilan(int no_handphone){
        System.out.println("Handphone tersebut berhasil menyambungkan panggilan ke No "+ no_handphone);}

    public void SMS(int no_handphone){
        System.out.println("Handphone tersebut berhasil mengirimkan SMS ke No "+ no_handphone);}

    public void SMS(int no_handphone1, int no_handphone2){
        System.out.println("Handphone tersebut berhasil mengirimkan SMS ke No "+ no_handphone1 +" dan ke No "+ no_handphone2);} 
    
}
