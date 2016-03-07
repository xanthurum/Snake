
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Game extends JFrame implements KeyListener
{

	public Matrix matrix;
	private JTextField area;
	private JPanel panel;
	private JFrame frame;
	
	public Game()
	{
		Matrix matrix = new Matrix();
		panel = new JPanel();
		frame = new JFrame();
		area = new JTextField(5);
		setVisible(true);
		setSize(50,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.add(area);
		add(panel);
		area.addKeyListener(this);	
	}

	public static void main(String[] args) 
	{
		new Game();
		
	
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{

	}


	@Override
	public void keyPressed(KeyEvent e) 
	{
		if	(e.getKeyCode() == KeyEvent.VK_UP)
		{
			System.out.println("up");
		}
		else 
		{
			if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				//matrix.right(matrix);
				System.out.println("right");
			}
			
			if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				System.out.println("down");
			}
		
			if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				System.out.println("left");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
