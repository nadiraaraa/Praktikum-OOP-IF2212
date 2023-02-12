/**
 * DaftarMahasiswa
 * Meng-output data mahasiswa
 * @author 18221059 Nadira
 */

import java.util.Scanner;
public class DaftarMahasiswa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.nextLine();
        String nim = scanner.nextLine();
        int sks = scanner.nextInt();
        int rev_sks = scanner.nextInt();

        Mahasiswa m1 = new Mahasiswa(nama, nim, sks);
        
        System.out.println("Nama mahasiswa: " + m1.getNama());
        System.out.println("NIM mahasiswa: " + m1.getNim());
        System.out.println("SKS mahasiswa: " + m1.getSks());
        System.out.println("Jumlah mahasiswa: " + m1.getJumlahMahasiswa());
        
        m1.tambahSks(rev_sks);
        System.out.println("Total Revisi SKS mahasiswa: " + m1.getSks());
    }
}

/*/
Format Input:
- Baris pertama merupakan nama mahasiswa
- Baris kedua merupakan NIM mahasiswa
- Baris ketiga merupakan jumlah SKS mahasiswa
- Baris keempat merupakan jumlah SKS tambahan

Format Output:
Sesuai dengan contoh di bawah

Contoh:
Input:
Marin
18221000
5
4

Output:
Nama mahasiswa: Marin
NIM mahasiswa: 18221000
SKS mahasiswa: 5
Jumlah mahasiswa: 1
Total Revisi SKS mahasiswa: 9

*/