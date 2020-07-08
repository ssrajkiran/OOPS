import java.io.*;
public class Details
{
    String fname,lname;
    int age;
    long id;
    public static void main(String args[])throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader input =  new BufferedReader(r);
        Details ob1 = new Details();
        System.out.println("Enter the first name:");
        ob1.fname = input.readLine();

        System.out.println("Enter the last name:");
        ob1.lname = input.readLine();

        System.out.println("Enter your age:");
        ob1.age =Integer.parseInt(input.readLine());

        System.out.println("Enter your id:");
        ob1.id = Integer.parseInt(input.readLine());


        System.out.println("Your name is:" +ob1.fname+" "+ob1.lname);
        System.out.println("Your age is:" +ob1.age);
        System.out.println("Your id is:"+ob1.id);
    }
}