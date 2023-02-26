
public class RockPaperScissor extends Games implements GameInt{
    public static String Instructions;
    public int Life1,Life2;
    public int RPS1,RPS2;

    public RockPaperScissor(Player P1, Player P2) {
        this.P1=P1;
        this.P2=P2;
        this.Life1=3;
        this.Life2=3;
    }

    public void Play() {
        PlayerSelect();
        while(Life1!=0 || Life2!=0) {
            RPS1=RandomCalculate.random(2);
            RPS2=RandomCalculate.random(2);
            if(RPS1==0 && RPS2==1 || RPS1==1 && RPS2==2 || RPS1==2 && RPS2==0) {
                Life1--;
            }
            else if(RPS2==0 && RPS1==1 || RPS2==1 && RPS1==2 || RPS2==2 && RPS1==0) {
                Life2--;
            }
        }
        WinLoss();

    }
    public void WinLoss() {
        if(Life1==0) {
            if(P1.getPlayer()==1) {
                P1.dead();
                System.out.println(P2.getName()+" Eliminated "+P1.getName());
            }
            else{
                P2.dead();
                System.out.println(P1.getName()+" Eliminated "+P2.getName());
            }
        }
    }
}
