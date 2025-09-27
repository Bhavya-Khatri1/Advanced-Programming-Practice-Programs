class SquareRunnable implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Square of " + i + " = " + (i * i));
        }
    }
}
public class Square
{
    public static void main(String[] args)
    {
        SquareRunnable sr = new SquareRunnable();
        Thread t = new Thread(sr);
        t.start();
    }
}