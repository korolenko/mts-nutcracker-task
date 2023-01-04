package korolenko.roman.nutcrackerStory.battle.army;

import korolenko.roman.nutcrackerStory.characters.FantasticCreature;

import java.util.ArrayList;
import java.util.List;

public class Army extends ArmyUnit implements Controllable {
    private final FantasticCreature commander;
    private List<Object> staff;

    public Army(String name, FantasticCreature commander){
        super(name,null);
        this.commander = commander;
        this.staff = new ArrayList<>();
    }

    public void setStaff(Object armyUnit){
        this.staff.add(armyUnit);
    }

    public String getName(){
        return this.name;
    }

}
