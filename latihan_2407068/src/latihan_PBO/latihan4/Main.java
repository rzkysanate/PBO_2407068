package latihan_PBO.latihan4;

public class Main {
    public static void main(String[] args) {

        persegi p = new persegi();

        p.setSisi(8);

        System.out.println("Luas Persegi = " + p.LuasPersegi());
        System.out.println("Keliling Persegi = " + p.KelilingPersegi());
    }
}

// public class Main {
//     public static void main(String[] args) {

//         persegipanjang pp = new persegipanjang();

//         pp.setPanjang(10);
//         pp.setLebar(5);

//         System.out.println("Luas Persegi Panjang = " + pp.LuasPersegiPanjang());
//         System.out.println("Keliling Persegi Panjang = " + pp.hitungKelilingPersegiPanjang());
//     }
// }

// public class MainSegitiga {
//     public static void main(String[] args) {

//         segitiga s = new segitiga();
//         s.setAlas(10);
//         s.setTinggi(5);

//         System.out.println("=== SEGITIGA ===");
//         System.out.println("Luas = " + s.hitungLuasSegitiga());
//         System.out.println("Keliling = " + s.hitungKelilingSegitiga());
//     }
// }

// public class MainBelahKetupat {
//     public static void main(String[] args) {

//         belahketupat bk = new belahketupat();
//         bk.setDiagonal1(8);
//         bk.setDiagonal2(6);
//         bk.setSisi(5);

//         System.out.println("=== BELAH KETUPAT ===");
//         System.out.println("Luas = " + bk.hitungLuasBelahKetupat());
//         System.out.println("Keliling = " + bk.hitungKelilingBelahKetupat());
//     }
// }