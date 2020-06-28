class rectangle_area
{
    int length,width;
    void getdata(int x,int y)
    {
        length =x;
        width=y;
    }   
    int rectarea()
    {
        int area =length*width;
        return (area);
    }
}
class rectarea
{
    public static void main(String[] args)
    {
        int area1,area2;
        rectangle_area rect1=new rectangle_area();
        rectangle_area rect2=new rectangle_area();
        rect1.length=15;
        rect1.width=10;
        area1=rect1.length*rect1.width;
        rect2.getdata(20,12);
        area2=rect2.rectarea();
        System.out.println("Area1:"+area1);
        System.out.println("Area2:"+area2);
    }
}