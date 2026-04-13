package latihan_PBO.tugas4;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] daftarBangunDatar = new BangunDatar[3];
        
        daftarBangunDatar[0] = new Persegi(5.0);
        daftarBangunDatar[1] = new PersegiPanjang(4.0, 6.0);
        daftarBangunDatar[2] = new Segitiga(3.0, 4.0);
        
        System.out.println("===== HASIL PERHITUNGAN BANGUN DATAR =====\n");
        
        for (BangunDatar bangun : daftarBangunDatar) {
            bangun.tampilkan();
        }
    }
}