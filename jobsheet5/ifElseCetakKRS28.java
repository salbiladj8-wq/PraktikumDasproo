package jobsheet5;
import java.util.Scanner;
public class ifElseCetakKRS28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ----");
        System.out.println("Masukan semester saat ini: ");
        int semesster = sc.nextInt();
        if (semesster == 1) {
            System.out.println("KRS semester 1 ditampilkan");
        } else if (semesster == 2) {
            System.out.println("KRS semester 2 ditampilkan");
        } else if (semesster == 3) {
            System.out.println("KRS semester 3 ditampilkan");
        } else if (semesster == 4) {
            System.out.println("KRS semester 4 ditampilkan");
        } else if (semesster == 5) {
            System.out.println("KRS semester 5 ditampilkan");
        } else if (semesster == 6) {
            System.out.println("KRS semester 6 ditampilkan");
        } else if (semesster == 7) {
            System.out.println("KRS semester 7 ditampilkan");
        } else if (semesster == 8) {
            System.out.println("KRS semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }
    }
}
