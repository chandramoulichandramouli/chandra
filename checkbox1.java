import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="checkbox1.class" width="700" height="700">
</applet>*/
public class checkbox1 extends Applet implements ItemListener
{
	String msg="";
	Checkbox c1,c2,c3;
	public void init()
	{
		c1=new Checkbox("II-A");
		c2=new Checkbox("II-B");
		c3=new Checkbox("II-D",true);
		add(c1);
		add(c2);
		add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent i)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="current state:";
		g.drawString(msg,100,100);
		if(c1.getState())
		{
			setBackground(Color.green);
		}
		msg="II-A"+c1.getState();
		g.drawString(msg,100,120);
		msg="II-B"+c2.getState();
		g.drawString(msg,100,140);
		msg="II-C"+c3.getState();
		g.drawString(msg,100,160);
	}
}
