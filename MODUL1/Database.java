import java.util.List;
import java.util.ArrayList;

public class Database {
    public static void Database(String[] args) {

        int total = 0

        System.out.print("================================");
        System.out.println("PILIHAN MENU");
        System.out.print("1.MENU ");
        System.out.print("2.PILIH MENU ");
        System.out.print("3.KELUAR ");
        System.out.print("================================");

        Scanner key = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
	
		System.out.println("MASUKAN PILIHAN.");
		int entry = key.nextInt();

        while ( entry == "1" );
         System.out.print("1.bakso = Rp.10000");
         System.out.print("2.jus buah = Rp.8000");
         System.out.print("jus buah = Rp.5000");

        while ( entry == "2" );
         System.out.println("MASUKAN PILIHAN MENU.");
		 int entry1 = menu.nextInt();

          while ( entry1 == "1");
           int total+=10000
           System.out.print("1 bakso ditambahkan");
           
          while ( entry1 == "2");
           int total+=8000
           System.out.print("1 jus buah ditambahkan");

           while ( entry1 == "3");
            int total+=5000
            System.out.print("1 salad ditambahkan");
           
            
         











        
    // TODO Create List of Menu Object to Store Menu from Menu Class

    // TODO Create Method to Insert Menu to Database

    // TODO Create Method to Show Menu from Database

    // TODO Create Method to Search Menu from Database


}
