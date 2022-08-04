import java.awt.*;
import javax.swing.*;
class MainDemoGUI
{
	public static void main(String[] args)
	{
		JFrame frm=new JFrame();
	Container con = frm.getContentPane();

		FlowLayout flw = new FlowLayout();
		con.setLayout(flw);

		JButton btn1 = new JButton("Click me 1");
		JButton btn2 = new JButton("Click me 2");
			con.add(btn1);
			con.add(btn2);

			frm.setSize(200,400);
			frm.setVisible(true);
			
	}
}