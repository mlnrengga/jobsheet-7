import java.util.Scanner;

public class WhileKelipatan15 {
    public static void main(String[] args) {
Scanner scan = new Scanner (System.in);

int kelipatan;
int jumlah = 0, counter = 0;
double rataRata;

System.out.print("Masukkan Bilangan Kelipatan (1-9): ");
kelipatan = scan.nextInt();

int i = 1;

while (i <= 50) {
    if (i % kelipatan == 0) {
        jumlah += i;
        counter++;
    }
    i++;
}
 rataRata = jumlah / counter;
System.out.printf("Banyaknya Bilangan %d dari 1 Sampai 50 Adalah %d\n", kelipatan, counter);
System.out.printf("Total Bilangan Kelipatan %d dari 1 Sampai 50 Adalah %d\n", kelipatan, jumlah);
System.out.printf("Rata Rata Dari Bilangan Kelipatan %d adalah %s", kelipatan, rataRata);
scan.close();
}
}