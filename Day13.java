//mengimpor class Scanner untuk menerima input dari keyboard
import java.util.Scanner;

//membuat class
public class day13 {

    //method utama yang pertama kali di jalankan
    public static void main(String[] args) {

        //membuat object Scanner dengan nama input
        Scanner input = new Scanner(System.in);

        //judul program
        System.out.println("Biodata Diri");
        
        //meminta pengguna memaksukkan nama
        System.out.print("Masukkan Nama           : ");
        String nama = input.nextLine();

        //masukkan nim
        System.out.print("Masukkan NIM            : ");
        String nim = input.nextLine();

        //masukkan jurusan
        System.out.print("Masukkan Jurusan        : ");
        String jurusan = input.nextLine();

        //masukkan umur
        System.out.print("Masukkan Umur           : ");
        int Umur = input.nextInt();

        //menghapus sisa enter setelah pengguna selesai memasukkan umur
        input.nextLine();
        
        //masukkan alamat
        System.out.print("Masukkan Alamat         : ");
        String alamat = input.nextLine();


        //pembatas 
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Jurusan     : " + jurusan);
        System.out.println("Umur        : " + Umur);
        System.out.println("Alamat      : " + alamat);
    }
}
