import java.util.Scanner;

public class DaftarMataKuliah {

   	public static void main(String[] args) {
       	Scanner scanner = new Scanner(System.in);
       	String inkode = scanner.nextLine();
       	String innama = scanner.nextLine();
       	int insks = scanner.nextInt();
       	scanner.nextLine();
       	String indosen = scanner.nextLine();
       	int inkap = scanner.nextInt();
       	int tambah = scanner.nextInt();
      	 
       	scanner.close();

       	MataKuliah mk1 = new MataKuliah(inkode, innama, insks, indosen, inkap);
      	 

       	System.out.println("Kode Mata Kuliah: " + mk1.getKode());
       	System.out.println("Nama Mata Kuliah: " + mk1.getNama());
       	System.out.println("SKS Mata Kuliah: " + mk1.getSks());
       	System.out.println("Nama Dosen: " + mk1.getDosen());
       	System.out.println("Kapasitas Kuliah: " + mk1.getKapasitas());

       	mk1.tambahKapasitas(tambah);

       	System.out.println("Total Revisi Kapasitas Kuliah: " + mk1.getKapasitas());
   	}
   }

