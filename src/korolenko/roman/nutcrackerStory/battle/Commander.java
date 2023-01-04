package korolenko.roman.nutcrackerStory.battle;

import korolenko.roman.nutcrackerStory.NoiseVolumes;
import korolenko.roman.nutcrackerStory.battle.army.CapableOfCommanding;
import korolenko.roman.nutcrackerStory.battle.army.Controllable;
import korolenko.roman.nutcrackerStory.battle.army.Orders;
import korolenko.roman.nutcrackerStory.characters.FantasticCreature;

public class Commander extends FantasticCreature implements Controllable, CapableOfCommanding {
    public Commander(String name, NoiseVolumes noise) {
        super(name,noise);
    }

    @Override
    public OrderResult executeOrder(korolenko.roman.nutcrackerStory.battle.army.Orders order) {
        OrderResult result =  FightResulter.getResult(this.getName(), order);
        System.out.println(String.format("%s doing %s and the result is %s", this.getName(), order, result));
        return result;
    }

    @Override
    public void giveAnOrder(Orders command, String forceName) {
        System.out.println(String.format("%s orders %s to do %s", this.getName(), forceName,command));
    }
}
