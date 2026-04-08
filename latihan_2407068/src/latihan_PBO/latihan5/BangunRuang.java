package latihan_PBO.latihan5;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    public double hitungVolume2() {
        return super.hitungLuas() * tinggi;
    }

    public void tampilkanInfoRuang() {
        super.tampilkanHasil();
        System.out.println("tinggi   : " + tinggi);
    }
}
