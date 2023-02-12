/**
 * MataKuliah.java
 * Kelas mencatat daftar mata kuliah yang ada serta detailnya
 * @author 18221059 Nadira
 */

 public class MataKuliah {
	// Deklarasi atribut
	private String kode;
	private String nama;
	private int sks;
	private String dosen;
	private int kapasitas;
	private static int jumlahMataKuliah;

	/**
 	* Konstruktor
 	* @param kode
 	* @param nama
 	* @param sks
 	* @param dosen
 	* @param kapasitas
 	*/
	public MataKuliah(String kode, String nama, int sks, String dosen, int kapasitas) {
		this.kode = kode; this.nama = nama; this.sks = sks; this.dosen = dosen; this.kapasitas = kapasitas;
	}

	/**
 	* Getter kode
 	* @return kode
 	*/
	public String getKode() {
    	return kode;
	}

	/**
 	* Getter nama
 	* @return nama
 	*/
	public String getNama() {
    	return nama;
	}

	/**
 	* Getter sks
 	* @return sks
 	*/
	public int getSks() {
    	return sks;
	}

	/**
 	* Getter dosen
 	* @return dosen
 	*/
	public String getDosen() {
   	 return dosen;
	}

	/**
 	* Getter kapasitas
 	* @return kapasitas
 	*/
	public int getKapasitas() {
   	 return kapasitas;
	}

	/**
 	* Getter jumlah mata kuliah
 	* @return jumlah mata kuliah
 	*/
	public static int getJumlahMataKuliah() {
   	 return jumlahMataKuliah;
	}

	/**
 	* Menambahkan kapasitas mahasiswa
 	* @param tambahan jumlah kapasitas yang ditambahkan
 	*/
	public void tambahKapasitas(int tambahan) {
   	 kapasitas += tambahan;
	}
}
