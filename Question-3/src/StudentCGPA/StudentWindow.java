package StudentCGPA;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class StudentWindow implements ActionListener  {
	
	static JFrame jf = new JFrame("Student Infomation Window");
	static JTextField name = new JTextField(20);
	static JTextField usn = new JTextField(20);
	static JTextField branch = new JTextField(10);
	static JTextField age = new JTextField(5);
	static JTextField address = new JTextField(50);
	static JTextField sgpaW[]=new JTextField[8];
	static JButton submit=new JButton("Submit");
	static JButton done=new JButton("Done");
	static JButton display=new JButton("Display");
	
	static ArrayList<Student> studentList= new ArrayList<>();

	public static void main(String[] args) {
		jf.setSize(800,600);
		jf.setLayout(new FlowLayout());
		
		
		jf.add(new JLabel("Name : "));
		jf.add(name);
		jf.add(new JLabel("USN : "));
		jf.add(usn);
		jf.add(new JLabel("Age : "));
		jf.add(age);
		jf.add(new JLabel("Branch : "));
		jf.add(branch);
		jf.add(new JLabel("Address : "));
		jf.add(address);
		for (int i = 0; i < sgpaW.length; i++) {
			sgpaW[i]=new JTextField(5);
			jf.add(new JLabel("SGPA "+(i+1)));
			jf.add(sgpaW[i]);
		}
		jf.add(submit);
		jf.add(done);
		jf.add(display);
		submit.addActionListener(new StudentWindow());
		done.addActionListener(new StudentWindow());
		display.addActionListener(new StudentWindow());
		jf.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit)
		{
			int a=Integer.parseInt(age.getText());
			if(18>a||a>30)
			{
				System.out.println("Invalid age");
				String temp=JOptionPane.showInputDialog(null,"Enter valid age between 18 to 30 : ");
				age.setText(temp);
			}
	
		}
		if(e.getSource()==done)
		{
			double sgpa[]=new double[8];
			
			for (int i = 0; i < sgpa.length; i++) {
				sgpa[i]=Double.parseDouble(sgpaW[i].getText());
			}
			double cgpa = Arrays.stream(sgpa).sum()/8.0;
			System.out.println(sgpaW[0].getText());
			int ageInt =  Integer.parseInt(age.getText());
			
			studentList.add(new Student(name.getText(), usn.getText(), branch.getText(), address.getText(), ageInt, sgpa, cgpa));
		}
		if(e.getSource()==display)
		{
			jf.setVisible(false);
			JFrame da=new JFrame("All Students");
			da.setSize(800,600);
			da.setVisible(true);
			JTextArea info=new JTextArea(50,50);
			da.add(info);
			for (Student i : studentList) {
				info.append(i.toString()+"\n");
			}
			
		}
		
	}
	

}