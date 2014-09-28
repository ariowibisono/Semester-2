import java.util.*;
public class KonverDetik {
	public static void main (String [] args) {
	
	Scanner scn = new Scanner (System.in);
	
	int detik=0;
	int hari=0;
	int jam=0;
	int menit=0;
	int dethari=0;
	int detjam=0;
	int detmenit=0;
	int total=0;
	
	System.out.println ("Masukkan Hari : ");
	hari=scn.nextInt();
	System.out.println ("Masukkan Jam : ");
	jam=scn.nextInt();
	System.out.println ("Masukkan Menit : ");
	menit=scn.nextInt();
	
	dethari = hari*24*3600;
	detjam = dethari+(jam*3600);
	detmenit = detjam+(menit*60);
	total = dethari+detjam+detmenit;
	
	System.out.println ("Total Detik : "+total+" Detik");
	}
}