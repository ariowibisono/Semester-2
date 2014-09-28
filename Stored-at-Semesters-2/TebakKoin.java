import java.util.Scanner;

public class TebakKoin {
	public static void main (String [] argc) {
	Scanner scn = new Scanner (System.in);
	
	//mencetak nilai random untuk jawaban yang benar
	//fungsi math.round untuk membulatkan nilai dari math.random
	int pilpc=(int)Math.round(Math.random());
	
		//user menginput tebakan
		System.out.println(" Tebak Koin \n'0' untuk Angka\n'1' untuk Gambar ");
		System.out.printf ("User memilih . . ");
		int piluser = scn.nextInt();
		
		//menampilkan inputan user dan pc
		System.out.println (" ");
		if (piluser == 0) {
			System.out.println ("Tebakan User : Angka \nTebakan PC : Gambar");
			}
			else {
			System.out.println ("Tebakan User : Gambar \nTebakan PC : Angka");
		}
		
		System.out.println (" ");
		
		//menampilkan tebakan yang benar
		if (pilpc == 1) {
			System.out.println ("Dan ternyata jawabannya adalah . . Gambar");
			}
			else {
			System.out.println ("Dan ternyata jawabannya adalah . . Angka");
		}
		
		//membandingkan tebakan user dengan jawaban yang benar
		if (piluser == pilpc) {
			System.out.println (" Tebakan User Benar ");
			}
			else {
			System.out.println (" Tebakan User Salah ");
		}
	}
}