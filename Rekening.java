public class Rekening {
    public String namaRekening;
    private String nomorRekening;
    protected double saldo;
    static int jumlahRekening = 0;
    Rekening(String namaRekening, String nomorRekening, double saldo) {
        this.namaRekening = namaRekening;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }
    public String getNamaRekening() {
        return namaRekening;
    }
    public String setNamaRekening(String namaRekeningBaru) {
        if(namaRekeningBaru.length() > 0) {
            this.namaRekening = namaRekeningBaru;
        }else if (namaRekeningBaru.length() == 0) {
            System.out.println("Nama rekening tidak boleh kosong");
        }
        return namaRekening;
    }
    public String getNomorRekening() {
        return nomorRekening;
    }
    public String setNomorRekening(String nomorRekeningBaru) {
        if(nomorRekeningBaru.length() == 10) {
            this.nomorRekening = nomorRekeningBaru;
        }else if (nomorRekeningBaru.length() != 10) {
            System.out.println("Nomor rekening harus 10 digit");
        }
        return nomorRekening;
    }   
    public double getSaldo() {
        return saldo;
    }
    public double setSaldo(double saldoBaru) {
        if(saldoBaru > 0) {
            this.saldo = saldoBaru;
        }else if (saldoBaru==0) {
            System.out.println("Saldo tidak valid");
        }
        return saldo;
    }
    public static void tampilkanInfoRekening() {
        System.out.println("Jumlah Rekening: " + jumlahRekening);
    }
    public void tampilkanInfo() {
        System.out.println("Nama Rekening  : " + namaRekening);
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Saldo          : " + saldo);
    }
}
