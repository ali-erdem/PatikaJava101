
import java.util.Scanner;


public class DaireAlanCevre {
   
    public static void main (String [] args){
        
        int r;
        double a;
        double pi = 3.14;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Daire için yarıçap giriniz: ");
        r = scanner.nextInt();
        
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin alanı: " +alan);
        System.out.println("Dairenin çevresi: " +cevre);
        
        System.out.println("Açı ölçüsü girin: ");
        a = scanner.nextDouble();
        double daireDilimi = (pi * (r*r) *  a) / 360;
        System.out.println("Daire diliminin alanı: " +daireDilimi);
        
    }
}
