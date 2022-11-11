public class Segitiga extends BangunDatar {

    private int alas = 0;
    private int tinggi = 0;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return 0.5F * this.alas * this.tinggi;
    }

    @Override
    public float keliling() {
        return (float) alas + alas + alas;
    }
}

