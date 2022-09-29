
import java.util.Scanner;


public class TaksiMetre {
    
    public static void main (String [] args){
       
        int km;
        double kilometreFiyati = 2.20, toplam, baslangicFiyati = 10;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gideceğiz km yazınız: ");
        km = scanner.nextInt();
        
        toplam = (km * kilometreFiyati);
        toplam += baslangicFiyati;
        
        toplam = (toplam < 20) ? 20:toplam;
        System.out.println("Toplam tutar: " +toplam);
        
        
    }
}
