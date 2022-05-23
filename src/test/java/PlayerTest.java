import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void decrementsLiveAndRestoreLives(){
       Player p1 = new Player(100, 20, 10);
       Player p2 = new Player(100, 20, 10);

        p2.setHealth(p2.getHealth()-10);
        p1.subtractLives(p2);

        assertEquals(9, p2.getLives());
        assertEquals(100, p2.getHealth());
    }

    @Test
    public void healthDecreaseAfterAttack(){
        Player p1 = new Player(100, 20, 10);
        Player p2 = new Player(100, 20, 10);

        p1.attack(p2);
        assertEquals(80, p2.getHealth());
    }

}
