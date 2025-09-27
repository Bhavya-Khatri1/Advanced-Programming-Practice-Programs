class five extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("5 x "+i+" = "+(5*i));
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class ten extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("10 x "+i+" = "+(10*i));
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class Multiplication
{
    public static void main(String args[])
    {
        five f1=new five();
        ten t1=new ten();
        f1.start();
        try
        {
            f1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        t1.start();
    }
}