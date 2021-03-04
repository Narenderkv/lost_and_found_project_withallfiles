package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame
{

/*
 public void close(){
		 
		 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		 
		 }
*/
	
	
//creating constructor
 public Login()
{
gui2();	
}

 
//definign method that we taken in the constructor
 //note:- its very important to write all the code in this method rather than directory in the main method
 
 //note:- in main method just create object of the class that we have created and then call the gui method in our case
public void gui2()
{
	//FRAME
	
	//creating object of JFrame class
	JFrame frame_login = new JFrame();

	//restricting 
	//if true user can resize the frame
	//if false user cannot resize the frame
	frame_login.setResizable(false);

	//removing title bar of frame
	frame_login.setUndecorated(true);


	//setting title for the frame
	frame_login.setTitle("LOST & FOUND home page");

	//giving size to the frame
	frame_login.setSize(550,630);

	//centering the frame
	frame_login.setLocationRelativeTo(null);

	//setting background color
	Container c = new Container();

	//storing ContentPane of our frame in c (whenever we want to add something in our frame we need ContentPane)
	c = frame_login.getContentPane();
	Color  black = new Color(53,56,57);
	c.setBackground(black);

	//setting layout to null
	c.setLayout(null);

	//after clicking on close button
	//to terminate the program we have to use one method (setDefaultCloseOperation)
	frame_login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//FRAME









	//PANEL 1(LOGO)

	//create object
	JPanel p = new JPanel();
	p.setLayout(new FlowLayout(FlowLayout.LEFT,6,2));

	//setting background
	Color  pure_black = new Color(35,43,43);
	p.setBackground(pure_black);

	//size and location
	p.setSize(450,35);
	p.setLocation(0,0);

	//adding to the frame
	c.add(p);








	//LABEL (our application icon )
	ImageIcon icon = new ImageIcon("E:/pic/new_final_after_testing.jpg");
	JLabel label = new JLabel(icon);
	p.add(label);

	//(positioning of label inside panel)not working 
	//for that we have to make panel layout null
	//label.setLocation(100,100);
	//label.setSize(100, 100);
	//label.setLayout();


	//SETTING BACKGROUND (i.e fighter airplane image)
	ImageIcon bg = new ImageIcon("E:/pic/fighterplane_after_4.jpg");
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
	p1.setLocation(450,0);

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
			frame_login.setState(frame_login.ICONIFIED);
		}

	});








	//LABEL (close buttons)
	ImageIcon icon2 = new ImageIcon("E:/pic/close_after_testing5.png");
	JButton btn_close = new JButton(icon2);
	btn_close.setBounds(50,0, 50, 35);
	btn_close.setBackground(pure_black);
	btn_close.setBorder(null);
	p1.add(btn_close);

	btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	Color li = new Color(79,88,88);
	        btn_close.setBackground(li);
	    }

	    public void mouseExited(java.awt.event.MouseEvent evt) {
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
	JLabel label2 = new JLabel("LOG IN",JLabel.LEFT);
	label2.setBounds(32,100,236,30);
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








	//NAME
	JLabel l3=new JLabel("Name : ",JLabel.LEFT);
	l3.setBounds(30,200,70,30);
	//l1.setBounds(100,150,50,ic.getIconWidth());
	Font font1 =  new Font("Arial",Font.PLAIN,17);
	l3.setFont(font1);
	l3.setForeground(Color.WHITE);
	c.add(l3);
	c.setComponentZOrder(l3, 1); 
	//TEXTFIELD
	//JTextField class used to insert textbox
	JTextField t1=new JTextField();
	t1.setBounds(150,200,210,27);
	c.add(t1);
	c.setComponentZOrder(t1, 1); 
	Cursor text_cur = new Cursor(Cursor.TEXT_CURSOR);
	t1.setCursor(text_cur);


	//EMPTY (if name is empty)
	JLabel name_is_empty = new JLabel();
	name_is_empty.setBounds(150,219,70,30);

	Font font2 =  new Font("Arial",Font.PLAIN,9);
	name_is_empty.setFont(font2);
	name_is_empty.setForeground(Color.WHITE);
	c.add(name_is_empty);
	c.setComponentZOrder(name_is_empty, 1); 









	//PASSWORD
	JLabel l4=new JLabel("Password : ",JLabel.LEFT);
	l4.setBounds(30,250,110,30);
	//l1.setBounds(100,150,50,ic.getIconWidth());
	//Font font1 =  new Font("Arial",Font.PLAIN,20);
	l4.setFont(font1);
	l4.setForeground(Color.WHITE);
	c.add(l4);
	c.setComponentZOrder(l4, 1); 
	//TEXTFIELD
	//JTextField class used to insert textbox
	JPasswordField t2=new JPasswordField();
	t2.setBounds(150,250,210,27);
	c.add(t2);
	c.setComponentZOrder(t2, 1); 
	//Cursor text_cur = new Cursor(Cursor.TEXT_CURSOR);
	t2.setCursor(text_cur);

	//EMPTY (if password is empty)
	JLabel pass_is_empty = new JLabel();
	pass_is_empty.setBounds(150,270,90,30);

	//Font font2 =  new Font("Arial",Font.PLAIN,9);
	pass_is_empty.setFont(font2);
	pass_is_empty.setForeground(Color.WHITE);
	c.add(pass_is_empty);
	c.setComponentZOrder(pass_is_empty, 1); 









	//BUTTON (what are the actions going to perform when button)
	JButton btn1 = new JButton("Submit");

	//DATABASE
	btn1.addActionListener(new ActionListener()
	{
		//Overriding actionPerformed method (not sure)
		//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
		public void actionPerformed(ActionEvent e) 
		{
			
			//if name or password is empty
			
			//(1)if both textfield are empty
			if(t1.getText().trim().isEmpty() && t2.getText().trim().isEmpty())
			{
				name_is_empty.setText("name is empty");
				pass_is_empty.setText("password is empty");
			}
			//(2)if only name textfield is empty
			else if(t1.getText().trim().isEmpty())
			{
				name_is_empty.setText("name is empty");
				//pass_is_empty.setText("password is empty");
			}
			//(3)if only password textfield is empty
			else if(t2.getText().trim().isEmpty())
			{
				//name_is_empty.setText("name is empty");
				pass_is_empty.setText("password is empty");
			}
			//(4)if everything is filled campare entered username and password present in the database if correct data is enterted then user will direct to the dashboard page
			else
			try
			{
				//exception
				Class.forName("com.mysql.jdbc.Driver");	
				
				//Creating connection with mysql
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/lostandfound","root","");
				//Create the statement
				Statement stmt = con.createStatement();
				//Create the query
				String query="Select * from usersignupdata where name='"+t1.getText()+"' and password='"+t2.getText()+"' ";
		
				//Execute the query 
				ResultSet rs= stmt.executeQuery(query);
				
				
				//NOTE :- next is function that return boolean value true or false
				//if true
				if(rs.next()==true)
				{
					//if user login is successful then store its id in a variable
					String id = rs.getString("id");
					JOptionPane.showMessageDialog(null, "Login succesful"+id);
					
					//closing login frame  
					frame_login.dispose();
					//u.setVisible(true);  ----> this statement is not required just create object of that frame 
					//							 that we want to open
					
					//opening another frame and passing id of that user
					User_dashboard u= new User_dashboard(id);
					
		           
				}
				//if false
				else
				{
					JOptionPane.showMessageDialog(null, "not succesful");
					
					
				}
				con.close();
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}

			
		}
	});








	//CODE for :if text is entered by the user then make labels empty
	t1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent e) 
		{
			name_is_empty.setText("");
		}
	});

	t2.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent e) 
		{
			pass_is_empty.setText("");
		}
	});







	btn1.setBounds(32, 315, 90, 30);
	c.add(btn1);

	Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	btn1.setCursor(cur);
	btn1.setForeground(Color.WHITE);
	btn1.setBackground(Color.black);
	c.setComponentZOrder(btn1, 1); 


	
	
	
	
	
	
	





	//last statement 
	frame_login.setVisible(true);		
	//c.setVisible(true);
}

public static void main(String[] args) 
{
Login obj2 = new Login();

}
}
