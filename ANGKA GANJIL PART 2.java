Hitung Angka Ganjil Part 2


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int jumlah = 0;
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int[][]A = new int[a][b];
    for (int i = 0; i < a; i++){
      for (int j = 0; j < b; j++){
        A[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < a; i++){
      for (int j = 0; j < b; j++){
        if(A[i][j]%2!=0){
          
          jumlah++;
        }
      }
      System.out.println("" + jumlah);
      jumlah = 0;
    }
  }
}