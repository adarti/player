package pl.daro.soundsystem;

/**
 * Created by Darek on 2018-05-08.
 */
//@Component
public class SgtPeppers implements CompactDisc {
    private String tittle = "Sgt. Pepper's Lonely Hearts Club Band";
    private String band = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + tittle + " by " + band);
    }
}
