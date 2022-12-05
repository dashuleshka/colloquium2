import org.junit.jupiter.api.Test;

public class AttackMonsterAction {
    public AttackMonsterAction(int i, int i1, Object opponent) {
        super(() -> new AttackMonsterAction(0, 0, opponent));
    }
}

    @Test
    public void testConstructor() {
        new AttackMonsterAction(0, 0, opponent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeMonsterIndex() {
        new AttackMonsterAction(-1, 0, opponent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeTargetMonsterIndex() {
        Object opponent;
        opponent = null;
        new AttackMonsterAction(0, -1, opponent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTooHighTargetMonsterIndex() {
        Object opponent = null;
        new AttackMonsterAction(0, 5, opponent);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullPlayer() {
        new AttackMonsterAction(0, 0, null);
    }