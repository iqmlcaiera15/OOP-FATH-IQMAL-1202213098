import java.util.Scanner;
public class User {

    public static void user( String[] args )

     Scanner key = new Scanner(System.in);
     string nama = "Iqmal"
     int pin = 1202213098;

     System.out.print("================================");
     System.out.println("SELAMAT DATANG DI RESTORAN EID");
     System.out.print("SILAKAN REGISTER TERLEBIH DAHULU ");
     System.out.print("================================");

     string entry = key.nextInt();

      while ( entry != pin );
     {
        System.out.println("\nNIM YANG ANDA MASUKAN SALAH, SILAHKAN COBA LAGI");
        System.out.print("MASUKAN PIN ");
        entry = key.nextInt();
    }


      while ( entry == pin );
      {
         System.out.println("\nREGISTER SUCCESS");
         System.out.print("NAME = IQMAL NURIADI ");
         System.out.print("PHONE NUMBER = 081354764387 ");
         

      }

    }

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
