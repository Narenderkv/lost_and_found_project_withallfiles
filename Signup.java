package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class Signup 
{
	
//default constructor
public Signup ()
{
	
}

//parameterized constructor
public Signup(String category) throws ClassNotFoundException
{
gui2(category);
}

//method inside the 
public void gui2(String category)
{
	//FRAME
	
	//creating object of JFrame class
	JFrame signup_frame = new JFrame();

	//restricting 
	//if true user can resize the frame
	//if false user cannot resize the frame
	signup_frame.setResizable(false);

	//removing title bar of frame
	signup_frame.setUndecorated(true);


	//setting title for the frame
	signup_frame.setTitle("LOST & FOUND home page");

	//giving size to the frame
	signup_frame.setSize(550,630);

	//centering the frame
	signup_frame.setLocationRelativeTo(null);

	//setting background color
	Container c = new Container();

	//storing ContentPane of our frame in c (whenever we want to add something in our frame we need ContentPane)
	c = signup_frame.getContentPane();
	Color  black = new Color(53,56,57);
	c.setBackground(black);

	//setting layout to null
	c.setLayout(null);

	//after clicking on close button
	//to terminate the program we have to use one method (setDefaultCloseOperation)
	signup_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

	btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
	  public void mouseEntered(java.awt.event.MouseEvent evt) {
	  	Color li = new Color(79,88,88);
	      btn_min.setBackground(li);
	  }

	  public void mouseExited(java.awt.event.MouseEvent evt) {
	      btn_min.setBackground(pure_black);
	  }
	});

	btn_min.addActionListener(new ActionListener()
	{
		//Overriding actionPerformed method
		//this method is present in ActionListener interface
		public void actionPerformed(ActionEvent ee) 
		{
			signup_frame.setState(signup_frame.ICONIFIED);
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
	JLabel label2 = new JLabel("SIGN UP",JLabel.LEFT);
	label2.setBounds(32,100,236,30);
	Font font =  new Font("Arial",Font.BOLD,30);

	label2.setFont(font);
	label2.setForeground(Color.WHITE);
	c.add(label2);
	//c.setComponentZOrder(label2,2);

	//c.setComponentZOrder(label, 1);
	//c.setComponentZOrder(label, 0);
	c.setComponentZOrder(label2, 0); 

	//label.setLocation(590,27);


	//Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
	//label.setBorder(border);

	//100 and 50 location 
	//100 and 30 size

	//Font font =  new Font("Arial",Font.BOLD,30);
	//label2.setFont(font);








	//NAME (t1)
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
	t1.setBounds(180,200,210,27);
	c.add(t1);
	c.setComponentZOrder(t1, 1); 
	Cursor text_cur = new Cursor(Cursor.TEXT_CURSOR);
	t1.setCursor(text_cur);


	//EMPTY (if name is empty)
	JLabel name_is_empty = new JLabel();
	name_is_empty.setBounds(180,219,70,30);

	Font font2 =  new Font("Arial",Font.PLAIN,9);
	name_is_empty.setFont(font2);
	name_is_empty.setForeground(Color.WHITE);
	c.add(name_is_empty);
	c.setComponentZOrder(name_is_empty, 1); 









	//MOBILE NO (t4)
	JLabel l6=new JLabel("Mobile No : ",JLabel.LEFT);
	l6.setBounds(30,245,110,30);
	//l1.setBounds(100,150,50,ic.getIconWidth());
	l6.setFont(font1);
	l6.setForeground(Color.WHITE);
	c.add(l6);
	c.setComponentZOrder(l6, 1); 
	//TEXTFIELD
	//JTextField class used to insert textbox
	JTextField t4=new JTextField();
	t4.setBounds(180,245,210,27);
	c.add(t4);
	c.setComponentZOrder(t4, 1); 
	//Cursor text_cur = new Cursor(Cursor.TEXT_CURSOR);
	t4.setCursor(text_cur);


	//EMPTY (if mob is empty)
	JLabel mob_is_empty = new JLabel();
	mob_is_empty.setBounds(180,265,70,30);
	//Font font2 =  new Font("Arial",Font.PLAIN,9);
	mob_is_empty.setFont(font2);
	mob_is_empty.setForeground(Color.WHITE);
	c.add(mob_is_empty);
	c.setComponentZOrder(mob_is_empty, 1); 









	//PASSWORD (t2)
	JLabel l4=new JLabel("Password : ",JLabel.LEFT);
	l4.setBounds(30,290,140,30);
	//l1.setBounds(100,150,50,ic.getIconWidth());
	//Font font1 =  new Font("Arial",Font.PLAIN,20);
	l4.setFont(font1);
	l4.setForeground(Color.WHITE);
	c.add(l4);
	c.setComponentZOrder(l4, 1); 
	//TEXTFIELD
	//JTextField class used to insert textbox
	JPasswordField t2=new JPasswordField();
	t2.setBounds(180,290,210,27);
	c.add(t2);
	c.setComponentZOrder(t2, 1); 
	//Cursor text_cur = new Cursor(Cursor.TEXT_CURSOR);
	t2.setCursor(text_cur);


	//EMPTY (if pass is empty)
	JLabel pass_is_empty = new JLabel();
	pass_is_empty.setBounds(180,310,100,30);
	//Font font2 =  new Font("Arial",Font.PLAIN,9);
	pass_is_empty.setFont(font2);
	pass_is_empty.setForeground(Color.WHITE);
	c.add(pass_is_empty);
	c.setComponentZOrder(pass_is_empty, 1);









	//CONFIRM PASSWORD (t3)
	JLabel l5=new JLabel("Confirm Password : ",JLabel.LEFT);
	l5.setBounds(30,335,180,30);
	//l1.setBounds(100,150,50,ic.getIconWidth());
	//Font font1 =  new Font("Arial",Font.PLAIN,20);
	l5.setFont(font1);
	l5.setForeground(Color.WHITE);
	c.add(l5);
	c.setComponentZOrder(l5, 1); 
	//TEXTFIELD
	//JTextField class used to insert textbox
	JPasswordField t3=new JPasswordField();
	t3.setBounds(180,335,210,27);
	c.add(t3);
	c.setComponentZOrder(t3, 1); 
	//Cursor text_cur = new Cursor(Cursor.TEXT_CURSOR);
	t3.setCursor(text_cur);

	//EMPTY (if confirm pass is empty)
	JLabel confirm_pass_is_empty = new JLabel();
	confirm_pass_is_empty.setBounds(180,355,120,30);
	//Font font2 =  new Font("Arial",Font.PLAIN,9);
	confirm_pass_is_empty.setFont(font2);
	confirm_pass_is_empty.setForeground(Color.WHITE);
	c.add(confirm_pass_is_empty);
	c.setComponentZOrder(confirm_pass_is_empty, 1);
	 









	//Category(t5)
	JLabel l7=new JLabel("Category : ",JLabel.LEFT);
	l7.setBounds(30,380,110,30);
	//l1.setBounds(100,150,50,ic.getIconWidth());
	l7.setFont(font1);
	l7.setForeground(Color.WHITE);
	c.add(l7);
	c.setComponentZOrder(l7, 1); 
	//TEXTFIELD
	//JTextField class used to insert textbox
	JTextField t5=new JTextField();
	t5.setBounds(180,380,210,27);
	c.add(t5);
	c.setComponentZOrder(t5, 1); 
	//Cursor text_cur = new Cursor(Cursor.TEXT_CURSOR);
	t5.setCursor(text_cur);
	
	t5.setText(category);
	t5.setEnabled(false);








	//Discription (t6)
	JLabel l8=new JLabel("Discription : ",JLabel.LEFT);
	l8.setBounds(30,425,110,30);
	//l1.setBounds(100,150,50,ic.getIconWidth());
	l8.setFont(font1);
	l8.setForeground(Color.WHITE);
	c.add(l8);
	c.setComponentZOrder(l8, 1); 
	//TEXTFIELD
	//JTextField class used to insert textbox
	JTextField t6=new JTextField();
	t6.setBounds(180,425,210,27);
	c.add(t6);
	c.setComponentZOrder(t6, 1); 
	//Cursor text_cur = new Cursor(Cursor.TEXT_CURSOR);
	t6.setCursor(text_cur);


	//EMPTY (if discription is empty)
	JLabel dis_is_empty = new JLabel();
	dis_is_empty.setBounds(180,445,100,30);
	//Font font2 =  new Font("Arial",Font.PLAIN,9);
	dis_is_empty.setFont(font2);
	dis_is_empty.setForeground(Color.WHITE);
	c.add(dis_is_empty);
	c.setComponentZOrder(dis_is_empty, 1); 









	//BUTTON
	JButton btn1 = new JButton("Submit");


	btn1.addActionListener(new ActionListener()
	{
		//Overriding actionPerformed method
		//this method is present in ActionListener interface
		public void actionPerformed(ActionEvent e) 
		{
			//if name or password is empty
			
					//(1)if both textfield are empty
					if(t1.getText().trim().isEmpty() && t4.getText().trim().isEmpty() && t2.getText().trim().isEmpty() && t3.getText().trim().isEmpty() && t6.getText().trim().isEmpty())
					{
						name_is_empty.setText("name is empty");
						mob_is_empty.setText("mobile is empty");
						pass_is_empty.setText("password is empty");
						dis_is_empty.setText("discription is empty");
						confirm_pass_is_empty.setText("confirm password is empty");
					}
					//(2)if only name textfield is empty
					else if(t1.getText().trim().isEmpty())
					{
						name_is_empty.setText("name is empty");
					}
					//(3)if only password textfield is empty
					else if(t4.getText().trim().isEmpty())
					{
						mob_is_empty.setText("mobile is empty");
					}
					else if(t2.getText().trim().isEmpty())
					{
						pass_is_empty.setText("password is empty");
					}
					else if(t3.getText().trim().isEmpty())
					{
						confirm_pass_is_empty.setText("confirm password is empty");
					}
					else if(t6.getText().trim().isEmpty())
					{
						dis_is_empty.setText("discription is empty");
					}
					
					//(4)if everything is filled campare entered username and password present in the database if correct data is enterted then user will direct to the dashboard page
			else
			try
			{
				
				//storing default image path in a variable
				//String path=("E:\\pic\\user_default_image_testing3.png");
				//File image = new File(path);
				//OR
				
				
				//path of file (default image of user that is going to displayed on user_dashboard page)
				//note : // (two backslash) in string is consider as / (one backslash)
				File image = new File("E:\\pic\\user_default_image_testing3.png");
				
				//now converting image into binary 
				FileInputStream fis = new FileInputStream ( image );
				
				//exception
				Class.forName("com.mysql.jdbc.Driver");	
				
				//Creating connection with mysql
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/lostandfound","root","");
				
				//NOTE:- setBlob() method is not defined for statement class . so i have to perparestatement class instead of statement class
				
				//create the query
				PreparedStatement ps = con.prepareStatement("Insert into usersignupdata (name,mobileno,password,category,discription,image)VALUES('"+t1.getText()+"','"+t4.getText()+"','"+t2.getText()+"','"+t5.getText()+"','"+t6.getText() +"',?) ");
				
				ps.setBlob(1, fis);
				
				//Execute the query 
				//executeUpdate for 'insert,update and delete'
				//executeQuery only for 'select statement'
				ps.executeUpdate();
				
				//if successful then show user a msg
				JOptionPane.showMessageDialog(null, "Your account is succesfully created");
				
				//working not properly (i.e a empty frame is opening)
				signup_frame.dispose();
				
				//opening another frame (by default constructor is called when we created object of Login class)
				Login l= new Login();
				
				
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

	t4.addKeyListener(new KeyAdapter() {
		  public void keyReleased(KeyEvent e) 
			{
				mob_is_empty.setText("");
			}
		});

	t2.addKeyListener(new KeyAdapter() {
	  public void keyReleased(KeyEvent e) 
		{
			pass_is_empty.setText("");
		}
	});

	t3.addKeyListener(new KeyAdapter() {
		  public void keyReleased(KeyEvent e) 
			{
				confirm_pass_is_empty.setText("");
			}
	});

	t6.addKeyListener(new KeyAdapter() {
		  public void keyReleased(KeyEvent e) 
			{
				dis_is_empty.setText("");
			}
	});





	btn1.setBounds(32, 500, 90, 30);
	c.add(btn1);

	Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	btn1.setCursor(cur);
	btn1.setForeground(Color.WHITE);
	btn1.setBackground(Color.black);
	c.setComponentZOrder(btn1, 1); 







	//last statement 
	signup_frame.setVisible(true);		
	c.setVisible(true);
	
}

public static void main(String[] args) 
{

	//creating object and calling constructo
	//and our constructor contains the gui method

	//hence we donot need to call the gui method manually
	//gui method is called automatically because it is inside the constructor
	Signup obj2=new Signup();
}
}

