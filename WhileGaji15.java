import java.util.Scanner;
public class WhileGaji15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        
        System.out.print("Masukkan Jumlah Karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan Jabatan Karyawan Ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan Jumlah Jam Lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan Invalid");
                i--;
            } 
            totalGajiLembur += gajiLembur;
        } 
        System.out.println("Total Gaji Lembur: " + totalGajiLembur);
        scan.close();
    } 
    
}
