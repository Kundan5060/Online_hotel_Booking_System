package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDriver extends JFrame implements ActionListener{
    
    JButton add,cancle;
    JTextField tfname,tfage,tfcompany,tfmodel,tflocation;
    JComboBox typecombo,availabelcombo, gendercombo;
    
    AddDriver(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading=new JLabel("Add Drivers");
        heading .setFont(new Font("Tohoma",Font.BOLD,18));
        heading.setBounds(150,10,200,20);
        add(heading);
        
        JLabel lblroomno=new JLabel("Name");
        lblroomno.setFont(new Font("Tohoma",Font.PLAIN,16));
        lblroomno.setBounds(60,70,120,30);
        add(lblroomno);
        
        tfname=new JTextField();
        tfname.setBounds(200,70,150,30);
        add(tfname);
        
        JLabel lblage=new JLabel("Age");
       lblage.setFont(new Font("Tohoma",Font.PLAIN,16));
        lblage.setBounds(60,110,120,30);
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(200,110,150,30);
        add(tfage);
        
        
        JLabel lblclean=new JLabel("Gender");
       lblclean.setFont(new Font("Tohoma",Font.PLAIN,16));
        lblclean.setBounds(60,150,120,30);
        add(lblclean);
        
        String cleanOptions[]={"Male","Female"};
        gendercombo=new JComboBox(cleanOptions);
          gendercombo.setBounds(200,150,150,30);
          gendercombo.setBackground(Color.white);
        add(   gendercombo);
        
        JLabel lbltype=new JLabel("Car Company");
        lbltype.setFont(new Font("Tohoma",Font.PLAIN,16));
        lbltype.setBounds(60,190,120,30);
        add(lbltype);
        
        tfcompany=new JTextField();
        tfcompany.setBounds(200,190,150,30);
        add(tfcompany);
        
        JLabel lblprice=new JLabel("Car Model");
        lblprice.setFont(new Font("Tohoma",Font.PLAIN,18));
        lblprice.setBounds(60,230,120,30);
        add(lblprice);
        
        tfmodel=new JTextField();
        tfmodel.setBounds(200,230,150,30);
        add(tfmodel);
        
        JLabel lblavailabel=new JLabel("Availabel");
        lblavailabel.setFont(new Font("Tohoma",Font.PLAIN,16));
        lblavailabel.setBounds(60,270,120,30);
        add(lblavailabel);
        
        String driverOptions[]={"Available","Busy"};
        availabelcombo=new JComboBox(driverOptions);
        availabelcombo.setBounds(200,270,150,30);
        availabelcombo.setBackground(Color.white);
        add(availabelcombo);
        
        JLabel lbllocation=new JLabel("Location");
        lbllocation.setFont(new Font("Tohoma",Font.PLAIN,18));
        lbllocation.setBounds(60,310,120,30);
        add(lbllocation);
        
        tflocation=new JTextField();
        tflocation.setBounds(200,310,150,30);
        add(tflocation);
        
        add=new JButton("Add Driver");
        add.setForeground(Color.white);
       add.setBackground(Color.black);
        add.setBounds(60,370,130,30);
        add.addActionListener(this);
        add(add);
        
        cancle=new JButton("Cancle");
        cancle.setForeground(Color.white);
        cancle.setBackground(Color.black);
        cancle.setBounds(220,370,130,30);
        cancle.addActionListener(this);
        add(cancle);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);
        
        
        
        setBounds(200,200,940,470);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String name= tfname.getText();
            String available=(String) availabelcombo.getSelectedItem();
            String gender=(String) gendercombo.getSelectedItem();
            String Gender=(String) gendercombo.getSelectedItem();
            String age= tfage.getText();
            String company= tfcompany.getText();
            String brand=tfmodel.getText();
            String location=tflocation.getText();
            
            try{
            
                Conn conn =new Conn();
                String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Driver Added Successfully");
                
                setVisible(false);
                
            }catch(Exception e){
                
            e.printStackTrace();
            
            }
            
            }
            
        
    else{
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args){
      new AddDriver();
    }
    
}
