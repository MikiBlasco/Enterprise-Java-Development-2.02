public class Warrior extends Player {

    public Warrior(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void superHit(Player rival){
        rival.setHealth(getHealth()-10);
    }
}
