package calculator;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener,KeyListener
{

	private JPanel contentPane;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bdot,bequal,badd,bsub,bdiv,bmul,bbackspace,bclear,bplusorminus;
	JLabel l1;
	JMenuBar menuBar;
	JMenu mnFile;
	
	
	
	
	private Color howercolor=new Color(0,139,139);
	
	private int font=35;
	
	private JMenuItem normalcalc,standardcalc,scintificcalc,datecalc,lengthcalc,tempcalc,energycalc,areacalc,speedcalc,pressurecalc,anglecalc,frequencycalc,volumecalc,masscalc;
	private JMenu follow;
	private JMenuItem instagram,facebook,twitter,youtube,github;
	private JLabel calculatorlbl,converterlbl;
	
	Border buttonborder,activebuttonborder;
	JTextArea message;
	
	double number1=0;
	char symbole='+';
	char number;
	Border border;
	DecimalFormat dc=new DecimalFormat("##.#########");
	
	/**00000
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
					frame.setLocation(400, 150);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Calculator() {
		
//		getFrame().setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("F:\\Assets\\Calculator button\\calcicon.png")))
		setResizable(false);
		Timer timer=new Timer(10,this);
		timer.start();
		
		setTitle("Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 504, 464);
	
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		 l1 = new JLabel("0");
		l1.setBackground(new Color(128, 128, 128));
		l1.setFont(new Font("Square721 BT", Font.BOLD, 35));
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		l1.setForeground(new Color(255, 255, 0));
		l1.setBounds(28, 43, 434, 59);
		l1.setOpaque(true);
		contentPane.add(l1);
		
		border=BorderFactory.createLineBorder(Color.green,1);
		
		
		b7 = new JButton("7");
		b7.setBackground(Color.WHITE);
		b7.setFont(new Font("Calibri", Font.BOLD, 30));
		b7.setBounds(28, 131, 79, 60);
		b7.setFocusPainted(false);
		b7.setFocusable(false);
		contentPane.add(b7);
		
		b8 = new JButton("8");
		b8.setFont(new Font("Calibri", Font.BOLD, 30));
		b8.setFocusable(false);
		b8.setFocusPainted(false);
		b8.setBackground(Color.WHITE);
		b8.setBounds(117, 131, 79, 60);
		contentPane.add(b8);
		
		 b9 = new JButton("9");
		b9.setFont(new Font("Calibri", Font.BOLD, 30));
		b9.setFocusable(false);
		b9.setFocusPainted(false);
		b9.setBackground(Color.WHITE);
		b9.setBounds(206, 131, 79, 60);
		contentPane.add(b9);
		
	   bbackspace = new JButton("\u232B");
		bbackspace.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		bbackspace.setFocusable(false);
		bbackspace.setFocusPainted(false);
		bbackspace.setBackground(Color.WHITE);
		bbackspace.setBounds(295, 131, 79, 60);
		contentPane.add(bbackspace);
		
		bclear = new JButton("C");
		bclear.setForeground(Color.black);
		bclear.setFont(new Font("Calibri", Font.BOLD, 30));
		bclear.setFocusable(false);
		bclear.setFocusPainted(false);
		bclear.setBackground(Color.white);
		bclear.setBounds(384, 131, 79, 60);
		contentPane.add(bclear);
		
		b4 = new JButton("4");
		b4.setFont(new Font("Calibri", Font.BOLD, 30));
		b4.setFocusable(false);
		b4.setFocusPainted(false);
		b4.setBackground(Color.WHITE);
		b4.setBounds(28, 202, 79, 60);
		contentPane.add(b4);
		
		b5 = new JButton("5");
		b5.setFont(new Font("Calibri", Font.BOLD, 30));
		b5.setFocusable(false);
		b5.setFocusPainted(false);
		b5.setBackground(Color.WHITE);
		b5.setBounds(117, 202, 79, 60);
		contentPane.add(b5);
		
		b6 = new JButton("6");
		b6.setFont(new Font("Calibri", Font.BOLD, 30));
		b6.setFocusable(false);
		b6.setFocusPainted(false);
		b6.setBackground(Color.WHITE);
		b6.setBounds(206, 202, 79, 60);
		contentPane.add(b6);
		
		bmul = new JButton("x");
		bmul.setFont(new Font("Calibri", Font.BOLD, 30));
		bmul.setFocusable(false);
		bmul.setFocusPainted(false);
		bmul.setBackground(Color.WHITE);
		bmul.setBounds(295, 202, 79, 60);
		contentPane.add(bmul);
		
		bdiv = new JButton("/");
		bdiv.setFont(new Font("Calibri", Font.BOLD, 30));
		bdiv.setFocusable(false);
		bdiv.setFocusPainted(false);
		bdiv.setBackground(Color.WHITE);
		bdiv.setBounds(384, 202, 79, 60);
		contentPane.add(bdiv);
		
		b1 = new JButton("1");
		b1.setFont(new Font("Calibri", Font.BOLD, 30));
		b1.setFocusable(false);
		b1.setFocusPainted(false);
		b1.setBackground(Color.WHITE);
		b1.setBounds(28, 273, 79, 60);
		contentPane.add(b1);
		
		b2 = new JButton("2");
		b2.setFont(new Font("Calibri", Font.BOLD, 30));
		b2.setFocusable(false);
		b2.setFocusPainted(false);
		b2.setBackground(Color.WHITE);
		b2.setBounds(117, 273, 79, 60);
		contentPane.add(b2);
		
	    b3 = new JButton("3");
		b3.setFont(new Font("Calibri", Font.BOLD, 30));
		b3.setFocusable(false);
		b3.setFocusPainted(false);
		b3.setBackground(Color.WHITE);
		b3.setBounds(206, 273, 79, 60);
		contentPane.add(b3);
		
		badd = new JButton("+");
		badd.setFont(new Font("Calibri", Font.BOLD, 30));
		badd.setFocusable(false);
		badd.setFocusPainted(false);
		badd.setBackground(Color.WHITE);
		badd.setBounds(295, 273, 79, 60);
		contentPane.add(badd);
		
		 bsub = new JButton("-");
		bsub.setFont(new Font("Calibri", Font.BOLD, 30));
		bsub.setFocusable(false);
		bsub.setFocusPainted(false);
		bsub.setBackground(Color.WHITE);
		bsub.setBounds(384, 273, 79, 60);
		contentPane.add(bsub);
		
	   b0 = new JButton("0");
		b0.setFont(new Font("Calibri", Font.BOLD, 30));
		b0.setFocusable(false);
		b0.setFocusPainted(false);
		b0.setBackground(Color.WHITE);
		b0.setBounds(29, 344, 79, 60);
		contentPane.add(b0);
		
		 b00 = new JButton("00");
		b00.setFont(new Font("Calibri", Font.BOLD, 30));
		b00.setFocusable(false);
		b00.setFocusPainted(false);
		b00.setBackground(Color.WHITE);
		b00.setBounds(117, 344, 79, 60);
		contentPane.add(b00);
		
		bdot = new JButton(".");
		bdot.setFont(new Font("Calibri", Font.BOLD, 30));
		bdot.setFocusable(false);
		bdot.setFocusPainted(false);
		bdot.setBackground(Color.WHITE);
		bdot.setBounds(206, 344, 79, 60);
		contentPane.add(bdot);
		
		 bequal = new JButton("=");
		 bequal.setForeground(Color.black);
		bequal.setFont(new Font("Calibri", Font.BOLD, 30));
		bequal.setFocusable(false);
		bequal.setFocusPainted(false);
		bequal.setBackground(Color.white);
		bequal.setBounds(384, 344, 79, 60);
		contentPane.add(bequal);
		b1.addActionListener(this);
		b1.setFocusable(false);
		b2.addActionListener(this);
		b2.setFocusable(false);
		b3.addActionListener(this);
		b3.setFocusable(false);
		b4.addActionListener(this);
		b4.setFocusable(false);
		b5.addActionListener(this);
		b5.setFocusable(false);
		b6.addActionListener(this);
		b6.setFocusable(false);
		b7.addActionListener(this);
		b7.setFocusable(false);
		b8.addActionListener(this);
		b8.setFocusable(false);
		b9.addActionListener(this);
		b9.setFocusable(false);
		b0.addActionListener(this);
		b0.setFocusable(false);
		b00.addActionListener(this);
		b00.setFocusable(false);
		bdiv.addActionListener(this);
		bdiv.setFocusable(false);
		bmul.addActionListener(this);
		bmul.setFocusable(false);
		bsub.addActionListener(this);
		bsub.setFocusable(false);

		badd.addActionListener(this);
		badd.setFocusable(false);
		bdot.addActionListener(this);
		bdot.setFocusable(false);
		bequal.addActionListener(this);
		bequal.setFocusable(false);
		bclear.addActionListener(this);
		bclear.setFocusable(false);
		bbackspace.addActionListener(this);
		bbackspace.setFocusable(false);
		
		message = new JTextArea();
		message.setEditable(false);
		message.setFont(new Font("Serif", Font.PLAIN, 20));
		message.setRows(2);
		message.setBounds(29, 92, 434, 28);
		contentPane.add(message);
		message.setVisible(false);
		addKeyListener(this);
		setFocusable(true);
		// setTraversarKeysEnabled(true);
		
		 buttonborder=BorderFactory.createLineBorder(Color.gray,1);
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
		bequal.setBorder(buttonborder);
		badd.setBorder(buttonborder);
		bsub.setBorder(buttonborder);
		bmul.setBorder(buttonborder);
		bdiv.setBorder(buttonborder);
		bbackspace.setBorder(buttonborder);
		
			menubar();
			bplusorminus = new JButton("\u00B1");
			bplusorminus.setFont(new Font("Calibri", Font.BOLD, 30));
			bplusorminus.setFocusable(false);
			bplusorminus.setFocusPainted(false);
			bplusorminus.setBorder(buttonborder);
			bplusorminus.setBackground(Color.WHITE);
			bplusorminus.setBounds(295, 344, 79, 60);
			bplusorminus.addActionListener(this);
			contentPane.add(bplusorminus);
			
			
			
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
			this.howereffect(b00);
			this.howereffect(bdot);
			this.howereffect(bclear);
			this.howereffect(bbackspace);
			this.howereffect(bequal);
			this.howereffect(bplusorminus);
			this.howereffect(badd);
			this.howereffect(bsub);
			this.howereffect(bmul);
			this.howereffect(bdiv);
	}
	private void fontchange()
	{
		if(l1.getText().length()<=16)
		{
				font=35;
				
		}
	
		if(l1.getText().length()>16&&l1.getText().length()<22)
		{
			font=30;
		}
		if(l1.getText().length()<=30 &&l1.getText().length()>=22)
		{
			font=25;
		}
		if(l1.getText().length()>30)
		{
			font=20;
		}
		l1.setFont(new Font("Square721 BT", Font.BOLD, font));
	}
	private void checkinfinity()
	{
		if(number1==Double.POSITIVE_INFINITY||number==Double.NEGATIVE_INFINITY)
		{
			l1.setText("Infinity");
		}
		
	}
	public void actionPerformed(ActionEvent e)
	{
		Object source=e.getSource();
		fontchange();
		menubaractionlistener(source);
		
		
		if(l1.getText()=="Infinity")
		{
			l1.setText("0");
			number=0;
			symbole='+';
		}
		
			if(source==bclear)
		{
			l1.setText("0");
			number1=0;
			symbole='+';
		}
		else if(source==b1 )
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("1");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("1");
			}
			else 
			{
				l1.setText(str+"1");
			}
		}	
		else if(source==b2)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("2");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("2");
			}
			else 
			{
				l1.setText(str+"2");
			}
		}	
		else if(source==b3)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("3");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("3");
			}
			else 
			{
				l1.setText(str+"3");
			}
		}	
		else if(source==b4)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0' && str.length()==1)
			{
				l1.setText("4");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("4");
			}
			else 
			{
				l1.setText(str+"4");
			}
		}	
		else if(source==b5)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("5");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("5");
			}
			else 
			{
				l1.setText(str+"5");
			}
		}	
		else if(source==b6)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&&str.length()==1)
			{
				l1.setText("6");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("6");
			}
			else 
			{
				l1.setText(str+"6");
			}
		}	
		else if(source==b7)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("7");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("7");
			}
			else 
			{
				l1.setText(str+"7");
			}
		}	
		else if(source==b8)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("8");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("8");
			}
			else 
			{
				l1.setText(str+"8");
			}
		}	
		else if(source==b9)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("9");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("9");
				
			}
			else 
			{
				l1.setText(str+"9");
			}
		}	
		else if(source==b0)
		{
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0");
			}
			else 
			{
				l1.setText(str+"0");
			}
		}	
		else if(source==b00)
		{
			String str=l1.getText();
			if(str.length()==14)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0");
			}
			else 
			{
				l1.setText(str+"00");
			}
		}	
		
		else if(source==bdot)
		{
			String str=l1.getText();
			


			if(str.contains("."))
			{
				
			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0.");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0.");
			}
			else 
			{
				l1.setText(str+".");
			}
		}	
		else if(source==bbackspace)
		{
			String str=l1.getText();
			if(str.charAt(0)=='=')
			{
				l1.setText("0");
				number1=0;
				symbole='+';
				message.setText("");

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0");
			}
			else if(str.length()==1)
			{
				l1.setText("0");

			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				
				str=str.substring(0,str.length()-1);
				
				number1=0.00;
				l1.setText(str);
			}
			else 
			{
				str=str.substring(0,str.length()-1);
				// number1=Double.parseDouble(str);
				l1.setText(str);
			}
		}	
		else if(source==badd)
		{
			String str=l1.getText();
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"+");
				symbole='+';
			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0+");
				number1=0;
				 symbole='+';
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"+";
				
				l1.setText(str);
				symbole='+';
			}
	
			
		
			else 
			{
				if(symbole=='-')
				{
					number1=number1-Double.parseDouble(str);
				}
				else if(symbole=='x')
				{
					number1=number1*Double.parseDouble(str);
				}
				else if(symbole=='/')
				{
					number1=number1/Double.parseDouble(str);
				}
				else if(symbole=='+')
				{
					number1=number1+Double.parseDouble(str);
				}

				
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
					
				}
				
				l1.setText(str+"+");
				fontchange();
				checkinfinity();
				symbole='+';
			}
			 
		}
		else if(source==bsub)
		{
			String str=l1.getText();
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"-");
				symbole='-';
			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0-");
				number1=0;
				 symbole='-';
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"-";
				l1.setText(str);
				symbole='-';
			}
				
			
			else 
			{
				if(symbole=='-')
				{
					number1=number1-Double.parseDouble(str);
				}
				else if(symbole=='x')
				{
					number1=number1*Double.parseDouble(str);
				}
				else if(symbole=='/')
				{
					number1=number1/Double.parseDouble(str);
				}
				else if(symbole=='+')
				{
					number1=number1+Double.parseDouble(str);
				}

				
				str=dc.format(number1);
				
				l1.setText(str+"-");
				fontchange();
				checkinfinity();

				symbole='-';
			}
		}
		else if(source==bmul)
		{
			String str=l1.getText();
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"x");
				symbole='x';
			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0x");
				number1=0;
				 symbole='x';
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"x";
				l1.setText(str);
				symbole='x';
			}
				else if(str.charAt(0)=='='&&str.charAt(str.length()-1)=='=')
			{
				number1=0;
				l1.setText("0x");
				symbole='x';
			}
			
			else 
			{
				if(symbole=='-')
				{
					number1=number1-Double.parseDouble(str);
				}
				else if(symbole=='x')
				{
					number1=number1*Double.parseDouble(str);
				}
				else if(symbole=='/')
				{
					number1=number1/Double.parseDouble(str);
				}
				else if(symbole=='+')
				{
					number1=number1+Double.parseDouble(str);
				}

			

				str=dc.format(number1);	
				if(str.length()>14)
				{
					str=number1+"";
				}
				l1.setText(str+"x");
				fontchange();
				checkinfinity();

				symbole='x';
			}
		}
		else if(source==bdiv)
		{
			String str=l1.getText();
		 	 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"/");
				symbole='/';
			}

			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0/");
				 number1=0;
				 symbole='/';
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"/";
				l1.setText(str);
				
				symbole='/';

			}
				else if(str.charAt(0)=='='&&str.charAt(str.length()-1)=='=')
			{
				number1=0;
				l1.setText("0/");
				symbole='/';
			}
		
			else 
			{
				if(symbole=='-')
				{
					number1=number1-Double.parseDouble(str);
				}
				else if(symbole=='x')
				{
					number1=number1*Double.parseDouble(str);
				}
				else if(symbole=='/')
				{
					number1=number1/Double.parseDouble(str);
				}
				else if(symbole=='+')
				{
					number1=number1+Double.parseDouble(str);
				}


				
					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
					}
				l1.setText(str+"/");
				fontchange();
				checkinfinity();

				symbole='/';
			}
		}
		else if(source==bequal)
		{
			String str=l1.getText();
			int num=0;
			for(int i=0; i<str.length(); i++)
			{
				if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)
				{
					num=1;
				}
			}
			if(str.charAt(0)=='=')
			{
				
			}
			else if(num==0)
			{
				l1.setText("Error");
			}
		
			 else if(str.charAt(str.length()-1)==symbole)
				{
					str="="+str.substring(0,str.length()-1);
					l1.setText(str);
					symbole='+';
					number1=0;
				}
				else if(str.charAt(0)=='0'&& str.length()==1)
				{
					l1.setText("0");
				}
				else 
				{
					if(symbole=='-')
					{
						number1=number1-Double.parseDouble(str);
					}
					else if(symbole=='x')
					{
						number1=number1*Double.parseDouble(str);
					}
					else if(symbole=='/')
					{
						number1=number1/Double.parseDouble(str);
					}
					else if(symbole=='+')
					{
						number1=number1+Double.parseDouble(str);
					}
					else if(symbole=='=')
					{
						number1=Double.parseDouble(str);
					}

					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
					}
					fontchange();
					checkinfinity();


					l1.setText("="+str);
					symbole='+';
					number1=0;
				}

		
		

		}
		else if(source==bplusorminus)
		{
			String str=l1.getText();
			
			
			if(str.charAt(0)=='=')
			{
				str=str.substring(1,str.length());
				
				l1.setText(str);
				symbole='+';
			}
			if(str.length()>15)
			{
				
			}
	
			else if(str.charAt(0)=='-')
			{
				str=str.substring(1,str.length());
				
				l1.setText(str);
				
			}
			else 
				
			{
				

				str="-"+str.substring(0,str.length());
				
				l1.setText(str);
				number1=-number1;
				
				
			}
		}
		if(l1.getText().charAt(0)=='-' &&l1.getText().charAt(1)=='0'&&l1.getText().length()>2)
		{
			String str=l1.getText();
			str="-"+str.substring(2);
			l1.setText(str);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		if(l1.getText()=="Infinity")
		{
			l1.setText("0");
			number=0;
			symbole='+';
		}
		fontchange();
		checkinfinity();

		if(e.getKeyCode()==KeyEvent.VK_DELETE)
		{
			this.howeronkey(bclear);
			l1.setText("0");
			number1=0;
			symbole='+';
		}
		else if(e.getKeyChar()=='1')
		{
			
			this.howeronkey(b1);
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("1");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("1");
			}
			else 
			{
				l1.setText(str+"1");
			}
		}	
		else if(e.getKeyChar()=='2')
		{
			this.howeronkey(b2);

			String str=l1.getText();
				if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("2");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("2");
			}
			else 
			{
				l1.setText(str+"2");
			}
		}	
		else if(e.getKeyChar()=='3')
		{
			
			this.howeronkey(b3);

			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("3");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("3");
			}
			else 
			{
				l1.setText(str+"3");
			}
		}	
		else if(e.getKeyChar()=='4')
		{
			this.howeronkey(b4);
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else 
			if(str.charAt(0)=='0' && str.length()==1)
			{
				l1.setText("4");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("4");
			}
			else 
			{
				l1.setText(str+"4");
			}
		}	
		else if(e.getKeyChar()=='5')
		{
			this.howeronkey(b5);
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("5");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("5");
			}
			else 
			{
				l1.setText(str+"5");
			}
		}	
		else if(e.getKeyChar()=='6')
		{
			this.howeronkey(b6);
			String str=l1.getText();
			
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&&str.length()==1)
			{
				l1.setText("6");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("6");
			}
			else 
			{
				l1.setText(str+"6");
			}
		}	
		else if(e.getKeyChar()=='7')
		{
			this.howeronkey(b7);

			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("7");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("7");
			}
			else 
			{
				l1.setText(str+"7");
			}
		}	
		else if(e.getKeyChar()=='8')
		{
			this.howeronkey(b8);
			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("8");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("8");
			}
			else 
			{
				l1.setText(str+"8");
			}
		}	
		else if(e.getKeyChar()=='9')
		{
			this.howeronkey(b9);

			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("9");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("9");
			}
			else 
			{
				l1.setText(str+"9");
			}
		}	
		else if(e.getKeyChar()=='0')
		{
			this.howeronkey(b0);

			String str=l1.getText();
			if(str.length()==15)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0");
			}
			else 
			{
				l1.setText(str+"0");
			}
		}	
		
		
		else if(e.getKeyChar()=='.')
		{
			this.howeronkey(bdot);
		
				String str=l1.getText();
				


				if(str.contains("."))
				{
					
				}
				else if(str.charAt(0)=='0'&& str.length()==1)
				{
					l1.setText("0.");
				}
				else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
				{
					l1.setText("0.");
				}
				else 
				{
					l1.setText(str+".");
				}
			
		}	
		else if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
		{
			this.howeronkey(bbackspace);

			String str=l1.getText();
			if(str.charAt(0)=='=')
			{
				l1.setText("0");
				number1=0;
				symbole='+';

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0");
			}
			else if(str.length()==1)
			{
				l1.setText("0");

			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				
				str=str.substring(0,str.length()-1);
				
				number1=0.00;
				l1.setText(str);
			}
			else 
			{
				str=str.substring(0,str.length()-1);
				// number1=Double.parseDouble(str);
				l1.setText(str);
			}
		}	
		else if(e.getKeyChar()=='+')
		{
			this.howeronkey(badd);
			String str=l1.getText();
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"+");
				symbole='+';
			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0+");
				number1=0;
				 symbole='+';
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"+";
				l1.setText(str);
				symbole='+';
			}
	
			
		
			else 
			{
				if(symbole=='-')
				{
					number1=number1-Double.parseDouble(str);
				}
				else if(symbole=='x')
				{
					number1=number1*Double.parseDouble(str);
				}
				else if(symbole=='/')
				{
					number1=number1/Double.parseDouble(str);
				}
				else if(symbole=='+')
				{
					number1=number1+Double.parseDouble(str);
				}

				
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
					
				}
				l1.setText(str+"+");
				fontchange();
				checkinfinity();

				symbole='+';
			}
		}
		else if(e.getKeyChar()=='-')
		{
			this.howeronkey(bsub);
			String str=l1.getText();
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"-");
				symbole='-';
			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0-");
				number1=0;
				 symbole='-';
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"-";
				l1.setText(str);
				symbole='-';
			}
				
			
			else 
			{
				if(symbole=='-')
				{
					number1=number1-Double.parseDouble(str);
				}
				else if(symbole=='x')
				{
					number1=number1*Double.parseDouble(str);
				}
				else if(symbole=='/')
				{
					number1=number1/Double.parseDouble(str);
				}
				else if(symbole=='+')
				{
					number1=number1+Double.parseDouble(str);
				}

				
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
					
				}
				
				l1.setText(str+"-");
				fontchange();
				checkinfinity();

				symbole='-';
			}
		}
		else if(e.getKeyChar()=='*')
		{
			this.howeronkey(bmul);

			String str=l1.getText();
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"x");
				symbole='x';
			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0x");
				number1=0;
				 symbole='x';
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"x";
				l1.setText(str);
				symbole='x';
			}
				else if(str.charAt(0)=='='&&str.charAt(str.length()-1)=='=')
			{
				number1=0;
				l1.setText("0x");
				symbole='x';
			}
			
			else 
			{
				if(symbole=='-')
				{
					number1=number1-Double.parseDouble(str);
				}
				else if(symbole=='x')
				{
					number1=number1*Double.parseDouble(str);
				}
				else if(symbole=='/')
				{
					number1=number1/Double.parseDouble(str);
				}
				else if(symbole=='+')
				{
					number1=number1+Double.parseDouble(str);
				}

			

				str=dc.format(number1);	
				if(str.length()>14)
				{
					str=number1+"";
					
				}
				l1.setText(str+"x");
				fontchange();
				checkinfinity();

				symbole='x';
			}
		}
		else if(e.getKeyChar()=='/')
		{
			this.howeronkey(bdiv);
			String str=l1.getText();
		 	 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"/");
				symbole='/';
			}

			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0/");
				 number1=0;
				 symbole='/';
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"/";
				l1.setText(str);
				
				symbole='/';

			}
				else if(str.charAt(0)=='='&&str.charAt(str.length()-1)=='=')
			{
				number1=0;
				l1.setText("0/");
				symbole='/';
			}
		
			else 
			{
				if(symbole=='-')
				{
					number1=number1-Double.parseDouble(str);
				}
				else if(symbole=='x')
				{
					number1=number1*Double.parseDouble(str);
				}
				else if(symbole=='/')
				{
					number1=number1/Double.parseDouble(str);
				}
				else if(symbole=='+')
				{
					number1=number1+Double.parseDouble(str);
				}


				
					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
						
					}
				l1.setText(str+"/");
				fontchange();
				checkinfinity();

				symbole='/';
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyChar()=='=')
		{
		
			this.howeronkey(bequal);
			String str=l1.getText();
			
			if(str.charAt(0)=='=')
			{

			}
			 else if(str.charAt(str.length()-1)==symbole)
				{
					str="="+str.substring(0,str.length()-1);
					l1.setText(str);
					symbole='+';
					number1=0;
				}
				else if(str.charAt(0)=='0'&& str.length()==1)
				{
					l1.setText("0");
				}
				else 
				{
					if(symbole=='-')
					{
						number1=number1-Double.parseDouble(str);
					}
					else if(symbole=='x')
					{
						number1=number1*Double.parseDouble(str);
					}
					else if(symbole=='/')
					{
						number1=number1/Double.parseDouble(str);
					}
					else if(symbole=='+')
					{
						number1=number1+Double.parseDouble(str);
					}
					else if(symbole=='=')
					{
						number1=Double.parseDouble(str);
					}

					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
						
					}
					l1.setText("="+str);
					fontchange();
					checkinfinity();

					symbole='+';
					number1=0;
				}
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
		badd.setBackground(Color.white);
		badd.setForeground(Color.black);
		bsub.setBackground(Color.white);
		bsub.setForeground(Color.black);
		bmul.setBackground(Color.white);
		bmul.setForeground(Color.black);
		bdiv.setBackground(Color.white);
		bdiv.setForeground(Color.black);
		bclear.setBackground(Color.white);
		bclear.setForeground(Color.black);
		bequal.setBackground(Color.white);
		bequal.setForeground(Color.black);
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
		bequal.setBorder(buttonborder);
		badd.setBorder(buttonborder);
		bsub.setBorder(buttonborder);
		bmul.setBorder(buttonborder);
		bdiv.setBorder(buttonborder);
		bbackspace.setBorder(buttonborder);
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void howeronkey(JButton b)
	{
		b.setBackground(howercolor);
		b.setForeground(Color.white);
		b.setBorder(activebuttonborder);
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

