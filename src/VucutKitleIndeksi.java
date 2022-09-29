
import java.util.Scanner;


public class VucutKitleIndeksi {
    public static void main (String [] args){
        
       double boy, kilo, kitleIndeksi;
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz: " );
        boy = scanner.nextDouble();
        System.out.println("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();
        
        kitleIndeksi =  kilo/ (boy * boy);
        System.out.println("Kitle indeksiniz: " +kitleIndeksi);
            
        
    }
}
