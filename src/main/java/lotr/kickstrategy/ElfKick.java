package lotr.kickstrategy;

import lotr.Character;

public class ElfKick implements KickStrategy {

    @Override
    public void kick(Character whoKicks, Character whoIsKicked){
        if (whoIsKicked.getPower() < whoKicks.getPower()){
            whoIsKicked.setHp(0);
        }else{
            whoKicks.setPower(whoKicks.getPower() - 1);
        }
    }
}
