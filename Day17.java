import java.util.Scanner;

public class OperatorPenugasan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        int angka = input.nextInt();

        System.out.println("Nilai awal = " + angka);

        angka += 5;
        System.out.println("Setelah += 5 : " + angka);

        angka -= 3;
        System.out.println("Setelah -= 3 : " + angka);

        angka *= 2;
        System.out.println("Setelah *= 2 : " + angka);

        angka /= 2;
        System.out.println("Setelah /= 2 : " + angka);

        angka %= 3;
        System.out.println("Setelah %= 3 : " + angka);

        input.close();
    }
}
