public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String driver, int Ram, float processor, boolean webcam){
        super(driver, Ram, processor);
        this.webcam = webcam;}

    public void informasi(){
        if (webcam){
            System.out.println("Laptop ini mempunyai drive dengan tipe "+ driver +" dan Ram sebesar "+ Ram +" GB dan processor sebesesar "+ processor +" Ghz. Fitur lainnya adalah laptop ini juga memiliki webcam");}
        else{
            System.out.println("Laptop ini mempunyai drive dengan tipe "+ driver +" dan Ram sebesar "+ Ram +" GB dan processor sebesar "+ processor +" Ghz. Tetapi laptop ini TIDAK memiliki fitur webcam");} 
     }

    public void Game(String game){
        System.out.println("Perangkat Laptop berhasil membuka sebuah game "+ game);}

    public void Email(String kirim_email){
        System.out.println("Perangkat Laptop berhasil mengirimkan Email ke "+ kirim_email);}

    public void Email(String email, String email1){
        System.out.println("Perangkat Laptop berhasil mengirimkan Email ke "+ email +" dan ke "+ email1);}
    
}
