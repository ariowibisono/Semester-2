import java.util.*;
public class SoalPenjumlahan{
	public static void main (String [] p) {
		Scanner sc=new Scanner (System.in);
		
		System.out.printf ("Masukkan Banyaknya Jumlah : ");
		int jumlah=sc.nextInt();
		int batas=1;
		
		System.out.println ("No.  Soal  Jawab  Kunci  Status");
		while (batas<=jumlah){
			int soal1=(int)Math.round(Math.random()*9);
			int soal2=(int)Math.round(Math.random()*9);
			System.out.print (batas+". "+soal1+" + "+soal2+" = ");
			System.out.printf (" ");
			int jawab=sc.nextInt();
			
			int kunci=soal1+soal2;
			
			if (jawab==kunci)
				System.out.print (batas+". "+soal1+" + "+soal2+" =  "+jawab+"\t  "+kunci+"\t Benar");
				else
				System.out.print (batas+". "+soal1+" + "+soal2+" =  "+jawab+"\t  "+kunci+"\t Salah");
			
			System.out.println (" ");
			batas++;
		}
	}
}