import java.util.*;
public class UsrMngV2{
	public static Vector<User> tbluser = new Vector<User>();
	public static Scanner sc = new Scanner(System.in);
	public static void main(String []argc){
		boolean selesai = false;
		do{
			User.mainMenu();
			int pil=bacaInt("Pilih menu 1-5 : ");
			switch(pil){
				case 1: add(); break;
				case 2: delete(); break;
				case 4: viewAllUser(); break;
				case 5: selesai=true; break;
			}
		}
		while(!selesai);
	}
	public static int bacaInt(String pesan){
		System.out.print(pesan);
		int i = sc.nextInt();
		return i;
	}
	public static String bacaStr(String pesan){
		System.out.print(pesan);
		String i = sc.next();
		return i;
	}
	public static void add(){
		System.out.println("===== ADD NEW USER =====");
		String username=bacaStr("Masukkan username: ");
		String password=bacaStr("Masukkan password: ");
		User userbaru = new User (username, password);
		tbluser.add(userbaru);
	}
	public static void viewAllUser(){
		System.out.println("=== VIEW ALL USER ===");
		for (User usr: tbluser)
			System.out.println(usr.getusername() +"\t" +usr.getpassword());
	}
	private static int cari(String username){
		int idx=1;
		int i=0;
		do{
			if(tbluser.elementAt(i).getusername().equals(username)){
				idx=i;
				i++;
			}
		}
		while((i<tbluser.size() && (idx==-1)));
		return i;
	}
	public static void delete(){
		System.out.println("Delete user");
		String username = bacaStr("Masukkan username yang akan dihapus : ");
		int idx=cari(username);
		if(idx==-1){
			System.out.println(username +" tidak ada di tabel user!");
			}
			else{
				String hapus = bacaStr("Apakah user : " +username +" akan dihapus [y/t]?");
					if (hapus.equalsIgnoreCase("y")){
						tbluser.removeElementAt(idx);
						System.out.println("User : " +username +" sudah terhapus!");
					}
				}
		}
  }