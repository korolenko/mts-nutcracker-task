package korolenko.roman.nutcrackerStory.battle.army;

import korolenko.roman.nutcrackerStory.battle.OrderResult;
import korolenko.roman.nutcrackerStory.characters.FantasticCreature;


public class ToysArmy extends Army{
    public ToysArmy(String name, FantasticCreature commander) {
        super(name,commander);
    }

    @Override
    public OrderResult executeOrder(Orders orders) {
        return null;
    }
}
