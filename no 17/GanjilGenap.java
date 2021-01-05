import java.util.Scanner;

public class GanjilGenap {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
          int angka = input.nextInt();
        
        if (angka % 2 == 1){
        System.out.println ("Ganjil");
      }else{
        System.out.println ("Genap");
      }
  }
}
