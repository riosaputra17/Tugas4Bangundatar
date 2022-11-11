public class Lingkaran extends BangunDatar {



    private int r = 0;
    public static double PI = 3.14;

    public Lingkaran(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (PI * this.r * this.r);
    }

    @Override
    public float keliling() {
        return (float) (2 * PI * this.r);
    }
}
