import java.awt.*;

public class Score extends Rectangle{

    static int SCREEN_WIDTH;
    static int SCREEN_HEIGTH;
    int player1;
    int player2;

    Score(int SCREEN_WIDTH, int SCREEN_HEIGTH){
        Score.SCREEN_HEIGTH = SCREEN_HEIGTH;
        Score.SCREEN_WIDTH = SCREEN_WIDTH;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60 ));

        g.drawLine(SCREEN_WIDTH/2, 0, SCREEN_WIDTH/2,SCREEN_HEIGTH);

        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (SCREEN_WIDTH/2)-85, 50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (SCREEN_WIDTH/2)+45, 50);
    }
}
