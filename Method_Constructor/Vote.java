import java.io.*;

class Vote
{
    public void name(String name)
    {
        System.out.println("welcome:"+name); 
        
    }
    public void age(int age)
    {
        if(age<18)
        {
            System.out.println("You are not allowed..");
        }  
        else
        {
            System.out.println("You are allowed..");
        }
    }

    public static void main(String args[])throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader input   = new BufferedReader(r);

        System.out.println("Enter your name:");
        String name = input.readLine();

        System.out.println("Enter your age:");
        int age = Integer.parseInt(input.readLine());


        
        Vote n = new Vote();
        Vote a = new Vote();
        n.name(name);
        a.age(age);
        
    }
}