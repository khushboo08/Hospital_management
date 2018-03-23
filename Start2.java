import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Start2 extends JFrame implements ActionListener
{
JLabel lbl,lbl1,lbl2,lbl3;
JButton btn,btn1,btn2,btn3;
Start2()
{
Image icon=Toolkit.getDefaultToolkit().getImage("download.jpg");
setIconImage(icon);
setLayout(null);
lbl=new JLabel("Doctor's information");
lbl.setBounds(445,30,210,20);
lbl1=new JLabel("1.Add doctors information");
lbl1.setBounds(200,150,210,20);
lbl2=new JLabel("2.Modify doctors information");
lbl2.setBounds(200,250,210,20);
lbl3=new JLabel("3.View doctors information");
lbl3.setBounds(200,350,210,20);
btn=new JButton("Add Data", new ImageIcon("add.gif"));
btn.setBounds(340,180,180,30);
btn1=new JButton("Modify Data", new ImageIcon("bModify.PNG"));
btn1.setBounds(340,280,180,30);
btn2=new JButton("View Data", new ImageIcon("search.PNG"));
btn2.setBounds(340,380,180,30);
btn3=new JButton("Back", new ImageIcon("restore.PNG"));
btn3.setBounds(503,545,100,30);
add(lbl);
add(lbl1);
add(lbl2);
add(lbl3);
add(btn);
add(btn1);
add(btn2);
add(btn3);
setVisible(true);
setTitle("Doctors information");
setBounds(0,0,1000,700);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btn.addActionListener(this);
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn)
{
new DoctorInfoAdd();
dispose();
}
else if(e.getSource()==btn1)
{
new DoctorInfoModify();
dispose();
}
else if(e.getSource()==btn2)
{
new DoctorInfoView();
dispose();
}
else if(e.getSource()==btn3)
{
new Start();
dispose();
}
}
}
