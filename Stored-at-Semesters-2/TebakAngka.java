import java.io.*;

public class TebakAngka {
	public static void main (String [] argc) throws IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   
		int angka_misteri=(int)(Math.random()*10);
		int angka;
	
		System.out.println(" Menebak Angka 0 - 10 ");
		System.out.printf("Masukkan angka : ");
		angka = Integer.parseInt(br.readLine());
		
		if (angka == angka_misteri)
			System.out.println (" Tebakan Benar ");
			else
			System.out.println (" Tebakan Salah ");
	}
}