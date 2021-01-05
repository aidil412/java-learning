import java.util.Scanner;

public class LulusAtauGagal {
  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   int  nilai = input.nextInt();
   if (nilai > 55){
      System.out.printf("LULUS");
   } else {
     System.out.printf("GAGAL");
   }
   
  }
}
