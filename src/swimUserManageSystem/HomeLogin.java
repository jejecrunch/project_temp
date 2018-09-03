package swimUserManageSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomeLogin extends JFrame {

	private JPanel panel1, panel2;
	JTextField id;
	JPasswordField password;
	JButton confirm, register;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeLogin frame = new HomeLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(2, 2));
		// 2행 2열로 panel의 화면을 분할
		id = new JTextField(10);
		setContentPane(panel1);
	}

}
