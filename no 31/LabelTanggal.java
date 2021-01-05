import java.util.Scanner;
public class LabelTanggal {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    String[] bulan = {
      "Januari",
      "Februari",
      "Maret",
      "April",
      "Mei",
      "Juni",
      "Juli",
      "Agustus",
      "September",
      "Oktober",
      "November",
      "Desember",
    };
    int tanggal = n.nextInt ();
    int nobulan = n.nextInt ();
    int tahun = n.nextInt ();
    System.out.print ( tanggal + bulan[nobulan-1] + tahun);
  }
}