public class Rekening {
    private String nomor;
    private String pemilik;
    private int saldo;

    // Constructor menggunakan this
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    // Method setor (menolak jumlah <= 0)
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        saldo += jumlah;
        return true;
    }

    // Method tarik (menolak jumlah <= 0 atau melebihi saldo)
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    // Method private untuk format Rupiah
    private String formatRupiah(int nominal) {
        java.text.NumberFormat formatRupiah = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("id", "ID"));
        return formatRupiah.format(nominal).replace("Rp", "Rp ");
    }

    // Method cetakInfo
    public void cetakInfo() {
        System.out.println(nomor + " | " + pemilik + " | " + formatRupiah(saldo));
    }
}