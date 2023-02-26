public class Main {
    public static void main(String[] args) {

        String[] arr= new String[]{"King","Queen","Jack","Sparrow","Peter","Steve","Thomas","Solomon","Shelby","Rick","Andrew","Samuel","Arthur","Dutch","Hosea","Gerald"};

        //arr={"King","Queen","Jack","Sparrow","Peter","Steve","Thomas","Solomon","Shelby","Rick","Andrew","Samuel","Arthur","Dutch","Hosea","Gerald"};
        int i,alive,j;

        SetGame G=new SetGame();
        SetGame.Instructions();
        Player[] P1=new Player[16];
        Player.Total_Alive=16;
        alive=Player.Total_Alive;

        for(i=0;i<alive;i++) {
            P1[i]= new Player(arr[i]);
        }
        G.Round1(P1);

        j=0;
        Player[] P2=new Player[8];
        for(i=0;i<alive;i++) {
            if(!"Dead".equals(P1[i].getStatus())) {
                P2[j]= P1[i];
                j++;
            }
        }
        Player.isalive(P1,Player.Total_Alive);
        alive=Player.Total_Alive;
        System.out.println(alive+" Qualified to Next Round");
        G.Round2(P2);


        j=0;
        Player[] P3=new Player[4];
        for(i=0;i<alive;i++) {
            if(!P2[i].getStatus().equals("Dead")) {
                P3[j]= P2[i];
                j++;
            }
        }
        Player.isalive(P2,Player.Total_Alive);
        alive=Player.Total_Alive;
        System.out.println(alive+" Qualified to Next Round");
        G.Round3(P3);


        j=0;
        Player[] P4=new Player[2];
        for(i=0;i<alive;i++) {
            if(!P3[i].getStatus().equals("Dead")) {
                P4[j]= P3[i];
                j++;
            }
        }
        Player.isalive(P3,Player.Total_Alive);
        alive=Player.Total_Alive;
        System.out.println(alive+" Qualified to Next Round");
        G.Round4(P4);
        if(P4[0].getStatus().equals("Dead")) {
            System.out.println(P4[1]+" is the Winner");
        }
        else {
            System.out.println(P4[0]+" is the Winner");
        }
    }
}

