package pl.daro.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.random;

//import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Darek on 2018-05-08.
 */
@Configuration
//@ComponentScan//(basePackageClasses = ComponentScanPlayerFlag.class)
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        CompactDisc cd = new BlankDisc();
        int rnd = (int) Math.floor(1 + (random() * 2));
        switch (rnd) {
            case 1:
                cd = new SgtPeppers();
                break;
            case 2:
                String tittle = "Sgt. Pepper's2 Lonely Hearts Club Band";
                String artist = "The Beatles";
                List<String> track = Arrays.asList("one", "two", "three");
                ((BlankDisc) cd).setArtist(artist);
                ((BlankDisc) cd).setTittle(tittle);
                ((BlankDisc) cd).setTrack(track);
                break;
        }
        return cd;
    }
//    @Bean MediaPlayers cdTerriblePlayer(CompactDisc cd){
//        MediaPlayers cdPlayer = new CDPlayer();
//        cdPlayer.insertDisc(cd);
//        return cdPlayer;
//    }

}
