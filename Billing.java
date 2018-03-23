import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Billing extends JFrame implements ActionListener
{
JLabel lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
JTextField txt,txt1,txt2,txt3,txt4;
JButton btn,btn1,btn2;
Billing()
{
Image icon=Toolkit.getDefaultToolkit().getImage("download.jpg");
setIconImage(icon);
setLayout(null);
lbl=new JLabel("Billing Information");
lbl.setBounds(440,35,107,15);
lbl1=new JLabel("Patient Name :");
lbl1.setBounds(104,97,85,25);
lbl2=new JLabel("Date of Admission :");
lbl2.setBounds(104,175,120,25);
lbl3=new JLabel("Room Type :");
lbl3.setBounds(104,242,70,25);
lbl4=new JLabel("Total Amount :");
lbl4.setBounds(104,380,85,25);
lbl5=new JLabel("Patient No. :");
lbl5.setBounds(570,97,70,25);
lbl6=new JLabel("Date of Discharge :");
lbl6.setBounds(570,175,120,25);
txt=new JTextField();
txt.setBounds(230,97,225,20);
txt1=new JTextField();
txt1.setBounds(230,175,90,20);
txt2=new JTextField();
txt2.setBounds(230,242,90,20);
txt3=new JTextField();
txt3.setBounds(230,380,120,20);
txt4=new JTextField();
txt4.setBounds(694,97,180,20);
btn=new JButton("Search" ,new ImageIcon("setting.png"));
btn.setBounds(300,550,110,30);
btn1=new JButton("Clear",new ImageIcon("LOGGOFF.PNG"));
btn1.setBounds(470,550,100,30);
btn2=new JButton("Back",new ImageIcon("restore.png"));
btn2.setBounds(580,550,100,30);
add(lbl);
add(lbl1);
add(txt);
add(lbl2);
add(txt1);
add(lbl3);
add(txt2);
add(lbl4);
add(txt3);
add(lbl5);
add(txt4);
add(lbl6);
add(btn);
add(btn1);
add(btn2);
setVisible(true);
setTitle("Billing");
setBounds(0,0,1000,700);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btn.addActionListener(this);
btn1.addActionListener(this);
btn2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn2)
{
new Start();
dispose();
}
}
}











