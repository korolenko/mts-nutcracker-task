package korolenko.roman.nutcrackerStory.battle.army;

import korolenko.roman.nutcrackerStory.battle.OrderResult;
import korolenko.roman.nutcrackerStory.battle.FightResulter;
import korolenko.roman.nutcrackerStory.characters.FantasticCreature;

public class MouseArmy extends Army{
    public MouseArmy(String name, FantasticCreature commander) {
        super(name, commander);
    }

    @Override
    public OrderResult executeOrder(korolenko.roman.nutcrackerStory.battle.army.Orders order) {
        OrderResult result =  FightResulter.getResult(this.getName(), order);
        System.out.println(String.format("%s doing %s and the result is %s", this.getName(), order, result));
        return result;
    }
}
