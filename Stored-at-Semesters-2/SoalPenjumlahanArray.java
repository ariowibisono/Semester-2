import java.util.*;
public class SoalPenjumlahanV2{
	public static void main (String [] p) {
		Scanner sc=new Scanner (System.in);
		
		System.out.printf ("Masukkan Banyaknya Jumlah : ");
		int jumlah=sc.nextInt();
		int batas=1;
		
		while (batas<=jumlah){
			int soal1=(int)Math.round(Math.random()*9);
			int soal2=(int)Math.round(Math.random()*9);
			System.out.print ("No. "batas+"  "+soal1+" + "+soal2+" = ");
			System.out.printf (" ");
			int jawab=sc.nextInt();
			
			int kunci=soal1+soal2;
			
			System.out.println (" ");
			batas++;
		}
		
		System.out.println ("No.  Soal  Jawab  Kunci  Status");
	
		while (batas=1){
			if (jawab==kunci)
			System.out.print (batas+". "+soal1+" + "+soal2+" =  "+jawab+"\t  "+kunci+"\t Benar");
			else
			System.out.print (batas+". "+soal1+" + "+soal2+" =  "+jawab+"\t  "+kunci+"\t Salah");
		
			batas--;
		}
	}
}
		}
	}
}