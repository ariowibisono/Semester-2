public class ArrayMethod2D {

	//Mencari Total Baris
	public static int Total_Baris (int [][] data) {
			int total_baris = 0;
			for (int i=0; i<data.length; i++){
				for (int j=0; j<data[i].length; j++){
					total_baris += data[i][j];
				}
			System.out.println ("Jumlah Baris ke "+(i+1)+" : "+total_baris);
			total_baris = 0;
			}
		return total_baris;
	}

	//Mencari Total Kolom
	public static int Total_Kolom (int [][] data) {
			int total_kolom = 0;
			int j = 0;
			for (int i=0; i<data[i].length; i++){
				for (j=0; j<data.length; j++){
					total_kolom += data[j][i];
				}
			System.out.println ("Jumlah Kolom ke "+(i+1)+" : "+total_kolom);
			total_kolom = 0;
			}
		return total_kolom;
	}

	//Mencari Total Keseluruhan
	public static int Total_Array (int [][] data) {
		int Total = 0;
		for (int i=0; i<data.length; i++){
			for (int j=0; j<data[i].length; j++){
				Total += data[i][j];
			}
		}
		return Total;
	}
	
	//program utama
	public static void main (String[]args){
		int [][] data = {{2,4,1},{10,9,6},{8,7,2},{1,1,1},{1,1,1}};
		System.out.println ("Menghitung Total per Baris ");
		Total_Baris (data);
		System.out.println ();
		System.out.println ("Menghitung Total per Kolom ");
		Total_Kolom (data);
		System.out.println ();
		Total_Array (data);
		int jumlah = Total_Array (data);
		System.out.println ("Jumlah Keseluruhan adalah "+jumlah);
	}
}