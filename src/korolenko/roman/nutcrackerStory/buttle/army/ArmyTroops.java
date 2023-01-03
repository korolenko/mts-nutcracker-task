package korolenko.roman.nutcrackerStory.buttle.army;

import korolenko.roman.nutcrackerStory.buttle.OrderResult;

import static korolenko.roman.nutcrackerStory.buttle.army.Orders.READY_TO_FIGHT;
import static korolenko.roman.nutcrackerStory.buttle.army.Orders.REFUSAL_TO_FIGHT;

public class ArmyTroops extends ArmyUnit {
    private Uniform uniform;
    public ArmyTroops(String name, Object technic, Uniform uniform) {
        super(name, technic);
        this.uniform = uniform;
    }

    public Uniform getUniform() {
        return uniform;
    }

    public void setUniform(Uniform uniform) {
        this.uniform = uniform;
    }

    public OrderResult isAbleToFight(){
        if(uniform.isDirty()){
            System.out.println("Uniform is dirty. Can`t fight");
            return this.executeOrder(REFUSAL_TO_FIGHT);
        } else {
            System.out.println("Uniform is clear. Ready to fight");
            return this.executeOrder(READY_TO_FIGHT);
        }
    }
}
