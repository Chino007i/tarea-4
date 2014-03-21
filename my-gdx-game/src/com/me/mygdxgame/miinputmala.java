package com.me.mygdxgame;


import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;




	public class miinputmala extends InputListener{
		pelotitamala t;
		miinputmala(pelotitamala param)
		{
			super();
			t= param;
		}

		@Override

		public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)	{
        
		
		System.out.println(Math.random()*1000%10);
		System.exit(0);
			return true;


			}
		}


