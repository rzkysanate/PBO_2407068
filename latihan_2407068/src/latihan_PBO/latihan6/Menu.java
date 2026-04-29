package latihan_PBO.latihan6;

public class Menu {
    private String namaMenu;
    private double hargaMenu;

    public Menu(String namaMenu, double hargaMenu) {
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

        public String getNamaMenu() {
        return namaMenu;
    }
    
    public double getHargaMenu() {
        return hargaMenu;
    }

    public double hitungTotal() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Menu: " + namaMenu);
        System.out.println("Harga: Rp" + hargaMenu);
    }
}