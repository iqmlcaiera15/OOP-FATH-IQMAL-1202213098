package MODUL3_IQMAL;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    perhitungan perhitungan = new perhitungan();

    boolean repeat = true;

    do {
      try {
        System.out.println("\n==PROGAM PENGHITUNG LUAS==");
        System.out.println("0. Exit");
        System.out.println("1. Kotak");
        System.out.println("2. Lingkaran");
        System.out.println("3. Trapesium");
        int data = scanner.nextInt();

        switch (data) {
          case 0:
           System.out.println("\nProgram Selesai");
            break;

          case 1:
            System.out.print("\nMasukan Panjang ");
            double sisi = scanner.nextDouble();
            perhitungan.setSquare(sisi);
            perhitungan.run();
            System.out.println("\nHasil: " + perhitungan.getSquare());
            break;

          case 2:
            System.out.print("\nMasukan Jari-jari lingkaran ");
            double radius = scanner.nextDouble();
            perhitungan.setCircle(radius);
            perhitungan.run();
            System.out.println("\nHasil: " + perhitungan.getCircle());
            break;

          case 3:
            System.out.print("\nMAsukan Panjang Trapesium : ");
            double p = scanner.nextDouble();
            System.out.print("Masukan Lebar Trapesium : ");
            double l = scanner.nextDouble();
            System.out.print("Masukan Tinggi Trapesium : ");
            double t = scanner.nextDouble();
            perhitungan.setTrapezoid(p, l, t);
            perhitungan.run();
            System.out.println("\nHasil: " + perhitungan.getTrapezoid());
            break;}

            repeat = false;


      } catch (InputMismatchException e) {
        System.out.println("\nHarus menggunakan angka");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());

      } catch (InterruptedException e) {
        System.out.println("\nProagm terinterupsi");

    } while (repeat);

    scanner.close();
 }
 }
}