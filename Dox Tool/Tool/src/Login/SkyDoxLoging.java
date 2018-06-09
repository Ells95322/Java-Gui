package Login;
import java.awt.*;
import javax.swing.*;

import Tool.MainTool;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SkyDoxLoging {

	private JFrame frmLogin;
	private JLabel lblUsername;
	private JPasswordField txtPass;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JTextField txtUname;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkyDoxLoging window = new SkyDoxLoging();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SkyDoxLoging() {
		initialize();
	}

	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 27));
		frmLogin.getContentPane().setBackground(new Color(105, 105, 105));
		frmLogin.setBackground(new Color(128, 128, 128));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 400, 225);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel LoginLBL = new JLabel("Login");
		LoginLBL.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 29));
		LoginLBL.setLabelFor(frmLogin);
		LoginLBL.setAlignmentX(Component.CENTER_ALIGNMENT);
		LoginLBL.setToolTipText("To Use Skydox You Need a Login");
		LoginLBL.setHorizontalAlignment(SwingConstants.CENTER);
		LoginLBL.setBounds(0, 0, 384, 42);
		frmLogin.getContentPane().add(LoginLBL);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(3, 53, 101, 32);
		frmLogin.getContentPane().add(lblUsername);
		
		txtPass = new JPasswordField();
		txtPass.setForeground(Color.BLACK);
		txtPass.setBackground(Color.LIGHT_GRAY);
		txtPass.setFont(new Font("Arial", Font.BOLD, 15));
		txtPass.setBounds(114, 96, 260, 32);
		frmLogin.getContentPane().add(txtPass);
		
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(0, 97, 110, 31);
		frmLogin.getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String password = txtUname.getText();
				@SuppressWarnings("deprecation")
				String username = txtPass.getText();
				
				if (password.contains("Test") && username.contains("1234"))
				{
					txtUname.setText(null);
					txtPass.setText(null);
					JOptionPane.showMessageDialog(null, "Login Succes", "Sucess", 1);
//					MainTool.main(null);
				}
				else if(password.contains("User") && username.contains("Pass"))
				{
					txtUname.setText(null);
					txtPass.setText(null);
					JOptionPane.showMessageDialog(null, "Login Succes", "Sucess", 1);
//					MainTool.main(null);
				}else{
					txtUname.setText(null);
					txtPass.setText(null);
					JOptionPane.showMessageDialog(null, "Invalad", "Warning", 2);
				}
				
			}
		});
		btnLogin.setBackground(new Color(169, 169, 169));
		btnLogin.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		btnLogin.setBounds(240, 148, 134, 27);
		frmLogin.getContentPane().add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(3, 40, 381, 2);
		frmLogin.getContentPane().add(separator);
		
		txtUname = new JTextField();
		txtUname.setFont(new Font("Arial", Font.BOLD, 15));
		txtUname.setForeground(Color.BLACK);
		txtUname.setBackground(Color.LIGHT_GRAY);
		txtUname.setBounds(114, 53, 260, 32);
		frmLogin.getContentPane().add(txtUname);
		txtUname.setColumns(10);
	}
}
