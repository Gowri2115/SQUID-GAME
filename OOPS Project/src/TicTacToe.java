
public class TicTacToe extends Games implements GameInt{
    static String Instructions;
    public String[][] Board = new String[3][3];
    public int x;

    public TicTacToe(Player P1, Player P2) {
        this.P1=P1;
        this.P2=P2;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Board[i][j]="-";
            }
        }
    }

    public void Play() {
        x=RandomCalculate.random(1);
        WinLoss();
    }

    public void WinLoss() {
        if(x==0) {
            P1.dead();
            System.out.println(P2.getName()+" Eliminated "+P1.getName());
        }
        else {
            P2.dead();
            System.out.println(P1.getName()+" Eliminated "+P2.getName());
        }
    }
}
