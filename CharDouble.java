package JavaDersleri.Day03;

public class CharDouble {

    public static void main(String[] args) {

        short sayi1=20;
        double sayi2=30;
        System.out.println(sayi1+ sayi2);
        System.out.println("İki sayinin toplami : "+ sayi1+sayi2);   // parantez içine almazsan yanyana yazdırır
        System.out.println("İki sayinin toplami : "+ (sayi1+sayi2)); // bir tanesi double old. için double
                                                                     // formatında sonuç yazdırılır

        char okulArma= 'K';
        System.out.println(okulArma);

       // Soru: Bir tamsayı ve bir char değişken alın ve bunların toplamını yazdırın
        int tamSayi=8;
        char degisken='a'; // 'a' nin ascii değeri 97 dir.

        System.out.println("İki degerin toplami : "+(tamSayi + degisken)); //105




























    }
}
