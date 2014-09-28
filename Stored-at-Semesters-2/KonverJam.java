import java.util.*;
public class KonverJam {
	public static void main (String [] args) {
	
	Scanner scn = new Scanner (System.in);
	
	int detik=0;
	int jam=0;
	int menit=0;
	int d=0;
	
	System.out.println ("Masukkan nominal detik : ");
	detik=scn.nextInt();
	
	jam = detik/3600;
	menit = ((detik-(jam*3600))/60);
	d = detik-((jam*3600)+(menit*60));
	
	System.out.println (jam+" Jam  "+menit+" Menit  "+d+" Detik");
	}
}