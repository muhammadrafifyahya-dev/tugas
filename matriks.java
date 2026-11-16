import java.util.Scanner;
public class matriks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Baris: ");
        int baris = scan.nextInt();
        System.out.println("Masukkan Jumlah Kolom: ");
        int kolom = scan.nextInt();
        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Masukkan Nilai Matriks pada Baris " + (i + 1) + " Kolom " + (j + 1) + ": ");
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matriks: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
