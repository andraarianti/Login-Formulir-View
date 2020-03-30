package login_form_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login_ {
    public static void main(String[] args) {
	Login login = new Login();
   }
}

class Login extends JFrame {
   final JTextField fuser = new JTextField(10);
   final JTextField fpass = new JTextField(10);
   
   JLabel ltitle = new JLabel(" LOGIN ");
   JLabel luser = new JLabel(" Username ");
   JLabel lpass = new JLabel(" Password ");
   
   JButton btnLogin = new JButton("LOGIN");

        Login() {
	setTitle("LOGIN");
	setSize(350,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        
        add(ltitle);
	add(luser);
	add(fuser);
        add(lpass);
	add(fpass);
	add(btnLogin);  
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = fuser.getText();
                String pass = fpass.getText();
                
                if(user.equals("admin") && pass.equals("12345")){
                    Form form = new Form();
                }
                else{
                    JOptionPane.showMessageDialog(null, "login failed !");
                }
            }
        });
        setVisible(true);
        ltitle.setBounds(150,15,140,20);
	luser.setBounds(10,50,120,20);
	fuser.setBounds(130,50,150,20);
	lpass.setBounds(10,75,120,20);
	fpass.setBounds(130,75,150,20);
	btnLogin.setBounds(100,110,120,20);
	
   }
}
