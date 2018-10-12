package ObjectDrawPro;

import objectdraw.*;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.EventListener;
import java.util.HashMap;

import ObjectDrawPro.Listeners.StartListener;

/**
 * The main manager file for the engine, this is what is accessed to determine things.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */
public class Game {
    private Driver driver;
    
    private DrawingCanvas mainCanvas;
    private Scene scene;
    
    private HashMap<String, Scene> scenes = new HashMap<String, Scene>();
    
    Game(int width, int height) {
        driver = new Driver(width, height);
        mainCanvas = driver.getCanvas();
    }
    
    public void switchScene(Scene newScene) {
        mainCanvas.clear();
        
        scene = newScene;
        
        mainCanvas = scene.getCanvas();
    }
    
    public Scene getScene(String name) {
        return scenes.get(name);
    }
    
    public Scene getCurrentScene() {
        return scene;
    }
    
    public void addStartListener(StartListener listener) {
        driver.addListener(listener);
    }
    
    public void addMouseListener(MouseListener listener) {
        driver.addListener(listener);
    }
    
    public void addKeyListener(KeyListener listener) {
        driver.addKeyListener(listener);
    }
}