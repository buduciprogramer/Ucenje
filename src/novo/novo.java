package novo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class novo implements ActionListener {
private static JLabel userlabel;
private static JTextField usertext;
private static JLabel passwordLabel;
private static JPasswordField passwordText;
private static JButton button;
private static JLabel success;

public static void main(String[] args) {
        JPanel panel=new JPanel();
JFrame frame=new JFrame();
frame.setSize(350,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.add(panel);
        panel.setLayout(null);
         userlabel=new JLabel("USER");
        userlabel.setBounds(10,25,80,25);
panel.add(userlabel);


         usertext=new JTextField(20);
    usertext.setBounds(100,20,165,25);
    panel.add(usertext);

     passwordLabel=new JLabel("Password");
passwordLabel.setBounds(10,50,80,25);
panel.add(passwordLabel);

 passwordText=new JPasswordField();
passwordText.setBounds(100,50,165,25);
panel.add(passwordText);

 button=new JButton("Login");
button.setBounds(10,80,80,25);
button.addActionListener(new novo());
panel.add(button);

 success=new JLabel("");
success.setBounds(10,110,300,25);
panel.add(success);


frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
String user=usertext.getText();
String password=passwordText.getText();
        System.out.println(user+""+password);

if(user.equals("Nedim")&&password.equals("nedooo")){
    success.setText("Login je uspjesan!");
}
}
}
