package SwingLogin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class Login extends Frame implements ActionListener{
    JLabel phno,userId,pass;
    JTextField phnoTxt,userIdTxt,passTxt;
    JButton validate,login;
    JPanel p1,p2;
    Login(){


        setLayout(new GridLayout(4,2));
        setVisible(true);
        setSize(560,500);


        phno = new JLabel("PHONE NUM");
        userId = new JLabel("User Id");
        pass = new JLabel("Password");

        phnoTxt = new JTextField(15);
        userIdTxt = new JTextField(15);
        passTxt = new JTextField(15);

        login = new JButton("LOGIN");
        login.addActionListener(this);
        validate = new JButton("VALIDATE");
        validate.addActionListener(this);

        p1 = new JPanel();
        p2 = new JPanel();

        login.setVisible(false);

        add(phno);
        add(phnoTxt);
        add(userId);
        add(userIdTxt);
        add(pass);
        add(passTxt);
        add(validate);
        add(login);

        pass.setVisible(false);
        passTxt.setVisible(false);
        userId.setVisible(false);
        userIdTxt.setVisible(false);
        //if validated then show the password fields and login button


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==validate) {
            try {
                int ph = Integer.parseInt(phnoTxt.getText());
                for(Customer i:Customer.customers) {
                    if(i.phone == ph) {
                        login.setVisible(true);
                        pass.setVisible(true);
                        passTxt.setVisible(true);
                        userId.setVisible(true);
                        userIdTxt.setVisible(true);
                        userIdTxt.setText(i.username);
                        break;
                    }
                }
                if(userIdTxt.getText().equals("")) {//no user found
                    JOptionPane.showMessageDialog(this, "No User Found.Create account");
                    this.dispose();//dispose this page
                    new Signup();//redirect to signup page
                }
            }catch(Exception er) {
                System.out.println(er.toString());
            }
        }

        if(e.getSource()==login) {
            boolean flag = true;
            for(Customer i:Customer.customers) {
                if((i.cid).equals(userIdTxt.getText()) && (i.pass).equals(passTxt.getText())) {
                    this.dispose();
                    flag = false;
                    new ItemPage();
                    break;
                }
            }
            if(flag) {
                JOptionPane.showMessageDialog(this, "Wrong password");
                passTxt.setText("");
            }
        }

    }


}
