class numThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class PrintNum
{
    public static void main(String args[])
    {
        numThread t1=new numThread();
        t1.start();
    }
}