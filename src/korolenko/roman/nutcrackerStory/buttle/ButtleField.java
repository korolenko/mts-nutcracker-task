package korolenko.roman.nutcrackerStory.buttle;

import korolenko.roman.nutcrackerStory.NoiseVolumes;
import korolenko.roman.nutcrackerStory.buttle.army.Army;

import java.util.ArrayList;
import java.util.List;

public class ButtleField {
    private List<Army> enemies;
    private Location location;
    private NoiseVolumes volume;

    public ButtleField(){
        this.enemies = new ArrayList<>();
    }

    public NoiseVolumes getNoise(){
        return this.volume;
    }

    public static Builder newBuilder() {
        return new ButtleField().new Builder();
    }

    public class Builder{
        private Builder(){}

        public Builder addArmy(Army army){
            ButtleField.this.enemies.add(army);
            return this;
        }

        public Builder addVolume(NoiseVolumes volume){
            ButtleField.this.volume = volume;
            return this;
        }

        public Builder addLocation(Location location){
            ButtleField.this.location = location;
            return this;
        }

        public ButtleField build(){
            return ButtleField.this;
        }
    }
}
