
public class Player {
    private String Name,Status;
    private int player;
    public static int Total_Alive;

    public Player(String Name){
        this.Name=Name;
        Status = "Alive";
    }

    public String getName() {
        return  Name;
    }

    public String getStatus() {
        return Status;
    }

    public void dead() {
        Status="Dead";
    }

    public void setPlayer(int player) {
        this.player=player;
    }

    public int getPlayer() {
        return player;
    }

    public static void isalive(Player p[],int x) {
        int i;
        for(i=0;i<x;i++) {
            if(p[i].Status=="Dead") {
                Total_Alive--;
            }
        }
    }

}
