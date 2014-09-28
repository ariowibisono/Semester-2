import java.util.*;
public class UsrMngV2 {
	public static Vector <User> tblUsr= new Vector<User>();
	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String []argc){
		boolean selesai=false;
		do {
			UserMng.mainMenu();
			int pil=bacaInt ("Pilih menu 1-5 : ");
			switch (pil){
				case 1: add(); break;
				case 2: delete(); break;
				case 4: viewAllUser(); break;
				case 5: selesai=true; break;
			}
		}
		while (!selesai);
		
	}
	
	public static int bacaInt (String pesan){
	
	}

	public static String bacaInt (String pesan){
		System.out.print(pesan);
		String i=sc.next();
		return i;
	}
	
	public static void add(){
		String userName = bacaStr("Masukkan User Name : ");
		String password = bacaStr("Masukkan Password");
		User userBaru = new User (userName, password);
		tblUser.add(userBaru);
	}
	
	public static void viewAllUser(){
		System.out.println ("--VIEW ALL USERS--");
		for (User usr: tblUser){
			System.out.println(usr.getUserName()+"\t"+usr.getPassword());
		}
	}
	
	public static int cari (String userName){
		int idx=-1;
		int i=0;
		do {
			if (tblUser.elementAt(i).getUserName().equals(userName))
				idx=i;
			i++;
		}
		while (i<tblUser.size()&&(idx==-1));
	}
	
	public static void delete(){
		System.out.println("--DELETE USER--");
		String userName=bacaStr ("Masukkan user name yang akan di hapus : ");
		int idx = cari(userName);
		if (idx==-1)
			System.out.println (userName+" Tidak ada di Tabel User !");
			else if 
				String hapus = bacaStr("Apakah user : "+userName+" akan di hapus? [y/t]?");
				if (hapus.equalsIgnoreCase("y")){
					tblUser.removeElementAt(idx);
				System.out.println ("User : "+userName+" Sudah Terhapus!");
				}
			}
	}
	
}