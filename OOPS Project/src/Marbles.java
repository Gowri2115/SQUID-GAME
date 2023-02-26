
public class Marbles extends Games implements GameInt{
    public int Marble1=10,Marble2=10;
    public String OddEven1,OddEven2;
    public int MarbleHand1,MarbleHand2;
    public static String Instructions;

    public Marbles(Player P1, Player P2) {
        this.P1=P1;
        this.P2=P2;
        this.Marble1=10;
        this.Marble2=10;
    }
    public void Play() {
        PlayerSelect();
        int temp=0;
        while(Marble1!=20 || Marble2!=20) {
            if(Marble1==1 || Marble2==1) {
                PlayerNE();
            }
            else {
                if(temp%2==0) {
                    Player1ch();
                }
                else{
                    Player2ch();
                }
                temp++;
            }
        }
        WinLoss();
    }
    public void Player1ch(){
        MarbleHand1=RandomCalculate.random(Marble1)+1;
        MarbleHand2=RandomCalculate.random(Marble2)+1;
        OddEven1=OddEven(MarbleHand1);
        OddEven2=OddEven(MarbleHand2);
        if(OddEven1==OddEven2) {
            Marble2-=MarbleHand2;
            Marble1+=MarbleHand2;
        }
        else {
            Marble2+=MarbleHand1;
            Marble1-=MarbleHand1;
        }
    }
    public void Player2ch(){
        MarbleHand1=RandomCalculate.random(Marble2-1)+1;
        MarbleHand2=RandomCalculate.random(Marble1-1)+1;
        OddEven1=OddEven(MarbleHand1);
        OddEven2=OddEven(MarbleHand2);
        if(OddEven1==OddEven2) {
            Marble2+=MarbleHand1;
            Marble1-=MarbleHand1;
        }
        else {
            Marble2-=MarbleHand2;
            Marble1+=MarbleHand2;
        }
    }
    public void PlayerNE() {
        if(Marble1==1) {
            MarbleHand2=RandomCalculate.random(Marble2-1)+1;
            MarbleHand1=1;
            OddEven1=OddEven(RandomCalculate.random(1));
            OddEven2=OddEven(MarbleHand2);
            if(OddEven1==OddEven2) {
                Marble2-=MarbleHand2;
                Marble1+=MarbleHand2;
            }
            else {
                Marble2+=MarbleHand1;
                Marble1-=MarbleHand1;
            }
        }
        else {
            MarbleHand1=RandomCalculate.random(Marble1-1)+1;
            MarbleHand2=1;
            OddEven2=OddEven(RandomCalculate.random(1));
            OddEven1=OddEven(MarbleHand1);
            if(OddEven1==OddEven2) {
                Marble2+=MarbleHand1;
                Marble1-=MarbleHand1;
            }
            else {
                Marble2-=MarbleHand2;
                Marble1+=MarbleHand2;
            }
        }
    }
    public String OddEven(int a) {
        if(a%2==1) {
            return "ODD";
        }
        else {
            return "EVEN";
        }
    }
    public void WinLoss() {
        if(Marble1==20) {
            if(P1.getPlayer()==1) {
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
