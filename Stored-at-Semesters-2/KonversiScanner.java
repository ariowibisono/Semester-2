import java.util.Scanner;
public class KonversiScanner{
	public static void main (String[]args){
	int d, jam, menit, detik;
	Scanner waktu = new Scanner(System.in);
	System.out.print(” Masukkan waktu dalam detik/bilangan: “);
	d= waktu.nextInt();

	jam = d/3600;
	menit = (d%3600)/60;
	detik = (d%3600)%60;

	System.out.println(+jam+” jam ” +menit+ ” menit ” +detik+ ” detik”);
	}
}