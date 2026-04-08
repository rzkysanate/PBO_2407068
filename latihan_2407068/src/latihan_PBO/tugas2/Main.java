package latihan_PBO.tugas2;

import java.util.Scanner;

class BangunDatar{
    private double sisi;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;
    private double diagonal1;
    private double diagonal2;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double kelilingPersegi(){
        return 4*sisi;
    }

    public double luasPersegi(){
        return sisi*sisi;
    }

    public double kelilingPersegiPanjang(){
        return 2*(panjang+lebar);
    }

    public double luasPersegiPanjang(){
        return panjang*lebar;
    }

    public double kelilingSegitiga(){
        return alas+tinggi+Math.sqrt(alas*alas+tinggi*tinggi);
    }

    public double luasSegitiga(){
        return 0.5*alas*tinggi;
    }

    public double kelilingBelahKetupat(){
        return 4*Math.sqrt((diagonal1/2)*(diagonal1/2)+(diagonal2/2)*(diagonal2/2));
    }

    public double luasBelahKetupat(){
        return 0.5*diagonal1*diagonal2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar bangunDatar = new BangunDatar();

        System.out.println("Pilih bangun datar :");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi : ");
                double sisi = scanner.nextDouble();
                bangunDatar.setSisi(sisi);
                System.out.println("Keliling Persegi : " + bangunDatar.kelilingPersegi());
                System.out.println("Luas Persegi : " + bangunDatar.luasPersegi());
                break;
            case 2:
                System.out.print("Masukkan panjang persegi panjang : ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                bangunDatar.setPanjang(panjang);
                bangunDatar.setLebar(lebar);
                System.out.println("Keliling Persegi Panjang : " + bangunDatar.kelilingPersegiPanjang());
                System.out.println("Luas Persegi Panjang : " + bangunDatar.luasPersegiPanjang());
                break;
            case 3:
                System.out.print("Masukkan alas segitiga : ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = scanner.nextDouble();
                bangunDatar.setAlas(alas);
                bangunDatar.setTinggi(tinggi);
                System.out.println("Keliling Segitiga: " + bangunDatar.kelilingSegitiga());
                System.out.println("Luas Segitiga: " + bangunDatar.luasSegitiga());
                break;
            case 4:
                System.out.print("Masukkan diagonal 1 belah ketupat : ");
                double diagonal1 = scanner.nextDouble();
                System.out.print("Masukkan diagonal 2 belah ketupat : ");
                double diagonal2 = scanner.nextDouble();
                bangunDatar.setDiagonal1(diagonal1);
                bangunDatar.setDiagonal2(diagonal2);
                System.out.println("Keliling Belah Ketupat: " + bangunDatar.kelilingBelahKetupat());
                System.out.println("Luas Belah Ketupat: " + bangunDatar.luasBelahKetupat());
        }
    }
}