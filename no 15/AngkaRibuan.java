import java.util.Scanner;
import java.util.Locale;

public class AngkaRibuan {
  public static void main(String[] args) {

  Scanner input= new Scanner(System.in);
  int harga = input.nextInt();
  Locale bahasa = new Locale("id");

        System.out.printf(bahasa, "Rp%,d,-", harga);    
  }
}
