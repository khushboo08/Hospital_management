import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Form extends JFrame implements ActionListener
{
JPanel panel,panel1,panel2;
JLabel lbl,lbl1,lbl2;
JTextField txt;
JPasswordField txt1;
JButton btn,btn1;
Form()
{
Image icon=Toolkit.getDefaultToolkit().getImage("download.jpg");
setLayout(null);
setIconImage(icon);
setLayout(null);
panel=new JPanel();
panel.setBounds(0,0,400,100);
panel.setLayout(null);
lbl=new JLabel("HOSPITAL MANGEMENT");
lbl.setBounds(100,10,200,50);
panel1=new JPanel();
panel1.setBounds(0,100,400,100);
panel1.setLayout(null);
lbl1=new JLabel("Username");
lbl1.setBounds(20,15,80,20);
txt=new JTextField();
txt.setBounds(150,15,100,20);
lbl2=new JLabel("Password");
lbl2.setBounds(20,55,80,20);
txt1=new JPasswordField();

txt1.setBounds(150,55,100,20);
panel2=new JPanel();
panel2.setBounds(0,200,400,100);
panel2.setLayout(null);
btn=new JButton("Login", new ImageIcon("key.gif"));
btn.setBounds(100,50,120,40);
btn1=new JButton("Exit", new ImageIcon("keys.gif"));
btn1.setBounds(230,50,100,40);
add(panel);panel.add(lbl);add(panel1);panel1.add(lbl1);panel1.add(txt);panel1.add(lbl2);panel1.add(txt1);add(panel2);panel2.add(btn);panel2.add(btn1);
setBounds(0,0,400,350);
setTitle("Khushboo");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btn.addActionListener(this);
btn1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn){
String a=txt.getText();
String b=txt1.getText();

if(a.equals("lavi")&& b.equals("lavi"))
{
JOptionPane.showMessageDialog(this,"welcome lavi");
new Start();
dispose();
}
else
{
JOptionPane.showMessageDialog(this,"invalid usename and password");
new Form();
dispose();
}
}
else if(e.getSource()==btn1)
{
System.exit(0);
}
}
public static void main(String ar[])
{
new Form();
}
}

