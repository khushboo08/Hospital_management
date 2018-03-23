import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Start extends JFrame implements ActionListener
{
JLabel lbl,lbl1,lbl2,lbl3,lbl4;
JButton btn,btn1,btn2,btn3,btn4,btn5;
Start()
{
Image icon=Toolkit.getDefaultToolkit().getImage("download.jpg");
setIconImage(icon);
setLayout(null);
lbl=new JLabel("SELECT THE APPROPRIATE OPTION");
lbl.setBounds(20,70,450,30);
lbl1=new JLabel("1.For inserting , Modifying , Retrieving Patients related Data");
lbl1.setBounds(10,120,350,30);
lbl2=new JLabel("2.For inserting , Modifying , Retrieving Doctors related Data");
lbl2.setBounds(10,170,350,30);
lbl3=new JLabel("3.Billing Details");
lbl3.setBounds(10,220,350,30);
lbl4=new JLabel("4.Patient and Doctor related Data");
lbl4.setBounds(10,270,350,30);
btn=new JButton("Patient", new ImageIcon("Advances.PNG"));
btn.setBounds(380,120,150,30);
btn1=new JButton("Doctor", new ImageIcon("Advances.PNG"));
btn1.setBounds(380,170,150,30);
btn2=new JButton("Billing", new ImageIcon("Attendance.PNG"));
btn2.setBounds(380,220,150,30);
btn3=new JButton("Report", new ImageIcon("edit.PNG"));
btn3.setBounds(380,270,150,30);
btn4=new JButton("Back", new ImageIcon("preview_Hover.PNG"));
btn4.setBounds(50,350,150,40);
btn5=new JButton("Exit", new ImageIcon("exits.PNG"));
btn5.setBounds(350,350,150,40);
add(lbl);
add(lbl1);
add(lbl2);
add(lbl3);
add(lbl4);
add(btn);
add(btn1);
add(btn2);
add(btn3);
add(btn4);
add(btn5);
setVisible(true);
setTitle("Hospital Management");
setBounds(0,0,700,700);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btn.addActionListener(this);
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);
btn5.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn)
{
new Start1();
dispose();
}
else if(e.getSource()==btn1)
{
new Start2();
dispose();
}
else if(e.getSource()==btn2)
{
new Billing();
dispose();
}
else if(e.getSource()==btn3)
{
new Report();
dispose();
}
else if(e.getSource()==btn4)
{
new Form();
dispose();
}
else if(e.getSource()==btn5)
{
System.exit(0);
}
}
}