import java.util.*;
public class UserMng {
	public static void cetak(String str){
		System.out.println(str);
	}
	
	public static void main (String [] args){
		//Inisialisasi vector username dan password
		Scanner sc = new Scanner(System.in);
		Vector <String> username = new Vector <String> ();
		Vector <String> password = new Vector <String> ();
		
		//Data Awal Program
		username.add("admin");
		username.add("user");
		username.add("root");
		password.add("123");
		password.add("456");
		password.add("789");
		
		//Deklarasi Variabel yang akan digunakan
		int i=0;
		int pil=0;
		int urutan = -1;
		int urutan2 = -1;
		String passbaru, userbaru, ulangpass;
		String hapusdata, hapusdata2;
		String gantipass, gantipass2;
		String ubahuser, ubahpass, ubahpass2;
		
		//Proses Login User
		do {
		cetak ("");
		cetak ("Login Program Manajemen User");
		System.out.print ("User Name \t: ");
		String user = sc.next();
		System.out.print ("Password \t: ");
		String pass = sc.next();
		
			if (username.indexOf(user) == password.indexOf(pass)){
				i=1;
				cetak ("User dan Password Valid Silahkan Masuk");}
			else
				i=0;
		}
		while (i==0);
		
		//Tampilan Utama Program
		do {
			cetak ("");
			cetak ("Program Manajemen User");
			cetak ("1. Tambah User");
			cetak ("2. Hapus User");
			cetak ("3. Ubah Password");
			cetak ("4. Tampilkan Semua User");
			cetak ("5. Exit");
			System.out.print ("Pilihlah menu [1-5]> ");
			pil = sc.nextInt();
			cetak ("");
			
			switch (pil) {
			
			//Proses Menambah User
				case 1:
					do {
						cetak ("Tambah User Baru");
						System.out.print ("Masukan User Name \t: ");
						userbaru = sc.next();
						System.out.print ("Masukkan Password \t: ");
						passbaru = sc.next();
						System.out.print ("Ulangi Password \t: ");
						ulangpass = sc.next();
						}
					while (!passbaru.equals(ulangpass));
					username.add(userbaru);
					password.add(passbaru);
				break;
			//Proses Menghapus User
				case 2:
					urutan = -1;
					System.out.print ("Masukkan User Name yang akan dihapus : ");
					hapusdata = sc.next();
					if (username.contains(hapusdata)){
						System.out.print ("Apakah Anda akan menghapus user "+hapusdata+" [y/t]? ");
						hapusdata2 = sc.next();
						if (hapusdata2.equalsIgnoreCase("y")){
							urutan = username.indexOf(hapusdata);
							username.remove(urutan);
							password.remove(urutan);
							cetak ("User "+hapusdata+" berhasil dihapus!");
						}
						else
						System.out.print ("Data tidak terhapus");
					}
					else
					cetak ("User Name tidak ditemukan!");
				break;
			//Proses Mengganti Password User
				case 3:
					urutan = -1;
					System.out.print ("Masukkan User Name yang akan di ganti passwordnya : ");
					ubahuser = sc.next();
					if (username.contains(ubahuser)){
						System.out.print ("Masukkan Password Lama : ");
						ubahpass = sc.next();
						urutan = password.indexOf(ubahpass);
						if (username.indexOf(ubahuser) == password.indexOf(ubahpass)){
							System.out.print ("Masukkan Password Baru : ");
							ubahpass2 = sc.next();
							password.setElementAt(ubahpass2,urutan);
							cetak ("Password telah diganti!");
						}
						else
							cetak ("Password tidak cocok");
					}
					else
					cetak ("User Name tidak ditemukan!");
				break;
			//Proses Menampilkan Seluruh Data Username
				case 4:
					//Menampilkan isi vektor username
					cetak ("Menampilkan Semua User yang tercatat :");
					for (Object s:username){
					cetak ((String)s);
					}
				break;
			//Proses Keluar Program
				case 5:
					cetak ("Keluar Program");
					System.exit(0);
				break;
			}
		}
		while (true);
	}
}