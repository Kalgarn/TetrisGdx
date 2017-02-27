package kalgarn.tetrisgdx;

import com.badlogic.gdx.Game;

public class TetrisGdx extends Game {

	
	@Override
	public void create () {
		Assets.load();

		this.setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}
}
