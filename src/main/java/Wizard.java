public class Wizard extends Player {

    public Wizard(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void superMagic(Player rival){
        rival.setStrength(getStrength()-5);
    }
}
