package latihan_PBO.latihan6;

public class Main {
    public static void main(String[] args) {
        Menu[] daftarMenu = new Menu[3];

        daftarMenu[0] = new MenuItem("Ketoprak", 12000, 3);
        daftarMenu[1] = new MenuItem("Nasi Goreng", 15000, 4);
        daftarMenu[2] = new MenuItem("Soda Gembira", 8000, 5);
        
        System.out.println("===== DAFTAR PESANAN =====\n");
        
        double totalSemua = 0;
        
        for (Menu menu : daftarMenu) {
            menu.tampilkan();
            totalSemua += menu.hitungTotal();
        }

        System.out.println("\nTotal belanja semuanya : Rp" + totalSemua);
    }
}