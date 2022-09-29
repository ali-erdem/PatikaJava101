
import java.util.Scanner;


public class ManavKasa {
    
    public static void main (String [] args){
        
        double armutKgFiyati = 2.14, elmaKgFiyati = 3.67, 
        domatesKgFiyati = 1.11, muzKgFiyati = 0.95, 
        patlicanKgFiyati = 5.0, kg, toplam ;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç kg armut: ");
        double armutKg = scanner.nextDouble();
        System.out.print("Kaç kg elma: ");
        double elmaKg = scanner.nextDouble();
        System.out.print("Kaç kg domates: ");
        double domatesKg = scanner.nextDouble();
        System.out.print("Kaç kg muz: ");
        double muzKg = scanner.nextDouble();
        System.out.print("Kaç kg patlıcan: ");
        double patlicanKg = scanner.nextDouble();
        
        toplam = (armutKgFiyati * armutKg) + (elmaKgFiyati * elmaKg) + (domatesKgFiyati*domatesKg) 
                + (muzKgFiyati*muzKg) + (patlicanKgFiyati*patlicanKg) ;
        
        System.out.println("Toplam: " +toplam);
        System.out.println("Yine bekleriz :D");

                
    }
}
