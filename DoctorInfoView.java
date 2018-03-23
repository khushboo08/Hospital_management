import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class DoctorInfoView extends JFrame implements ActionListener
{
JLabel lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10;
JTextField txt,txt1,txt2,txt3,txt4;
TextArea txta,txta1,txta2;
JButton btn,btn1,btn2;
DoctorInfoView()
{
Image icon=Toolkit.getDefaultToolkit().getImage("download.jpg");
setIconImage(icon);
setLayout(null);
lbl=new JLabel("View Doctor Information");
lbl.setBounds(450,35,160,15);
lbl1=new JLabel("Doctor Information");
lbl1.setBounds(40,75,120,15);
lbl2=new JLabel("Name");
lbl2.setBounds(105,100,110,15);
lbl3=new JLabel("Address :");
lbl3.setBounds(105,140,70,15);
lbl4=new JLabel("Doctor ID :");
lbl4.setBounds(580,100,70,25);
lbl5=new JLabel("Contact :");
lbl5.setBounds(580,140,60,25);
lbl6=new JLabel("Specialization :");
lbl6.setBounds(105,315,100,25);
lbl7=new JLabel("Working hours :");
lbl7.setBounds(580,205,100,15);
lbl8=new JLabel("From :");
lbl8.setBounds(680,200,40,25);
lbl9=new JLabel("to :");
lbl9.setBounds(780,200,20,25);
lbl10=new JLabel("Patient List :");
lbl10.setBounds(570,310,80,25);
txt=new JTextField();
txt.setBounds(270,100,250,20);
txt1=new JTextField();
txt1.setBounds(645,100,150,20);
txt2=new JTextField();
txt2.setBounds(645,140,200,20);
txt3=new JTextField();
txt3.setBounds(719,200,45,20);
txt4=new JTextField();
txt4.setBounds(810,200,45,20);
txta=new TextArea();
txta.setBounds(270,140,250,100);
txta1=new TextArea();
txta1.setBounds(270,310,250,100);
txta2=new TextArea();
txta2.setBounds(735,310,250,100);
btn=new JButton("Search",new ImageIcon("search.png"));
btn.setBounds(190,600,120,30);
btn1=new JButton("Clear",new ImageIcon("LOGGOFF.PNG"));
btn1.setBounds(390,600,100,30);
btn2=new JButton("Back",new ImageIcon("restore.png"));
btn2.setBounds(550,600,100,30);
add(lbl);
add(lbl1);
add(lbl2);
add(txt);
add(lbl3);
add(txta);
add(lbl4);
add(txt1);
add(lbl5);
add(txt2);
add(lbl6);
add(txta1);
add(lbl7);
add(lbl8);
add(txt3);
add(lbl9);
add(txt4);
add(lbl10);
add(txta2);
add(btn);
add(btn1);
add(btn2);
setVisible(true);
setTitle("DoctorInfoView");
setBounds(0,0,1200,700);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btn.addActionListener(this);
btn1.addActionListener(this);
btn2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn1)
{
txt.setText("");
txt1.setText("");
txt2.setText("");
txt3.setText("");
txt4.setText("");
txta.setText("");
txta1.setText("");
}
else if(e.getSource()==btn2)
{
new Start2();
dispose();
}
}
}



