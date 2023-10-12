package ontopic.week3.enums;

public enum DogSound {
    GOLDEN("bark"),
    LAB("BARK");
    String sound;
    DogSound(String sound) {
        this.sound = sound;
    }
}
