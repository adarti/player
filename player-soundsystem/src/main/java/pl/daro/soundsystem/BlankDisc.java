package pl.daro.soundsystem;

import java.util.List;

/**
 * Created by Darek on 2018-05-08.
 */
//@Component
public class BlankDisc implements CompactDisc {
    private String tittle;
    private String artist;
    private List<String> track;

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTrack(List<String> track) {
        this.track = track;
    }

    @Override
    public void play() {
        System.out.println("Playing " + tittle + " by " + artist);
        for (String song : track) {
            System.out.println("song: " + song);
        }
    }
}
