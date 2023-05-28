package SwingLogin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ItemPage extends Frame implements ActionListener {
    JButton add,print;
    JTextArea area;
    JLabel itemId,quan,d;
    JTextField itemIdTxt,quanTxt;
    String res="";
    double totalcost = 0;
    JComboBox discount;
    String[] discountList = {"10","20","30"};
    ItemPage(){
        add = new JButton("Add");
        area = new JTextArea();
        print = new JButton("Print");
        add.addActionListener(this);
        print.addActionListener(this);
        itemId = new JLabel("Item id");
        itemIdTxt = new JTextField();
        quan  = new JLabel("Quantity");
        d = new JLabel("Discounts");
        quanTxt = new JTextField();
        discount = new JComboBox(discountList);
        add(itemId);
        add(itemIdTxt);
        add(quan);
        add(quanTxt);
        add(d);
        add(discount);
        add(add);
        add(print);
        add(area);
        setLayout(new GridLayout(5,2));
        setVisible(true);
        setSize(500,500);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==add) {
                for(Item i:ItemList.itemList) {
                    if(i.id==Integer.parseInt(itemIdTxt.getText())) {
                        res+="\n"+i+" quantity: "+quanTxt.getText()+" total: "+i.price*Integer.parseInt(quanTxt.getText());
                        totalcost+=i.price*Integer.parseInt(quanTxt.getText());
                        itemIdTxt.setText("");
                        quanTxt.setText("");
                        JOptionPane.showMessageDialog(this,"added");
                        break;
                    }
                    System.out.println("1"+res);
                }
            }
            if(e.getSource()==print) {
                area.setText(res+"\n Discount: "+discountList[discount.getSelectedIndex()]+"%"+"\n GrandTotal: "+(totalcost-((totalcost)*(Integer.parseInt(discountList[discount.getSelectedIndex()]))/100)));
            }
        }catch(Exception er) {
            System.out.println(er.toString());
        }
    }
}
