package graphicalcalendar;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class DateChooser extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateChooser frame = new DateChooser();
					frame.setVisible(true);
					frame.icon();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	public  ImageIcon createImage(String path)
//	{
//		return new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getClass().getResource(path));
//		
//	}
	private void icon()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calcicon.png")));
	}
	/**
	 * Create the frame.
	 */
	public DateChooser() {
//		this.setIconImage(createImage("C:/Users/Sohansinh Rathod/eclipse-workspace/Calculator/resources/calcicon.png").getImage());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
	}
}
