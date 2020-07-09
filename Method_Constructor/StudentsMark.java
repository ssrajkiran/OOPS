import java.io.*;

class StudentsMark
{
    static void setdata()throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader ds = new BufferedReader(r);

        System.out.println("Enter student name:");
        String name = ds.readLine();
        System.out.println("Enter students id:");
        int id = Integer.parseInt(ds.readLine());   

    }
    static void setmark()throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader dr = new BufferedReader(r);

        System.out.println("Enter mark for Tamil:");
        int t = Integer.parseInt(dr.readLine());
        System.out.println("Enter mark for English:");
        int e = Integer.parseInt(dr.readLine());
        System.out.println("Enter mark for Maths:");
        int m = Integer.parseInt(dr.readLine());
        System.out.println("Enter mark for Social:");
        int so = Integer.parseInt(dr.readLine());
        System.out.println("Enter mark for Science:");
        int s = Integer.parseInt(dr.readLine());
    }
    public static void main(String args[])throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(r);

        System.out.println("Mark Sheet Entry:");
        System.out.println("How many students have to add:");
        int to =Integer.parseInt(input.readLine());


        for(int i=1;i<=to;i++)
        {  
             System.out.println("Do you want to set data(1->Yes,0->No)");
                int d =Integer.parseInt(input.readLine());
        if(d==1)
        {
                setdata();  
                setmark();
        }
        else
        {
            System.out.println("Exit");
        }
        }    
         
    }
}