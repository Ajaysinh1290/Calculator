package calculator;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import graphicalcalendar.GCalendar;

public class DateCalculator extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JMenuItem normalcalc,standardcalc,scintificcalc,datecalc,lengthcalc,tempcalc,energycalc,areacalc,speedcalc,pressurecalc,anglecalc,frequencycalc,volumecalc,masscalc;
	private JMenu follow;
	private JMenuItem instagram,facebook,twitter,youtube,github;
	private JLabel calculatorlbl,converterlbl;
	private JLabel firstdate;
	private JLabel seconddate,datediffer;
	private boolean writeinfirst=false,writeinsecond=false;
	private String date1,date2;
	JButton bseconddate,bfirstdate;
	private JLabel lblTo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateCalculator frame = new DateCalculator();
					frame.setVisible(true);
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
	public DateCalculator() {
		
		LocalDate now=LocalDate.now();
		date1=GCalendar.getdate(now.getDayOfMonth())+"/"+GCalendar.getdate(now.getMonthValue())+"/"+now.getYear();
		date2=date1;
		Timer timer=new Timer(100,this);
		timer.start();
		setResizable(false);
		setTitle("Date Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(487, 523);
		
			contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		menubar();
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(new Color(0, 0, 0));
		lblFrom.setFont(new Font("Cambria", Font.BOLD, 20));
		lblFrom.setBounds(49, 66, 64, 36);
		contentPane.add(lblFrom);
		
		firstdate = new JLabel(date1.substring(0,2)+" "+GCalendar.monthnamelist[Integer.parseInt(date1.substring(3, 5))-1]+","+date1.substring(6));
		firstdate.setForeground(new Color(255, 255, 255));
		firstdate.setBackground(new Color(0, 128, 128));
		firstdate.setFont(new Font("Cambria", Font.PLAIN, 20));
		firstdate.setHorizontalAlignment(SwingConstants.CENTER);
		firstdate.setBounds(49, 113, 292, 53);
		firstdate.setOpaque(true);
		contentPane.add(firstdate);
		
		 bfirstdate = new JButton();
		bfirstdate.setFont(new Font("Cambria", Font.PLAIN, 23));
		bfirstdate.setForeground(Color.BLACK);
		bfirstdate.setBackground(Color.WHITE);
		bfirstdate.setBounds(364, 113, 53, 53);
		contentPane.add(bfirstdate);
		bfirstdate.setFocusPainted(false);
		bfirstdate.setCursor(new Cursor(HAND_CURSOR));
		bfirstdate.addActionListener(this);
		bfirstdate.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\calendarbtn.png"));
		
		seconddate = new JLabel(date2.substring(0,2)+" "+GCalendar.monthnamelist[Integer.parseInt(date2.substring(3, 5))-1]+","+date2.substring(6));
		seconddate.setForeground(new Color(255, 255, 255));
		seconddate.setOpaque(true);
		seconddate.setHorizontalAlignment(SwingConstants.CENTER);
		seconddate.setFont(new Font("Cambria", Font.PLAIN, 20));
		seconddate.setBackground(new Color(0, 128, 128));
		seconddate.setBounds(49, 224, 292, 53);
		contentPane.add(seconddate);
		
		bseconddate = new JButton();
		bseconddate.setForeground(Color.BLACK);
		bseconddate.setFont(new Font("Cambria", Font.PLAIN, 23));
		bseconddate.setFocusPainted(false);
		bseconddate.setBackground(Color.WHITE);
		bseconddate.setBounds(364, 224, 53, 53);
		bseconddate.setCursor(new Cursor(HAND_CURSOR));
		
		bseconddate.setIcon(new ImageIcon("C:\\Users\\Sohansinh Rathod\\eclipse-workspace\\Calculator\\icons\\calendarbtn.png"));
		bseconddate.addActionListener(this);
		contentPane.add(bseconddate);
		
		lblTo = new JLabel("To");
		lblTo.setForeground(new Color(0, 0, 0));
		lblTo.setFont(new Font("Cambria", Font.BOLD, 20));
		lblTo.setBounds(49, 177, 64, 36);
		contentPane.add(lblTo);
		
		JLabel lblDifference = new JLabel("Difference");
		lblDifference.setForeground(new Color(0, 0, 0));
		lblDifference.setFont(new Font("Cambria", Font.PLAIN, 21));
		lblDifference.setHorizontalAlignment(SwingConstants.CENTER);
		lblDifference.setBounds(0, 341, 481, 36);
		contentPane.add(lblDifference);
		
		 datediffer = new JLabel("Same Dates");
		datediffer.setHorizontalAlignment(SwingConstants.CENTER);
		datediffer.setForeground(new Color(0, 0, 0));
		datediffer.setFont(new Font("Cambria", Font.BOLD, 25));
		datediffer.setBounds(0, 388, 481, 36);
		contentPane.add(datediffer);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		LocalDate dateone = LocalDate.of( Integer.parseInt(date1.substring(6)),Integer.parseInt(date1.substring(3,5)), Integer.parseInt(date1.substring(0, 2)));
	
		LocalDate datetwo = LocalDate.of( Integer.parseInt(date2.substring(6)),Integer.parseInt(date2.substring(3,5)), Integer.parseInt(date2.substring(0, 2)));
		
		Period diff = Period.between(dateone,datetwo);
		int years = Math.abs(diff.getYears()); 
		int months = Math.abs(diff.getMonths());
        int days = Math.abs(diff.getDays());
        String year=years+" year";
        String month=months+" month";
        String day=days+" day";
        
        if(years>1)
        {
        	year=year+"s ";
        }
        if(months>1)
        {
        	month=month+"s ";
        }
        if(days>1)
        {
        	day=day+"s ";
        }
       
        String duration="";
        if(years!=0)
        {
        	duration=year;
        }
        if(months!=0)
        {
        	if(duration!="")
        	{
        		duration+=",";
        	}
        	duration=duration+month;
        }
        if(days!=0)
        {

        	if(duration!="")
        	{
        		duration+=",";
        	}
        	duration=duration+day;
        }
        if(years==0 && months==0 && days==0)
        {
        	duration="Same days";
        }


        datediffer.setText(duration);
		
		
		if(writeinfirst)
		{
			try
			{
			FileReader fw=new FileReader("F:\\Home java\\date\\date.txt");
			BufferedReader bf=new BufferedReader(fw);
			String str=bf.readLine();
			date1=str;
			str=str.substring(0,2)+" "+GCalendar.monthnamelist[Integer.parseInt(str.substring(3, 5))-1]+","+str.substring(6);
		
			firstdate.setText(str);
			bf.close();
			File file=new File("F:\\Home java\\date\\date.txt");
			file.delete();
			
			}
			catch(Exception exp)
			{
		
			}
			
		}
		if(writeinsecond)
		{
			try
			{
			FileReader fw=new FileReader("F:\\Home java\\date\\date.txt");
			BufferedReader bf=new BufferedReader(fw);
			String str=bf.readLine();
			date2=str;
			str=str.substring(0,2)+" "+GCalendar.monthnamelist[Integer.parseInt(str.substring(3, 5))-1]+","+str.substring(6);
			
			seconddate.setText(str);
			File file=new File("F:\\Home java\\date\\date.txt");
			file.delete();
			}
			catch(Exception exp)
			{
			
			}
			
		}
		

	
		Object source=e.getSource();
		menubaractionlistener(source);
		if(bfirstdate==source)
		{
			LocalDate now=LocalDate.now();
			GCalendar gc=new GCalendar(Integer.parseInt(date1.substring(0,2)),Integer.parseInt(date1.substring(3,5))-1, Integer.parseInt(date1.substring(6)));
			gc.setVisible(true);
			gc.setLocation(this.getX(), this.getY());
			writeinsecond=false;
			writeinfirst=true;
		}
		else if(bseconddate==source)
		{
			LocalDate now=LocalDate.now();
			GCalendar gc=new GCalendar(Integer.parseInt(date2.substring(0,2)),Integer.parseInt(date2.substring(3,5))-1, Integer.parseInt(date2.substring(6)));
			gc.setVisible(true);
			gc.setLocation(this.getX(), this.getY());
			writeinfirst=false;
			writeinsecond=true;
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
