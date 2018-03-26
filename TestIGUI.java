import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class TestIGUI {

	private JFrame frame;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JButton button;
	private JTextField textFieldans;
	private JLabel lblAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestIGUI window = new TestIGUI();
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
	public TestIGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(25, 30, 320, 90);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(355, 30, 320, 90);
		frame.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		JButton btnNewButton = new JButton("-|-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,ans;
				
				
				try {
					
					num1=Integer.parseInt(textFieldnum2.getText());
					num2=Integer.parseInt(textFieldnum2.getText());

					ans=num1+num2;
					textFieldans.setText(Integer.toString(ans));
					}catch(Exception e ) {
						JOptionPane.showMessageDialog(null, "Plese enter a valid number");
					}
				
			}
		});
		btnNewButton.setBounds(25, 158, 320, 90);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("---");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				
				
				try {
					
					num1=Integer.parseInt(textFieldnum2.getText());
					num2=Integer.parseInt(textFieldnum2.getText());

					ans=num1-num2;
					textFieldans.setText(Integer.toString(ans));
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Plese enter a valid number");
			}
		}});
		button.setBounds(355, 158, 320, 90);
		frame.getContentPane().add(button);
		
		textFieldans = new JTextField();
		textFieldans.setEditable(false);
		textFieldans.setBounds(25, 298, 650, 90);
		frame.getContentPane().add(textFieldans);
		textFieldans.setColumns(10);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 52));
		lblAnswer.setLabelFor(textFieldans);
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setBounds(25, 245, 650, 55);
		frame.getContentPane().add(lblAnswer);
		frame.setBounds(100, 100, 859, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
