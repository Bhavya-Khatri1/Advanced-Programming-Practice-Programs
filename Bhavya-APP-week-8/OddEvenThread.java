class oddThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i+=2)
        {
            System.out.println("Odd: "+i);
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
class evenThread extends Thread
{
    public void run()
    {
        for(int i=2;i<=10;i+=2)
        {
            System.out.println("Even: "+i);
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
public class OddEvenThread
{
    public static void main(String args[])
    {
        oddThread o1=new oddThread();
        evenThread e1=new evenThread();
        o1.start();
        e1.start();
    }
}