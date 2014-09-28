import java.util.Scanner;

public class BentukAir {
	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);

	//Menginputkan temperatur air
	System.out.printf ("Masukkan Temperatur Air (celcius) : ");
	int air=scn.nextInt();
	
	//menyeleksi suhu air di atas 100 derajat
	if (air>=100){
		System.out.println("Bentuk air adalah gas");
		}
		//menyeleksi suhu air antara 1-99 derajat
		if ((air<100)&&(air>0)){
		System.out.println ("Bentuk air adalah cair");
			}
			//menyeleksi suhu air dibawah 1 derajat
			if (air <= 0){
			System.out.println ("Bentuk air adalah padat");
				}
	}
}