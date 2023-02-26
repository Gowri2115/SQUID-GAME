
public class Cricket extends Games implements GameInt{
    public int Target,Run1,Run2;
    public static String Instructions;

    public Cricket(Player P1,Player P2) {
        this.P1=P1;
        this.P2=P2;
    }
    public void Play() {
        {
            SetPlayer();
            Batting();
            Bowling();
        }while(Run2==Target);
        WinLoss();
    }
    public void Batting() {
        int ch1,ch2;
        Run1=0;
        {
            ch1=RandomCalculate.random(5)+1;
            ch2=RandomCalculate.random(5)+1;
            if(ch1!=ch2) {
                Run1+=ch1;
            }
        }while(ch1!=ch2);
        Target=Run1;
    }
    public void Bowling() {
        int ch1,ch2;
        Run2=0;
        {
            ch1=RandomCalculate.random(5)+1;
            ch2=RandomCalculate.random(5)+1;
            if(ch1!=ch2) {
                Run2+=ch2;
            }
        }while(ch1!=ch2 || Run2<=Target );
    }

    public void SetPlayer() {
        int tossch,ch1,ch2,tosswin;
        tossch=RandomCalculate.random(1);
        ch1=RandomCalculate.random(5)+1;
        ch2=RandomCalculate.random(5)+1;
        tosswin=RandomCalculate.random(1)+1;
        if((ch1+ch2)%2==tossch) {
            if(tosswin==1) {
                P1.setPlayer(1);
                P2.setPlayer(2);
            }
            else {
                P1.setPlayer(2);
                P2.setPlayer(1);
            }
        }
        else {
            if(tosswin==1) {
                P1.setPlayer(2);
                P2.setPlayer(1);
            }
            else {
                P1.setPlayer(1);
                P2.setPlayer(2);
            }
        }
    }
    public void WinLoss() {
        if(Run2>Target) {
            if(P1.getPlayer()==2) {
                P2.dead();
                System.out.println(P1.getName()+" Eliminated "+P2.getName());
            }
            else{
                P1.dead();
                System.out.println(P2.getName()+" Eliminated "+P1.getName());
            }
        }
    }
}
