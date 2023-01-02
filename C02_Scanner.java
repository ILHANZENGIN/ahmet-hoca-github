package JavaDersleri.Day02;

import java.util.Scanner;

public class C02_Scanner {


    public static void main(String[] args) {

        // kullanicidan yaricap alıp dairenin alanini hesaplayın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yaricap giriniz");

        double yaricap=scan.nextDouble();

        double daireninAlani=3.14 * yaricap*yaricap;

        System.out.println("Dairenin Alanı : "+ daireninAlani);  // 63.585


    }
}
