package latihan_PBO.tugas4;

public class BangunDatar {
    protected double varA;
    protected double varB;

    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("========================================");
    }
}