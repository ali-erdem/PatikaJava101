
import java.util.Scanner;


public class NotOrtalamasi {
    public static void main(String[] args) {
        int matematik, kimya, fizik, turkce, tarih, muzik;
          
          Scanner input = new Scanner(System.in);
          
          System.out.println("Matematik notunuzu giriniz: ");
          matematik = input.nextInt();
          
          System.out.println("Kimya notunuzu giriniz: ");
          kimya = input.nextInt();
          
          System.out.println("Fizik notunuzu giriniz: ");
          fizik = input.nextInt();
          
          System.out.println("Türkçe notunuzu giriniz: ");
          turkce = input.nextInt();
          
          System.out.println("Tarih notunuzu giriniz: ");
          tarih = input.nextInt();
          
          System.out.println("Müzik notunuzu giriniz: ");
          muzik = input.nextInt();
       
          int notToplam = (matematik + kimya + fizik + turkce + tarih + muzik);
          int notSonuc = (notToplam/6);
          
          System.out.println("Notlarınızın ortalaması: " +notSonuc);
          
          boolean result = notSonuc >= 60;
          String str = (result)? "Geçtiniz" : "Kaldınız";       
          
          System.out.println(str);
    }
}
