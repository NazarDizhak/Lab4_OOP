package lotr;

public class CharacterFactory {

    static Character createCharacter() {
        int idx = (int)(Math.random()*4);

        if (idx == 0){
            return new Hobbit();
        }else if (idx == 1){
            return new Elf();
        }else if (idx == 2){
            return new King();
        }else{
            return new Knight();
        }
    }
}