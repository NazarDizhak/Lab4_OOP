package lotr.kickstrategy;

import lotr.Character;

public interface KickStrategy {
    public void kick(Character whoKicks, Character whoIsKicked);
}
