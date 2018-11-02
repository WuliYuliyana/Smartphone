public class Test{
	public static void main(String[] args) {
		Merk m1 = new Merk("Samsung");
		m1.showNama();
		m1.showHarga();

		Merk m2 = new Merk("Xiomi",2000000);
		m2.showNama();
		m2.showHarga();
	}
}