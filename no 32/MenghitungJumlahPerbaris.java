import java.util.Scanner;
public class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
    int i, j, m, n;
    int matriks[][] = new int[10][10];
    int hasil[][] = new int [10][10];
    Scanner A = new Scanner(System.in);
    m = 5;
    n = 5;
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++){
        matriks[i][j] = A.nextInt();
      }
    }
    System.out.println(matriks[0][0] + matriks[0][1] + matriks[0][2] + matriks[0][3] + matriks[0][4]);
    System.out.println(matriks[1][0] + matriks[1][1] + matriks[1][2] + matriks[1][3] + matriks[1][4]);
    System.out.println(matriks[2][0] + matriks[2][1] + matriks[2][2] + matriks[2][3] + matriks[2][4]);
    System.out.println(matriks[3][0] + matriks[3][1] + matriks[3][2] + matriks[3][3] + matriks[3][4]);
    System.out.println(matriks[4][0] + matriks[4][1] + matriks[4][2] + matriks[4][3] + matriks[4][4]);
  }
}
