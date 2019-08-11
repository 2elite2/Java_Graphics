import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Fungraphics extends GraphicsProgram{
	public void run()  {
		GLabel label = new GLabel("hello , world",100, 75);
		label.setFont("ClarendonSerif-38");
		label.setColor(Color.RED);
		add(label);
		
		
		GRect rect1 = new GRect(10,10,50,50);
		add(rect1);
		
		
		GRect rect2 = new GRect(300,75,200,100);
		rect2.setFilled(true);
		rect2.setColor(Color.RED);
		
		GOval oval = new GOval(300,75,200,100); 
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
		
		GLine myFunkieLine = new GLine(100,150,200,175);
		add(myFunkieLine);
		
		GLine dudewheremyline = new GLine(0,0,200,200);
		
		
		
		
		
		
	}

}
