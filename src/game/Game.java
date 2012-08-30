package game;

import org.newdawn.slick.*;

/**
 * Created with IntelliJ IDEA.
 * User: DarkShade
 * Date: 28.08.12
 * Time: 20:11
 * To change this template use File | Settings | File Templates.
 */
public class Game extends BasicGame {

    public Game(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        R.ost.play();
    }

    @Override
    public void update(GameContainer gc, int dt) throws SlickException {
        //Update
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        //Render
    }

    public static void main(String... args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new Game("Minecraft 2D"));
        app.start();
    }
}
