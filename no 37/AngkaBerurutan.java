public class AngkaBerurutan {
  static int ujian() {
  
    int angka[] = {3,2,4,5,3,6,7,9};
	int arrayTerurut[] = new int [angka.length];
	int inisialJumlah = 1;

		for (int i = 0,i < angka.length; i++){
		system.out.println (inisialJumlah);
		int nilai1 = angka [i]
		
		if (i < angka.length - 1) {
			int nilai1Plus1 = angka [i+1];
		
		if (nilai1 < nilai1Plus1){
				inisialJumlah++;
				}else{
				arrayTerurut[i] = inisialJumlah;
				inisialJumlah = 1;
		}
	}
}