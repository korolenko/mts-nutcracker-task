package korolenko.roman.nutcrackerStory;

public enum NoiseVolumes {
    BATTLE(1),
    DOLLS_CRY(2),
    SCREAMING_AND_SCREECHING_OF_THE_MOUSE_KING(3),
    THE_FORMIDABLE_VOICE_OF_THE_NUTCRACKER(3);

    private final Integer noiseLevel;

    public int getNoise(){
        return this.noiseLevel;
    }

    NoiseVolumes(int noiseLevel) {
        this.noiseLevel = noiseLevel;
    }
}
