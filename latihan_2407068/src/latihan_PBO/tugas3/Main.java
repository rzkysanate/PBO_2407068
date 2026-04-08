package latihan_PBO.tugas3;

public class Main {
    public static void main(String[] args) {
        BangunRuang br = new BangunRuang(10, 5, 4);

        System.out.println("Luas alas : " + br.hitungLuas());   
        System.out.println("Volume    : " + br.hitungVolume()); 
    }
}
