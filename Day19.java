import java.util.Scanner;

public class KonversiManual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        double angka = input.nextDouble();

        // Konversi manual dari double ke int
        int hasil = (int) angka;

        System.out.println("Nilai double = " + angka);
        System.out.println("Nilai int    = " + hasil);

        input.close();
    }
}
