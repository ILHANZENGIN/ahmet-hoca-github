package JavaDersleri.Day02;

import java.util.Scanner;

public class AB01_Scanner {

    public static <Char> void main(String[] args) {

//        //Farklı uc data turunde variable yazdirin

//        String okulIsmi="Yildiz Koleji";
//
//        System.out.println(okulIsmi);
//
//        int kurulusYili=1998;
//        System.out.println(kurulusYili);
//
//        char sembol='R';
//        System.out.println(sembol);


// kullanıcıdan ismini alip ilk harfini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");

       char ilkHarf=scan.next().charAt(0);

        System.out.println("İsmin baş harfi: " + ilkHarf );
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz...");
//        char ilkHarf= scan.next().charAt(0);
//        System.out.println("Girdiginiz ismin ilk harfi: " + ilkHarf);
//
    }


}
