import java.util.Scanner;

public class RataNilai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,i;
        float nilai, totalNilai, rataNilai;

        i = 1;
        while(i <= 5){
            System.out.println("Input Nilai Mahasiswa ke- " + i);
            totalNilai = 0;
            for(j=1; j<=5; j++){
                System.out.print("Nilai ke- " + j + " = ");
                nilai = input.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            i++;
            System.out.println("Rata-rata Nilai Mahasiswa ke- " + i + " adalah " + rataNilai);
        }
    }
}
