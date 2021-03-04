package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Home extends JFrame
{
	
public Home()
{
gui();	
}

public void gui()
{
//FRAME
//creating object of JFrame class
JFrame h_frame = new JFrame();


//restricting 
//if true user can resize the frame
//if false user cannot resize the frame
h_frame.setResizable(false);

//removing title bar of frame
h_frame.setUndecorated(true);


//setting title for the frame
h_frame.setTitle("LOST & FOUND home page");

//giving size to the frame
h_frame.setSize(900,550);

//centering the frame
h_frame.setLocationRelativeTo(null);

//setting background color
Container c = new Container();

//storing ContentPane of our frame in c (whenever we want to add something in our frame we need ContentPane)
c = h_frame.getContentPane();
Color  black = new Color(53,56,57);
c.setBackground(black);

//setting layout to null
c.setLayout(null);

//after clicking on close button
//to terminate the program we have to use one method (setDefaultCloseOperation)
h_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//FRAME








//PANEL 1(LOGO)

//create object
JPanel p = new JPanel();
p.setLayout(new FlowLayout(FlowLayout.LEFT,6,2));

//setting background
Color  pure_black = new Color(35,43,43);
p.setBackground(pure_black);

//size and location
p.setSize(800,35);
p.setLocation(0,0);

//adding to the frame
c.add(p);








//LABEL
ImageIcon icon = new ImageIcon("E:/pic/new_final_after_testing.jpg");
JLabel label = new JLabel(icon);
p.add(label);

//(positioning of label inside panel)not working 
//for that we have to make panel layout null
//label.setLocation(100,100);
//label.setSize(100, 100);
//label.setLayout();



//SETTING BACKGROUND
ImageIcon bg = new ImageIcon("E:/pic/Home1.jpg");
JLabel label1 = new JLabel(bg);
label1.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
c.add(label1);





//PANEL 2 (PANEL FOR MINIMIZE AND CLOSE BUTTON)


//create object
JPanel p1 = new JPanel();

//note:important 
//if we set the panel layout is equal to null 
//it will be in the "Absolute Layout", 
//and then you'll be able to set the position of the JLabel and JButton with setBounds().
p1.setLayout(null);

//setting background
//Color  pure_black = new Color(35,43,43);
p1.setBackground(Color.WHITE);

//size and location
p1.setSize(100,35);
p1.setLocation(800,0);

//adding to the frame
c.add(p1);
c.setComponentZOrder(p1, 1); 




//LABEL (minimize buttons)
ImageIcon icon1 = new ImageIcon("E:/pic/ok_report.png");
JButton btn_min = new JButton(icon1);
btn_min.setBounds(0,0, 50, 35);
btn_min.setBackground(pure_black);
btn_min.setBorder(null);
p1.add(btn_min);
//p1.setComponentZOrder(btn_min, 0);
//c.setComponentZOrder(p, 0);




//hover effect on minimize button
btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseEntered(java.awt.event.MouseEvent evt) {
Color li = new Color(79,88,88);
btn_min.setBackground(li);
}

public void mouseExited(java.awt.event.MouseEvent evt) {
btn_min.setBackground(pure_black);
}
});




//minimize action performed code
btn_min.addActionListener(new ActionListener()
{
//Overriding actionPerformed method
//this method is present in ActionListener interface
public void actionPerformed(ActionEvent ee) 
{
h_frame.setState(h_frame.ICONIFIED);
}
});



//LABEL (close buttons)
ImageIcon icon2 = new ImageIcon("E:/pic/close_after_testing5.png");
JButton btn_close = new JButton(icon2);
btn_close.setBounds(50,0, 50, 35);
btn_close.setBackground(pure_black);
btn_close.setBorder(null);
p1.add(btn_close);




//hover effect on close button
btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseEntered(java.awt.event.MouseEvent evt) {
Color li = new Color(79,88,88);
btn_close.setBackground(li);
}

public void mouseExited(java.awt.event.MouseEvent evt) 
{
btn_close.setBackground(pure_black);
}
});




//close action performed code
btn_close.addActionListener(new ActionListener()
{
//Overriding actionPerformed method
//this method is present in ActionListener interface
public void actionPerformed(ActionEvent ee) 
{
System.exit(0);
}
});







//LABEL

//JLabel class
JLabel label2 = new JLabel("SELECT CATEGORY",JLabel.LEFT);
label2.setBounds(113,50,300,40);
Font font =  new Font("Arial",Font.BOLD,30);
label2.setFont(font);
label2.setForeground(Color.WHITE);
c.add(label2);
//c.setComponentZOrder(label2,2);

//c.setComponentZOrder(label, 1);
//c.setComponentZOrder(label, 0);
c.setComponentZOrder(label2, 0); 

//label.setLocation(590,25);


//Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
//label.setBorder(border);

//100 and 50 location 
//100 and 30 size

//Font font =  new Font("Arial",Font.BOLD,30);
//label2.setFont(font);



	
	
	
//login button
JButton login_btn = new JButton("Login");

login_btn.setBounds(800, 52, 90, 30);
Cursor cur = new Cursor(Cursor.HAND_CURSOR);
login_btn.setCursor(cur);
login_btn.setForeground(Color.WHITE);
login_btn.setBackground(Color.black);

c.add(login_btn);
c.setComponentZOrder(login_btn,1);
	
//BUTTON (what are the actions going to perform when button)
		
login_btn.addActionListener(new ActionListener()
{
//Overriding actionPerformed method (not sure)
				
//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
public void actionPerformed(ActionEvent e) 
{
h_frame.dispose();
Login ob1 = new Login();
//ob1.setVisible(true);
	        	
}
});






//BUTTON1
ImageIcon icon3 = new ImageIcon("E:/pic/smartphone_vector2.jpg");
JButton btn1 = new JButton(icon3);
btn1.setBounds(120, 140, 170, 120);
c.add(btn1);
//Cursor cur = new Cursor(Cursor.HAND_CURSOR);
btn1.setCursor(cur);

//NAME
JLabel l3=new JLabel("Smart Phone ",JLabel.LEFT);
l3.setBounds(160,260,120,30);
//l1.setBounds(100,150,50,ic.getIconWidth());
Font font1 =  new Font("Arial",Font.BOLD,14);
l3.setFont(font1);
l3.setForeground(Color.PINK);
c.add(l3);
c.setComponentZOrder(btn1, 1); 
c.setComponentZOrder(l3, 1); 
	
//BUTTON (what are the actions going to perform when button)
		
btn1.addActionListener(new ActionListener()
{
//Overriding actionPerformed method (not sure)
		
//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
public void actionPerformed(ActionEvent e) 
{
h_frame.dispose();
Signup ob1 = new Signup();
//ob1.setVisible(true);
				
h_frame.dispose();
try {
new Signup("Smartphone");
} catch (ClassNotFoundException ex) 
{
Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
}
}
});







//BUTTON2
ImageIcon icon4 = new ImageIcon("E:/pic/laptop_vector3.jpg");
JButton btn2 = new JButton(icon4);
btn2.setBounds(370, 140, 170, 120);
c.add(btn2);
btn2.setCursor(cur);


//NAME
JLabel l4=new JLabel("Laptop ",JLabel.LEFT);
l4.setBounds(430,260,120,30);
l4.setFont(font1);
Color col1= new Color(253,208,53);
l4.setForeground(col1);
c.add(l4);
c.setComponentZOrder(btn2, 1); 
c.setComponentZOrder(l4, 1); 

	
btn2.addActionListener(new ActionListener()
{
//Overriding actionPerformed method (not sure)
			
//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
public void actionPerformed(ActionEvent e) 
{
					h_frame.dispose();
					Signup ob1 = new Signup();
					//ob1.setVisible(true);
					
					h_frame.dispose();
					try {
					        new Signup("Laptop");
					    } catch (ClassNotFoundException ex) {
					        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
					    }
				}
			});







	//BUTTON3
	ImageIcon icon5 = new ImageIcon("E:/pic/luggage_vector5.jpg");
	JButton btn3 = new JButton(icon5);
	btn3.setBounds(620, 140, 170, 120);
	c.add(btn3);
	btn3.setCursor(cur);


	//NAME
	JLabel l5=new JLabel("Luggage",JLabel.LEFT);
	l5.setBounds(675,260,120,30);
	l5.setFont(font1);
	Color col2= new Color(4,196,233);
	l5.setForeground(col2);
	c.add(l5);
	c.setComponentZOrder(btn3, 1); 
	c.setComponentZOrder(l5, 1); 

	btn3.addActionListener(new ActionListener()
	{
		//Overriding actionPerformed method (not sure)
	
		//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
		public void actionPerformed(ActionEvent e) 
		{
			h_frame.dispose();
			Signup ob1 = new Signup();
			//ob1.setVisible(true);
			
			
			h_frame.dispose();
			try {
			        new Signup("Luggage");
			    } catch (ClassNotFoundException ex) {
			        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
			    }
		}
	});









	//BUTTON4
	ImageIcon icon6 = new ImageIcon("E:/pic/wall.png");
	JButton btn4 = new JButton(icon6);
	btn4.setBounds(240, 340, 170, 120);
	c.add(btn4);
	btn4.setCursor(cur);


	//NAME
	JLabel l6=new JLabel("Wallet",JLabel.LEFT);
	l6.setBounds(300,460,120,30);
	l6.setFont(font1);
	Color col3 = new Color(102,199,113);
	l6.setForeground(col3);
	c.add(l6);
	c.setComponentZOrder(btn4, 1); 
	c.setComponentZOrder(l6, 1); 

	btn4.addActionListener(new ActionListener()
	{
		//Overriding actionPerformed method (not sure)
	
		//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
		public void actionPerformed(ActionEvent e) 
		{
			h_frame.dispose();
			Signup ob1 = new Signup();
			//ob1.setVisible(true);
			
			try {
		        new Signup("Wallet");
		    } catch (ClassNotFoundException ex) {
		        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
		    }
		}
	});







	//BUTTON5
	ImageIcon icon7 = new ImageIcon("E:/pic/passport_vector10.png");
	JButton btn5 = new JButton(icon7);
	btn5.setBounds(490, 340, 170, 120);
	c.add(btn5);
	btn5.setCursor(cur);


	//NAME
	JLabel l7=new JLabel("Passport",JLabel.LEFT);
	l7.setBounds(545,460,120,30);
	l7.setFont(font1);
	Color col4= new Color(27,49,84);
	l7.setForeground(col4);
	c.add(l7);
	c.setComponentZOrder(btn5, 1); 
	c.setComponentZOrder(l7, 1); 

	btn5.addActionListener(new ActionListener()
	{
		//Overriding actionPerformed method (not sure)
	
		//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
		public void actionPerformed(ActionEvent e) 
		{
			h_frame.dispose();
			Signup ob1 = new Signup();
			//ob1.setVisible(true);
			
			
			h_frame.dispose();
			try {
			        new Signup("Passport");
			    } catch (ClassNotFoundException ex) {
			        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
			    }
		}
	});






	//last statement 
	h_frame.setVisible(true);
}

public static void main(String[] args)
{

//creating object and calling constructo
//and our constructor contains the gui method

//hence we donot need to call the gui method manually
//gui method is called automatically because it is inside the constructor
Home obj1=new Home();
}





}

