package latihan_PBO.latihan6;

public class MenuItem extends Menu {
    private int totalItem;

    public MenuItem(String namaMenu, double hargaMenu, int totalItem) {
        super(namaMenu, hargaMenu);
        this.totalItem = totalItem;
    }

    public int getTotalItem() {
        return totalItem;
    }

    @Override
    public double hitungTotal() {
        return getHargaMenu() * totalItem;
    }

    @Override
    public void tampilkan() {
        System.out.println(getNamaMenu() + " : Rp" + getHargaMenu() + " x " + totalItem + " = Rp" + hitungTotal());
    }
}