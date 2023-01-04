package korolenko.roman.nutcrackerStory.battle.army;

public class Uniform {
    private final String uniformName;
    private boolean isDirty;

    public Uniform(String uniformName){
        this.uniformName = uniformName;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }
}
