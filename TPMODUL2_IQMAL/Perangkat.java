public class Perangkat {
    protected String driver;
    protected int Ram;
    protected float processor;


    public Perangkat(String driver, int Ram, float processor){
        this.driver = driver;
        this.Ram = Ram;
        this.processor = processor;}
        

    public void informasi(){
        System.out.println("Perangkat tersebut tidak diketahui memiliki drive "+ driver+" dengan ram sebesar " + Ram + " dan processor secepat "+ processor +" Ghz");}

    
}
