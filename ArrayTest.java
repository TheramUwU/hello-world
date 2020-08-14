package mx.unam.poo.pointLineArray;

public class ArrayTest {

    public static void main(String[] args) {
        
        Point begin1 = new Point(1,1);
        Point end1 = new Point(3,3);
        
        Line line1 = new Line(0,0,0,0);
        
        line1.setBegin(begin1);
        line1.setEnd(end1);
        System.out.println(""+line1.getBegin()+line1.getEnd());
        
        line1.setBeginX(-1);
        line1.setBeginY(2);
        line1.setEndX(-3);
        line1.setEndY(4);
        System.out.println("("+line1.getBeginX()+","+line1.getBeginY()+")("+line1.getEndX()+","+line1.getEndY()+")");
        
        line1.setBeginXY(0, 0);
        line1.setEndXY(3, 4);
        System.out.println(""+line1.getBeginXY()+line1.getEndXY());
        
        System.out.println(""+line1);
        
        System.out.println(""+line1.getLength());
    }

}
