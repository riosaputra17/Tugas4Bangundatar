public class Main {
    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran(10);
        lingkaran.setR(15);

        System.out.println("=== Lingkaran ===");
        System.out.println("PI = " + lingkaran.PI);
        System.out.println("r = " + lingkaran.getR());
        System.out.println("Luas Lingkaran = " + lingkaran.PI + " x " + lingkaran.getR() + " x " + lingkaran.getR() + " = " + lingkaran.luas());
        System.out.println("Keliling Lingkaran = 2 "  + " x " + lingkaran.PI + " x " + lingkaran.getR() + " = " + lingkaran.keliling());

        System.out.println();

        Segitiga segitiga = new Segitiga(15, 15);
        segitiga.setAlas(15);
        segitiga.setTinggi(15);

        System.out.println("=== Segitiga ===");
        System.out.println("Alas = " + segitiga.getAlas());
        System.out.println("Tinggi = " + segitiga.getTinggi());
        System.out.println("Luas Segitiga = 1/2 x " + segitiga.getAlas() + " x " + segitiga.getTinggi() + " = " + segitiga.luas());
        System.out.println("Keliling Segitiga = "  + segitiga.getAlas() + " x " + segitiga.getAlas() + " x " + segitiga.getAlas() + " = " + segitiga.keliling());

        System.out.println();

        Persegi persegi = new Persegi(15F);
        persegi.setSisi(20F);

        System.out.println("=== Persegi ===");
        System.out.println("Sisi = " + persegi.getSisi());
        System.out.println("Luas Persegi = " + persegi.getSisi() + " x " + persegi.getSisi() + " = " + persegi.luas());
        System.out.println("Keliling Persegi = 4 x "  + persegi.getSisi() + " = " + persegi.keliling());


    }
}