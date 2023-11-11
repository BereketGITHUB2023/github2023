package gui;
/*	1. Components
 * 		A. Top-Level Container: JFrame
 * 		B. Intermediate Level Container
 * 		C. Atomic Components
 *  2. Layout Manager
 *  	JFrame has a default layout manager called BorderLayout.
 *  	BorderLayout has five regions: EAST, WEST, CENTER, NORTH,
 *  				SOUTH
 *  	CENTER is the default region for the BorderLayout
 *  	CENTER covers the entire application window (JFrame)
 *  	Every region contains only one component at a time.
 *  
 *  
 *  3. Event Handling
 * */
/*	To Create a Top-level Container: JFrame
 * 		1. via Inheritance
 * 		2. Create an object from JFrame
 * 	To create an intermediate level container: JPanel
 * 	To create an atomic component: 
 * 			JLabel -  
 * */
import java.awt.*;//Java native package, heavy weight package
import javax.swing.*;//an extension of awt, light weight package
public class GUIDemo extends JFrame{
	JPanel p1,p2,p3,p4;
	JLabel l1, l2;
	JButton b1,b2;
	JTextField t1;
	JPasswordField t2;
	JTextArea ta;
	JRadioButton r1,r2;
	JCheckBox c1,c2;
	JComboBox <String> cb;
	JList <String>li;
	DefaultListModel<String> lm;
	String str[] = {"Orange","Banana", "Apple","Grapes","Mango"};
	String btn[] = {"0","1","0","1","0","1","0","1","0","1","0","1"};
	JButton button[];
	public GUIDemo() {
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p1.setSize(200,300);
		//setLayout(new FlowLayout());
		p1.setLayout(new BorderLayout());
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		p3.setBackground(Color.yellow);
		p4.setBackground(Color.blue);
		//add the panels into the JFrame
		add(p2, BorderLayout.NORTH);
		add(p1, BorderLayout.CENTER);
		add(p3,BorderLayout.EAST);
		add(p4,BorderLayout.WEST);
		ta = new JTextArea();
		l1 = new JLabel("User Name");
		l2 = new JLabel("Password");
		t1 = new JTextField();
		t1.setColumns(10);
		t2 = new JPasswordField(10);
		p2.add(l1);
		p2.add(t1);
		p2.add(l2);
		p2.add(t2);
		t2.setEchoChar('#');
		b1 = new JButton("OK");
		b2 = new JButton();
		b2.setText("Yes");
		
		JPanel p5 = new JPanel();
		p1.add(p5);
		p1.add(t1,BorderLayout.NORTH);
		
		ta.append("Test\n");
		ta.append("Test1\n");
		ta.append("Test2\n");
		r1 = new JRadioButton("Male",true);
		r2 = new JRadioButton("Female");
		ButtonGroup g = new ButtonGroup();
		g.add(r1);
		g.add(r2);
		c1 = new JCheckBox("Java",true);
		c2 = new JCheckBox("C#",true);
		p4.add(r1);
		p4.add(r2);
		p4.add(c1);
		p4.add(c2);
		cb = new JComboBox<>(str);
		cb.addItem("Lemon");
		lm = new DefaultListModel<>();
		li = new JList<>(lm);
		lm.addElement("Lemon");
		p3.add(cb);
		
		p3.add(new JScrollPane(li));
		
		cb.setMaximumRowCount(3);
		li.setVisibleRowCount(3);
		button = new JButton[12];
		for(int i=0;i<12;i++) {
			button[i] = new JButton(btn[i]);
		}
		GridLayout gl = new GridLayout(4,3);
		p5.setLayout(gl);
		
		//add the buttons into the panel p1
		for(int i=0;i<12;i++)
			p5.add(button[i]);
		
		setVisible(true);
		setSize(600,400);
		setTitle("GUI Demo App");	
	}
	public static void main(String[] args) {
		GUIDemo gd = new GUIDemo();
		
	}

}
