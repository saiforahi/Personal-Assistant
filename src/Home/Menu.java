package Home;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Menu {

	public JFrame frame;
	private JLabel label_6,lblEclipse,lblExit,lblChrome,label_2,label,label_5;
	private JPanel panel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
		Functions.setBackground(label_6);
		logoTextAnimation();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.setTitle("Menu");
		frame.setIconImage(Functions.setIcon());
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setSize(new Dimension(screenSize.width, screenSize.height));
		frame.getContentPane().setPreferredSize(new Dimension(screenSize.width, screenSize.height));
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBackground(SystemColor.menu);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setLocation(0,0);
		
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1366, 768);
		frame.getContentPane().add(panel);
		
		label_5 = new JLabel("");
		label_5.setForeground(Color.DARK_GRAY);
		label_5.setFont(new Font("Sakkal Majalla", Font.BOLD, 16));
		label_5.setBounds(697, 347, 98, 18);
		panel.add(label_5);
		
		label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(204, 255, 102));
		label.setFont(new Font("Segoe Script", Font.BOLD, 24));
		label.setBounds(125, 430, 731, 50);
		panel.add(label);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_1.setBorder(new TitledBorder(new LineBorder(Color.GRAY, 4, true), "Menu", TitledBorder.CENTER, TitledBorder.TOP,  new Font("Sakkal Majalla",Font.PLAIN,44), Color.DARK_GRAY));
				lblChrome.setForeground(new Color(255, 255, 255));
				label_2.setForeground(new Color(255, 255, 255));
				lblEclipse.setForeground(new Color(255, 255, 255));
				lblExit.setForeground(new Color(255, 102, 0));
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				panel_1.setBorder(new TitledBorder(new LineBorder(Color.WHITE, 4, true), "Menu", TitledBorder.CENTER, TitledBorder.TOP,  new Font("Sakkal Majalla",Font.PLAIN,44), Color.WHITE));
				label_2.setForeground(Color.DARK_GRAY);
				lblChrome.setForeground(Color.DARK_GRAY);
				lblEclipse.setForeground(Color.DARK_GRAY);
				lblExit.setForeground(Color.DARK_GRAY);
			}
		});
		panel_1.setOpaque(false);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(new LineBorder(Color.WHITE, 4, true), "Menu", TitledBorder.CENTER, TitledBorder.TOP,  new Font("Sakkal Majalla",Font.PLAIN,44), Color.WHITE));
		panel_1.setBackground(new Color(0, 0, 0, 0));
		panel_1.setBounds(968, 86, 296, 333);
		panel.add(panel_1);
		
		lblExit = new JLabel("Sleep!");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblExit.setFont(new Font("Sakkal Majalla", Font.BOLD, 35));
				panel_1.setBorder(new TitledBorder(new LineBorder(Color.WHITE, 4, true), "Menu", TitledBorder.CENTER, TitledBorder.TOP,  new Font("Sakkal Majalla",Font.PLAIN,44), Color.WHITE));
				lblEclipse.setForeground(new Color(255, 255, 255));
				label_2.setForeground(new Color(255, 255, 255));
				lblChrome.setForeground(new Color(255, 255, 255));
				lblExit.setForeground(new Color(255, 102, 0));
			}
			public void mouseExited(MouseEvent arg0) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				lblExit.setFont(new Font("Sakkal Majalla", Font.BOLD, 27));
			}
		});
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.DARK_GRAY);
		lblExit.setFont(new Font("Sakkal Majalla", Font.BOLD, 33));
		lblExit.setBorder(null);
		lblExit.setBounds(42, 244, 210, 47);
		panel_1.add(lblExit);
		
		label_2 = new JLabel("WM Player");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				label_2.setFont(new Font("Sakkal Majalla", Font.BOLD, 37));
				panel_1.setBorder(new TitledBorder(new LineBorder(Color.WHITE, 4, true), "Menu", TitledBorder.CENTER, TitledBorder.TOP,  new Font("Sakkal Majalla",Font.PLAIN,44), Color.WHITE));
				lblChrome.setForeground(new Color(255, 255, 255));
				label_2.setForeground(new Color(255, 255, 255));
				lblEclipse.setForeground(new Color(255, 255, 255));
				lblExit.setForeground(new Color(255, 102, 0));
			}
			public void mouseExited(MouseEvent arg0) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				label_2.setFont(new Font("Sakkal Majalla", Font.BOLD, 27));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(isProcessRunning("wmplayer.exe"))
				{
					System.out.println("done");
				}
				else
				{
					try {
						frame.setState(JFrame.ICONIFIED);
						System.out.println("Opening notepad");
						Runtime runTime = Runtime.getRuntime();
						@SuppressWarnings("unused")
						Process process = runTime.exec("C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe");
						
						//process.destroy();
					} catch (IOException w) {
						w.printStackTrace();
					}
				}
				
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("Sakkal Majalla", Font.BOLD, 27));
		label_2.setBorder(null);
		label_2.setBounds(42, 131, 210, 38);
		panel_1.add(label_2);
		
		lblEclipse = new JLabel("Eclipse!");	
		lblEclipse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblEclipse.setFont(new Font("Sakkal Majalla", Font.BOLD, 45));
				panel_1.setBorder(new TitledBorder(new LineBorder(Color.WHITE, 4, true), "Menu", TitledBorder.CENTER, TitledBorder.TOP,  new Font("Sakkal Majalla",Font.PLAIN,44), Color.WHITE));
				lblChrome.setForeground(new Color(255, 255, 255));
				label_2.setForeground(new Color(255, 255, 255));
				lblEclipse.setForeground(new Color(255, 255, 255));
				lblExit.setForeground(new Color(255, 102, 0));
			}
			public void mouseExited(MouseEvent arg0) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				lblEclipse.setFont(new Font("Sakkal Majalla", Font.BOLD, 35));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					frame.setState(JFrame.ICONIFIED);
					System.out.println("Opening notepad");
					Runtime runTime = Runtime.getRuntime();
					@SuppressWarnings("unused")
					Process process = runTime.exec("C:\\Users\\raider\\eclipse\\java-oxygen\\eclipse\\eclipse.exe");
					
					//process.destroy();
				} catch (IOException w) {
					w.printStackTrace();
				}
			}
		});
		lblEclipse.setHorizontalAlignment(SwingConstants.CENTER);
		lblEclipse.setForeground(Color.DARK_GRAY);
		lblEclipse.setFont(new Font("Sakkal Majalla", Font.BOLD, 35));
		lblEclipse.setBounds(42, 180, 210, 38);
		panel_1.add(lblEclipse);
		
		lblChrome = new JLabel("Chrome");
		lblChrome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				lblChrome.setFont(new Font("Sakkal Majalla", Font.BOLD, 35));
				panel_1.setBorder(new TitledBorder(new LineBorder(Color.WHITE, 4, true), "Menu", TitledBorder.CENTER, TitledBorder.TOP,  new Font("Sakkal Majalla",Font.PLAIN,44), Color.WHITE));
				lblEclipse.setForeground(new Color(255, 255, 255));
				label_2.setForeground(new Color(255, 255, 255));
				lblChrome.setForeground(new Color(255, 255, 255));
				lblExit.setForeground(new Color(255, 102, 0));
			}
			public void mouseExited(MouseEvent arg0) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				lblChrome.setFont(new Font("Sakkal Majalla", Font.BOLD, 27));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					frame.setState(JFrame.ICONIFIED);
					System.out.println("Opening notepad");
					Runtime runTime = Runtime.getRuntime();
					@SuppressWarnings("unused")
					Process process = runTime.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome");
					
					//process.destroy();
				} catch (IOException w) {
					w.printStackTrace();
				}
			}
		});
		lblChrome.setHorizontalAlignment(SwingConstants.CENTER);
		lblChrome.setForeground(Color.DARK_GRAY);
		lblChrome.setFont(new Font("Sakkal Majalla", Font.BOLD, 27));
		lblChrome.setBorder(null);
		lblChrome.setBounds(42, 82, 210, 38);
		panel_1.add(lblChrome);
		
		label_6 = new JLabel("");
		label_6.setForeground(new Color(0, 51, 0));
		label_6.setBounds(3, 3, 1360, 762);
		panel.add(label_6);
	}
	
/******************************************** logo text animation ****************************/
	
	public void logoTextAnimation(){
		Runnable run=new Runnable(){
			public void run(){
				for (int i=0;i<i+1;i++)
				{
					if(i==1)
					{
						label_5.setHorizontalAlignment(SwingConstants.LEADING);
						label_5.setText("L");
						//lblTakeTests.setBorder(new LineBorder(new Color(0,0,102), 3));
					}
					else if(i==2)
					{
						label_5.setText("LA");
					}
					else if(i==3)
					{
						label_5.setText("LAB");
					}
					else if(i==4)
					{
						try {
							TimeUnit.MILLISECONDS.sleep(400);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						label_5.setText("LAB  S");
					}
					else if(i==5)
					{
						label_5.setText("LAB  Sy");
						
					}
					else if(i==6)
					{
						label_5.setText("LAB  Sym");
					}
					else if(i==7)
					{
						
						label_5.setText("LAB  Symb");
					}
					else if(i==8)
					{
						label_5.setText("LAB  Symbi");
					}
					else if(i==9)
					{
						label_5.setText("LAB  Symbio");
					}
					else if(i==10)
					{
						label_5.setText("LAB  Symbiot");
					}
					else if(i==11)
					{
						label_5.setText("LAB  Symbioti");
					}
					else if(i==12)
					{
						label_5.setText("LAB  Symbiotic");
						try {
							TimeUnit.MILLISECONDS.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						i=0;
						label_5.setText(null);
					}
					try {
						TimeUnit.MILLISECONDS.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
		};
		Thread design=new Thread(run);
		design.start();
	}
	public boolean isProcessRunning(final String processName) {
	    try {
			final Process process = Runtime.getRuntime().exec("tasklist");
			@SuppressWarnings("resource")
			final Scanner reader = new Scanner(process.getInputStream(), "UTF-8");
			while(reader.hasNextLine())
			    if(reader.nextLine().startsWith(processName))
			    	process.destroy();
			        return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return false;
	}
	public boolean isrunning(String name)
	{
		  try {
			Process process = Runtime.getRuntime().exec("sc query "+name);
			    @SuppressWarnings("resource")
				Scanner reader = new Scanner(process.getInputStream(), "UTF-8");
			    while(reader.hasNextLine())
			        if(reader.nextLine().contains(name))
			        	process.destroy();
			            return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    return false;
	}
}
