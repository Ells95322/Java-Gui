package Tool;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainTool {

	private JFrame frmSkydox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainTool window = new MainTool();
					window.frmSkydox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainTool() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSkydox = new JFrame();
		frmSkydox.setTitle("SkyDox");
		frmSkydox.setBackground(new Color(192, 192, 192));
		frmSkydox.getContentPane().setBackground(new Color(128, 128, 128));
		frmSkydox.setBounds(100, 100, 675, 520);
		frmSkydox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSkydox.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 639, 459);
		frmSkydox.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		tabbedPane.addTab("About", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		tabbedPane.addTab("Links", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 128, 128));
		tabbedPane.addTab("Formater", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 128));
		tabbedPane.addTab("Database Serch", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Comeing");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 99));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setBounds(10, 11, 614, 409);
		panel_3.add(lblNewLabel);
		
		JLabel lblSoo = new JLabel("Soon");
		lblSoo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoo.setFont(new Font("Arial", Font.BOLD, 99));
		lblSoo.setBounds(10, 11, 614, 409);
		panel_3.add(lblSoo);
		frmSkydox.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmSkydox.getContentPane()}));
	}
}
