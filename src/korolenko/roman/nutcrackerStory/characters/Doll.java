package korolenko.roman.nutcrackerStory.characters;

import korolenko.roman.nutcrackerStory.NoiseVolumes;

import java.util.Objects;

public class Doll extends FantasticCreature {
    public Doll(String name, NoiseVolumes volume){
        super(name,volume);
    }

    public void say(String phrase){
        System.out.println(String.format("- %s - said %s", phrase, this.getName()));
    }

    public boolean makeHugs(Doll anotherDoll){
        if (!this.equals(anotherDoll)){
            System.out.println(
                    String.format("%s have successfully made hugs with %s", this.getName(), anotherDoll.getName()));
            return true;
        } else {
            System.out.println("Unable to make hugs. It's equals dolls");
            return false;
        }
    }

    public void cry(){
        System.out.println(
                String.format("%s is crying whith noize %s", this.getName(), this.getVolume().name()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doll doll = (Doll) o;
        return Objects.equals(this.getName(), doll.getName());
    }
}
