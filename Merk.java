public class Merk extends Smartphone{
	
	public int harga;

	public Merk(String nama, int harga){
		super(nama);		
		this.harga = harga;
	}

	public Merk (String nama){
		super(nama);
	}


	public void showHarga(){
		System.out.println(harga);
	}

}