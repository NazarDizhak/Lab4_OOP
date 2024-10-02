package lotr;

public class GameManager{

    void fight(Character c1, Character c2) {
        System.out.println(c1 + " fights " + c2 + "\n");
        while (c1.isAlive() && c2.isAlive()) {
            if (move(c1, c2)) {
                break;
            }
            if (move(c2, c1)) {
                break;
            }
        }
    }

    Boolean move(Character c1, Character c2) {
        String c1_name = c1.getClass().getSimpleName();
        String c2_name = c2.getClass().getSimpleName();
        
        if (c1_name == c2_name){
            c1_name += "1";
            c2_name += "2";
        }

        int damage = c2.getHp();

        System.out.println(c1_name + " kicked " + c2_name);
        c1.kick(c2);

        damage -= c2.getHp();

        System.out.println(c1_name + " dealt " + damage + " damage to "  + c2 + "\n");
        if (c2.isAlive()) {
            return false;
        }
        System.out.println(c2_name + " is dead! \n" + c1_name + " has won!");
        return true;
    }
    public static void main(String[] args) {
        GameManager gm = new GameManager();
        gm.fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }
}
