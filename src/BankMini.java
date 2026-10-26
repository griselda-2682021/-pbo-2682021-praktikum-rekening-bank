import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        // Ketentuan No. 7: Uji coba akses field private langsung untuk melihat pesan error
        // Pesan Error: java: saldo has private access in Rekening
        // Rekening rekTest = new Rekening("001", "Ani", 100000);
        // rekTest.saldo = 1000000;

        // Membuat object Rekening dengan nomor 001, pemilik Ani, saldo awal 100.000
        Rekening rekening = new Rekening("001", "Ani", 100000);
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        System.out.println("=========== BANK MINI ===========");
        rekening.cetakInfo();

        do {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Jumlah: ");
                int jumlah = scanner.nextInt();
                if (rekening.setor(jumlah)) {
                    System.out.println("Berhasil");
                } else {
                    System.out.println("Ditolak");
                }
            } else if (pilihan == 2) {
                System.out.print("Jumlah: ");
                int jumlah = scanner.nextInt();
                if (rekening.tarik(jumlah)) {
                    System.out.println("Berhasil");
                } else {
                    System.out.println("Ditolak");
                }
            } else if (pilihan == 3) {
                rekening.cetakInfo();
            } else if (pilihan != 0) {
                System.out.println("Menu tidak dikenal.");
            }
        } while (pilihan != 0);

        System.out.println("\n=========== SALDO AKHIR ===========");
        rekening.cetakInfo();

        scanner.close();
    }
}