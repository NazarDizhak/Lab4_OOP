package lotr;

import lotr.kickstrategy.NobleKick;

public class Noble extends Character {
    
    public Noble(int shift){
        super((int)(Math.random()*(11) + shift), (int)(Math.random()*(11) + shift), new NobleKick());
    }
}
