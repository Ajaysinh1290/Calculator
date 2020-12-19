package calculator;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.text.DecimalFormat;

import javax.swing.AbstractAction;
import javax.swing.Action;
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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class  ScintificCalculator extends JFrame implements ActionListener,KeyListener
{

	private JPanel contentPane;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bdot,bequal,badd,bsub,bdiv,bmul,bbackspace,bclear,bsqrt,bcbrt;
	JButton bsin,bcos,btan,basin;

	private int font=35;
	String equ="";
	private Color howercolor=new Color(0,139,139);
	private boolean printsp=false;
	private boolean infinityerror=false,error=false,invalidinput=false;
	JLabel l1;
	JMenuBar menuBar;
	JMenu mnFile;
	JTextArea equation;
	private JMenuItem normalcalc,standardcalc,scintificcalc,datecalc,lengthcalc,tempcalc,energycalc,areacalc,speedcalc,pressurecalc,anglecalc,frequencycalc,volumecalc,masscalc;
	private JMenu follow;
	private JMenuItem instagram,facebook,twitter,youtube,github;
	private JLabel calculatorlbl,converterlbl;
	Border buttonborder,activebuttonborder;
	double number1=0;
	char symbole='+';
	char number;
	Border border;
	DecimalFormat dc=new DecimalFormat("##.###########");
	private JButton bxsquare;
	private JButton bxcube;
	private JButton bxpowern;
	private JButton bonebyx;
	private JButton bpersantage;
	private JButton be;
	private JButton bpie;
	private JButton bxfactorial;
	private JScrollPane sp;
	private final Action action = new SwingAction();
	private JButton bplusorminus;
	private JButton bacos;
	private JButton batan;
	private JButton bhsin;
	private JButton bhcos;
	private JButton bhtan;
	private JButton blog;
	private JButton bln;
	private JButton ben;
	private JButton bnroot;
	private JButton bdegree;
	private JButton babs;
	
	
	/**00000
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScintificCalculator frame = new ScintificCalculator();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocation(100, 100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public ScintificCalculator() {
		
		setResizable(false);
		setTitle("Scintific Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 853, 574);
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
		l1.setBounds(28, 88, 790, 55);
		l1.setOpaque(true);
		contentPane.add(l1);
		
		border=BorderFactory.createLineBorder(Color.green,1);
		
		
		b7 = new JButton("7");
		b7.setForeground(Color.BLACK);
		b7.setBackground(Color.WHITE);
		b7.setFont(new Font("Calibri", Font.PLAIN, 30));
		b7.setBounds(28, 167, 79, 60);
		b7.setFocusPainted(false);
		b7.setFocusable(false);
		contentPane.add(b7);
		
		b8 = new JButton("8");
		b8.setForeground(Color.BLACK);
		b8.setFont(new Font("Calibri", Font.PLAIN, 30));
		b8.setFocusable(false);
		b8.setFocusPainted(false);
		b8.setBackground(Color.WHITE);
		b8.setBounds(117, 167, 79, 60);
		contentPane.add(b8);
		
		 b9 = new JButton("9");
		 b9.setForeground(Color.BLACK);
		b9.setFont(new Font("Calibri", Font.PLAIN, 30));
		b9.setFocusable(false);
		b9.setFocusPainted(false);
		b9.setBackground(Color.WHITE);
		b9.setBounds(206, 167, 79, 60);
		contentPane.add(b9);
		
	   bbackspace = new JButton("\u232B");
	   bbackspace.setForeground(Color.BLACK);
		bbackspace.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		bbackspace.setFocusable(false);
		bbackspace.setFocusPainted(false);
		bbackspace.setBackground(Color.WHITE);
		bbackspace.setBounds(295, 166, 79, 60);
		contentPane.add(bbackspace);
		
		bclear = new JButton("C");
		bclear.setForeground(Color.black);
		bclear.setFont(new Font("Calibri", Font.PLAIN, 30));
		bclear.setFocusable(false);
		bclear.setFocusPainted(false);
		bclear.setBackground(Color.white);
		bclear.setBounds(384, 167, 79, 60);
		contentPane.add(bclear);
		
		b4 = new JButton("4");
		b4.setForeground(Color.BLACK);
		b4.setFont(new Font("Calibri", Font.PLAIN, 30));
		b4.setFocusable(false);
		b4.setFocusPainted(false);
		b4.setBackground(Color.WHITE);
		b4.setBounds(28, 238, 79, 60);
		contentPane.add(b4);
		
		b5 = new JButton("5");
		b5.setForeground(Color.BLACK);
		b5.setFont(new Font("Calibri", Font.PLAIN, 30));
		b5.setFocusable(false);
		b5.setFocusPainted(false);
		b5.setBackground(Color.WHITE);
		b5.setBounds(117, 238, 79, 60);
		contentPane.add(b5);
		
		b6 = new JButton("6");
		b6.setForeground(Color.BLACK);
		b6.setFont(new Font("Calibri", Font.PLAIN, 30));
		b6.setFocusable(false);
		b6.setFocusPainted(false);
		b6.setBackground(Color.WHITE);
		b6.setBounds(206, 238, 79, 60);
		contentPane.add(b6);
		
		bmul = new JButton("x");
		bmul.setForeground(Color.BLACK);
		bmul.setFont(new Font("Calibri", Font.PLAIN, 30));
		bmul.setFocusable(false);
		bmul.setFocusPainted(false);
		bmul.setBackground(Color.WHITE);
		bmul.setBounds(295, 238, 79, 60);
		contentPane.add(bmul);
		
		bdiv = new JButton("/");
		bdiv.setForeground(Color.BLACK);
		bdiv.setFont(new Font("Calibri", Font.PLAIN, 25));
		bdiv.setFocusable(false);
		bdiv.setFocusPainted(false);
		bdiv.setBackground(Color.WHITE);
		bdiv.setBounds(384, 239, 79, 60);
		contentPane.add(bdiv);
		
		b1 = new JButton("1");
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Calibri", Font.PLAIN, 30));
		b1.setFocusable(false);
		b1.setFocusPainted(false);
		b1.setBackground(Color.WHITE);
		b1.setBounds(28, 310, 79, 60);
		contentPane.add(b1);
		
		b2 = new JButton("2");
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Calibri", Font.PLAIN, 30));
		b2.setFocusable(false);
		b2.setFocusPainted(false);
		b2.setBackground(Color.WHITE);
		b2.setBounds(117, 310, 79, 60);
		contentPane.add(b2);
		
	    b3 = new JButton("3");
	    b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Calibri", Font.PLAIN, 30));
		b3.setFocusable(false);
		b3.setFocusPainted(false);
		b3.setBackground(Color.WHITE);
		b3.setBounds(206, 310, 79, 60);
		contentPane.add(b3);
		
		badd = new JButton("+");
		badd.setForeground(Color.BLACK);
		badd.setFont(new Font("Calibri", Font.PLAIN, 30));
		badd.setFocusable(false);
		badd.setFocusPainted(false);
		badd.setBackground(Color.WHITE);
		badd.setBounds(295, 310, 79, 60);
		contentPane.add(badd);
		
		 bsub = new JButton("-");
		 bsub.setForeground(Color.BLACK);
		bsub.setFont(new Font("Calibri", Font.PLAIN, 30));
		bsub.setFocusable(false);
		bsub.setFocusPainted(false);
		bsub.setBackground(Color.WHITE);
		bsub.setBounds(384, 310, 79, 60);
		contentPane.add(bsub);
		
	   b0 = new JButton("0");
	   b0.setForeground(Color.BLACK);
		b0.setFont(new Font("Calibri", Font.PLAIN, 30));
		b0.setFocusable(false);
		b0.setFocusPainted(false);
		b0.setBackground(Color.WHITE);
		b0.setBounds(28, 381, 79, 60);
		contentPane.add(b0);
		
		 b00 = new JButton("00");
		 b00.setForeground(Color.BLACK);
		b00.setFont(new Font("Calibri", Font.PLAIN, 30));
		b00.setFocusable(false);
		b00.setFocusPainted(false);
		b00.setBackground(Color.WHITE);
		b00.setBounds(117, 381, 79, 60);
		contentPane.add(b00);
		
		bdot = new JButton(".");
		bdot.setForeground(Color.BLACK);
		bdot.setFont(new Font("Calibri", Font.BOLD, 30));
		bdot.setFocusable(false);
		bdot.setFocusPainted(false);
		bdot.setBackground(Color.WHITE);
		bdot.setBounds(206, 381, 79, 60);
		contentPane.add(bdot);
		
		 bequal = new JButton("=");
		 bequal.setForeground(Color.black);
		bequal.setFont(new Font("Calibri", Font.BOLD, 30));
		bequal.setFocusable(false);
		bequal.setFocusPainted(false);
		bequal.setBackground(Color.white);
		bequal.setBounds(384, 381, 79, 60);
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
		
		 bsqrt = new JButton("\u221Ax");
		 bsqrt.setForeground(Color.BLACK);
		bsqrt.setFont(new Font("Calibri", Font.PLAIN, 30));
		bsqrt.setFocusable(false);
		bsqrt.setFocusPainted(false);
		bsqrt.setBorder(buttonborder);
		bsqrt.setBackground(Color.WHITE);
		bsqrt.setBounds(31, 452, 76, 60);
		bsqrt.addActionListener(this);
		contentPane.add(bsqrt);
		
		bcbrt = new JButton("\u00B3\u221Ax");
		bcbrt.setForeground(Color.BLACK);
		bcbrt.setFont(new Font("Calibri", Font.PLAIN, 30));
		bcbrt.setFocusable(false);
		bcbrt.setFocusPainted(false);
		bcbrt.setBorder(buttonborder);
		bcbrt.setBackground(Color.WHITE);
		bcbrt.setBounds(117, 452, 79, 60);
		bcbrt.addActionListener(this);
//		bcbrt.setIcon(new ImageIcon("Webp.net-resizeimage (39).png"));
		contentPane.add(bcbrt);
		
		bxsquare = new JButton("x\u00B2");
		bxsquare.setForeground(Color.BLACK);
		bxsquare.setFont(new Font("Calibri", Font.PLAIN, 30));
		bxsquare.setFocusable(false);
		bxsquare.setFocusPainted(false);
		bxsquare.setBorder(buttonborder);
		bxsquare.setBackground(Color.WHITE);
		bxsquare.setBounds(206, 452, 79, 60);
		bxsquare.addActionListener(this);

		contentPane.add(bxsquare);
		
		bxcube = new JButton("x\u00B3");
		bxcube.setForeground(Color.BLACK);
		bxcube.setFont(new Font("Calibri", Font.PLAIN, 30));
		bxcube.setFocusable(false);
		bxcube.setFocusPainted(false);
		bxcube.setBorder(buttonborder);
		bxcube.setBackground(Color.WHITE);
		bxcube.setBounds(295, 452, 79, 60);
		bxcube.addActionListener(this);

		contentPane.add(bxcube);
		
		bxpowern = new JButton("x\u207F");
		bxpowern.setForeground(Color.BLACK);
		bxpowern.setFont(new Font("Calibri", Font.PLAIN, 30));
		bxpowern.setFocusable(false);
		bxpowern.setFocusPainted(false);
		bxpowern.setBorder(buttonborder);
		bxpowern.setBackground(Color.WHITE);
		bxpowern.setBounds(384, 452, 79, 60);
		bxpowern.addActionListener(this);

		contentPane.add(bxpowern);
		
		bonebyx = new JButton("1/x");
		bonebyx.setForeground(Color.BLACK);
		bonebyx.setFont(new Font("Calibri", Font.PLAIN, 25));
		bonebyx.setFocusable(false);
		bonebyx.setFocusPainted(false);
		bonebyx.setBorder(buttonborder);
		bonebyx.setBackground(Color.WHITE);
		bonebyx.setBounds(473, 168, 79, 60);
		bonebyx.addActionListener(this);

		contentPane.add(bonebyx);
		
		bpersantage = new JButton("%");
		bpersantage.setForeground(Color.BLACK);
		bpersantage.setFont(new Font("Calibri", Font.PLAIN, 30));
		bpersantage.setFocusable(false);
		bpersantage.setFocusPainted(false);
		bpersantage.setBorder(buttonborder);
		bpersantage.setBackground(Color.WHITE);
		bpersantage.setBounds(473, 238, 79, 60);
		bpersantage.addActionListener(this);

		contentPane.add(bpersantage);
		
		be = new JButton("e");
		be.setForeground(Color.BLACK);
		be.setFont(new Font("Calibri", Font.PLAIN, 30));
		be.setFocusable(false);
		be.setFocusPainted(false);
		be.setBorder(buttonborder);
		be.setBackground(Color.WHITE);
		be.setBounds(473, 381, 79, 60);
		be.addActionListener(this);

		contentPane.add(be);
		
		bpie = new JButton("\u03C0");
		bpie.setForeground(Color.BLACK);
		bpie.setFont(new Font("Calibri", Font.PLAIN, 30));
		bpie.setFocusable(false);
		bpie.setFocusPainted(false);
		bpie.setBorder(buttonborder);
		bpie.setBackground(Color.WHITE);
		bpie.setBounds(473, 310, 79, 60);
		bpie.addActionListener(this);

		contentPane.add(bpie);
		
		bxfactorial = new JButton("x!");
		bxfactorial.setForeground(Color.BLACK);
		bxfactorial.setFont(new Font("Calibri", Font.PLAIN, 25));
		bxfactorial.setFocusable(false);
		bxfactorial.setFocusPainted(false);
		bxfactorial.setBorder(buttonborder);
		bxfactorial.setBackground(Color.WHITE);
		bxfactorial.setBounds(473, 453, 79, 60);
		bxfactorial.addActionListener(this);

		contentPane.add(bxfactorial);
		
		menubar();
		
		bplusorminus = new JButton("\u00B1");
		bplusorminus.setForeground(Color.BLACK);
		bplusorminus.setFont(new Font("Calibri", Font.PLAIN, 30));
		bplusorminus.setFocusable(false);
		bplusorminus.setFocusPainted(false);
		bplusorminus.setBorder(buttonborder);
		bplusorminus.setBackground(Color.WHITE);
		bplusorminus.setBounds(295, 381, 79, 60);
		bplusorminus.addActionListener(this);
		contentPane.add(bplusorminus);
		
		equation = new JTextArea("");
		equation.setBackground(Color.GRAY);
		equation.setForeground(Color.YELLOW);
	
		equation.setFocusable(false);
		equation.setFont(new Font("Square721 BT", Font.BOLD, 20));
		equation.setBounds(28, 45, 790, 45);
		equation.setEditable(false);
		contentPane.add(equation);
		sp=new JScrollPane(equation,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.getVerticalScrollBar().setPreferredSize(new Dimension(10,0));
		sp.getHorizontalScrollBar().setPreferredSize(new Dimension(0,10));
		sp.setBounds(28, 45, 791, 45);

		sp.setFocusable(false);
		sp.getHorizontalScrollBar().setBackground(Color.white);
		sp.getHorizontalScrollBar().setForeground(Color.white);
	
		getContentPane().add(sp);
		
		 bsin = new JButton("sin");
		bsin.setForeground(Color.BLACK);
		bsin.setFont(new Font("Calibri", Font.PLAIN, 25));
		bsin.setFocusable(false);
		bsin.setFocusPainted(false);
		bsin.setBorder(buttonborder);
		bsin.setBackground(Color.WHITE);
		bsin.setBounds(562, 168, 79, 60);
		contentPane.add(bsin);
		bsin.addActionListener(this);
		
		 bcos = new JButton("cos");
		bcos.setForeground(Color.BLACK);
		bcos.setFont(new Font("Calibri", Font.PLAIN, 25));
		bcos.setFocusable(false);
		bcos.setFocusPainted(false);
		bcos.setBorder(buttonborder);
		bcos.setBackground(Color.WHITE);
		bcos.setBounds(651, 168, 79, 60);
		contentPane.add(bcos);
		bcos.addActionListener(this);

		
		btan = new JButton("tan");
		btan.setForeground(Color.BLACK);
		btan.setFont(new Font("Calibri", Font.PLAIN, 25));
		btan.setFocusable(false);
		btan.setFocusPainted(false);
		btan.setBorder(buttonborder);
		btan.setBackground(Color.WHITE);
		btan.setBounds(739, 168, 79, 60);
		contentPane.add(btan);
		btan.addActionListener(this);
		
		basin = new JButton("sin¯¹");
		basin.setForeground(Color.BLACK);
		basin.setFont(new Font("Calibri", Font.PLAIN, 24));
		basin.setFocusable(false);
		basin.setFocusPainted(false);
		basin.setBorder(buttonborder);
		basin.setBackground(Color.WHITE);
		basin.setBounds(562, 240, 79, 60);
		contentPane.add(basin);
		basin.addActionListener(this);

		
		bacos = new JButton("cos¯¹");
		bacos.setForeground(Color.BLACK);
		bacos.setFont(new Font("Calibri", Font.PLAIN, 24));
		bacos.setFocusable(false);
		bacos.setFocusPainted(false);
		bacos.setBorder(buttonborder);
		bacos.setBackground(Color.WHITE);
		bacos.setBounds(651, 240, 79, 60);
		contentPane.add(bacos);
		bacos.addActionListener(this);

		
		batan = new JButton("tan¯¹");
	

		batan.setForeground(Color.BLACK);
		batan.setFont(new Font("Calibri", Font.PLAIN, 24));
		batan.setFocusable(false);
		batan.setFocusPainted(false);
		batan.setBorder(buttonborder);
		batan.setBackground(Color.WHITE);
		batan.setBounds(739, 240, 79, 60);
		contentPane.add(batan);
		batan.addActionListener(this);

		
		bhsin = new JButton("sinh");
		bhsin.setForeground(Color.BLACK);
		bhsin.setFont(new Font("Calibri", Font.PLAIN, 24));
		bhsin.setFocusable(false);
		bhsin.setFocusPainted(false);
		bhsin.setBorder(buttonborder);
		bhsin.setBackground(Color.WHITE);
		bhsin.setBounds(562, 312, 79, 60);
		contentPane.add(bhsin);
		bhsin.addActionListener(this);

		
		bhcos = new JButton("cosh");
		bhcos.setForeground(Color.BLACK);
		bhcos.setFont(new Font("Calibri", Font.PLAIN, 24));
		bhcos.setFocusable(false);
		bhcos.setFocusPainted(false);
		bhcos.setBorder(buttonborder);
		bhcos.setBackground(Color.WHITE);
		bhcos.setBounds(651, 312, 79, 60);
		contentPane.add(bhcos);
		bhcos.addActionListener(this);

		bhtan = new JButton("tanh");
		bhtan.setForeground(Color.BLACK);
		bhtan.setFont(new Font("Calibri", Font.PLAIN, 24));
		bhtan.setFocusable(false);
		bhtan.setFocusPainted(false);
		bhtan.setBorder(buttonborder);
		bhtan.setBackground(Color.WHITE);
		bhtan.setBounds(739, 312, 79, 60);
		contentPane.add(bhtan);
		bhtan.addActionListener(this);
		
		blog = new JButton("log");
		blog.setForeground(Color.BLACK);
		blog.setFont(new Font("Calibri", Font.PLAIN, 24));
		blog.setFocusable(false);
		blog.setFocusPainted(false);
		blog.setBorder(buttonborder);
		blog.setBackground(Color.WHITE);
		blog.setBounds(651, 381, 79, 60);
		contentPane.add(blog);
		blog.addActionListener(this);

		
		bln = new JButton("ln");
		bln.setForeground(Color.BLACK);
		bln.setFont(new Font("Calibri", Font.PLAIN, 24));
		bln.setFocusable(false);
		bln.setFocusPainted(false);
		bln.setBorder(buttonborder);
		bln.setBackground(Color.WHITE);
		bln.setBounds(739, 381, 79, 60);
		contentPane.add(bln);
		bln.addActionListener(this);

		
		ben = new JButton("eⁿ");
		ben.setForeground(Color.BLACK);
		ben.setFont(new Font("Calibri", Font.PLAIN, 30));
		ben.setFocusable(false);
		ben.setFocusPainted(false);
		ben.setBorder(buttonborder);
		ben.setBackground(Color.WHITE);
		ben.setBounds(562, 381, 79, 60);
		contentPane.add(ben);
		ben.addActionListener(this);

		
		bnroot = new JButton("ⁿ√x");
		bnroot.setForeground(Color.BLACK);
		bnroot.setFont(new Font("Calibri", Font.PLAIN, 25));
		bnroot.setFocusable(false);
		bnroot.setFocusPainted(false);
		bnroot.setBorder(buttonborder);
		bnroot.setBackground(Color.WHITE);
		bnroot.setBounds(562, 453, 79, 60);
		
		contentPane.add(bnroot);
		bnroot.addActionListener(this);

		
		bdegree = new JButton("deg");
		bdegree.setForeground(Color.BLACK);
		bdegree.setFont(new Font("Calibri", Font.PLAIN, 22));
		bdegree.setFocusable(false);
		bdegree.setFocusPainted(false);
		bdegree.setBorder(buttonborder);
		bdegree.setBackground(Color.WHITE);
		bdegree.setBounds(739, 454, 79, 60);
		contentPane.add(bdegree);
		bdegree.addActionListener(this);

		
		babs = new JButton("|x|");
		babs.setForeground(Color.BLACK);
		babs.setFont(new Font("Calibri", Font.PLAIN, 22));
		babs.setFocusable(false);
		babs.setFocusPainted(false);
		babs.setBorder(buttonborder);
		babs.setBackground(Color.WHITE);
		babs.setBounds(651, 452, 79, 60);
		contentPane.add(babs);
		scintificcalc.addActionListener(this);
		babs.addActionListener(this);

		
		
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
		this.howereffect(bequal);
		this.howereffect(bplusorminus);
		this.howereffect(badd);
		this.howereffect(bsub);
		this.howereffect(bmul);
		this.howereffect(bdiv);
		this.howereffect(bxsquare);
		this.howereffect(bsqrt);
		this.howereffect(bcbrt);
		this.howereffect(bxcube);
		this.howereffect(bxpowern);
		this.howereffect(bonebyx);
		this.howereffect(bpersantage);
		this.howereffect(be);
		this.howereffect(bpie);
		this.howereffect(bxfactorial);
		this.howereffect(b00);
		this.howereffect(bsin);
		this.howereffect(bcos);
		this.howereffect(btan);
		this.howereffect(basin);
		this.howereffect(bacos);
		this.howereffect(batan);
		this.howereffect(bhsin);
		this.howereffect(bhcos);
		this.howereffect(bhtan);
		this.howereffect(ben);
		this.howereffect(bln);
		this.howereffect(blog);
		this.howereffect(bnroot);
		this.howereffect(bdegree);
		this.howereffect(babs);
		
		
		
	}
	private void fontchange()
	{
		if(l1.getText().length()<=25)
		{
				font=35;
				
		}
	
		if(l1.getText().length()>25&&l1.getText().length()<30)
		{
			font=30;
		}
		if(l1.getText().length()<=35 &&l1.getText().length()>=30)
		{
			font=25;
		}
		if(l1.getText().length()>35)
		{
			font=20;
		}
		l1.setFont(new Font("Square721 BT", Font.BOLD, font));
	}
	public void checkerror()
	{
		if(infinityerror)
		{
			l1.setText("Infinity");
			infinityerror=false;
			disablebutton();
			equation.setText("");
		}
		if(error)
		{
			l1.setText("Error");
			error=false;
			disablebutton();
		}
		if(invalidinput)
		{
			l1.setText("Invalid Input");
			invalidinput=false;
			disablebutton();
		}
		
			
	}
	public void printequ(String str)
	{
		equation.append(str);
	}
	
	public void disablebutton()
	{
		bdot.setEnabled(false);
		badd.setEnabled(false);
		bsub.setEnabled(false);
		bmul.setEnabled(false);
		bdiv.setEnabled(false);
		
		
		bequal.setEnabled(false);
		
//		bbackspace.setEnabled(false);
		bplusorminus.setEnabled(false);
		bsqrt.setEnabled(false);
		bcbrt.setEnabled(false);
		bxsquare.setEnabled(false);
		bxcube.setEnabled(false);
		bxpowern.setEnabled(false);
		bpersantage.setEnabled(false);
		bonebyx.setEnabled(false);
		bpie.setEnabled(false);
		be.setEnabled(false);
		bxfactorial.setEnabled(false);
		bcos.setEnabled(false);
		bsin.setEnabled(false);
		btan.setEnabled(false);
		basin.setEnabled(false);
		bacos.setEnabled(false);
		batan.setEnabled(false);
		bhsin.setEnabled(false);
		bhtan.setEnabled(false);
		bhcos.setEnabled(false);
		ben.setEnabled(false);
		blog.setEnabled(false);
		bln.setEnabled(false);
		bnroot.setEnabled(false);
		bdegree.setEnabled(false);
		babs.setEnabled(false);
		
	}
	public void enablebutton()
	{
		bdot.setEnabled(true);
		badd.setEnabled(true);
		bsub.setEnabled(true);
		bmul.setEnabled(true);
		bdiv.setEnabled(true);
		bequal.setEnabled(true);
		bbackspace.setEnabled(true);
		bplusorminus.setEnabled(true);
		bsqrt.setEnabled(true);
		bcbrt.setEnabled(true);
		bxsquare.setEnabled(true);
		bxcube.setEnabled(true);
		bxpowern.setEnabled(true);
		bpersantage.setEnabled(true);
		bonebyx.setEnabled(true);
		bpie.setEnabled(true);
		be.setEnabled(true);
		bxfactorial.setEnabled(true);
		bcos.setEnabled(true);
		bsin.setEnabled(true);
		btan.setEnabled(true);
		basin.setEnabled(true);
		bacos.setEnabled(true);
		batan.setEnabled(true);
		bhsin.setEnabled(true);
		bhtan.setEnabled(true);
		bhcos.setEnabled(true);
		ben.setEnabled(true);
		blog.setEnabled(true);
		bln.setEnabled(true);
		bnroot.setEnabled(true);
		bdegree.setEnabled(true);
		babs.setEnabled(true);
		
		
	}
	private void docalc(String str)
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

			try
			{
			number1=number1/Double.parseDouble(str);

			}
			catch(ArithmeticException exp)
			{
				infinityerror=true;
				
				
			}	
			if(number1==Double.POSITIVE_INFINITY)
			{
				infinityerror=true;
			}
			
		}
		else if(symbole=='+')
		{
			number1=number1+Double.parseDouble(str);
		}
		else if(symbole=='=')
		{
			number1=Double.parseDouble(str);
		}
		
		if(!printsp)
		{
			if(str.charAt(0)=='-')
			{
			printequ("("+str+")");
			}
			else
			{
				printequ(str);
			}

		}
		else
		{

			printsp=false;
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		Object source=e.getSource();
		fontchange();

		
		if(l1.getText()=="Error"||l1.getText()=="Infinity"||l1.getText()=="Invalid Input"||l1.getText().contains("âˆž")||l1.getText()=="Number is too large")
		{
			l1.setText("0");
			equation.setText("");
			printsp=false;
			enablebutton();
			symbole='+';
			number1=0;
		}
		menubaractionlistener(source);

		if(source==bclear)
		{
			l1.setText("0");
			equation.setText("");
			printsp=false;
			number1=0;
			enablebutton();
			symbole='+';
		}
		else if(source==b1 )
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1 )
			{
				l1.setText("1");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"1");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("1");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"1");
			}
		}	
		else if(source==b2)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("2");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"2");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("2");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"2");
			}
		}	
		else if(source==b3)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("3");
				
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"3");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("3");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"3");
			}
		}	
		else if(source==b4)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0' && str.length()==1)
			{
				l1.setText("4");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"4");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("4");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"4");
			}
		}	
		else if(source==b5)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("5");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"5");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("5");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"5");
			}
		}	
		else if(source==b6)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&&str.length()==1)
			{
				l1.setText("6");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"6");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("6");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"6");
			}
		}	
		else if(source==b7)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("7");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"7");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("7");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"7");
			}
		}	
		else if(source==b8)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("8");
				
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"8");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("8");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"8");
			}
		}	
		else if(source==b9)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("9");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"9");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("9");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"9");
			}
		}	
		else if(source==b0)
		{
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"0");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"0");
			}
		}	
		else if(source==b00)
		{
			String str=l1.getText();
			if(str.length()>13&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"0");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			else if(str.contains("^(1/"))
			{
				l1.setText(str+".");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0.");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
				}
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
				equation.setText("");
				

			}
			else if(str.contains("^(1/") && str.charAt(str.length()-1)=='/')
			{
				l1.setText("0");
				
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1);
				 number1=0;
				l1.setText(str);
				equation.setText("");
			}
			else if(printsp)
			{
				
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

			
				l1.setText(str);
			}
		}	
		else if(source==badd)
		{
			String str=l1.getText();
			double number2=0;
			
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				printequ("+");
				number1=Double.parseDouble(str);
				l1.setText(str+"+");
				symbole='+';
			}
				else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			 {
				 error=true;
				 checkerror();
			 }
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
				}
	
			else if(str.charAt(str.length()-1)=='^')
			{
				 error=true;
				 printequ("{ "+str+" } : Syntax Error");
				 checkerror();
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"+";
				equation.setText(equation.getText().substring(0,equation.getText().length()-1)+"+");
				l1.setText(str);
				symbole='+';
			}
	
			else if(str.contains("^"))
			{
				try
							{
							int n=0;
							for(int i=0; i<str.length(); i++)
							{
									if(str.charAt(i)=='^')
									{
										break;
									}
									else
									{
										n++;
									}
							}
							
						
							
							if(str.charAt(0)=='=')
							{
								str=str.substring(1,str.length());
								
								l1.setText(str);
								symbole='=';
							}
							printequ(str+"+");
							printsp=true;
							int divison=0;
							double power=0;
							if(str.contains("/"))
							{
								for(int i=0; i<str.length(); i++)
								{
									if(str.charAt(i)=='/')
									{
										divison=i;
										break;
									}
										
								}
								power=1/Double.parseDouble(str.substring(divison+1,str.length()));
								printequ(")");
							}
							else
							{
								power=Double.parseDouble(str.substring(n+1,str.length()));
							}
							double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
							number2=sum;
							String string=dc.format(sum);
							docalc(string);
							str=dc.format(number1);
							if(str.length()>14)
							{
								str=number1+"";
							}
							
			
							l1.setText(str+"+");
							symbole='+';
							if( number1==Double.POSITIVE_INFINITY)
							{
							infinityerror=true;	
							}
						}
						catch(Exception eer)
						{
							if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
							{
							infinityerror=true;	
							}
							else 
							{
								error=true;
							}
						}
						finally
						{
								checkerror();
								fontchange();
								number=0;
						}

			}
			else 
			{
				try
				{
					docalc(str);
					printequ("+");
					
					
				
					symbole='+';
					
					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
					}
					
					
					l1.setText(str+"+");
					if( number1==Double.POSITIVE_INFINITY)
					{
					infinityerror=true;	
					}
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				finally
				{
				
				checkerror();
				fontchange();
				}
				
			} 
			 
		}
		else if(source==bsub)
		{
			String str=l1.getText();
			double number2=0;
			
			if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"-");
				symbole='-';
				printequ("-");
			}
			else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"-";
				equation.setText(equation.getText().substring(0,equation.getText().length()-1)+"-");
				l1.setText(str);
				symbole='-';
			}
			else if(str.charAt(str.length()-1)=='^')
			{

				 error=true;
				 printequ("{ "+str+" } : Syntax Error");
				 checkerror();
			}
			else if(str.contains("^"))
			{
			
				try
				{
							int n=0;
							for(int i=0; i<str.length(); i++)
							{
									if(str.charAt(i)=='^')
									{
										break;
									}
									else
									{
										n++;
									}
							}
							
						
							
							if(str.charAt(0)=='=')
							{
								str=str.substring(1,str.length());
								
								l1.setText(str);
								symbole='=';
							}
							printequ(str+"-");
							printsp=true;
							int divison=0;
							double power=0;
							if(str.contains("/"))
							{
								for(int i=0; i<str.length(); i++)
								{
									if(str.charAt(i)=='/')
									{
										divison=i;
										break;
									}
										
								}
								power=1/Double.parseDouble(str.substring(divison+1,str.length()));
								printequ(")");
							}
							else
							{
								power=Double.parseDouble(str.substring(n+1,str.length()));
							}
							double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
							number2=sum;
							String string=dc.format(sum);
							docalc(string);
							str=dc.format(number1);
							if(str.length()>14)
							{
								str=number1+"";
							}
							
			
							l1.setText(str+"-");
							symbole='-';
							if( number1==Double.POSITIVE_INFINITY)
							{
							infinityerror=true;	
							}
					}
					catch(Exception eer)
					{
						if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
						else 
						{
							error=true;
						}
					}
				finally
				{
				checkerror();
				fontchange();
				number=0;
				}

			}

			
			else 
			{
				
				try
				{
						docalc(str);
						printequ("-");
		
						
						symbole='-';
						
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
						
						l1.setText(str+"-");
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				finally
				{
				checkerror();
				fontchange();
				}
				
			}
		}
		else if(source==bmul)
		{
			String str=l1.getText();
			double number2=0;
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"x");
				symbole='x';
				printequ("x");
			}
				else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			 {
				 error=true;
				 checkerror();
			 }
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"x";
				equation.setText(equation.getText().substring(0,equation.getText().length()-1)+"x");

				l1.setText(str);
				symbole='x';
			}
			else if(str.charAt(0)=='='&&str.charAt(str.length()-1)=='=')
			{
				number1=0;
				l1.setText("0x");
				symbole='x';
			}
				else if(str.charAt(str.length()-1)=='^')
				{
					 error=true;
					 printequ("{ "+str+" } : Syntax Error");
					 checkerror();
				}
				else if(str.contains("^"))
				{
					try
						{
							int n=0;
							for(int i=0; i<str.length(); i++)
							{
									if(str.charAt(i)=='^')
									{
										break;
									}
									else
									{
										n++;
									}
							}
							
						
							
							if(str.charAt(0)=='=')
							{
								str=str.substring(1,str.length());
								
								l1.setText(str);
								symbole='=';
							}
							printequ(str+"x");
							printsp=true;
							int divison=0;
							double power=0;
							if(str.contains("/"))
							{
								for(int i=0; i<str.length(); i++)
								{
									if(str.charAt(i)=='/')
									{
										divison=i;
										break;
									}
										
								}
								power=1/Double.parseDouble(str.substring(divison+1,str.length()));
								printequ(")");
							}
							else
							{
								power=Double.parseDouble(str.substring(n+1,str.length()));
							}
							double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
							number2=sum;
							String string=dc.format(sum);
							docalc(string);
							str=dc.format(number1);
							if(str.length()>14)
							{
								str=number1+"";
							}
							
		
							l1.setText(str+"x");
							symbole='x';
							if( number1==Double.POSITIVE_INFINITY)
							{
							infinityerror=true;	
							}
					}
					catch(Exception eer)
					{
						if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
						else 
						{
							error=true;
						}
					}
					finally
					{
					checkerror();
					fontchange();
					
					number=0;
					}

				}

			else 
			{
				try
				{
						docalc(str);
						printequ("x");
		
		
						str=dc.format(number1);	
						if(number1>14)
						{
							str=number1+"";
						}
						l1.setText(str+"x");
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				finally
				{
				checkerror();
				fontchange();
				symbole='x';
				}
			}
		}
		else if(source==bdiv)
		{
			String str=l1.getText();
			double number2=0;
		 	 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"/");
				symbole='/';
				printequ("/");
			}
				else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

		 	 {
		 		 error=true;
				 checkerror();
			 }

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"/";
				l1.setText(str);
				equation.setText(equation.getText().substring(0,equation.getText().length()-1)+"/");

				
				symbole='/';

			}
				else if(str.charAt(0)=='='&&str.charAt(str.length()-1)=='=')
			{
				number1=0;
				l1.setText("0/");
				symbole='/';
			}
				else if(str.charAt(str.length()-1)=='^')
				{
					 error=true;
					 printequ("{ "+str+" } : Syntax Error");
					 checkerror();
				}
				else if(str.contains("^"))
				{
					try
								{
								int n=0;
								for(int i=0; i<str.length(); i++)
								{
										if(str.charAt(i)=='^')
										{
											break;
										}
										else
										{
											n++;
										}
								}
								
							
								
								if(str.charAt(0)=='=')
								{
									str=str.substring(1,str.length());
									
									l1.setText(str);
									symbole='=';
								}
								printequ(str+"/");
								printsp=true;
								int divison=0;
								double power=0;
								if(str.contains("/"))
								{
									for(int i=0; i<str.length(); i++)
									{
										if(str.charAt(i)=='/')
										{
											divison=i;
											break;
										}
											
									}
									power=1/Double.parseDouble(str.substring(divison+1,str.length()));
									printequ(")");
								}
								else
								{
									power=Double.parseDouble(str.substring(n+1,str.length()));
								}
								double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
								number2=sum;
								String string=dc.format(sum);
								docalc(string);
								str=dc.format(number1);
								if(str.length()>14)
								{
									str=number1+"";
								}
								
			
								l1.setText(str+"/");
								symbole='/';
								if( number1==Double.POSITIVE_INFINITY)
								{
								infinityerror=true;	
								}
						}
					catch(Exception eer)
					{
						if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
						else 
						{
							error=true;
						}
					}
					finally
					{
					checkerror();
					fontchange();
					number=0;
					}

				}

			else 
			{
				try
				{
				docalc(str);
				printequ("/");


				
					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
					}
				l1.setText(str+"/");
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				}
				catch(Exception ee)
				{
					infinityerror=true;
				}
				finally
				{
				checkerror();
				fontchange();
				}
				symbole='/';
			}
		}
		else if(source==bequal)
		{
			String str=l1.getText();
			double number2=0;
			int num=0;
			for(int i=0; i<str.length(); i++)
			{
				if((int)str.charAt(i)>=48 &&(int)str.charAt(i)<=57)
				{
					num=1;
				}
			}
		if(str.charAt(0)=='=')
		{

		}
		else if(num==0)
		{
			 error=true;
			 checkerror();
		}
		else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

		 {
			 error=true;
			 checkerror();
		 }
		
		 else if(str.length()==1 && str.charAt(0)=='-')
		 {
			 error=true;
			 checkerror();
		 } 
		else if(str.charAt(str.length()-1)==symbole)
			{
				str="="+str.substring(0,str.length()-1);
				String string=equation.getText();
				equation.setText(string.substring(0,string.length()-1));

				l1.setText(str);
				symbole='+';
				number1=0;
			}
			
			else if(str.charAt(str.length()-1)=='^')
			{
				 error=true;
				 printequ("{ "+str+" } : Syntax Error");
				 checkerror();
			}
			else if(str.contains("^"))
			{
				try
				{
						int n=0;
						for(int i=0; i<str.length(); i++)
						{
								if(str.charAt(i)=='^')
								{
									break;
								}
								else
								{
									n++;
								}
						}
						
					
						
						if(str.charAt(0)=='=')
						{
							str=str.substring(1,str.length());
							
							l1.setText(str);
							symbole='=';
						}
						printequ(str);
						printsp=true;
						int divison=0;
						double power=0;
						if(str.contains("/"))
						{
							for(int i=0; i<str.length(); i++)
							{
								if(str.charAt(i)=='/')
								{
									divison=i;
									break;
								}
									
							}
							power=1/Double.parseDouble(str.substring(divison+1,str.length()));
							printequ(")");
						}
						else
						{
							power=Double.parseDouble(str.substring(n+1,str.length()));
						}
						double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
						number2=sum;
						String string=dc.format(sum);
						docalc(string);
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
						
		
						l1.setText("="+str);
						symbole='=';
						if( number2==Double.POSITIVE_INFINITY||number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
				}
				catch(Exception eer)
				{
					if( number==Double.POSITIVE_INFINITY)
					{
					infinityerror=true;	
					}
					else
					{
					error=true;
					}
				}
				finally
				{
						checkerror();
						fontchange();
						number=0;
				}

			}
			else 
			{
				try
				{
						
						docalc(str);
						
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
			
						l1.setText("="+str);
						printsp=false;
						number1=0;
						symbole='=';
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
						
						
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
			
					checkerror();
					
					fontchange();
				
				number1=0;
				
			}
		}
		else if(source==bplusorminus)
		{
			String str=l1.getText();
			
			try
			{
			if(str.charAt(0)=='=')
			{
				str=str.substring(1,str.length());
				
				
				equation.setText("");
				
				symbole='+';
			}
			
			 else if(str.charAt(str.length()-1)==symbole)
				{
				 	invalidinput=true;
				 	checkerror();
				}
				else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			 {
				 error=true;
				 checkerror();
			 }
			else if(str.contains("^"))
			{
				int n=0;
				for(int i=0; i<str.length(); i++)
				{
						if(str.charAt(i)=='^')
						{
							break;
						}
						else
						{
							n++;
						}
				}
				
			
				if(str.charAt(n+1)!='-')
				{
			
				str=str.substring(0,n+1)+"-"+str.substring(n+1);
				l1.setText(str);
				}
				else
				{
					str=str.substring(0,n+1)+str.substring(n+2);
					l1.setText(str);
				}
				fontchange();
				
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
				
				fontchange();
				
			}
			}catch(Exception eer)
			{
			error=true;
			}
			checkerror();
			fontchange();
		}
		else if(source==bsqrt)
		{
			String str=l1.getText();
			 if(str.charAt(str.length()-1)==symbole)
				
				{

				 invalidinput=true;
				 checkerror();
				}

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}
				else if(str.contains("-"))
				{

					 error=true;
					 checkerror();
					}
				else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
				 {
					 error=true;
					 checkerror();
				 }
			
				else 
				{
					
					try
					{
					if(str.charAt(0)=='=')
					{
						str=str.substring(1,str.length());
						
						l1.setText(str);
						equation.setText("");
					
					}
					
						printequ("²√"+str);
					
					printsp=true;
					double sum=Math.sqrt(Double.parseDouble(str));
					
					str=dc.format(sum);
				
					docalc(str);
					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
					}


					if( number1==Double.POSITIVE_INFINITY||number1==Double.NEGATIVE_INFINITY)
					{
					infinityerror=true;	
					}
					
					
					l1.setText("="+str);
					symbole='=';
					number1=0;
					}
					catch(Exception eer)
					{
						error=true;
						
					}
					fontchange();
					checkerror();
				}
		}
		else if(source==bcbrt)
		{
			String str=l1.getText();
			
			if(str.charAt(str.length()-1)==symbole)
				
				{
				 invalidinput=true;
				 checkerror();
				}
				else if(str.charAt(0)=='-')
				{
					 error=true;
					 checkerror();
				}

				 else if(str.contains("^"))
					{
					 	invalidinput=true;
					 	checkerror();
					}
					else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
				 {
					 error=true;
					 checkerror();
				 }
			
				else 
				{
					
					try
					{
						
						if(str.charAt(0)=='=')
						{
							str=str.substring(1,str.length());
							equation.setText("");
							l1.setText(str);
							symbole='=';
						}
							printequ("³√"+str);
						printsp=true;
						double sum=Math.cbrt(Double.parseDouble(str));
						
						str=dc.format(sum);
						
						docalc(str);
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
	
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
						
						
						l1.setText("="+str);
						symbole='=';
						}
			 catch(Exception eer)
			 {
				 error=true;
			 }
					fontchange();
					checkerror();

				
				}
		}

		else if(source==bxsquare)
		{
			String str=l1.getText();
			
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
				
					equation.setText("");
				}
				if(str.charAt(0)=='-')
				{
				printequ("("+str+")²");
				}
				else
				{
					printequ(str+"²");
				}
				printsp=true;
				double sum=Math.pow(Double.parseDouble(str),2);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				symbole='=';
				///////
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==bxcube)
		{
			String str=l1.getText();
			
		 if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }


			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
		
			else 
			{	
				try
				{
				//// 1st
						if(str.charAt(0)=='=')
						{
							str=str.substring(1,str.length());
							
							l1.setText(str);
							equation.setText("");
							
						}
						// 2nd
						
							printequ(str+"³");
						
						printsp=true;
						
						
						//3rd
						double sum=Math.pow(Double.parseDouble(str),3);
						
		
						str=dc.format(sum);
						//4th
						docalc(str);
						
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
		
						l1.setText("="+str);
						symbole='=';
						//5th
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
					
						symbole='=';
						//6th
					
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				fontchange();
				checkerror();
				
				
			}
		}
		else if(source==bxpowern)
		{
			String str=l1.getText();
			try
			{
			
		 if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			{
				 error=true;
				 checkerror();
			 }

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else if(str.charAt(str.length()-1)==symbole)
			{
				error=true;
				equation.setText("Syntax error");

				
			}		
			else if(str.contains("^"))
			{
				
			}

			else
			{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					equation.setText("");
					
					
				}
					
				str=str+"^";
				l1.setText(str);
				symbole='=';
			}
			}
			catch(Exception eer)
			{
				error=true;
			}
			checkerror();
			fontchange();
			
		}
		else if(source==bnroot)
		{
			String str=l1.getText();
			try
			{
			
		 if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			{
				 error=true;
				 checkerror();
			 }

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
				else if(str.charAt(str.length()-1)==symbole)
				{
					error=true;
					equation.setText("Syntax error");

					
				}			
			else if(str.contains("^"))
			{
				
			}

			else
			{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					equation.setText("");
				}
					
				str=str+"^(1/";
				l1.setText(str);
			}
			}
			catch(Exception eer)
			{
				error=true;
			}
			checkerror();
			fontchange();
		}

		else if(source==ben)
		{
			String str=l1.getText();
			try
			{
		 if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			{
				 error=true;
				 checkerror();
			 }

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else if(str.charAt(str.length()-1)==symbole)
			{
				error=true;
			}		
			else if(str.contains("^"))
			{
				
			}

			else
			{
			
				
						if(str.charAt(0)=='=')
						{
							str=str.substring(1,str.length());
							
							l1.setText(str);
							equation.setText("");
						
						}
						// 2nd
						
							printequ("e"+"^"+str);
						
						printsp=true;
						
						
						//3rd
						double sum=Math.pow(Math.E,Double.parseDouble(str));
						
		
						str=dc.format(sum);
						//4th
						docalc(str);
						
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
		
						l1.setText("="+str);
						symbole='=';
						//5th
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
					
						symbole='=';
			}
			}catch(Exception eer)
			{
				error=true;
			}
			fontchange();
			checkerror();
		}
		else if (source==bxfactorial)
		{
			
			String str=l1.getText();
			
		 if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			 if(str.length()>5)
			 {
				 infinityerror=true;
				 checkerror();
			 }

			 else if(str.charAt(str.length()-1)==symbole||str.contains(".")||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					equation.setText("");
					
					l1.setText(str);
					symbole='=';
					}
				
					printequ(str+"!");
				
				printsp=true;
				double sum=1;
				for(double i=Double.parseDouble(str);  i>0; i--)
				{
					sum=sum*i;
				}
				
				str=dc.format(sum);

				docalc(str);
				
				str=dc.format(number1);
				if(str.length()>14)
				{
					
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				//5th
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
			
				symbole='=';
				//6th
				}
				catch(Exception eer)
				{
					error=true;
				}
				
				fontchange();
				checkerror();

				
		
			
			
			
			}
			
			
		}
		else if(source==bpie)
		{
			
			String str=l1.getText();
			try
			{	
				String string=equation.getText();
//				
				if(str.length()>=1 &&  str.charAt(str.length()-1)=='^')
				{
					l1.setText(str+Math.PI);
				}
				else if(str.contains("^"))
				{
					error=true;
				}
				else
				{
					if(string.length()>=1 && (string.charAt(string.length()-1)!='+'&&string.charAt(string.length()-1)!='-'&&string.charAt(string.length()-1)!='x'&&string.charAt(string.length()-1)!='/'))
					{
						printequ("x");
						symbole='x';
					}
					
							
					 if(str.length()==1 && str.charAt(0)=='-')
					 {
						 l1.setText("-"+Math.PI);
						 
					 }
					 else
					 {
							l1.setText(Math.PI+"");
							
						
					 }
					
					printequ("π");
						
					 printsp=true;
					 
					 str=dc.format(Math.PI);
		
						docalc(str);
						
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
		
						l1.setText("="+str);
						symbole='=';
						//5th
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
					
						symbole='=';
				//6th
				}
			}
			catch(Exception eer)
			{
				error=true;
			}
				
				fontchange();
				checkerror();
		}
		else if(source==be)
		{
			
			String str=l1.getText();
			try
			{	
				String string=equation.getText();
//				
				 if(str.length()>=1 &&  str.charAt(str.length()-1)=='^')
				{
					l1.setText(str+Math.E);
				}
				else if(str.contains("^"))
				{
					error=true;
				}
				else
				{
					if(string.length()>=1 && (string.charAt(string.length()-1)!='+'&&string.charAt(string.length()-1)!='-'&&string.charAt(string.length()-1)!='x'&&string.charAt(string.length()-1)!='/'))
					{
						printequ("x");
						symbole='x';
					}
						
							
					 if(str.length()==1 && str.charAt(0)=='-')
					 {
						 l1.setText("-"+Math.E);
						 
					 }
					 else
					 {
							l1.setText(Math.E+"");
							
						
					 }
					
					printequ("e");
						
					 printsp=true;
					 
					 str=dc.format(Math.E);
		
						docalc(str);
						
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
		
						l1.setText("="+str);
						symbole='=';
						//5th
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
					
						symbole='=';
				//6th
				}
			}
			catch(Exception eer)
			{
				error=true;
			}
				
				fontchange();
				checkerror();
		}
		else if(source==bpersantage)
		{
			String str=l1.getText();
			double number2=0;
					
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }

			

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}
			
			else
			{
				try
				{
				
						if(str.charAt(0)=='=')
						{
							str=str.substring(1,str.length());
							equation.setText("");
							
							l1.setText(str);
							symbole='=';
						}
						printequ(Double.parseDouble(str)+"%");
						
						 printsp=true;
						double sum=Double.parseDouble(str)/100;
		
						number2=sum;
						if(number1!=0 && (symbole=='+' ||symbole=='-'))
						{
						sum=number1*sum;
						}
					
						
						if(symbole=='+')
						{
						number1=number1+sum;
						}
						else if(symbole=='-')
						{
							number1=number1-sum;
						}
						else if(symbole=='x')
						{
						
							number1=number1*sum;
						
							
						}
						else if(symbole=='/')
						{
							
							number1=number1/sum;
							
							
						}
						
						str=dc.format(number1);
		
						if(str.length()>14)
						{
							str=number1+"";
						}
						
						l1.setText("="+str);
						symbole='=';
						
						if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						System.out.println("I am here");
						}
		
						
				}
				catch(Exception eer)
				{
					if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
					{
					infinityerror=true;	
					}
					else 
					{
						error=true;
//						l1.setText(eer.getMessage());
					}
				}
				finally
				{
				fontchange();
				
				checkerror();
				
				}
				////
				
		
				
			}
		
	
		}
		else if(source==bonebyx)
		{
			String str=l1.getText();
		
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				error=true;
				checkerror();
			 	}


			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}
			
			else 
			{
				try
				{
			
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					equation.setText("");
					
					l1.setText(str);
					symbole='=';
				}
				printequ("1/"+str);
				
				 printsp=true;
				double sum=1/(Double.parseDouble(str));
		
				
				str=dc.format(sum);

				docalc(str);
				
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				//5th
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
			
				symbole='=';
				//6th
				}
				catch(Exception ee)
				{
				error=true;
					
				}
				
				fontchange();
				checkerror();


				
			}

		}
		else if(source==bdegree)
		{
			if(bdegree.getText()=="deg")
			{
			bdegree.setText("rad");
			}
			else if(bdegree.getText()=="rad")
			{
				bdegree.setText("deg");
			}
		}
		else if(source==bsin)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText("sin("+equation.getText()+")");
				}
				else
				{
				printequ("sin("+str+")");
				}
				
				double deg=Double.parseDouble(str);

				if(bdegree.getText()=="deg")
				{
					 deg=Math.toRadians(deg);
				}
				
				
				
				
				printsp=true;
				double sum=Math.sin(deg);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				symbole='=';
				///////
				}
				catch(Exception eer)
				{
				error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==bcos)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText("cos("+equation.getText()+")");

				}
				else
				{
				
				printequ("cos("+str+")");
				}
				
				double deg=Double.parseDouble(str);

				if(bdegree.getText()=="deg")
				{
					 deg=Math.toRadians(deg);
				}
				
				
				
				
				printsp=true;
				double sum=Math.cos(deg);
				
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}
				
				l1.setText("="+str);
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				symbole='=';
				///////
				}
				catch(Exception eer)
				{
					error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==btan)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			 
			else
				
				
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText("tan("+equation.getText()+")");

				}
				else
				{
				
				printequ("tan("+str+")");
				}
			
				double deg=Double.parseDouble(str);
				
				
				if(bdegree.getText()=="deg")
				{
					 deg=Math.toRadians(deg);
				}
				
				
				
				
				printsp=true;
				double sum=Math.tan(deg);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}
				if(str.contains("E"))
				{
					infinityerror=true;
				}
				l1.setText("="+str);
				
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				symbole='=';
				///////
				}
				catch(Exception eer)
				{
					error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==basin)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			 
			else
				
				
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText(basin.getText()+"("+equation.getText()+")");

				}
				else
				{
				
				printequ(basin.getText()+"("+str+")");
				}
			
				double deg=Double.parseDouble(str);
				
				
				printsp=true;
				double sum=Math.asin(deg);
				if(bdegree.getText()=="deg")
				{
					str=dc.format(Math.toDegrees(sum));
				}
				else
				{
					str=dc.format(sum);
				}
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				if(str.contains("E"))
				{
					infinityerror=true;
				}
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				symbole='=';
				///////
				}
				catch(Exception eer)
				{
					error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==bacos)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			 
			else
				
				
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText(bacos.getText()+"("+equation.getText()+")");

				}
				else
				{
				
				printequ(bacos.getText()+"("+str+")");
				}
			
				double deg=Double.parseDouble(str);
				
				
				printsp=true;
				double sum=Math.acos(deg);
				if(bdegree.getText()=="deg")
				{
					str=dc.format(Math.toDegrees(sum));
				}
				else
				{
					str=dc.format(sum);
				}
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				if(str.contains("E"))
				{
					infinityerror=true;
				}
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				///////
				}
				catch(Exception eer)
				{
					error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==batan)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			 
			else
				
				
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText(batan.getText()+"("+equation.getText()+")");

				}
				else
				{
				
				printequ(batan.getText()+"("+str+")");
				}
			
				double deg=Double.parseDouble(str);
				
				
				printsp=true;
				double sum=Math.atan(deg);
				if(bdegree.getText()=="deg")
				{
					str=dc.format(Math.toDegrees(sum));
				}
				else
				{
					str=dc.format(sum);
				}
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				if(str.contains("E"))
				{
					infinityerror=true;
				}
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				///////
				}
				catch(Exception eer)
				{
					error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==bhsin)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
				
				
		
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText("sinh("+equation.getText()+")");
				}
				else
				{
				printequ("sinh("+str+")");
				}
				
				double deg=Double.parseDouble(str);

				
				
				
				
				
				printsp=true;
				double sum=Math.sinh(deg);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
			
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				symbole='=';
				///////
				}
				catch(Exception eer)
				{
				error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==bhcos)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText("cosh("+equation.getText()+")");
				}
				else
				{
				printequ("cosh("+str+")");
				}
				
				double deg=Double.parseDouble(str);

				if(bdegree.getText()=="deg")
				{
					 deg=Math.toRadians(deg);
				}
				
				
				
				
				printsp=true;
				double sum=Math.cosh(deg);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				///////
				}
				catch(Exception eer)
				{
				error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==bhtan)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText("tanh("+equation.getText()+")");
				}
				else
				{
				printequ("tanh("+str+")");
				}
				
				double deg=Double.parseDouble(str);

				if(bdegree.getText()=="deg")
				{
					 deg=Math.toRadians(deg);
				}
				
				
				
				
				printsp=true;
				double sum=Math.tanh(deg);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				///////
				}
				catch(Exception eer)
				{
				error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==blog)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText("log("+equation.getText()+")");
				}
				else
				{
				printequ("log("+str+")");
				}
				
				double deg=Double.parseDouble(str);


				
				
				
				
				printsp=true;
				double sum=Math.log10(deg);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				///////
				}
				catch(Exception eer)
				{
				error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==bln)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					symbole='=';
					equation.setText("ln("+equation.getText()+")");
				}
				else
				{
				printequ("ln("+str+")");
				}
				
				double deg=Double.parseDouble(str);


				
				
				
				
				printsp=true;
				double sum=Math.log(deg);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				///////
				}
				catch(Exception eer)
				{
				error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}
		else if(source==babs)
		{
			String str=l1.getText();
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else 
				
				
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					
					l1.setText(str);
					equation.setText("|"+equation.getText()+"|");
				}
				else
				{
				printequ("|"+str+"|");
				}
				
				double deg=Double.parseDouble(str);


				
				
				
				
				printsp=true;
				double sum=Math.abs(deg);
			

				str=dc.format(sum);
				
				docalc(str);
				str=dc.format(number1);
				if(str.length()>14)
				{
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				
				
				l1.setText("="+str);
				symbole='=';
				///////
				}
				catch(Exception eer)
				{
				error=true;
				}
				
				
				fontchange();
				checkerror();
				
			}
		}


		if(l1.getText()==null)
		{
			l1.setText("0");
		}
		if(l1.getText().length()>2)
		{
		if(l1.getText().charAt(0)=='-' &&l1.getText().charAt(1)=='0'&&l1.getText().length()>2&&l1.getText().charAt(2)!='.')
		{
			String str=l1.getText();
			str="-"+str.substring(2);
			l1.setText(str);
		}
		
		if(l1.getText().charAt(0)=='-'&&l1.getText().charAt(1)==symbole)
		{
			String str="-"+"0"+symbole;
			l1.setText(str);
		}
		}
			

	}
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		// TODO Auto-generated method stub


//		
//			bxpowern.setBackground(Color.green);
//			bxpowern.setForeground(Color.white);
//			bxpowern.setBorder(activebuttonborder);
		fontchange();

		
		if(l1.getText()=="Error"||l1.getText()=="Infinity"||l1.getText()=="Invalid Input"||l1.getText().contains("âˆž")||l1.getText()=="Number is too large")
		{
			l1.setText("0");
			equation.setText("");
			printsp=false;
			enablebutton();
			symbole='+';
			number1=0;
		}
	

		
		if(e.getKeyCode()==KeyEvent.VK_DELETE)
		{

			this.howeronkey(bclear);
			
			l1.setText("0");
			equation.setText("");
			printsp=false;
			number1=0;
			enablebutton();
			symbole='+';
		}
		else if(e.getKeyChar()=='1' )
		{
			this.howeronkey(b1);
			String str=l1.getText();
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1 )
			{
				l1.setText("1");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"1");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("1");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("2");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"2");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("2");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("3");
				
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"3");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("3");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0' && str.length()==1)
			{
				l1.setText("4");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"4");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("4");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("5");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"5");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("5");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&&str.length()==1)
			{
				l1.setText("6");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"6");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("6");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("7");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"7");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("7");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("8");
				
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"8");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("8");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("9");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"9");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("9");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
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
			if(str.length()==15&&str.charAt(str.length()-1)!=symbole)
			{

			}
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+"0");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
					printsp=false;
				}
			}
			else 
			{
				l1.setText(str+"0");
			}
		}	
		
		else if(e.getKeyChar()=='.')
		{
			String str=l1.getText();
			

			this.howeronkey(bdot);


			if(str.contains("."))
			{
				
			}
			
		
			else if(str.charAt(0)=='0'&& str.length()==1)
			{
				l1.setText("0.");
			}
			else if(str.contains("^(1/"))
			{
				l1.setText(str+".");
			}
			else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='/')
			{
				l1.setText("0.");
				if(str.charAt(0)=='=')
				{
					equation.setText("");
				}
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
				equation.setText("");
				

			}
			else if(str.contains("^(1/") && str.charAt(str.length()-1)=='/')
			{
				l1.setText("0");
				
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1);
				 number1=0;
				l1.setText(str);
				equation.setText("");
			}
			else if(printsp)
			{
				
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

			
				l1.setText(str);
			}
		}	
		else if(e.getKeyChar()=='+')
		{
			String str=l1.getText();
			double number2=0;
			

			this.howeronkey(badd);

			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				printequ("+");
				number1=Double.parseDouble(str);
				l1.setText(str+"+");
				symbole='+';
			}
				else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			 {
				 error=true;
				 checkerror();
			 }
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
				}
	
			else if(str.charAt(str.length()-1)=='^')
			{
				 error=true;
				 printequ("{ "+str+" } : Syntax Error");
				 checkerror();
			}
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"+";
				equation.setText(equation.getText().substring(0,equation.getText().length()-1)+"+");
				l1.setText(str);
				symbole='+';
			}
	
			else if(str.contains("^"))
			{
				try
							{
							int n=0;
							for(int i=0; i<str.length(); i++)
							{
									if(str.charAt(i)=='^')
									{
										break;
									}
									else
									{
										n++;
									}
							}
							
						
							
							if(str.charAt(0)=='=')
							{
								str=str.substring(1,str.length());
								
								l1.setText(str);
								symbole='=';
							}
							printequ(str+"+");
							printsp=true;
							
							int divison=0;
							double power=0;
							if(str.contains("/"))
							{
								for(int i=0; i<str.length(); i++)
								{
									if(str.charAt(i)=='/')
									{
										divison=i;
										break;
									}
										
								}
								power=1/Double.parseDouble(str.substring(divison+1,str.length()));
								printequ(")");
							}
							else
							{
								power=Double.parseDouble(str.substring(n+1,str.length()));
							}
							double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
							number2=sum;
							String string=dc.format(sum);
							docalc(string);
							str=dc.format(number1);
							if(str.length()>14)
							{
								str=number1+"";
							}
							
			
							l1.setText(str+"+");
							symbole='+';
							if( number1==Double.POSITIVE_INFINITY)
							{
							infinityerror=true;	
							}
						}
						catch(Exception eer)
						{
							if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
							{
							infinityerror=true;	
							}
							else 
							{
								error=true;
							}
						}
						finally
						{
								checkerror();
								fontchange();
								number=0;
						}

			}
			else 
			{
				try
				{
					docalc(str);
					printequ("+");
					
					
				
					symbole='+';
					
					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
					}
					
					
					l1.setText(str+"+");
					if( number1==Double.POSITIVE_INFINITY)
					{
					infinityerror=true;	
					}
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				finally
				{
				
				checkerror();
				fontchange();
				}
				
			} 
			 
		}
		else if(e.getKeyChar()=='-')
		{
			String str=l1.getText();
			double number2=0;
			this.howeronkey(bsub);

			if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"-");
				symbole='-';
				printequ("-");
			}
			else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"-";
				equation.setText(equation.getText().substring(0,equation.getText().length()-1)+"-");
				l1.setText(str);
				symbole='-';
			}
			else if(str.charAt(str.length()-1)=='^')
			{

				 error=true;
				 printequ("{ "+str+" } : Syntax Error");
				 checkerror();
			}
			else if(str.contains("^"))
			{
			
				try
				{
							int n=0;
							for(int i=0; i<str.length(); i++)
							{
									if(str.charAt(i)=='^')
									{
										break;
									}
									else
									{
										n++;
									}
							}
							
						
							
							if(str.charAt(0)=='=')
							{
								str=str.substring(1,str.length());
								
								l1.setText(str);
								symbole='=';
							}
							printequ(str+"-");
							printsp=true;
							int divison=0;
							double power=0;
							if(str.contains("/"))
							{
								for(int i=0; i<str.length(); i++)
								{
									if(str.charAt(i)=='/')
									{
										divison=i;
										break;
									}
										
								}
								power=1/Double.parseDouble(str.substring(divison+1,str.length()));
								printequ(")");
							}
							else
							{
								power=Double.parseDouble(str.substring(n+1,str.length()));
							}
							double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
							number2=sum;
							String string=dc.format(sum);
							docalc(string);
							str=dc.format(number1);
							if(str.length()>14)
							{
								str=number1+"";
							}
							
			
							l1.setText(str+"-");
							symbole='-';
							if( number1==Double.POSITIVE_INFINITY)
							{
							infinityerror=true;	
							}
					}
					catch(Exception eer)
					{
						if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
						else 
						{
							error=true;
						}
					}
				finally
				{
				checkerror();
				fontchange();
				number=0;
				}

			}

			
			else 
			{
				
				try
				{
						docalc(str);
						printequ("-");
		
						
						symbole='-';
						
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
						
						l1.setText(str+"-");
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				finally
				{
				checkerror();
				fontchange();
				}
				
			}
		}
		else if(e.getKeyChar()=='*')
		{

			this.howeronkey(bmul);

			String str=l1.getText();
			double number2=0;
			 if(str.charAt(0)=='=')
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"x");
				symbole='x';
				printequ("x");
			}
				else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			 {
				 error=true;
				 checkerror();
			 }
			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"x";
				equation.setText(equation.getText().substring(0,equation.getText().length()-1)+"x");

				l1.setText(str);
				symbole='x';
			}
			else if(str.charAt(0)=='='&&str.charAt(str.length()-1)=='=')
			{
				number1=0;
				l1.setText("0x");
				symbole='x';
			}
				else if(str.charAt(str.length()-1)=='^')
				{
					 error=true;
					 printequ("{ "+str+" } : Syntax Error");
					 checkerror();
				}
				else if(str.contains("^"))
				{
					try
						{
							int n=0;
							for(int i=0; i<str.length(); i++)
							{
									if(str.charAt(i)=='^')
									{
										break;
									}
									else
									{
										n++;
									}
							}
							
						
							
							if(str.charAt(0)=='=')
							{
								str=str.substring(1,str.length());
								
								l1.setText(str);
								symbole='=';
							}
							printequ(str+"x");
							printsp=true;
							int divison=0;
							double power=0;
							if(str.contains("/"))
							{
								for(int i=0; i<str.length(); i++)
								{
									if(str.charAt(i)=='/')
									{
										divison=i;
										break;
									}
										
								}
								power=1/Double.parseDouble(str.substring(divison+1,str.length()));
								printequ(")");
							}
							else
							{
								power=Double.parseDouble(str.substring(n+1,str.length()));
							}
							double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
							number2=sum;
							String string=dc.format(sum);
							docalc(string);
							str=dc.format(number1);
							if(str.length()>14)
							{
								str=number1+"";
							}
							
		
							l1.setText(str+"x");
							symbole='x';
							if( number1==Double.POSITIVE_INFINITY)
							{
							infinityerror=true;	
							}
					}
					catch(Exception eer)
					{
						if(number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
						{
							infinityerror=true;
						}
						else
						{
							error=true;
						}
					}
					finally
					{
					checkerror();
					fontchange();
					
					number=0;
					}

				}

			else 
			{
				try
				{
						docalc(str);
						printequ("x");
		
		
						str=dc.format(number1);	
						if(number1>14)
						{
							str=number1+"";
						}
						l1.setText(str+"x");
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				finally
				{
				checkerror();
				fontchange();
				symbole='x';
				}
			}
		}
		else if(e.getKeyChar()=='/')
		{

			this.howeronkey(bdiv);

			String str=l1.getText();
		 	double number2=0; 
			if(str.charAt(0)=='=')
		 		 
			{
				str=str.substring(1);
				number1=Double.parseDouble(str);
				l1.setText(str+"/");
				symbole='/';
				printequ("/");
			}
				else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

		 	 {
		 		 error=true;
				 checkerror();
			 }

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"/";
				l1.setText(str);
				equation.setText(equation.getText().substring(0,equation.getText().length()-1)+"/");

				
				symbole='/';

			}
				else if(str.charAt(0)=='='&&str.charAt(str.length()-1)=='=')
			{
				number1=0;
				l1.setText("0/");
				symbole='/';
			}
				else if(str.charAt(str.length()-1)=='^')
				{
					 error=true;
					 printequ("{ "+str+" } : Syntax Error");
					 checkerror();
				}
				else if(str.contains("^"))
				{
					try
								{
								int n=0;
								for(int i=0; i<str.length(); i++)
								{
										if(str.charAt(i)=='^')
										{
											break;
										}
										else
										{
											n++;
										}
								}
								
							
								
								if(str.charAt(0)=='=')
								{
									str=str.substring(1,str.length());
									
									l1.setText(str);
									symbole='=';
								}
								printequ(str+"/");
								printsp=true;
								int divison=0;
								double power=0;
								if(str.contains("/"))
								{
									for(int i=0; i<str.length(); i++)
									{
										if(str.charAt(i)=='/')
										{
											divison=i;
											break;
										}
											
									}
									power=1/Double.parseDouble(str.substring(divison+1,str.length()));
									printequ(")");
								}
								else
								{
									power=Double.parseDouble(str.substring(n+1,str.length()));
								}
								double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
								number2=sum;
								String string=dc.format(sum);
								docalc(string);
								str=dc.format(number1);
								if(str.length()>14)
								{
									str=number1+"";
								}
								
			
								l1.setText(str+"/");
								symbole='/';
								if( number1==Double.POSITIVE_INFINITY)
								{
								infinityerror=true;	
								}
						}
					catch(Exception eer)
					{
						if(number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
						{
							infinityerror=true;
						}
						else
						{
							error=true;
						}
					}
					finally
					{
					checkerror();
					fontchange();
					number=0;
					}

				}

			else 
			{
				try
				{
				docalc(str);
				printequ("/");


				
					str=dc.format(number1);
					if(str.length()>14)
					{
						str=number1+"";
					}
				l1.setText(str+"/");
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
				}
				catch(Exception ee)
				{
					infinityerror=true;
				}
				finally
				{
				checkerror();
				fontchange();
				}
				symbole='/';
			}
		}
		else if(e.getKeyChar()=='='||e.getKeyCode()==KeyEvent.VK_ENTER)
		{

			this.howeronkey(bequal);

			String str=l1.getText();
			double number2=0;
			int num=0;
			for(int i=0; i<str.length(); i++)
			{
				if((int)str.charAt(i)>=48 &&(int)str.charAt(i)<=57)
				{
					num=1;
				}
			}
		if(str.charAt(0)=='=')
		{

		}
		else if(num==0)
		{
			 error=true;
			 checkerror();
		}
		else if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

		 {
			 error=true;
			 checkerror();
		 }
		
		 else if(str.length()==1 && str.charAt(0)=='-')
		 {
			 error=true;
			 checkerror();
		 } 
		else if(str.charAt(str.length()-1)==symbole)
			{
				str="="+str.substring(0,str.length()-1);
				String string=equation.getText();
				equation.setText(string.substring(0,string.length()-1));

				l1.setText(str);
				symbole='+';
				number1=0;
			}
			
			else if(str.charAt(str.length()-1)=='^')
			{
				 error=true;
				 printequ("{ "+str+" } : Syntax Error");
				 checkerror();
			}
			else if(str.contains("^"))
			{
				try
				{
						int n=0;
						for(int i=0; i<str.length(); i++)
						{
								if(str.charAt(i)=='^')
								{
									break;
								}
								else
								{
									n++;
								}
						}
						
					
						
						if(str.charAt(0)=='=')
						{
							str=str.substring(1,str.length());
							
							l1.setText(str);
							symbole='=';
						}
						printequ(str);
						printsp=true;
						int divison=0;
						double power=0;
						if(str.contains("/"))
						{
							for(int i=0; i<str.length(); i++)
							{
								if(str.charAt(i)=='/')
								{
									divison=i;
									break;
								}
									
							}
							power=1/Double.parseDouble(str.substring(divison+1,str.length()));
							printequ(")");
						}
						else
						{
							power=Double.parseDouble(str.substring(n+1,str.length()));
						}
						double sum=Math.pow(Double.parseDouble(str.substring(0,n)),power);
						number2=sum;
						String string=dc.format(sum);
						docalc(string);
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
						
		
						l1.setText("="+str);
						symbole='=';
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
				}
				catch(Exception eer)
				{
					if(number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
					{
						infinityerror=true;
					}
					else
					{
						error=true;
					}
				}
				finally
				{
						checkerror();
						fontchange();
						number=0;
				}

			}
			else 
			{
				try
				{
						
						docalc(str);
						
						str=dc.format(number1);
						if(str.length()>14)
						{
							str=number1+"";
						}
			
						l1.setText("="+str);
						symbole='=';
						if( number1==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						}
						
						
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				finally
				{
					checkerror();
					
					fontchange();
				}
				
				number1=0;
				
			}
		}
		else if(e.getKeyChar()=='^')
		{

			this.howeronkey(bxpowern);

			String str=l1.getText();
			
			
		 if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))

			{
				 error=true;
				 checkerror();
			 }

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else if(str.charAt(str.length()-1)==symbole)
			{
				str=str.substring(0,str.length()-1)+"^";
				l1.setText(str);
				symbole='+';
				
			}		
			else if(str.contains("^"))
			{
				
			}

			else
			{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					equation.setText("");
					
				}
					
				str=str+"^";
				l1.setText(str);
			}
		}
		else if (e.getKeyChar()=='!')
		{
			

			this.howeronkey(bxfactorial);

			String str=l1.getText();
			
		 if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }
			 if(str.length()>5)
			 {
				 infinityerror=true;
				 checkerror();
			 }

			 else if(str.charAt(str.length()-1)==symbole||str.contains(".")||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			else
			{
				try
				{
				if(str.charAt(0)=='=')
				{
					str=str.substring(1,str.length());
					equation.setText("");
					
					l1.setText(str);
					symbole='=';		
					}
				
				
					printequ(str+"!");
				
				printsp=true;
				double sum=1;
				for(double i=Double.parseDouble(str);  i>0; i--)
				{
					sum=sum*i;
				}
				
				str=dc.format(sum);

				docalc(str);
				
				str=dc.format(number1);
				if(str.length()>14)
				{
					
					str=number1+"";
				}

				l1.setText("="+str);
				symbole='=';
				//5th
				if( number1==Double.POSITIVE_INFINITY)
				{
				infinityerror=true;	
				}
			
				symbole='=';
				//6th
				}
				catch(Exception eer)
				{
					infinityerror=true;
				}
				
				fontchange();
				checkerror();

				
		
			
			
			
			}
			
			
		}
		else if(e.getKeyChar()=='%')
		{
			String str=l1.getText();

			this.howeronkey(bpersantage);

		
			double number2=0;
					
			if(str.length()>6&&str.charAt(str.length()-1)=='E'||(str.length()>6&&str.charAt(str.length()-2)=='E'&&str.charAt(str.length()-1)=='-'))
			 {
				 error=true;
				 checkerror();
			 }

			

			 else if(str.length()==1 && str.charAt(0)=='-')
			 {
				 error=true;
				 checkerror();
			 }
			

			 else if(str.charAt(str.length()-1)==symbole||str.contains("^"))
				{
				 	invalidinput=true;
				 	checkerror();
				}
			
			else
			{
				try
				{
				
						if(str.charAt(0)=='=')
						{
							str=str.substring(1,str.length());
							equation.setText("");
							
							l1.setText(str);
							symbole='+';
						}
						printequ(Double.parseDouble(str)+"%");
						
						 printsp=true;
						double sum=Double.parseDouble(str)/100;
		
						number2=sum;
						if(number1!=0 && (symbole=='+' ||symbole=='-'))
						{
						sum=number1*sum;
						}
					
						
						if(symbole=='+')
						{
						number1=number1+sum;
						}
						else if(symbole=='-')
						{
							number1=number1-sum;
						}
						else if(symbole=='x')
						{
						
							number1=number1*sum;
						
							
						}
						else if(symbole=='/')
						{
							
							number1=number1/sum;
							
							
						}
						
						str=dc.format(number1);
		
						if(str.length()>14)
						{
							str=number1+"";
						}
						
						l1.setText("="+str);
						symbole='=';
						
						if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
						{
						infinityerror=true;	
						System.out.println("I am here");
						}
						
						
				}
				catch(Exception eer)
				{
					if( number1==Double.POSITIVE_INFINITY||number2==Double.POSITIVE_INFINITY)
					{
					infinityerror=true;	
					}
					else 
					{
						error=true;
					}
				}
				finally
				{
				fontchange();
				
				checkerror();
				
				}
				////
				
		
				
			}
		
	
	
		}
		if(l1.getText()==null)
		{
			l1.setText("0");
		}
		if(l1.getText().length()>2)
		{
		if(l1.getText().charAt(0)=='-' &&l1.getText().charAt(1)=='0'&&l1.getText().length()>2&&l1.getText().charAt(2)!='.')
		{
			String str=l1.getText();
			str="-"+str.substring(2);
			l1.setText(str);
		}
		
		if(l1.getText().charAt(0)=='-'&&l1.getText().charAt(1)==symbole)
		{
			String str="-"+"0"+symbole;
			l1.setText(str);
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
		bxfactorial.setBackground(Color.white);
		bxfactorial.setForeground(Color.black);
		bpersantage.setBackground(Color.white);
		bpersantage.setForeground(Color.black);
		bxpowern.setBackground(Color.white);
		bxpowern.setForeground(Color.black);
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
		bxfactorial.setBorder(buttonborder);
		bxpowern.setBorder(buttonborder);
		bpersantage.setBorder(buttonborder);
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
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
	public void howereffect(JMenuItem b)
	{
		b.setFocusPainted(false);
		b.setFocusable(false);
		b.setBorderPainted(false);
		b.addMouseListener(new MouseAdapter()
		{
			
			public void mouseEntered(MouseEvent evt)
			{
				b.setBackground(howercolor);
				b.setForeground(Color.white);
			}
			public void mouseExited(MouseEvent evt)
			{
				b.setBackground(Color.white);
				b.setForeground(Color.black);
			}
		});
	}
	public void menubar()
	{
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, this.getWidth(), 40);
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
		
		howereffect(normalcalc);
		howereffect(standardcalc);
		howereffect(scintificcalc);
		howereffect(datecalc);
		howereffect(lengthcalc);
		howereffect(tempcalc);
		howereffect(energycalc);
		
		
		
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


