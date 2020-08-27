import java.util.Random;

public class Bowling
{
    private int firstBall;
    private int secondBall;
    private int extraBall;
    private int frame;
    private int score;
    private Random r; 
    public Bowling()
    {
        firstBall = 0;
        secondBall = 0;
        extraBall = 0;
        frame = 0;
        score = 0;
        r = new Random();
    }
    public void displayFrame()
    {        
        if (score == 10)
        {
            System.out.println("Results from Frame #" + frame);
            System.out.println("First Ball:" + firstBall);
            System.out.println("Second Ball:" + secondBall);
            System.out.println("Extra Ball:" + extraBall);
            System.out.println("Total Score:" + score);
        }
        else 
        {
            System.out.println("Results from Frame #" + frame);
            System.out.println("First Ball:" + firstBall);
            System.out.println("Second Ball:" + secondBall);
            System.out.println("Total Score:" + score);
        }
    }
    public void updateScore()
    {
        score = score + firstBall + secondBall + extraBall;
    }
    public void bowlFrame()
    {
        if (frame == 10)
        {
            displayFrame();
        }
        else 
        {
            frame++;
            firstBall = r.nextInt(11);
            if (firstBall < 10)
            {
                secondBall = r.nextInt(10 - firstBall + 1);
            }
            else if (secondBall + firstBall == 10 && frame == 10)
            {
                extraBall = r.nextInt(11);
            }
            updateScore();
            displayFrame();
        }
    }
    public void reset()
    {
        firstBall = 0;
        secondBall = 0;
        extraBall = 0;
        score = 0;
        frame = 0;
    }
    public int playGame()
    {
        reset();
        int x = 0;
        while (x < 10)
        {
            x++;
            bowlFrame();
        }
        return score;
    }
}