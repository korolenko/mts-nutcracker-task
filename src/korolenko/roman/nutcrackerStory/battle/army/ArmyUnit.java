package korolenko.roman.nutcrackerStory.battle.army;

import korolenko.roman.nutcrackerStory.battle.OrderResult;
import korolenko.roman.nutcrackerStory.battle.FightResulter;

public abstract class ArmyUnit implements Controllable {
    String name;
    Object technic;

    public ArmyUnit(String name, Object technic){
        this.name = name;
        this.technic = technic;
    }

    public String getName() {
        return name;
    }

    @Override
    public OrderResult executeOrder(korolenko.roman.nutcrackerStory.battle.army.Orders order) {
        OrderResult result =  FightResulter.getResult(this.getName(), order);
        System.out.println(String.format("%s doing %s and the result is %s", this.getName(), order, result));
        return result;
    }
}
