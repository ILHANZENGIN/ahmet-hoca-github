package JavaDersleri.Day02;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // kullanicidan bir kelime isteyip ilk harfini yazdirin

        Scanner scan=new Scanner(System.in);

        char ilkHarf=scan.next().charAt(0);

        System.out.println("Girilen kelimenin ilk harfi : "+ilkHarf);




        // veya ikinci yol
//        Scanner scan =new Scanner(System.in);
//        System.out.println("Bir kelime girin");
//
//        String kelime= scan.nextLine();
//        System.out.println("Girilen kelimenin ilk harfi : "+ kelime.charAt(0));







    }
}
