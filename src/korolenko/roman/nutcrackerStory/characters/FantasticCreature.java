package korolenko.roman.nutcrackerStory.characters;

import korolenko.roman.nutcrackerStory.NoiseVolumes;

public class FantasticCreature {
    private final String name;
    private final NoiseVolumes volume;

    public FantasticCreature(String name, NoiseVolumes volume){
        this.name = name;
        this.volume = volume;
    }

    public NoiseVolumes getVolume(){
        return this.volume;
    }

    public String getName(){
        return this.name;
    }
}
