package JavaDersleri.Day02;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // kullanicidan ismini, soyismini ve yasini alıp
        // ismin ilk harfini, soyismini ve yasini yazdirin
        //  girilen bilgiler: Joe Doe, 44;

        Scanner scan = new Scanner(System.in);


        System.out.println("Lutfen isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yasiniz=scan.nextInt();

        System.out.println("Girilen bilgiler: " +isim.charAt(0) +" " +soyisim+ ", "+yasiniz); // Girilen ismin ilk harfi, soyisim, yas : J Doe, 44

      }
}
