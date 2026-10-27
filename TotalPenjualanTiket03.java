import java.util.Scanner;
public class TotalPenjualanTiket03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalPenjualan = 0;
        int jml;

        System.out.println("=== Penjualan Tiket Bioskop ===");
        System.out.println("Masukkan 0 untuk mengakhiri");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jml = scanner.nextInt();
            if (jml < 0) {
                System.out.println("Input tidak valid. Masukkan lagi!");
                continue;
            }
            if (jml == 0) {
                break;
            }
            
            int diskonPersen = 0;
            if (jml > 10) {
                diskonPersen = 15;
            } else if (jml > 4) {
                diskonPersen = 10;
            } 
            int harga = jml * hargaTiket * (100 - diskonPersen) / 100;
            System.out.println("Diskon: " + diskonPersen + "%");
            System.out.println("Harga yang harus dibayar: Rp " + harga);
            totalTiket += jml;
            totalPenjualan += harga;
        }

        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: " +);
    }
}