import java.util.Scanner;

public class No2Tugas17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahAtlet = 5;

        System.out.println("==== PORSENI POLITEKNIK NEGERI MALANG 2024 ====");
        System.out.println("===== DAFTAR CABANG OLAHRAGA DAN ATLET =====");

        System.out.println("\nMasukkan nama atlet untuk cabang Badminton:");
        for (int i = 1; i <= jumlahAtlet; i++) {
            System.out.print("Nama atlet ke-" + i + ": ");
            String namaAtlet = input.nextLine();
        }
        
        System.out.println("\nMasukkan nama atlet untuk cabang Tenis Meja:");
        for (int i = 1; i <= jumlahAtlet; i++) {
            System.out.print("Nama atlet ke-" + i + ": ");
            String namaAtlet = input.nextLine();
        }
        
        System.out.println("\nMasukkan nama atlet untuk cabang Basket:");
        for (int i = 1; i <= jumlahAtlet; i++) {
            System.out.print("Nama atlet ke-" + i + ": ");
            String namaAtlet = input.nextLine();
        }
        
        System.out.println("\nMasukkan nama atlet untuk cabang Bola Voli:");
        for (int i = 1; i <= jumlahAtlet; i++) {
            System.out.print("Nama atlet ke-" + i + ": ");
            String namaAtlet = input.nextLine();
        }
    }
}
