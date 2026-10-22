import java.util.Scanner;

public class KafeDoWhile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000;
        double hargaTeh = 7000;
        double hargaRoti = 20000;
        double totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("BATAL")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            } 
            System.out.print("Jumlah kopi: ");
            kopi = scanner.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = scanner.nextInt();
            System.out.print("Jumlah roti: ");
            roti = scanner.nextInt();
             
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            scanner.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}