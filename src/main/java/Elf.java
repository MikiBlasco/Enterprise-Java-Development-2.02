public class Elf extends Player {

    public Elf(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void superCure(Player player){
        player.setHealth(getHealth()+10);
    }
}