package pl.daro.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Darek on 2018-05-08.
 */
@Component
public class CDPlayer implements MediaPlayers {

    private CompactDisc cd;

//    public CDPlayer(CompactDisc cd) {
//        this.cd = cd;
//    }
//
//    public CDPlayer() {
//    }


    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    //    @Autowired
//    public CDPlayer(CompactDisc cd) {
//        this.cd = cd;
//    }
    @Autowired
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
