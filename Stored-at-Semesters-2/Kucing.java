public class Kucing {
	String nama;
	String warna;
	int umur;
	int berat;
	
	void Meong() {
		System.out.println ("Metoda Meong");
	}
	void Gigit() {
		System.out.println ("Metoda Gigit");
	}
	void cetak() {
		System.out.println ("Nama : "+this.nama+"\n"+"Warna : "+this.warna);
		System.out.println ("Umur : "+this.umur+"\n"+"Tahun : "+this.umur);
		System.out.println ("Berat : "+this.berat+" Kg");
	}
}