class HelloThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Hello");
        }
    }
}
class WelcomeThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Welcome");
        }
    }
}
public class HelloThreadTest
{
    public static void main(String[] args)
    {
        HelloThread h = new HelloThread();
        WelcomeThread w = new WelcomeThread();

        h.start();
        w.start();
    }
}