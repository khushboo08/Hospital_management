import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class PatientInfoAdd extends JFrame implements ActionListener
{
JLabel lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,lbl12,lbl13,lbl14,lbl15,lbl16,lbl17;
JTextField txt,txt1,txt2,txt3,txt4,txt5,txt6;
TextArea txta,txta1,txta2;
JButton btn,btn1,btn2,btn3,btn4,btn5;
JRadioButton rb,rb1;
Choice ch,ch1;
String a,b,c,d,e1,f,g,h,i,j,k,l,m;
PatientInfoAdd()
{
Image icon=Toolkit.getDefaultToolkit().getImage("download.jpg");
setIconImage(icon);
setLayout(null);
lbl=new JLabel("Add Patient Information");
lbl.setBounds(440,35,160,15);
lbl1=new JLabel("Add Personal Information");
lbl1.setBounds(40,60,150,15);
lbl2=new JLabel("Name :");
lbl2.setBounds(104,97,70,25);
lbl3=new JLabel("Address :");
lbl3.setBounds(104,138,70,15);
lbl4=new JLabel("Patient No.:");
lbl4.setBounds(570,97,110,25);
lbl5=new JLabel("Room No.:");
lbl5.setBounds(720,97,60,20);
lbl6=new JLabel("Contact :");
lbl6.setBounds(575,138,50,25);
lbl7=new JLabel("Date Of Admission :");
lbl7.setBounds(575,180,120,25);
lbl8=new JLabel("(dd-mm-yyyy)");
lbl8.setBounds(782,180,100,20);
lbl9=new JLabel("Gender :");
lbl9.setBounds(596,223,50,15);
rb=new JRadioButton("Male");
rb.setBounds(698,223,70,15);
rb1=new JRadioButton("Female");
rb1.setBounds(790,223,90,15);
lbl10=new JLabel("Medical Information");
lbl10.setBounds(40,260,120,15);
lbl11=new JLabel("Blood Group :");
lbl11.setBounds(104,306,79,15);
lbl12=new JLabel("Date of Birth :");
lbl12.setBounds(575,306,120,15);
lbl13=new JLabel("(dd-mm-yyyy)");
lbl13.setBounds(782,306,100,20);
lbl14=new JLabel("History :");
lbl14.setBounds(104,365,50,15);
lbl15=new JLabel("Current Problem :");
lbl15.setBounds(575,365,100,15);
lbl16=new JLabel("Type Of Room : ");
lbl16.setBounds(104,510,120,25);
lbl17=new JLabel("Attending Doctor :");
lbl17.setBounds(575,510,130,15);
txt=new JTextField();
txt.setBounds(270,97,250,20);
txt1=new JTextField();
txt1.setBounds(643,97,60,20);
txt2=new JTextField();
txt2.setBounds(788,97,60,20);
txt3=new JTextField();
txt3.setBounds(640,138,250,20);
txt4=new JTextField();
txt4.setBounds(696,180,80,20);
ch=new Choice();
ch.setBounds(270,306,60,25);
ch.addItem("A -ve");
ch.addItem("A +ve");
ch.addItem("B -ve");
ch.addItem("B +ve");
ch.addItem("AB -ve");
ch.addItem("AB +ve");
ch.addItem("O +ve");
ch.addItem("O -ve");
txt5=new JTextField();
txt5.setBounds(696,306,80,25);
ch1=new Choice();
ch1.setBounds(270,510,80,15);
ch1.addItem("Deluxe");
ch1.addItem("Private");
ch1.addItem("Semi-Private");
ch1.addItem("General");
txt6=new JTextField();
txt6.setBounds(720,510,250,20);
txta=new TextArea();
txta.setBounds(270,138,250,100);
txta1=new TextArea();
txta1.setBounds(270,365,250,100);
txta2=new TextArea();
txta2.setBounds(720,365,250,100);
btn=new JButton("Add",new ImageIcon("add.gif"));
btn.setBounds(362,600,100,30);
btn1=new JButton("Clear",new ImageIcon("LOGGOFF.PNG"));
btn1.setBounds(470,600,100,30);
btn2=new JButton("Back",new ImageIcon("restore.png"));
btn2.setBounds(580,600,100,30);
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
add(txt3);
add(lbl7);
add(txt4);
add(lbl8);
add(lbl9);
add(rb);
add(rb1);
add(lbl10);
add(lbl11);
add(ch);
add(lbl12);
add(txt5);
add(lbl13);
add(lbl14);
add(txta1);
add(lbl15);
add(txta2);
add(lbl16);
add(ch1);
add(lbl17);
add(txt6);
add(btn);
add(btn1);
add(btn2);
setVisible(true);
setTitle("PatientInfoAdd");
setBounds(0,0,1200,800);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btn.addActionListener(this);
btn1.addActionListener(this);
btn2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn)
{
a=txt.getText();
b=txta.getText();
c=txt1.getText();
d=txt2.getText();
e1=txt3.getText();
f=txt4.getText();
g=txt5.getText();
h=txta1.getText();
i=txta2.getText();
j=txt6.getText();
k=(String)ch.getSelectedItem();
l=(String)ch1.getSelectedItem();
m=rb.getActionCommand();
{
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Hospital Management");
PreparedStatement st=con.prepareStatement("insert into Table values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

st.setString(1,a);
st.setString(2,b);
st.setString(3,c);
st.setString(4,d);
st.setString(3,e1);
st.setString(6,f);
st.setString(7,g);
st.setString(8,h);
st.setString(9,i);
st.setString(10,j);
st.setString(11,k);
st.setString(12,l);
st.setString(13,m);
ResultSet rst=st.executeQuery();
if(rst.next())

{
System.out.println("successful login");
}
}catch(Exception ee)
{
ee.printStackTrace();
}
}
}
else if(e.getSource()==btn1)
{
txt.setText("");
txt1.setText("");
txt2.setText("");
txt3.setText("");
txt4.setText("");
txt5.setText("");
txt6.setText("");
txta.setText("");
txta1.setText("");
txta2.setText("");
}
else if(e.getSource()==btn2)
{
new Start1();
dispose();
}
}
}























