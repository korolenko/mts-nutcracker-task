package korolenko.roman.nutcrackerStory.battle;

import korolenko.roman.nutcrackerStory.NoiseVolumes;
import korolenko.roman.nutcrackerStory.battle.army.Army;

import java.util.ArrayList;
import java.util.List;

public class BattleField {
    private List<Army> enemies;
    private Location location;
    private NoiseVolumes volume;

    public BattleField(){
        this.enemies = new ArrayList<>();
    }

    public NoiseVolumes getNoise(){
        return this.volume;
    }

    public static Builder newBuilder() {
        return new BattleField().new Builder();
    }

    public class Builder{
        private Builder(){}

        public Builder addArmy(Army army){
            BattleField.this.enemies.add(army);
            return this;
        }

        public Builder addVolume(NoiseVolumes volume){
            BattleField.this.volume = volume;
            return this;
        }

        public Builder addLocation(Location location){
            BattleField.this.location = location;
            return this;
        }

        public BattleField build(){
            return BattleField.this;
        }
    }
}
