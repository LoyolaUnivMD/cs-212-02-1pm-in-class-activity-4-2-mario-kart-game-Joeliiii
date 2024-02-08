// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments

class MarioKartGame {
    public static void main(String[] args) {

        MarioKartPlayer Joel = new MarioKartPlayer("Joel", 0, "Mario");
        MarioKartPlayer Anneliese = new MarioKartPlayer("Anneliese", 10, "Rosalina");
        Anneliese.displayinfo();
        Joel.displayinfo();
        Joel.boostSpeed();
        Anneliese.boostSpeed();
        Anneliese.displayinfo();
        Joel.displayinfo();

        
    }
}
class MarioKartPlayer{
    private String PlayerName;
    private double speed;
    private String character;

    public MarioKartPlayer(String PlayerName, double speed, String character){
        this.PlayerName = PlayerName;
        this.character = character;
        this.speed = speed;

    }

    public void boostSpeed(){
        speed += 15;
        System.out.println(PlayerName + "'s speed has increased.");
    }
    public void displayinfo(){
        System.out.println(PlayerName +"'s character is " + character + " and their speed is " + speed);
    }

}
