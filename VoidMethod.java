package JavaDersleri.Day03;

public class VoidMethod {

    public static void main(String[] args) {

        boolean uyeMi = true;
        int uyelik = 3;
        double satisFiyati = 250;

        // uyelik 5 yıldan fazla ise %15
        // uyelik 5 yıldan az ise %10
        // uye degilse %5 indirim uygula.
        // indirim miktarı, indirimli fiyat ve normal fiyatı belirleyin

        indirimliFiyatHesapla(uyeMi, uyelik, satisFiyati);
        //   VoidMethod.indirimliFiyatHesapla(true, 8, 1000);


    }


    public static void indirimliFiyatHesapla(boolean uyeMi, int uyelik, double satisFiyati) {

        if (uyeMi) {

            if (uyelik > 5) {

                System.out.println("yuzdeOnBesIndirimMiktari: " + satisFiyati * 0.15);
                System.out.println("yuzdeOnBesIndirimliFiyat: " + (satisFiyati - satisFiyati * 0.15));
                System.out.println("normalSatis fiyati: " + satisFiyati);
            } else {

                System.out.println("yuzdeOnIndirimMiktari: " + satisFiyati * 0.10);
                System.out.println("yuzdeOnIndirimliFiyat: " + (satisFiyati - satisFiyati * 0.10));
                System.out.println("normalSatisFiyati: " + satisFiyati);
            }
            } else{
                System.out.println("yuzdeBesIndirimMiktari: " + satisFiyati * 0.05);
                System.out.println("yuzdeBesIndirimliFiyat: " + (satisFiyati - satisFiyati * 0.05));
                System.out.println("normalSatisFiyati: " + satisFiyati);
            }


        }
    }




