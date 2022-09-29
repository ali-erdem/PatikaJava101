
import java.util.Scanner;


public class Hipotenus {
    
    public static void main (String [] args){
        
        int birinciKenar, ikinciKenar, cevre, alan, u;
        double ucuncuKenar;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Üçgende hipotenüsü bulmak için üç tane tam sayı giriniz: ");
        System.out.println("Birinci kenar: ");
        birinciKenar = scanner.nextInt();
        System.out.println("İkinci kenar: ");
        ikinciKenar = scanner.nextInt();
        
        ucuncuKenar = Math.sqrt((birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar));
        System.out.println("Hipotenüs: " +ucuncuKenar);        
        u = (birinciKenar + ikinciKenar + (int)ucuncuKenar) / 2;
        cevre = 2*u;
        alan  = u * (u - birinciKenar) * (u - ikinciKenar) * (u - (int)ucuncuKenar);
        
        System.out.println("Üçgenin çevresi: " +cevre);
        System.out.println("Üçgenin alanı: " +alan);
        
      
    }
}
