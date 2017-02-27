package kalgarn.tetrisgdx.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import kalgarn.tetrisgdx.TetrisGdx;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Tetris";
		config.width = 800;
		config.height = 600;
		new LwjglApplication(new TetrisGdx(), config);
	}
}
