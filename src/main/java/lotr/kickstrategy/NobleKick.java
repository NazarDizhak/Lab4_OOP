package lotr.kickstrategy;

import lotr.Character;

public class NobleKick implements KickStrategy {

    @Override
    public void kick(Character whoKicks, Character whoIsKicked){
        whoIsKicked.setHp(whoIsKicked.getHp() - (int) (Math.random() * (whoKicks.getPower() + 1)));
    }
}
