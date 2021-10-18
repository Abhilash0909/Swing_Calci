
import java.net.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class First extends Frame implements ActionListener
{
	Label output=new Label("Your result is = ");
	TextField Firstinput=new TextField("Enter First Input",20);
	TextField Secondinput=new TextField("Enter Second Input",20);
	Button add=new Button("Add");		
	Button sub=new Button("Sub");
	Button mul=new Button("Mul");
	Button div=new Button("Div");
	First()
	{
		Label Homepage=new Label("Calci Page");
		Homepage.setBounds(235,100,80,30);
		Homepage.setAlignment(Label.CENTER);
		add(Homepage);
		Label username=new Label("First Number");
		username.setBounds(230,200,80,30);
		username.setAlignment(Label.CENTER);
		username.setForeground(Color.WHITE);
		username.setBackground(Color.RED);
		add(username);
		Label password=new Label("Second Number");
		password.setBounds(230,250,80,30);
		password.setAlignment(Label.CENTER);
		password.setForeground(Color.WHITE);
		password.setBackground(Color.RED);
		add(password);
		Firstinput.setBounds(350,200,160,30);
		add(Firstinput);
		Secondinput.setBounds(350,250,160,30);
		add(Secondinput);
		add.setBounds(50,150,80,30);
		add.addActionListener(this);
		add(add);
		sub.setBounds(50,200,80,30);
		sub.addActionListener(this);
		add(sub);
		mul.setBounds(50,250,80,30);
		mul.addActionListener(this);
		add(mul);
		div.setBounds(50,300,80,30);
		div.addActionListener(this);
		add(div);
		output.setBounds(250,350,180,50);
		add(output);
		setSize(700,800);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=Firstinput.getText();
		String s2=Secondinput.getText();
		int num1,num2;
		num1=Integer.parseInt(s1);
		num2=Integer.parseInt(s2);
		if(e.getSource()==add)
		{
			output.setText("Your result is = "+(num1+num2));
		}
		else if(e.getSource()==sub)
		{
			output.setText("Your result is = "+(num1-num2));
		}
		else if(e.getSource()==mul)
		{
			output.setText("Your result is = "+(num1*num2));
		}
		else if(e.getSource()==div)
		{
			output.setText("Your result is = "+(num1/num2));
		}
		
	}
}
public class CalciAWT
{
	public static void main(String[] args) throws UnknownHostException
	{
		System.out.println("JAI HANUMAN");
		new First();
	}
}
