package exam;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Aptst extends Applet implements ActionListener{
	TextField t1,t2,t3,t4;
public void init(){
	Frame m=new Frame();
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	Button b=new Button("Find max");
	Label k=new Label("Maximum:");
	t4=new TextField();
	t1.setBounds(50,50,100,25);
	t2.setBounds(50,100,100,25);
	t3.setBounds(50,150,100,25);
	t4.setBounds(140,200,100,25);
	b.setBounds(50,250,100,50);
	k.setBounds(50,190,80,50);
	m.add(t1);	m.add(t2);	m.add(t3);m.add(t4);;m.add(k);
	m.add(b);
	
	b.addActionListener(this);
	m.setLayout(null);m.setVisible(true);m.setSize(400,400);
}


public void actionPerformed(ActionEvent e) {
	int a1=Integer.parseInt(t1.getText());
	int a2=Integer.parseInt(t2.getText());
	int a3=Integer.parseInt(t3.getText());
if(a1>a2)
{
	if(a1>a3)
		t4.setText(t1.getText());
	else
		t4.setText(t3.getText());
	
}
else
{
	if(a2>a3)
		t4.setText(t2.getText());
	else
		t4.setText(t3.getText());
	
}
		
}
}
/*<applet code="Aptst" width="450" height="450"></applet>*/
