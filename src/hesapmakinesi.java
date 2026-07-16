import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    int sayi1, sayi2;
    char islem;
    int sonuc;
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("İlk sayıyı girin:");
    sayi1 = scanner.nextInt();

    System.out.print("İkinci sayıyı girin:");
    sayi2 = scanner.nextInt();
    
    System.out.print("İşlem seçiniz (+,-,*,/,%)");
    islem = scanner.next().charAt(0);

    
    switch (islem) {
      case '+':
        sonuc = sayi1 + sayi2;
        System.out.println("Sonuç: " + sonuc);
        break;
      case '-':
        sonuc = sayi1 - sayi2;
        System.out.println("Sonuç: " + sonuc);
        break;
      case '*':
        sonuc = sayi1 * sayi2;
        System.out.println("Sonuç: " + sonuc);
        break;
      case '/':
        sonuc = sayi1 / sayi2;
        System.out.println("Sonuç: " + sonuc);
        break;
      case '%':
        sonuc = sayi1 % sayi2;
        System.out.println("Sonuç: " + sonuc);
        break;   
      default:
        System.out.println("Geçersiz işlem operatörü!");
        break;
    }  
  }
}
