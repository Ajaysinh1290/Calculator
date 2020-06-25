package calculator;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Speed extends JFrame implements ActionListener, KeyListener
{

	private JPanel contentPane;
	private JMenuItem normalcalc,standardcalc,scintificcalc,datecalc,lengthcalc,tempcalc,energycalc,areacalc,speedcalc,pressurecalc,anglecalc,frequencycalc,volumecalc,masscalc;
	private JMenu follow;
	private JMenuItem instagram,facebook,twitter,youtube,github;
	private JLabel calculatorlbl,converterlbl;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b0;
	private JButton bdot;
	private JButton bclear;
	private JButton bbackspace;
	private JButton b00;
	private int font=30;
	private JLabel l1,l2;
	private Border activebuttonborder,buttonborder;
	private JComboBox combo1,combo2;
	Color howercolor=new Color(0,139,139);
	private JLabel lblNewLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Speed frame = new Speed();
					frame.setVisible(true);
					frame.setLocation(400,100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Speed() {
		addKeyListener(this);
		setFocusable(true);
		Timer timer=new Timer(10,this);
		timer.start();
		setResizable(false);
		setTitle("Speed");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(472,571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menubar();
		b1 = new JButton("1");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b1.setForeground(Color.BLACK);
		b1.setBackground(new Color(255, 255, 255));
		b1.setBounds(16, 460, 100, 61);
		b1.setFocusPainted(false);
		b1.setFocusable(false);
		contentPane.add(b1);
		
		b2 = new JButton("2");
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b2.setFocusPainted(false);
		b2.setBackground(Color.WHITE);
		b2.setBounds(126, 460, 100, 61);
		b2.setFocusable(false);
		contentPane.add(b2);
		
		b3 = new JButton("3");
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b3.setFocusPainted(false);
		b3.setBackground(Color.WHITE);
		b3.setBounds(236, 460, 100, 61);
		b3.setFocusable(false);
		contentPane.add(b3);
		
		b4 = new JButton("4");
		b4.setForeground(Color.BLACK);
		b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b4.setFocusPainted(false);
		b4.setBackground(Color.WHITE);
		b4.setBounds(16, 388, 100, 61);
		b4.setFocusable(false);
		contentPane.add(b4);
		
		b5 = new JButton("5");
		b5.setForeground(Color.BLACK);
		b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b5.setFocusPainted(false);
		b5.setBackground(Color.WHITE);
		b5.setBounds(126, 388, 100, 61);
		b5.setFocusable(false);
		contentPane.add(b5);
		
		b6 = new JButton("6");
		b6.setForeground(Color.BLACK);
		b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b6.setFocusPainted(false);
		b6.setBackground(Color.WHITE);
		b6.setBounds(236, 388, 100, 61);
		b6.setFocusable(false);
		contentPane.add(b6);
		
		b7 = new JButton("7");
		b7.setForeground(Color.BLACK);
		b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b7.setFocusPainted(false);
		b7.setBackground(Color.WHITE);
		b7.setBounds(16, 319, 100, 61);
		b7.setFocusable(false);
		contentPane.add(b7);
		
		b8 = new JButton("8");
		b8.setForeground(Color.BLACK);
		b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b8.setFocusPainted(false);
		b8.setBackground(Color.WHITE);
		b8.setBounds(126, 319, 100, 61);
		b8.setFocusable(false);
		contentPane.add(b8);
		
		b9 = new JButton("9");
		b9.setForeground(Color.BLACK);
		b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b9.setFocusPainted(false);
		b9.setBackground(Color.WHITE);
		b9.setBounds(236, 319, 100, 61);
		b9.setFocusable(false);
		contentPane.add(b9);
		
		b0 = new JButton("0");
		b0.setForeground(Color.BLACK);
		b0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b0.setBackground(Color.WHITE);
		b0.setFocusPainted(false);
		b0.setBounds(346, 388, 100, 61);
		b0.setFocusable(false);
		contentPane.add(b0);
		
		bdot = new JButton(".");
		bdot.setForeground(Color.BLACK);
		bdot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bdot.setBackground(Color.WHITE);
		bdot.setBounds(346, 319, 100, 61);
		bdot.setFocusPainted(false);
		bdot.setFocusable(false);
		contentPane.add(bdot);
		
		bclear = new JButton("C");
		bclear.setForeground(Color.BLACK);
		bclear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bclear.setBackground(Color.WHITE);
		bclear.setBounds(236, 248, 100, 61);
		bclear.setFocusPainted(false);
		bclear.setFocusable(false);
		contentPane.add(bclear);
		
		bbackspace = new JButton("\u232B");
		bbackspace.setForeground(Color.BLACK);
		bbackspace.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		bbackspace.setBackground(Color.WHITE);
		bbackspace.setBounds(346, 247, 100, 61);
		bbackspace.setFocusPainted(false);
		bbackspace.setFocusable(false);
		contentPane.add(bbackspace);
		
		b00 = new JButton("00");
		b00.setForeground(Color.BLACK);
		b00.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b00.setFocusPainted(false);
		b00.setBackground(Color.WHITE);
		b00.setBounds(346, 460, 100, 61);
		b00.setFocusable(false);
		contentPane.add(b00);
		
		
		buttonborder=BorderFactory.createLineBorder(Color.black,1);
		 activebuttonborder=BorderFactory.createLineBorder(howercolor,2);
			b1.setBorder(buttonborder);
			b2.setBorder(buttonborder);
			b3.setBorder(buttonborder);
			b4.setBorder(buttonborder);
			b5.setBorder(buttonborder);
			b6.setBorder(buttonborder);
			b7.setBorder(buttonborder);
			b8.setBorder(buttonborder);
			b9.setBorder(buttonborder);
			b0.setBorder(buttonborder);
			b00.setBorder(buttonborder);
			bdot.setBorder(buttonborder);
			bclear.setBorder(buttonborder);
			bbackspace.setBorder(buttonborder);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b0.addActionListener(this);
			bclear.addActionListener(this);
			bbackspace.addActionListener(this);
			b00.addActionListener(this);
			bdot.addActionListener(this);
		
			 l1 = new JLabel("0");
			l1.setForeground(Color.YELLOW);
			l1.setBackground(Color.GRAY);
			l1.setOpaque(true);
			l1.setFont(new Font("Square721 BT", Font.BOLD, 35));
			l1.setBounds(16, 44, 430, 61);
			contentPane.add(l1);
			
			 l2 = new JLabel("0");
			l2.setForeground(Color.YELLOW);
			l2.setBackground(Color.GRAY);
			font=30;
			l2.setFont(new Font("Square721 BT", Font.BOLD,font));
			l2.setBounds(16, 104, 430, 67);
			l2.setOpaque(true);
			contentPane.add(l2);
			
			combo1 = new JComboBox();
			combo1.setFont(new Font("Square721 BT", Font.PLAIN, 15));
			combo1.setModel(new DefaultComboBoxModel(new String[] {"Miles per hour", "Foot per second", "Metre per second", "Kilometre per second", "Kilometre per hour", "Knot"}));
			combo1.setSelectedIndex(0);
			combo1.setFocusable(false);
			combo1.setForeground(Color.BLACK);
			combo1.setBackground(Color.WHITE);
			combo1.setBounds(16, 192, 156, 25);
			contentPane.add(combo1);
	
			
			 combo2 = new JComboBox();
			combo2.setFont(new Font("Square721 BT", Font.PLAIN, 15));
			combo2.setModel(new DefaultComboBoxModel(new String[] {"Miles per hour", "Foot per second", "Metre per second", "Kilometre per second", "Kilometre per hour", "Knot"}));
			combo2.setForeground(Color.BLACK);
			combo2.setSelectedIndex(1);
			combo2.setFocusable(false);
			combo2.setBackground(Color.WHITE);
			combo2.setBounds(290, 192, 156, 25);
			contentPane.add(combo2);
			this.howereffect(b1);
			this.howereffect(b2);
			this.howereffect(b3);
			this.howereffect(b4);
			this.howereffect(b5);
			this.howereffect(b6);
			this.howereffect(b7);
			this.howereffect(b8);
			this.howereffect(b9);
			this.howereffect(b0);
			this.howereffect(bdot);
			this.howereffect(bclear);
			this.howereffect(bbackspace);
			
			lblNewLabel = new JLabel("\u2500\u2500\u2500\u2500>");
			lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
			lblNewLabel.setBounds(205, 190, 80, 22);
			contentPane.add(lblNewLabel);
			

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		fontchange();
		Object source=e.getSource();
		docalc();
		menubaractionlistener(source);
		if(source==b1)
		{
			insertnumber(1);
		}
		else if(source==b2)
		{
			insertnumber(2);
		}
		else if(source==b3)
		{
			insertnumber(3);
		}
		else if(source==b4)
		{
			insertnumber(4);
		}
		else if(source==b5)
		{
			insertnumber(5);
		}
		else if(source==b6)
		{
			insertnumber(6);
		}
		else if(source==b7)
		{
			insertnumber(7);
		}
		else if(source==b8)
		{
			insertnumber(8);
		}
		else if(source==b9)
		{
			insertnumber(9);
		}
		else if(source==b0)
		{
			insertnumber(0);
		}
		else if(source==b00)
		{
			if(l1.getText().length()>14)
			{
			
			}
			else if(l1.getText().length()==1 && l1.getText().charAt(0)=='0')
			{
				
			}
			else
			{
				l1.setText(l1.getText()+"00");
			}
			
		}
		else if(source==bdot)
		{
			String str=l1.getText();
			
			if(str.length()>14)
			{
			
			}
			else if(str.contains("."))
			{
				
			}
			else if(str.charAt(0)=='0' &&str.length()==1)
			{
			l1.setText("0."+"");
			}
			else
			{
			l1.setText(str+".");
			}
		}
		else if(source==bbackspace)
		{
			String str=l1.getText();
			if(str.length()==1)
			{
				l1.setText("0");
			}
			else
			{
				l1.setText(str.substring(0,str.length()-1));
			}
			
		}
		else if(source==bclear)
		{
			l1.setText("0");
		}
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub
		fontchange();
		docalc();
		if(e.getKeyChar()=='1')
		{
			howeronkey(b1);
			insertnumber(1);
		}
		else if(e.getKeyChar()=='2')
		{
			howeronkey(b2);
			insertnumber(2);
			
		}
		else if(e.getKeyChar()=='3')
		{
			howeronkey(b3);
			insertnumber(3);
		}
		else if(e.getKeyChar()=='4')
		{
			howeronkey(b4);
			insertnumber(4);
		}
		else if(e.getKeyChar()=='5')
		{
			howeronkey(b5);
			insertnumber(5);
		}
		else if(e.getKeyChar()=='6')
		{
			howeronkey(b6);
			insertnumber(6);
		}
		else if(e.getKeyChar()=='7')
		{
			howeronkey(b7);
			insertnumber(7);
		}
		else if(e.getKeyChar()=='8')
		{
			howeronkey(b8);
			insertnumber(8);
		}
		else if(e.getKeyChar()=='9')
		{
			howeronkey(b9);
			insertnumber(9);
		}
		else if(e.getKeyChar()=='0')
		{
			howeronkey(b0);
			insertnumber(0);
		}
		
		else if(e.getKeyChar()=='.')
		{
			String str=l1.getText();
			howeronkey(bdot);
			if(str.length()>14)
			{
			
			}
			else if(str.contains("."))
			{
				
			}
			else if(str.charAt(0)=='0' &&str.length()==1)
			{
			l1.setText("0."+"");
			}
			else
			{
			l1.setText(str+".");
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
		{
			String str=l1.getText();
			howeronkey(bbackspace);
			if(str.length()==1)
			{
				l1.setText("0");
			}
			else
			{
				l1.setText(str.substring(0,str.length()-1));
			}
			
		}
		else if(e.getKeyCode()==KeyEvent.VK_DELETE)
		{
			howeronkey(bclear);
			l1.setText("0");
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b2.setBackground(Color.white);
		b2.setForeground(Color.black);
		b3.setBackground(Color.white);
		b3.setForeground(Color.black);
		b4.setBackground(Color.white);
		b4.setForeground(Color.black);
		b5.setBackground(Color.white);
		b5.setForeground(Color.black);
		b6.setBackground(Color.white);
		b6.setForeground(Color.black);
		b7.setBackground(Color.white);
		b7.setForeground(Color.black);
		b8.setBackground(Color.white);
		b8.setForeground(Color.black);
		b9.setBackground(Color.white);
		b9.setForeground(Color.black);
		b0.setBackground(Color.white);
		b0.setForeground(Color.black);
		bdot.setBackground(Color.white);
		bdot.setForeground(Color.black);
		bbackspace.setBackground(Color.white);
		bbackspace.setForeground(Color.black);
		
		bclear.setBackground(Color.white);
		bclear.setForeground(Color.black);
		b1.setBorder(buttonborder);
		b2.setBorder(buttonborder);
		b3.setBorder(buttonborder);
		b4.setBorder(buttonborder);
		b5.setBorder(buttonborder);
		b6.setBorder(buttonborder);
		b7.setBorder(buttonborder);
		b8.setBorder(buttonborder);
		b9.setBorder(buttonborder);
		b0.setBorder(buttonborder);
		b00.setBorder(buttonborder);
		bdot.setBorder(buttonborder);
		bclear.setBorder(buttonborder);
		bbackspace.setBorder(buttonborder);
	}

	public void howereffect(JButton b)
	{
		
		b.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent evt)
			{
				b.setBackground(howercolor);
				b.setForeground(Color.white);
				b.setBorder(activebuttonborder);
			}
			public void mouseExited(MouseEvent evt)
			{
				b.setBackground(Color.white);
				b.setForeground(Color.black);
				b.setBorder(buttonborder);
			}
		});
	}
	public void howeronkey(JButton b)
	{
		b.setBackground(howercolor);
		b.setForeground(Color.white);
		b.setBorder(activebuttonborder);
	}
	public void insertnumber(int num)
	{
		String str=l1.getText();
		if(str.length()>14)
		{
		
		}
		else if(str.charAt(0)=='0' &&str.length()==1)
		{
		l1.setText(num+"");
		}
		else
		{
		l1.setText(str+num);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private void fontchange()
	{
		if(l2.getText().length()<=20)
		{
				font=30;
				
		}
	
		if(l2.getText().length()>20&&l2.getText().length()<25)
		{
			font=25;
			
		}
		if(l2.getText().length()<=30&&l2.getText().length()>=25)
		{
			font=20;
		}
		if(l2.getText().length()>30)
		{
			font=15;
		}
		l2.setFont(new Font("Square721 BT", Font.BOLD, font));
	}

	public void docalc()
	{
		String firstm=(String) combo1.getSelectedItem();
		String secondm=(String) combo2.getSelectedItem();
			fontchange();
			if(firstm==secondm)
			{
				Double number=Double.parseDouble(l1.getText());
				l2.setText(number+"");
			}
			if(firstm=="Miles per hour")
			{
				if(secondm=="Miles per hour")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number)+"");	
				}
				else if(secondm=="Foot per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*1.46667)+"");	
				}
				else if(secondm=="Metre per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/2.237)+"");	
				}
				else if(secondm=="Kilometre per hour")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*1.609)+"");	
				}
				else if(secondm=="Knot")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/1.151)+"");	
				}
			}
			else if(firstm=="Foot per second")
			{
				if(secondm=="Miles per hour")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/1.467)+"");	
				}
				else if(secondm=="Foot per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number)+"");	
				}
				else if(secondm=="Metre per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/3.281)+"");	
				}
				else if(secondm=="Kilometre per hour")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*1.097)+"");	
				}
				else if(secondm=="Knot")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/1.688)+"");	
				}
			}
			else if(firstm=="Metre per second")
			{
				if(secondm=="Miles per hour")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*2.23694)+"");	
				}
				else if(secondm=="Foot per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*3.281)+"");	
				}
				else if(secondm=="Metre per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number)+"");	
				}
				else if(secondm=="Kilometre per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*3.6)+"");	
				}
				else if(secondm=="Knot")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*1.944)+"");	
				}
			}
			else if(firstm=="Kilometre per hour")
			{
				if(secondm=="Miles per hour")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/1.609)+"");	
				}
				else if(secondm=="Foot per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/1.6097)+"");	
				}
				else if(secondm=="Metre per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/3.6)+"");	
				}
				else if(secondm=="Kilometre per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number)+"");	
				}
				else if(secondm=="Knot")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/1.852)+"");	
				}
			}
			else if(firstm=="Knot")
			{
				if(secondm=="Miles per hour")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*1.151)+"");	
				}
				else if(secondm=="Foot per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*1.688)+"");	
				}
				else if(secondm=="Metre per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number/1.944)+"");	
				}
				else if(secondm=="Kilometre per second")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number*1.852)+"");	
				}
				else if(secondm=="Knot")
				{
					Double number=Double.parseDouble(l1.getText());
					l2.setText((number)+"");	
				}
			}
				
	}
	public void menubar()
	{
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 500, 40);
		contentPane.add(menuBar);
		JMenu mnFile = new JMenu("\u2261");
		mnFile.setForeground(Color.black);
		mnFile.setFont(new Font("Segoe UI Symbol", Font.BOLD, 30));
		menuBar.add(mnFile);
		
		normalcalc = new JMenuItem("Normal");
		normalcalc.addActionListener(this);
		
		calculatorlbl = new JLabel("calculator");
		calculatorlbl.setOpaque(true);
		calculatorlbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		calculatorlbl.setHorizontalAlignment(SwingConstants.CENTER);
		mnFile.add(calculatorlbl);
		normalcalc.setForeground(Color.BLACK);
		normalcalc.setBackground(Color.white);
		
		normalcalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		normalcalc.setHorizontalAlignment(SwingConstants.LEFT);
		mnFile.add(normalcalc);
		
		standardcalc = new JMenuItem("Standard");
		standardcalc.setForeground(Color.BLACK);
		standardcalc.setBackground(Color.WHITE);
		standardcalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		standardcalc.setHorizontalAlignment(SwingConstants.LEFT);
		mnFile.add(standardcalc);
		standardcalc.addActionListener(this);
		
		scintificcalc = new JMenuItem("Scintific");
		scintificcalc.setForeground(Color.BLACK);
		scintificcalc.setBackground(Color.WHITE);
		scintificcalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		scintificcalc.setHorizontalAlignment(SwingConstants.LEFT);
		mnFile.add(scintificcalc);
		scintificcalc.addActionListener(this);
		
		
		

		datecalc = new JMenuItem("Date Calculator");
		datecalc.setForeground(Color.BLACK);
		datecalc.setBackground(Color.WHITE);
		datecalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		datecalc.setHorizontalAlignment(SwingConstants.LEFT);
		datecalc.addActionListener(this);
		mnFile.add(datecalc);
		converterlbl = new JLabel("converter");
		converterlbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
		converterlbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		mnFile.add(converterlbl);
		
		
		lengthcalc = new JMenuItem("Length ");
		lengthcalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lengthcalc.setHorizontalAlignment(SwingConstants.LEFT);
		lengthcalc.addActionListener(this);
		lengthcalc.setForeground(Color.BLACK);
		lengthcalc.setBackground(Color.WHITE);
		mnFile.add(lengthcalc);

		
		

		tempcalc = new JMenuItem("Temperature");
		tempcalc.setBackground(Color.WHITE);
		tempcalc.setForeground(Color.black);
		tempcalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		tempcalc.setHorizontalAlignment(SwingConstants.LEFT);
		tempcalc.addActionListener(this);
		
		mnFile.add(tempcalc);
		
		energycalc = new JMenuItem("Energy");
		energycalc.setForeground(Color.black);
		energycalc.setBackground(Color.WHITE);
		energycalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		energycalc.setHorizontalAlignment(SwingConstants.LEFT);
		energycalc.addActionListener(this);
		mnFile.add(energycalc);
		
		areacalc = new JMenuItem("Area");
		areacalc.setForeground(Color.black);
		areacalc.setBackground(Color.WHITE);
		areacalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		areacalc.setHorizontalAlignment(SwingConstants.LEFT);
		areacalc.addActionListener(this);
		mnFile.add(areacalc);
		
		speedcalc = new JMenuItem("Speed");
		speedcalc.setForeground(Color.black);
		speedcalc.setBackground(Color.WHITE);
		speedcalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		speedcalc.setHorizontalAlignment(SwingConstants.LEFT);
		speedcalc.addActionListener(this);
		mnFile.add(speedcalc);
		
		pressurecalc = new JMenuItem("Pressure");
		pressurecalc.setForeground(Color.black);
		pressurecalc.setBackground(Color.WHITE);
		pressurecalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		pressurecalc.setHorizontalAlignment(SwingConstants.LEFT);
		pressurecalc.addActionListener(this);
		mnFile.add(pressurecalc);
		
		anglecalc = new JMenuItem("Angle");
		anglecalc.setForeground(Color.black);
		anglecalc.setBackground(Color.WHITE);
		anglecalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		anglecalc.setHorizontalAlignment(SwingConstants.LEFT);
		anglecalc.addActionListener(this);
		mnFile.add(anglecalc);
		
		frequencycalc = new JMenuItem("Frequency");
		frequencycalc.setForeground(Color.black);
		frequencycalc.setBackground(Color.WHITE);
		frequencycalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		frequencycalc.setHorizontalAlignment(SwingConstants.LEFT);
		frequencycalc.addActionListener(this);
		mnFile.add(frequencycalc);
		

		volumecalc = new JMenuItem("Volume");
		volumecalc.setForeground(Color.black);
		volumecalc.setBackground(Color.WHITE);
		volumecalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		volumecalc.setHorizontalAlignment(SwingConstants.LEFT);
		volumecalc.addActionListener(this);
		mnFile.add(volumecalc);
		
		masscalc = new JMenuItem("Mass");
		masscalc.setForeground(Color.black);
		masscalc.setBackground(Color.WHITE);
		masscalc.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		masscalc.setHorizontalAlignment(SwingConstants.LEFT);
		masscalc.addActionListener(this);
		mnFile.add(masscalc);
		
		 follow = new JMenu("follow me on");
		 follow.setBackground(Color.WHITE);
			follow.setForeground(Color.BLACK);
			follow.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			mnFile.add(follow);
			
			 instagram = new JMenuItem("Instgram");
			 instagram.setBackground(Color.WHITE);
			 instagram.setForeground(Color.BLACK);
			instagram.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			instagram.addActionListener(this);
			follow.add(instagram);
			
			facebook = new JMenuItem("Facebook");
			facebook.setBackground(Color.WHITE);
			facebook.setForeground(Color.BLACK);
			facebook.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			facebook.addActionListener(this);
			follow.add(facebook);
			
			 twitter = new JMenuItem("Twitter");
			 twitter.setForeground(Color.BLACK);
			 twitter.setBackground(Color.WHITE);
			twitter.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			twitter.addActionListener(this);
			follow.add(twitter);
			
			youtube = new JMenuItem("Youtube");
			youtube.setForeground(Color.BLACK);
			youtube.setBackground(Color.WHITE);
			youtube.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			youtube.addActionListener(this);
			follow.add(youtube);
			
			github = new JMenuItem("Github");
			github.setForeground(Color.BLACK);
			github.setBackground(Color.WHITE);
			github.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			github.addActionListener(this);
			follow.add(github);
		
		normalcalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\calculator.png"));
		standardcalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\standardcalculator.png"));
		scintificcalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\scintificcalculator.png"));
		datecalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\calendar.png"));
		lengthcalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\length.png"));
		tempcalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\temperature.png"));
		energycalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\energy.png"));
		areacalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\area.png"));
		speedcalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\speed.png"));
		pressurecalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\pressure.png"));
		anglecalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\angle.png"));
		frequencycalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\frequency.png"));
		volumecalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\volume.png"));
		masscalc.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\mass.png"));
		instagram.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\instagram.png"));
		youtube.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\youtube.png"));
		twitter.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\twitter.png"));
		facebook.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\facebook.png"));
		github.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\github.png"));
		follow.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\followme.png"));
		
		
		
		
	}
	public void menubaractionlistener(Object source)
	{
		if(source==standardcalc)
		{
			StandardCalculator sc=new StandardCalculator();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		else if(source==scintificcalc)
		{
			ScintificCalculator sc=new ScintificCalculator();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());

			this.dispose();	
		}
		else if(source==normalcalc)
		{
			Calculator sc=new Calculator();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());

			this.dispose();	
		}
		else if(source==datecalc)
		{
			DateCalculator sc=new DateCalculator();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());

			this.dispose();	
		}
		else if(source==lengthcalc)
		{
			Length sc=new Length();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());

			this.dispose();	
		}
		else if(source==tempcalc)
		{
			Temperature sc=new Temperature();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());

			this.dispose();	
		}
		else if(source==energycalc)
		{
			Energy sc=new Energy();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		else if(source==areacalc)
		{
			Area sc=new Area();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		else if(source==speedcalc)
		{
			Speed sc=new Speed();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		else if(source==pressurecalc)
		{
			Pressure sc=new Pressure();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		else if(source==anglecalc)
		{
			Angle sc=new Angle();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		else if(source==frequencycalc)
		{
			Frequency sc=new Frequency();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		
		else if(source==volumecalc)
		{
			Volume sc=new Volume();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		else if(source==masscalc)
		{
			Mass sc=new Mass();
			sc.setVisible(true);
			sc.setLocation(this.getX(),this.getY());
			this.dispose();
		}
		else if(source==instagram)
		{
			StringBuffer url=new StringBuffer("https://www.instagram.com/ll_ajayrathod_ll/");
			Desktop desktop=Desktop.getDesktop();
			try
			{
			desktop.browse(URI.create(url.toString()));
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		else if(source==facebook)
		{
			StringBuffer url=new StringBuffer("https://www.facebook.com/ajaysinh.rathod.7927");
			Desktop desktop=Desktop.getDesktop();
			try
			{
			desktop.browse(URI.create(url.toString()));
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		else if(source==twitter)
		{
			StringBuffer url=new StringBuffer("https://twitter.com/Ajaysin34751867");
			Desktop desktop=Desktop.getDesktop();
			try
			{
			desktop.browse(URI.create(url.toString()));
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		else if(source==youtube)
		{
			StringBuffer url=new StringBuffer("https://www.youtube.com/channel/UCbhGYVadJsZtJzHYMWLNRRQ");
			Desktop desktop=Desktop.getDesktop();
			try
			{
			desktop.browse(URI.create(url.toString()));
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		else if(source==github)
		{
			StringBuffer url=new StringBuffer("https://github.com/Ajaysinh1290");
			Desktop desktop=Desktop.getDesktop();
			try
			{
			desktop.browse(URI.create(url.toString()));
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	
		
	}


}
