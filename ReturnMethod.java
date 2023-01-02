package JavaDersleri.Day03;

public class ReturnMethod {

    public static void main(String[] args) {

// verilen isim ve soyismin baş harfleri büyük, diğer harfleri küçük olarak yazdırın

        String isim= "BULENT";
        String soyisim= "YILMAZ";


        String isimSoyisim = isimDuzenle(isim, soyisim);

        System.out.println("ismin ilk hali : " + isim + " "+ soyisim);
        System.out.println("ismin duzenlenmis hali : "+ isimSoyisim);



    }

    private static String isimDuzenle(String isim, String soyisim) {

        String isimDuzenlenmis= isim.substring(0,1).toUpperCase()+
                                 isim.substring(1).toLowerCase();
        String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase()+
                                  soyisim.substring(1).toLowerCase();

        return isimDuzenlenmis + " " + soyisimDuzenlenmis;



























    }


}
