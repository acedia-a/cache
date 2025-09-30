public class main {
    public static void main(String[] args) {
        System.out.println("Nama bank: " + Bank.getNamaBank());
        Rekening rekening1 = new Rekening("Ahmad Habibie", "1234567890", 5000.0);
        Rekening rekening2 = new Rekening("Siti Nurhalizah", "0987654321", 10000.0);
        
        rekening1.tampilkanInfo();
        rekening1.setSaldo(2000.0);
        rekening2.tampilkanInfo();
        rekening2.setSaldo(3000.0);
        System.out.println("Setelah penambahan saldo:"+rekening2.getSaldo());
        
        Rekening.jumlahRekening = 2;
        Rekening.tampilkanInfoRekening();
        
    }
}
