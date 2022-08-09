
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser ;
import java.awt.event.*;


public class AddFaculty extends JFrame implements ActionListener {
    
    JTextField tfname , tffname , tfaddress, tfphone , tfemail 
            ,tfx , tfxii , tfaadhar ;
    JLabel labelempid;
    JDateChooser dcdob ;
    JComboBox cbcourse , cbbranch;
    JButton submit , cancel ;
    
    Random ran = new Random() ;
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L)  ;
    
       AddFaculty(){
       
         setSize(1000,800);
         setLocation(450,50);
         
         setLayout(null) ;
         
         JLabel heading = new JLabel("New Faculty Details") ;
         heading.setBounds(310,30,500,50);
         heading.setFont(new Font("sarif",Font.BOLD,30));
         add(heading);
         
         JLabel lblname = new JLabel("Name") ;
         lblname.setBounds(50,150,100,30);
         lblname.setFont(new Font("sarif",Font.BOLD,30));
         add(lblname);
         
         tfname = new JTextField() ;
         tfname.setBounds(200,150,150,30);
         add(tfname) ;
         
         JLabel lblfname = new JLabel("Father Name") ;
         lblfname.setBounds(400,150,250,30);
         lblfname.setFont(new Font("sarif",Font.BOLD,30));
         add(lblfname);
         
         tffname = new JTextField() ;
         tffname.setBounds(600,150,150,30);
         add(tffname) ;
         
            JLabel lblempid = new JLabel("Emp Id") ;
         lblempid.setBounds(50,200,200,30);
         lblempid.setFont(new Font("sarif",Font.BOLD,30));
         add(lblempid);
         
           labelempid = new JLabel("101" + first4) ;
         labelempid.setBounds(200,200,200,30);
         labelempid.setFont(new Font("sarif",Font.BOLD,30));
         add(labelempid);
         
           JLabel lbldob = new JLabel("Date of Birth") ;
         lbldob.setBounds(400,200,200,30);
         lbldob.setFont(new Font("sarif",Font.BOLD,30));
         add(lbldob);
         
         dcdob = new JDateChooser() ;
         dcdob.setBounds(600,200,150,30);
         add(dcdob);
         
          JLabel lbladdress = new JLabel("Address") ;
         lbladdress.setBounds(50,250,200,30);
         lbladdress.setFont(new Font("sarif",Font.BOLD,30));
         add(lbladdress);
         
         tfaddress = new JTextField() ;
         tfaddress.setBounds(200,250,150,30);
         add(tfaddress) ;
         
          JLabel lblphone = new JLabel("Phone No") ;
         lblphone.setBounds(400,250,200,30);
         lblphone.setFont(new Font("sarif",Font.BOLD,30));
         add(lblphone);
         
         tfphone = new JTextField() ;
         tfphone.setBounds(600,250,150,30);
         add(tfphone) ;
         
           JLabel lblemail = new JLabel("Email Id") ;
         lblemail.setBounds(50,300,200,30);
         lblemail.setFont(new Font("sarif",Font.BOLD,30));
         add(lblemail);
         
         tfemail = new JTextField() ;
         tfemail.setBounds(200,300,150,30);
         add(tfemail) ;
         
          JLabel lblx = new JLabel("Class X(%)") ;
         lblx.setBounds(400,300,200,30);
         lblx.setFont(new Font("sarif",Font.BOLD,30));
         add(lblx);
         
         tfx = new JTextField() ;
         tfx.setBounds(600,300,150,30);
         add(tfx) ;
         
           JLabel lblxii = new JLabel("Class XII(%)") ;
         lblxii.setBounds(30,350,500,30);
         lblxii.setFont(new Font("sarif",Font.BOLD,30));
         add(lblxii);
         
         tfxii = new JTextField() ;
         tfxii.setBounds(200,350,150,30);
         add(tfxii) ;
         
         
             JLabel lblaadhar = new JLabel("Aadhar no..") ;
         lblaadhar.setBounds(400,350,550,30);
         lblaadhar.setFont(new Font("sarif",Font.BOLD,30));
         add(lblaadhar);
         
         tfaadhar = new JTextField() ;
         tfaadhar.setBounds(600,350,150,30);
         add(tfaadhar) ;
         
         JLabel lblcourse = new JLabel("Qualification") ;
         lblcourse.setBounds(30,400,200,30);
         lblcourse.setFont(new Font("sarif",Font.BOLD,30));
         add(lblcourse);
         
         String course[] = {"PHD" , "MCA" , "MBA" , "M.tech" }  ;
         cbcourse = new JComboBox(course) ;
         cbcourse.setBounds(200,400,150,30);
         cbcourse.setBackground(Color.WHITE);
         add(cbcourse) ;
         
           JLabel lblbranch = new JLabel("Department") ;
         lblbranch.setBounds(400,400,200,30);
         lblbranch.setFont(new Font("sarif",Font.BOLD,30));
         add(lblbranch);
         
         String branch[] = { "Computer Science" , "ECE" , "IT" , "EEE" , "CIVIL" } ;
         cbbranch = new JComboBox(branch) ;
         cbbranch.setBounds(600,400,150,30) ;
         cbbranch.setBackground(Color.WHITE) ;
         add(cbbranch) ;
         
            submit = new JButton("Submit") ;
               submit.setBounds(200,550,120,30) ;
         
               submit.setBackground(Color.BLACK);
               submit.setForeground(Color.WHITE);
          submit.addActionListener(this);
               submit.setFont(new Font("serif",Font.BOLD,16));
               add(submit) ;

                  cancel = new JButton("Cancel") ;
               cancel.setBounds(450,550,120,30) ;
               cancel.setBackground(Color.BLACK);
               cancel.setForeground(Color.WHITE);
          cancel.addActionListener(this);
               cancel.setFont(new Font("serif",Font.BOLD,16));
               add(cancel) ;
         
         setVisible(true) ;
           
       }
    
         public void actionPerformed ( ActionEvent ae ){
               if( ae.getSource() == submit ){
                    
                   String name = tfname.getText() ;
                   String fname = tffname.getText() ;
                   String empid = labelempid.getText();
                   String dob =((JTextField)dcdob.getDateEditor().getUiComponent()).getText()  ;
                   String address = tfaddress.getText();
                   String phone = tfphone.getText();
                   String email  = tfemail.getText() ;
                   String x = tfx.getText();
                   String xii = tfxii.getText();
                   String aadhar = tfaadhar.getText();
                   String qualification = (String)cbcourse.getSelectedItem() ;
                   String branch = (String)cbbranch.getSelectedItem();
                   
                   // query 
                   try{
                   
                       String query = "insert into teacher values( '"+name+"' , '"+fname+"' , '"+empid+"' , '"+dob+"' , '"+address+"' , '"+phone+"' , '"+email+"' , '"+x+"' , '"+xii+"' , '"+aadhar+"' , '"+qualification+"' , '"+branch+"'  ) " ;
                      
                       Conn con = new Conn() ;
                       con.s.executeUpdate(query) ; // for dml 
                       
                       JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                       setVisible(false) ;
                       
                   }catch(Exception e){
                      e.printStackTrace() ;
                   }
                   
               }else {
                   setVisible(false) ;
               }
        }
       
      public static void main(String[] args){
      
                new AddFaculty() ;
          
      }
    
}
