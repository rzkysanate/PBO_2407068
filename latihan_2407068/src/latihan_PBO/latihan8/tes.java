package latihan_PBO.latihan8;

public class tes {
    public static void main(String[] args) {
        
        int[] angka = {1, 2, 3};
        // System.out.println(angka[3]);
        // System.out.println("Program selesai");
        try {
            System.out.println(angka[1]);
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e);
        } finally {
            System.out.println("Program selesai");
        }
    }
}
