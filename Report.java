import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Report extends JFrame implements ActionListener
{
JLabel lbl,lbl1;
JButton btn,btn1,btn2;
Report()
{
Image icon=Toolkit.getDefaultToolkit().getImage("download.jpg");
setIconImage(icon);
setLayout(null);
lbl=new JLabel("For Patients Reports Click Here :");
lbl.setBounds(100,200,400,30);
lbl1=new JLabel("For Patients Reports Click Here :");
lbl1.setBounds(100,350,400,30);
btn=new JButton("Display Patient's Report",new ImageIcon("emp.png"));
btn.setBounds(400,200,250,30);
btn1=new JButton("Display Doctor's Report",new ImageIcon("users.png"));
btn1.setBounds(400,350,250,30);
btn2=new JButton("Back",new ImageIcon("restore.png"));
btn2.setBounds(480,550,100,30);
add(lbl);
add(lbl1);
add(btn);
add(btn1);
add(btn2);
setVisible(true);
setTitle("Report");
setBounds(0,0,1000,700);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btn.addActionListener(this);
btn1.addActionListener(this);
btn2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn)
{
new Report1();
dispose();
}
else if(e.getSource()==btn1)
{
new Report1();
dispose();
}

if(e.getSource()==btn2)
{
new Start();
dispose();
}
}
}