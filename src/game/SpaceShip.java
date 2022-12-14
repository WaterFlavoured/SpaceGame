package game;
import java.awt.Color;
import java.awt.Rectangle;

public class SpaceShip extends Rectangle{
	double xx, yy;  //double versions of x,y for precise moving
	double vx = 5.2;
	double vy = 6.3;
	Color clr = Color.GREEN;  //TODO: make the enemy one a different colour
	
	SpaceShip(){
		width = 50;
		height = 30;
		
		xx = SpaceMain.panW/2 - width/2;
		yy = SpaceMain.panH - 90;
		
		x = (int) xx;
		y = (int) yy;
		
		
	}
	
	void move (int key) {
		switch (key) {
		case 'W':		
			yy -=vy; break;
		case 'S':
			yy +=vy; break;
		case 'A':
			xx -=vx; break;
		case 'D':
			xx +=vx; break;
		}
		// wrap around on the screen
		if (xx < 0) xx = SpaceMain.panW;
		if (yy < 0) yy = SpaceMain.panH;
		if (xx > SpaceMain.panW) xx = 0;
		if (yy > SpaceMain.panH) yy = 0;
		
		//update final positions
		x = (int)xx;
		y = (int)yy;
	}
}
