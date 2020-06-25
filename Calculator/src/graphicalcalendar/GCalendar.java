package graphicalcalendar;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class GCalendar extends JFrame implements ActionListener
{

	private JPanel contentPane;
	public static  int date=0;
	private Border activedateborder,border;
	private JButton b[],btnok,back,bdefault;
	public static int selectedyear=0,selectedmonth=0;
	public static String monthnamelist[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	private JMonthChooser monthChooser;
	private JSpinner year,month;
	private JYearChooser yearChooser;
	private int cday,cmonth,cyear;
	private JTextField monthname;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar cal=new GregorianCalendar();
					GCalendar frame = new GCalendar(cal.get(Calendar.DATE),cal.get(Calendar.MONTH),cal.get(Calendar.YEAR));
					frame.setVisible(true);
					frame.setLocation(300,100);
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GCalendar(int intcday,int intcmonth,int intcyear)
	{
		
		
		
		
		 cday=intcday;
		 cmonth=intcmonth;
		 cyear=intcyear;
		date=cday;
		selectedyear=cyear;
		selectedmonth=cmonth;
		
		Timer timer=new Timer(10,this);
		timer.start();
		this.setUndecorated(false);
		setTitle("Calendar");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 487, 523);
		setBackground(Color.white);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//	
		 btnok = new JButton("Ok");
		btnok.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnok.setForeground(Color.BLACK);
		btnok.setBackground(Color.WHITE);
		btnok.setBounds(309, 448, 130, 35);
		btnok.addActionListener(this);
		btnok.setFocusPainted(false);
		contentPane.add(btnok);
		
		 back = new JButton("back");
		back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		back.setBackground(Color.WHITE);
		back.setForeground(Color.BLACK);
		back.setBounds(32, 448, 130, 35);
		back.setFocusPainted(false);
		back.addActionListener(this);
		contentPane.add(back);
		
		
		JLabel lblCalendar = new JLabel("Calendar");
		lblCalendar.setBackground(new Color(128, 128, 128));
		lblCalendar.setForeground(new Color(255, 255, 255));
		lblCalendar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCalendar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalendar.setOpaque(true);
		lblCalendar.setBounds(0, 11, 484, 35);
		contentPane.add(lblCalendar);
		
		JLabel lblSu = new JLabel("  SU         MO       TU        WE        TH        FR         SA");
		lblSu.setForeground(new Color(0, 0, 0));
		
		lblSu.setBackground(new Color(255, 255, 0));
		lblSu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSu.setOpaque(true);
		lblSu.setBounds(32, 113, 407, 19);
		contentPane.add(lblSu);
		
		 bdefault = new JButton("Today");
		bdefault.setForeground(Color.BLACK);
		bdefault.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bdefault.setFocusPainted(false);
		bdefault.setBackground(Color.WHITE);
		bdefault.setBounds(169, 448, 130, 35);
		contentPane.add(bdefault);
		
		 yearChooser = new JYearChooser();
		yearChooser.setBounds(352, 67, 84, 35);
		contentPane.add(yearChooser);
		yearChooser.setYear(cyear);
		yearChooser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 monthChooser = new JMonthChooser();
		 monthChooser.setYearChooser(yearChooser);
		monthChooser.setBounds(31, 67, 115, 35);
		monthChooser.setOpaque(true);
		contentPane.add(monthChooser);
		monthChooser.setMonth(cmonth);
		monthChooser.setFocusable(false);
		
		monthname = new JTextField();
		monthname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		monthname.setHorizontalAlignment(SwingConstants.CENTER);
		monthname.setEditable(false);
		monthname.setBounds(150, 67, 198, 35);
		contentPane.add(monthname);
		monthname.setColumns(10);

		
		for(Component c : monthChooser.getComponents())
		{
			c.setBackground(Color.white);
			c.setFont(new Font("Tahoma", Font.PLAIN, 15));
			c.setFocusable(false);
			
		}
		
		bdefault.addActionListener(this);
		activedateborder=BorderFactory.createLineBorder(new Color(51,204,255), 0);
		border=BorderFactory.createLineBorder(Color.black, 0);
		int count=0;
		b=new JButton[42];
		int row=40,colume=50;
		for(int i=1; i<=6; i++)
		{	
			colume=10;
			for(int j=1; j<=7; j++)
			{
				b[count]=new JButton(count+"");
				b[count].setBounds(20+colume,100+row,50,40);
				b[count].setVisible(true);
				b[count].setFocusPainted(false);
				b[count].setBorder(border);
			
				b[count].setBackground(Color.white);
				b[count].setForeground(Color.black);
				b[count].addActionListener(this);
				b[count].setFont(new Font("Segoe UI Semibold",Font.PLAIN,15));
				contentPane.add(b[count]);
				count++;
				colume+=60;
			}
			row+=50;
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub

		selectedyear=(int) yearChooser.getYear();
		selectedmonth=(int) monthChooser.getMonth();
		GregorianCalendar gcal=new GregorianCalendar(selectedyear,selectedmonth,1);
		int days=gcal.getActualMaximum(Calendar.DATE);
		int totalweeks=gcal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		int startinweek=gcal.get(Calendar.DAY_OF_WEEK);
		int count=1;
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(count<startinweek || count+1-startinweek>days)
				{
					b[count-1].setVisible(false);
				}
				else
				{
					
					
					
						b[count-1].setVisible(true);
						b[count-1].setText(count+1-startinweek+"");
					
					
				}
				count++;
			}
		}
		Calendar c=new GregorianCalendar();
		count=1;
		for(int i=0; i<42; i++)
		{
			if(Integer.parseInt(b[i].getText())==date)
			{
				b[i].setBorder(activedateborder);
//				b[i].setBackground(new Color(51,204,255));
				b[i].setBackground(new Color(0,130,130));
				b[i].setForeground(Color.white);
				b[i].setFont(new Font("Serif",Font.BOLD,23));
				
				if((c.get(Calendar.DATE)==(count-startinweek+1))&& c.get(Calendar.MONTH)==selectedmonth &&c.get(Calendar.YEAR)==selectedyear)
				{
				b[i].setBackground(Color.red);
				
				
				}
				
			}
			else
			{
				b[i].setBorder(border);
				
				b[i].setBackground(Color.white);
				b[i].setForeground(Color.black);
				b[i].setFont(new Font("Segoe UI Semibold",Font.PLAIN,18));
			}
			if((c.get(Calendar.DATE)==(count-startinweek+1))&& c.get(Calendar.MONTH)==selectedmonth &&c.get(Calendar.YEAR)==selectedyear)
			{
			if(c.get(Calendar.DATE)==date)
			{
				b[i].setForeground(Color.white);
			}else
			{
				b[i].setForeground(Color.red);
				b[i].setFont(new Font("Arial",Font.BOLD,15));
				
			}
			
			b[i].setBorder(border);
			}
			
			
			count++;
		}
	
			monthname.setText(date+" "+monthnamelist[(int) monthChooser.getMonth()]+","+yearChooser.getYear());
		
		if(e.getSource()==btnok)
		{
	
		try
		{
			FileWriter fw=new FileWriter("F:\\Home java\\date\\date.txt",false);
			BufferedWriter bf=new BufferedWriter(fw);
			fw.write(getdate());
			fw.close();
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
			this.dispose();
		}
		else if(e.getSource()==back)
		{
			this.dispose();
		}
		else if(e.getSource()==bdefault)
		{
			
			Calendar cal=new GregorianCalendar();
			GCalendar g = new GCalendar(cal.get(Calendar.DATE),cal.get(Calendar.MONTH),cal.get(Calendar.YEAR));
			g.setVisible(true);
			g.setLocation(this.getX(), this.getY());
			this.dispose();
		}
		
		else
		{
				for(int i=0; i<42; i++)
				{
							if(b[i]==e.getSource())
							{
								
								date=Integer.parseInt(b[i].getText());
								
							}
					
					
				}
		}
	
	}
	public static String getdate(int n)
	{
		String str=n+"";
		if(str.length()==1)
		{
			str="0"+str;
		}
		return str;
		
	}
	public static String getdate()
	{
		String strdate=getdate(date)+"/"+getdate(selectedmonth+1)+"/"+selectedyear;
		return strdate;
		
	}
}

