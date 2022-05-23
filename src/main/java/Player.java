public class Player {

    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
    }

    public void attack(Player rival){
        int damage = getStrength();
        rival.setHealth(rival.getHealth()-damage);
    }

    public void subtractLives(Player rival){
        rival.setLives(9);
        rival.setHealth(100);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
