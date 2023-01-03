package korolenko.roman.nutcrackerStory.buttle.army;

import korolenko.roman.nutcrackerStory.buttle.OrderResult;
import korolenko.roman.nutcrackerStory.buttle.FightResulter;

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
    public OrderResult executeOrder(korolenko.roman.nutcrackerStory.buttle.army.Orders order) {
        OrderResult result =  FightResulter.getResult(this.getName(), order);
        System.out.println(String.format("%s doing %s and the result is %s", this.getName(), order, result));
        return result;
    }
}
