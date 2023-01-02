package JavaDersleri.Day02;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // kullanıcıdan ismini(şifresini) isteyip yazdirin


//        Scanner scan = new Scanner(System.in);
//
//       System.out.println("Lutfen sifrenizi giriniz");
//
//        int kullaniciSifresi= scan.nextInt();
//
//        System.out.println("Girilen kuıllanici sifresi : "+kullaniciSifresi);


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String kullaniciIsmi= scan.nextLine();

        System.out.println("Girilen kuıllanici ismi : "+kullaniciIsmi);

    }


}
