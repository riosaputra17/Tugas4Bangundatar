public class Persegi extends BangunDatar {

    private float sisi = 0.0F;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return this.sisi * this.sisi;
    }

    @Override
    public float keliling() {
        return 4 * this.sisi;
    }
}
