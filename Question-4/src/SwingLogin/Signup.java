package SwingLogin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Signup extends Frame implements ActionListener {
    JLabel username,password,phno,cid;
    JTextField usernameTxt,passwordTxt,phnoTxt,cidTxt;
    JButton submit;
    Signup(){
        username = new JLabel("Username");
        password = new JLabel("password");
        phno = new JLabel("PHno");
        cid = new JLabel("Customer id");
        usernameTxt = new JTextField();
        passwordTxt = new JTextField();
        phnoTxt = new JTextField();
        cidTxt = new JTextField();
        submit = new JButton("Signup");
        submit.addActionListener(this);

        add(username);
        add(usernameTxt);
        add(password);
        add(passwordTxt);
        add(phno);
        add(phnoTxt);
        add(cid);
        add(cidTxt);
        add(submit);

        setLayout(new GridLayout(5,2));
        setVisible(true);
        setSize(500,500);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            Customer c = new Customer(usernameTxt.getText(), passwordTxt.getText(),cidTxt.getText(),Integer.parseInt(phnoTxt.getText()));
            Customer.customers.add(c);
            JOptionPane.showMessageDialog(this,"Created account");
            this.dispose();//dispose this page
            new Login();//redirect to login page;
        }
    }
}