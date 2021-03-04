package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class User_dashboard extends JFrame
{

String namee;
String mb;
String st;
//inputstream is used to read data that is in bytes
//InputStream img ;

JLabel label1;
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
JLabel label_status = new JLabel("",JLabel.LEFT);

//default constructor 
//note:- default constructor is never gonna called . so thats why it is empty
User_dashboard()
{
	
}

//constructor receiving an id of the user after login
User_dashboard(String id)
{
gui4(id);
}

public void gui4(String id)
{
	//JLabel i = new JLabel();
	//i.setText(id);
	
	//FRAME
	
	//creating object of JFrame class
	JFrame frame_udb = new JFrame();

	//restricting 
	//if true user can resize the frame
	//if false user cannot resize the frame
	frame_udb.setResizable(false);

	//removing title bar of frame
	frame_udb.setUndecorated(true);


	//setting title for the frame
	frame_udb.setTitle("LOST & FOUND home page");

	//giving size to the frame
	frame_udb.setSize(900,550);

	//centering the frame
	frame_udb.setLocationRelativeTo(null);

	//setting background color
	Container c = new Container();

	//storing ContentPane of our frame in c (whenever we want to add something in our frame we need ContentPane)
	c = frame_udb.getContentPane();
	Color  black = new Color(53,56,57);
	c.setBackground(black);

	//setting layout to null
	c.setLayout(null);

	//after clicking on close button
	//to terminate the program we have to use one method (setDefaultCloseOperation)
	frame_udb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

	//LABEL (our application icon )
	ImageIcon icon = new ImageIcon("E:/pic/new_final_after_testing.jpg");
	JLabel label = new JLabel(icon);
	p.add(label);
	//c.setComponentZOrder(p, 0);








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
			frame_udb.setState(frame_udb.ICONIFIED);
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









	//PANEL 3 (plain white line)
	//create object
	JPanel p2 = new JPanel();
	p2.setLayout(new FlowLayout(FlowLayout.LEFT,6,2));

	//setting background
	//Color  pure_black = new Color(35,43,43);
	p2.setBackground(Color.WHITE);

	//size and location
	p2.setSize(900,1);
	p2.setLocation(0,35);

	//adding to the frame
	c.add(p2);









	//USER IMAGE
	//create object
	JPanel p3 = new JPanel();
	//p3.setLayout(new FlowLayout(FlowLayout.LEFT,6,2));
	p3.setLayout(null);

	//setting background
	//Color  pure_black = new Color(35,43,43);
	p3.setBackground(pure_black);

	//size and location
	p3.setSize(900,90);
	p3.setLocation(0,36);

	//adding to the frame
	c.add(p3);

	//LABEL (default image of user )
	ImageIcon user_default_image = new ImageIcon("E:/pic/user_default_image_testing3.png");
	label1 = new JLabel(user_default_image);
	label1.setSize(90,90);
	p3.add(label1);

	
	
	
	
	
	
	
	
	//Upload image button
	JButton upload_image_btn = new JButton("Upload Image");

	upload_image_btn.setBounds(100, 52, 115, 30);
	Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	upload_image_btn.setCursor(cur);
	upload_image_btn.setForeground(Color.WHITE);
	upload_image_btn.setBackground(Color.black);

	p3.add(upload_image_btn);
	//c.setComponentZOrder(upload_image_btn,1);
	
	upload_image_btn.addActionListener(new ActionListener()
	{
	//Overriding actionPerformed method (not sure)
					
	//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
	public void actionPerformed(ActionEvent e) 
	{
		
		
	
		
		try
		{
			//File image = new File(path);
			//FileInputStream fis = new FileInputStream ( image );
			
			//code for letting user to browser his/her required image
			JFileChooser choose_the_file = new JFileChooser();
			choose_the_file.showOpenDialog(null);
			
			//storing selected image in a variable 'f'
			File f= choose_the_file.getSelectedFile();
			//storing selected image path in a variable
			String path=f.getAbsolutePath();
			
			File image = new File(path);
			
			//now converting image into binary 
			FileInputStream fis = new FileInputStream ( image );
			
			//ByteArrayOutputStream baos= new ByteArrayOutputStream();
			
			//exception
			Class.forName("com.mysql.jdbc.Driver");	
			
			//Creating connection with mysql
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/lostandfound","root","");
			
			//Create the statement
			//Statement stmt = con.createStatement();
			//NOTE:- setBlob() method is not defined for statement class . so i have to perparestatement class instead of statement class
			//Create the query
			//String query=("Insert into usersignupdata where id='"+id+"'(image)VALUES('"+((Object) stmt).setBlob(fis)+"') ");
	
			PreparedStatement ps = con.prepareStatement("update usersignupdata set image=? where id='"+id+"' ");
			
			ps.setBlob(1, fis);
			
			//Execute the query 
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "image is inserted");
			
		}
		catch(Exception exception_obj)
		{
			JOptionPane.showMessageDialog(null, exception_obj);
		}
	}
	});
	
	
	
	
	
	
	


			
			//USER DATA FROM THE DATABASE
			try
			{
				//exception
				Class.forName("com.mysql.jdbc.Driver");	
				
				//Creating connection with mysql
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/lostandfound","root","");
				//Create the statement
				Statement stmt = con.createStatement();
				//Create the query
				String query="Select * from usersignupdata where id='"+id+"' ";
		
				//Execute the query 
				ResultSet rs= stmt.executeQuery(query);
				
				
				//NOTE :- next is function that return boolean value true or false
				//if true
				if(rs.next()==true)
				{
					//RETRIVEING NAME,MOBILE AND STATUS FROM THE DATABSE
					namee = rs.getString("name");
					mb = rs.getString("mobileno");
					st = rs.getString("status");
					
					
					//RETRIVEING IMAGE FROM THE DATABASE
					//storing image in the form of bytes by using getBytes() method
					byte[] imagedata=rs.getBytes("image");
					//ImageIcon method used to convert the image from byte to actual image
					ImageIcon actual_im = new ImageIcon(imagedata);
					
					//setting user image from database to label
					label1.setIcon(actual_im);
					
					
					
					label2.setText(namee);
					label3.setText(mb);
					label_status.setText(st);
					//label1.
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

			

	
	
	
	    //NAME
		
		//label2.setText(id);
				
		//location and size
		label2.setBounds(100,0,120,100);

		//font styling little bit
		Font font =  new Font("Arial",Font.BOLD,11);
		label2.setFont(font);
		label2.setForeground(Color.WHITE);

		//adding label on panel
		p3.add(label2);
		c.setComponentZOrder(label2, 0);
	
	
		//MOBILE NUMBER
		
		//label3.setText(mb);
		
		//location and size
		label3.setBounds(100,20,100,100);

		//font styling little bit
		Font font_no =  new Font("Arial",Font.BOLD,10);
		label3.setFont(font_no);
		label3.setForeground(Color.WHITE);

		//adding label on panel
		p3.add(label3);
		c.setComponentZOrder(label3, 0);
		//c.setComponentZOrder(p, 0);
	

	//logout button
	JButton logout_btn = new JButton("Logout");

	logout_btn.setBounds(800, 32, 90, 30);
	//Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	logout_btn.setCursor(cur);
	logout_btn.setForeground(Color.WHITE);
	logout_btn.setBackground(Color.black);

	p3.add(logout_btn);
	//c.setComponentZOrder(logout_btn,1);
	
	
	//BUTTON (what are the actions going to perform when button)
			
	logout_btn.addActionListener(new ActionListener()
	{
	//Overriding actionPerformed method (not sure)
					
	//this method is present in ActionListener interface(or we are writing its body here because it is method of interface)
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "succesfully logout ");
		frame_udb.dispose();
		Home ob1 = new Home();
		
		}
	});









	//PANEL 3 (plain white line)
	//create object
	JPanel p4 = new JPanel();
	p4.setLayout(new FlowLayout(FlowLayout.LEFT,6,2));

	//setting background
	//Color  pure_black = new Color(35,43,43);
	p4.setBackground(Color.WHITE);

	//size and location
	p4.setSize(900,1);
	p4.setLocation(0,126);

	//adding to the frame
	c.add(p4);







	
		//Showing STATUS to the user
		label_status.setBounds(10,180,400,40);
		Font font_status =  new Font("Arial",Font.BOLD,30);

		label_status.setFont(font_status);
		label_status.setForeground(Color.WHITE);
		c.add(label_status);
		
		//c.setComponentZOrder(label_status, 0); 






	//last statement 
	frame_udb.setVisible(true);	
}




//MAIN METHOD
public static void main(String[] args)
{
User_dashboard obj4= new User_dashboard();

}
}


