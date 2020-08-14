package mx.unam.poo.pointLineArray;

public class Line {

    private Point begin = new Point();
    private Point end = new Point();

    public Line(int x1, int y1, int x2, int y2) {
        begin.setX(x1);
        begin.setY(y1);
        end.setX(x2);
        end.setY(y2);
    }

    public Line(Point begin, Point end) {
        this.begin.setXY(begin.getX(), begin.getY());
        this.end.setXY(end.getX(), end.getY());
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int[] getBeginXY() {
        return this.begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getEndXY() {
        return this.end.getXY();
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    @Override
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }

    public double getLength() {
        return begin.distance(end);
    }
}
