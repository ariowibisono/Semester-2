import java.util.*;
public class SoalPenjumlahanV2{
	public static void main (String [] p) {
		Scanner sc=new Scanner (System.in);
		
		//Menginputkan batas pertanyaan
		System.out.printf ("Masukkan Banyaknya Jumlah : ");
		int jumlah=sc.nextInt();
		int batas=1;
		String hasil="";
		
		while (batas<=jumlah){
			//Membuat soal random dengan nominal 1-9
			int soal1=(int)Math.round(Math.random()*9);
			int soal2=(int)Math.round(Math.random()*9);
			System.out.print ("No."+batas+")  "+soal1+" + "+soal2+" = ");
			int jawab=sc.nextInt();
			int kunci=soal1+soal2;
		
				//+= untuk menambah karakter string, \t fungsi tab pada java
				if (jawab==kunci)
					hasil +="\n"+batas+".\t"+soal1+" + "+soal2+" =  "+jawab+"\t  "+kunci+"\t Benar";
					else
					hasil +="\n"+batas+".\t"+soal1+" + "+soal2+" =  "+jawab+"\t  "+kunci+"\t Salah";
		
			batas++;
		}
		
		//Memunculkan semua isi karakter string dari variabel hasil
		System.out.println (" ");
		System.out.println ("Hasil Kuis Anda Adalah:");  
		System.out.println ("No."+"\tsoal"+"\tJawaban"+"\tKunci"+"\tStatus");
		System.out.println (hasil);
	}
}