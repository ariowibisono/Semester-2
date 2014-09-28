import java.util.*;
public class Jam {
	public static void main (String [] args);
	Scanner scn = new Scanner (System.in);
	System.out.println ("Masukkan nominal detik : ");
	int detik=scn.nextint();
	
	int jam=detik/3600;
	int menit=((detik-(jam*3600))/60);
	int detik=detik-(((detik-(jam*3600))/60));
	
	System.out.println ("Jam = "+jam "Menit = "+menit "Detik = "+detik);
	
}