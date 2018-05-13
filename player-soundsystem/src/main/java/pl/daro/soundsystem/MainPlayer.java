package pl.daro.soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Darek on 2018-05-08.
 */
public class MainPlayer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CDPlayerTest-context.xml");
        MediaPlayers player = context.getBean(MediaPlayers.class);

        player.play();
    }
}
