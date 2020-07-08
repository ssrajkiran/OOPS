
public class RectangleArea {
    public static void main(String[] args) {
        int area1, area2;
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length = 15;
        rect1.width = 10;
        area1 = rect1.rectarea();
        rect2.getdata(20, 12);
        area2 = rect2.rectarea();
        System.out.println("Area1:" + area1);
        System.out.println("Area2:" + area2);
    }
}

class Rectangle {
    public int length, width;

    void getdata(int x, int y) {
        length = x;
        width = y;
    }

    int rectarea() {
        return length * width;
    }
}
