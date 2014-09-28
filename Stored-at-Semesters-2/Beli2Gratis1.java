import java.io.*;

public class Beli2Gratis1 {
	public static void main (String [] argc) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int angka;
		
		System.out.printf ("Masukkan angka : ");
		angka = Integer.parseInt(br.readLine ());
		
		if (angka%2==1) {
			System.out.println ("Jumlah Barang yang dibeli : "+angka);
			System.out.println ("Jumlah Bonus : "+((angka-1)/2));
			System.out.println ("Total Item yang dibawa pulang : "+(angka+((angka-1)/2)));
		}
		else {
			System.out.println ("Jumlah Barang yang dibeli : "+angka);
			System.out.println ("Jumlah Bonus : "+(angka/2));
			System.out.println ("Total Item yang dibawa pulang : "+(angka+(angka/2)));
		}
	}
}