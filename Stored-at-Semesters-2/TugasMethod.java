public class TugasMethod {
	//mentotal array
	public static int Cari_Total(int [] data){
		  int total = 0;
			for(int i=0; i<data.length; i++){
              total = total + data[i];
			}
		return total;
	}
	
	//program utama
	public static void main (String[]args){
		int [] data = {2,4,1,10,9,6,8,7};
		int jumlah = Cari_Total(data);
		cetak (data);
		cetak ("Total = "+jumlah);
		cetak_urut (data);
		int maksimal = Cari_Maksimal(data);
		cetak ("Nilai Maksimal : "+maksimal);
		int minimal = Cari_Minimal(data);
		cetak ("Nilai Maksimal : "+minimal);
	}
	
	public static void cetak(String str){
		System.out.println(str);
	}
	
	//mengurutkan array
	public static void cetak_urut(int [] data){
	int min = 1000;
	int max = -1000;
	int sementara;
		for (int i=0; i<data.length; i++){
			for (int j=0; j<data.length; j++){
				if (data[j] > data[i]){
					sementara = data [i];
					data[i] = data [j];
					data [j] = sementara;
				}
			}
		}
	System.out.print ("Array yang diurutkan :\n\tData = {");
		for (int i=0; i<data.length;i++){
			if (i==(data.length-1)){
				System.out.print(data[i]);
			}
			else
				System.out.print(data[i]+", ");
		}
	System.out.print ("}");
	System.out.println ();
	}
	
	//mencetak array
	public static void cetak(int [] data){
		System.out.print ("Data = {");
		for (int j=0; j<data.length;j++){
			if (j==(data.length-1)){
			System.out.print(data[j]);
			}
			else
			System.out.print(data[j]+", ");
		}
		System.out.print ("}");
		System.out.println ();
	}
	
	//mencari nilai maksimal
	public static int Cari_Maksimal(int [] data){
		  int max = -1000;
			for(int i=0; i<data.length; i++){
				if(max<data[i]){
					max=data[i];
				}
			}
		return max;
	}

	//mencari nilai minimal
	public static int Cari_Minimal(int [] data){
		  int min = 1000;
			for(int i=0; i<data.length; i++){
				if(min>data[i]){
					min=data[i];
				}
			}
		return min;
	}
}