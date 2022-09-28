
import java.util.Scanner;


public class KdvTutarHesaplama {
    
    public static void main (String [] args){
        
        double urunTutar, kdvOraniKucuk = 0.18, kdvOraniBuyuk = 0.08, kdvliTutarKucuk, kdvliTutarBuyuk, kdvKucuk, kdvBuyuk;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ürün tutarı en az 0 Tl olmalıdır maksimum sınırı ise yoktur. Lütfen bu aralıkta tutar giriniz.");
        System.out.println("*****");
        System.out.println("Bir tutar giriniz: ");
        urunTutar = scanner.nextDouble();
         
        boolean sonuc = (urunTutar < 1000);
        kdvKucuk = urunTutar * kdvOraniKucuk;
        kdvliTutarKucuk = urunTutar + kdvKucuk;
        kdvBuyuk = urunTutar * kdvOraniBuyuk;
        kdvliTutarBuyuk = urunTutar + kdvBuyuk;
        String urunKdv = String.valueOf(sonuc ? kdvliTutarKucuk : kdvliTutarBuyuk);
        String kdvMiktarı = String.valueOf(sonuc  ? kdvKucuk: kdvBuyuk);
        System.out.println("Ürünün KDV'si: " +kdvMiktarı);
        System.out.println("Ürünün Kdv'li fiyatı: " +urunKdv);
        
        
//        if ( urunTutar <= 1000 && urunTutar >0){
//        System.out.println("Girilen tutar: " +urunTutar);
//        kdvKucuk = urunTutar * kdvOraniKucuk;
//        kdvliTutarKucuk = urunTutar + kdvKucuk;
//        System.out.println("Ürünün Kdv'li fiyatı: " +kdvliTutarKucuk);
//        }
//        else if(urunTutar > 1000){
//        System.out.println("Girilen tutar: ");
//        kdvBuyuk = urunTutar * kdvOraniBuyuk;
//        kdvliTutarBuyuk = urunTutar + kdvBuyuk;
//        System.out.println("Ürünün Kdv'li fiyatı: " +kdvliTutarBuyuk);
//        }
//        
//        else{
//            System.out.println("Lütfen belirtilen aralıkta giriniz.");
//        }
    }
}
