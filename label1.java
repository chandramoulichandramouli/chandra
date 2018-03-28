import java.applet.*;
import java.awt.*;
/*<applet code="label1" width="200" height="200">
</applet>*/
public class label1 extends Applet
{
	public void init()
	{
		Label l1=new Label();
		Label l2=new Label("two");
		Label l3=new Label("three", Label.CENTER);
		add(l1);
		l1.setText("one");
		add(l2);
		add(l3);
		l2.setAlignment(Label.RIGHT);
	}
}