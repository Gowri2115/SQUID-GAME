public class SetGame {
    public Player[] R1=new Player[16];
    public Player[] R2=new Player[8];
    public Player[] R3=new Player[4];
    public Player[] R4=new Player[2];

    public static void Instructions() {
        RockPaperScissor.Instructions="This is instructions of Rock Paper Scissor";
        Marbles.Instructions="This is instructions of Marbles";
        TicTacToe.Instructions="This is instructions of TicTacToe";
        Cricket.Instructions="This is instructions of Cricket";
    }

    public void Round1(Player[] P) {
        int i;
        System.out.println(RockPaperScissor.Instructions);
        for(i=0;i<16;i++) {
            R1[i]=P[i];
        }
        RockPaperScissor[] G=new RockPaperScissor[8];
        for(i=0;i<8;i++) {
            G[i]=new RockPaperScissor(R1[2*i],R1[2*i+1]);
            G[i].Play();
        }
        System.out.println("Round 1 Over");
    }

    public void Round2(Player[] P) {
        int i;
        System.out.println(Marbles.Instructions);
        for(i=0;i<=8;i++) {
            R2[i]=P[i];
        }
        Marbles[] G=new Marbles[4];
        for(i=0;i<4;i++) {
            G[i]=new Marbles(R2[2*i],R2[2*i+1]);
            G[i].Play();
        }
        System.out.println("Round 2 Over");
    }

    public void Round3(Player[] P) {
        int i;
        System.out.println(TicTacToe.Instructions);
        for(i=0;i<=4;i++) {
            R3[i]=P[i];
        }
        TicTacToe[] G=new TicTacToe[2];
        for(i=0;i<4;i++) {
            G[i]=new TicTacToe(R3[2*i],R3[2*i+1]);
            G[i].Play();
        }
        System.out.println("Round 3 Over");
    }

    public void Round4(Player[] P) {
        int i;
        System.out.println(Cricket.Instructions);
        for(i=0;i<=2;i++) {
            R4[i]=P[i];
        }
        Cricket G= new Cricket(R4[0],R4[1]);
        G.Play();
        System.out.println("Round 4 Over");
    }

}
