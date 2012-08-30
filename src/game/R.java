package game;

import java.io.File;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.openal.AudioLoader;
import org.newdawn.slick.tests.SoundTest;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: DarkShade
 * Date: 28.08.12
 * Time: 20:18
 * To change this template use File | Settings | File Templates.
 */
public class R {

    public static Image terrain;

    public static Music test;

    public static Sound ost;

    static{
        //Graphics loading
        //try {
        //    terrain = new Image("res/terrain.png");
        //} catch (SlickException e) {
        //}
        //
        ////Audio loading
        //try {
        //    test = new Music("res/test.wav");
        //} catch (SlickException e) {
        //    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        //}

        //Sound loading
        try {
            ost = new Sound("res/ost.pm3");
        } catch (SlickException e) {
        }
    }

}
