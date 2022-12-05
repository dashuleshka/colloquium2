import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        ElfSquadronFactory factory = new ElfSquadronFactory();
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
        mage.cast();
        archer.shoot();;
        warrior.attack();
    }

    @Test
    public void testConstructor() {
        Object opponent = null;
        new AttackMonsterAction(0, 0, opponent);
    }
}
interface Mage{
    public void cast();
}
interface Archer {
    public void shoot();
}

interface Warrior {
    public void attack();
}

class ElfSquadronFactory implements SquadronFactory {
    public Mage createMage() {
        return new ElfMage();
    }

    public Archer createArcher() {
        return new ElfArcher();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}

class ElfMage implements Mage {
    public void cast() {
        System.out.println("magic elf");
    }
}

class ElfArcher implements Archer {
    public void shoot() {
        System.out.println("using BOW");
    }
}

class ElfWarrior implements Warrior {
    public void attack() {
        System.out.println("using sword");
    }
}

