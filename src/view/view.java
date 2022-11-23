package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class view extends JFrame
{
	JButton start ;
	JButton quit ;
	JPanel startmenu ;
	JLabel background ;
	
	public view()
	{
		this.setBounds(0, 0, 1300, 800);
		this.setVisible(true);
		this.setTitle("Hearthstone");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		startmenu = new JPanel() ;
		startmenu.setBounds(0, 0, 1300, 800);
		startmenu.setLayout(null);
		
		
		start = new JButton("Start") ;
		quit = new JButton("Quit") ;
		
		start.setBounds(550, 280, 200, 100);
		startmenu.add(start);
		
		quit.setBounds(550, 390, 200, 100);
		startmenu.add(quit);
		
		background = new JLabel() ;
		background.setBounds(0, 0, 1300, 800);
		background.setIcon(new ImageIcon("wallpaper.jpg"));
		startmenu.add(background);
		this.setContentPane(startmenu);
		
		
	}
	
	
	
	public static void main (String [] args)
	{
		view x = new view() ;
	}
}
