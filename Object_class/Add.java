import java.io.*;
public class Add
{
int x,y;



    public static void main(String args[])throws Exception
    {
        InputStreamReader r =new InputStreamReader(System.in);
        BufferedReader  input =  new BufferedReader(r);
    Add ob1 = new Add(); 

    System.out.println("Addition of number using class and objects:");
    System.out.println("Enter 1st number:");
    ob1.x = Integer.parseInt(input.readLine());

    System.out.println("Enter 2nd number:");
    ob1.y = Integer.parseInt(input.readLine());
    int z = ob1.x + ob1.y;
    System.out.println("Output is:" +z);
      
   }

}