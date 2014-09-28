import java.util.*;
public class HitungPinjaman {
	public static void main (String [] args) {
	
	Scanner scn = new Scanner (System.in);
	
	double BayarBulanan;
	double BayarTotal;
	
	System.out.printf ("Masukkan Suku Bunga Tahunan (contoh : 2,5) : ");
	double BungaTahun=scn.nextDouble();
	double BungaBulan=BungaTahun/12;
	
	System.out.printf ("Masukkan Lama Tahun Pinjaman (contoh : 2) : ");
	double Tahun=scn.nextDouble();
	
	System.out.printf ("Masukkan Jumlah Pinjaman (contoh : 1000000) : ");
	double Pinjaman=scn.nextDouble();
	
	BayarBulanan = Pinjaman*BungaBulan / (1-(1/(Math.pow(1+BungaBulan, Tahun*12))));
	BayarTotal = BayarBulanan/Tahun*12;
	
	System.out.println ("Jumlah Pembayaran Bulanan = "+(int)BayarBulanan);
	System.out.println ("Jumlah Total Pembayaran = "+(int)BayarTotal);
	
	}
}