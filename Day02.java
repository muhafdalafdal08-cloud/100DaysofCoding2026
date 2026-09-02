public class Biodata {
    public static void main(String[] args) {

        // Menggunakan println()
        System.out.println("=== BIODATA DIRI ===");
        System.out.println("Nama       : muh afdhal asysyifa");
        System.out.println("Prodi      : Informatika");

        // Menggunakan print()
        System.out.print("Asal Kota  : ");
        System.out.print("Majene");
        System.out.print("prodi");

        // Menggunakan printf()
        String nama = "muh afdhal asysyifa";
        String prodi = "Informatika";
        String kota = "kabupaten pasangkayu";
        int umur = 18;

        System.out.printf("Nama       : muh afdhal asysyifa", nama);
        System.out.printf("Prodi      : informatika", prodi);
        System.out.printf("Asal Kota  : kabupaten pasangkayu", kota);
        System.out.printf("Umur       : 18", umur);
    }
}
