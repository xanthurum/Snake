
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
		matrix = new Matrix();
		panel = new JPanel();
		frame = new JFrame();
		area = new JTextField(5);
		setVisible(true);
		setSize(100,100);
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
			matrix.task(-1,0);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				matrix.task(0,1);
			}
			
		else if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				matrix.task(1,0);
			}
		
		else if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				matrix.task(0,-1);
			}
		}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
