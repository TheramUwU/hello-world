package mx.unam.poo.pointLineArray;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    public int[] getXY() {
        int[] a = new int[2];
        a[0] = getX();
        a[1] = getY();
        return a;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public double distance(int x, int y) {
        double xdif;
        xdif = this.x - x;
        xdif = xdif * xdif;
        double ydif;
        ydif = this.y - y;
        ydif = ydif * ydif;
        return Math.sqrt(xdif + ydif);
    }

    public double distance(Point another) {
        double xdif;
        xdif = this.x - another.x;
        xdif = xdif * xdif;
        double ydif;
        ydif = this.y - another.y;
        ydif = ydif * ydif;
        return Math.sqrt(xdif + ydif);
    }

    public double distance() {
        double xsqr;
        xsqr = this.x * this.x;
        double ysqr;
        ysqr = this.y * this.y;
        return Math.sqrt(xsqr + ysqr);
    }
}
