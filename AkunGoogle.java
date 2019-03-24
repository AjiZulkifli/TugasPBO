public class AkunGoogle{
	private int NIK,Usia;
	private String NamaDepan,NamaBelakang,UserName,Password,jenisKelamin,Alamat,Email,noTelepon;

	public AkunGoogle(int NIK,int Usia,String NamaDepan, String NamaBelakang,String UserName,String Password, String jenisKelamin,String Alamat, String Email, String noTelepon){
		this.NIK = NIK;
		this.Usia = Usia;
		this.NamaDepan = NamaDepan;
		this.NamaBelakang = NamaBelakang;
		this.UserName = UserName;
		this.Password = Password;
		this.jenisKelamin = jenisKelamin;
		this.Alamat = Alamat;
		this.Email = Email;
		this.noTelepon = noTelepon;
	}

	public int NIK(){
		return NIK;
	}

	public int Usia(){
		return Usia;
	}
		
	public String NamaDepan(){
		return NamaDepan;
	}

	public String NamaBelakang(){
		return NamaBelakang;
	}

	public String UserName(){
		return UserName;
	}

	public String Password(){
		return Password;
	}

	public String jenisKelaminenisKelamin(){
		return jenisKelamin;
	}

	public String Alamat(){
		return Alamat;
	}

	public String Email(){
		return Email;
	}
	
	public String noTelepon(){
		return noTelepon;
	}
}