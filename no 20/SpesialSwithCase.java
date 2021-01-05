import java.util.Scanner;

public class SpesialWithCase {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int paket = input.nextInt();
    switch (paket) {
      case 1 :
        System.out.println ("Satu\n" + "Dua\n" + "Tiga");
        break;
      case 2 :
        System.out.println ("Dua\n" + "Tiga");
        break;
      case 3 :
        System.out.println ("Tiga");
    }
  }
}
