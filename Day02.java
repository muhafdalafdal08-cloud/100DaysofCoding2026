public class Biodata {
    public static void main(String[] args) {

        // Menggunakan println()
        System.out.println("=== BIODATA DIRI ===");
        System.out.println("Nama       : Muh afdhal asysyifa");
        System.out.println("Prodi      : Informatika");

        // Menggunakan print()
        System.out.print("Asal Kota  : ");
        System.out.print("kabupaten pasangkayu");
        System.out.print("\n");

        // Menggunakan printf()
        String nama = "Muh afdhal asysyifa";
        String prodi = "Informatika";
        String kota = "kabupaten pasangkayu";
        int umur = 18;

        System.out.printf("Nama       : %s%n", nama);
        System.out.printf("Prodi      : %s%n", prodi);
        System.out.printf("Asal Kota  : %s%n", kota);
        System.out.printf("Umur       : %d tahun%n", umur);
    }
}
