package latihan_pbo.latihan1;

class Cafe{
    String nama;
    String alamat;

    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println(nama);
        System.out.println(alamat);
    }
}

public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Kopi Kenangan", "Indramayu");
        Cafe cafe2 = new Cafe("Tomoro Coffe", "Cirebon");
    }
}
