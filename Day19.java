import java.util.Scanner;

public class KonversiManual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        // Konversi manual dari int ke double
        double hasil = (double) angka;

        System.out.println("Nilai int    = " + angka);
        System.out.println("Nilai double = " + hasil);

        input.close();
    }
}
