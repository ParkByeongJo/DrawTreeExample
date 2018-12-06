import javax.swing.*;
import java.awt.*;

public class DrawTreeExample extends JFrame{
	
	public DrawTreeExample() {
		this.setSize(800, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
		if(depth==0)
			return;
		int x2=x1+(int)(Math.cos(Math.toRadians(angle))*depth*10.0);
		int y2=y1+(int)(Math.sin(Math.toRadians(angle))*depth*10.0);
		g.drawLine(x1, y1, x2, y2);
		this.drawTree(g, x2, y2, angle-20, depth-1);
		this.drawTree(g, x2, y2, angle+20, depth-1);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		this.drawTree(g, 400, 600, -90, 10);
	}

	public static void main(String[] args) {
		new DrawTreeExample();
	}

}
