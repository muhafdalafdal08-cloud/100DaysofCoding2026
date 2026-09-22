import java.util.Scanner;

public class StringKePrimitif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        String teks = input.nextLine();

        int angka = Integer.parseInt(teks);

        System.out.println("String = " + teks);
        System.out.println("Integer = " + angka);

        input.close();
    }
}
