package korolenko.roman.nutcrackerStory.buttle.army;

import korolenko.roman.nutcrackerStory.buttle.OrderResult;
import korolenko.roman.nutcrackerStory.buttle.FightResulter;
import korolenko.roman.nutcrackerStory.characters.FantasticCreature;

public class MouseArmy extends Army{
    public MouseArmy(String name, FantasticCreature commander) {
        super(name, commander);
    }

    @Override
    public OrderResult executeOrder(korolenko.roman.nutcrackerStory.buttle.army.Orders order) {
        OrderResult result =  FightResulter.getResult(this.getName(), order);
        System.out.println(String.format("%s doing %s and the result is %s", this.getName(), order, result));
        return result;
    }
}
