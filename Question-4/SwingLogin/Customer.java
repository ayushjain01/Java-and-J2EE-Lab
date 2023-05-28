package SwingLogin;

import java.util.ArrayList;

public class Customer {
    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    String cid,username,pass;
    int phone;

    public Customer(String username,String pass,String cid,int phone) {
        this.cid = cid;
        this.phone = phone;
        this.pass = pass;
        this.username = username;
    }

    public String toString() {
        return "\nUsername :"+username+"\nCID: "+cid+"\nPHONE: "+String.valueOf(phone);
    }
}
