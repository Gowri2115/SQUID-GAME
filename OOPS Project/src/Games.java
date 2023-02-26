
public abstract class Games {
    Player P1;
    Player P2;

    public void PlayerSelect() {
        int a = RandomCalculate.random(1);
        if(a==0) {
            P1.setPlayer(1);
            P2.setPlayer(2);
        }
        else {
            P1.setPlayer(2);
            P2.setPlayer(1);
        }
    }

}
