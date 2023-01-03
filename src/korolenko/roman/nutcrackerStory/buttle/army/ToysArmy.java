package korolenko.roman.nutcrackerStory.buttle.army;

import korolenko.roman.nutcrackerStory.buttle.OrderResult;
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
