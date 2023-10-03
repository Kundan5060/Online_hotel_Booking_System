
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    
    Dashboard(){
        
       setBounds(0,0,1250,800);
       setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
       Image i2=i1.getImage().getScaledInstance(1250, 800, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0, 0, 1250, 800);
       add(image);
       
       JLabel text=new JLabel("THE TAJ GROUP WELCOME YOU");
       text.setBounds(350,80,1000,50);
       text.setFont(new Font("Tahoma",Font.PLAIN,46));
       text.setForeground(Color.YELLOW);
       image.add(text);
       
       JMenuBar mb=new JMenuBar();
       mb.setBounds(0,0,1250,30);
       image.add(mb);
       
       JMenu hotel=new JMenu("HOTEL MANAGEMENT");
       hotel.setForeground(Color.MAGENTA);
       mb.add(hotel);
       
       JMenuItem reception=new JMenuItem("RECEPTION");
       reception.addActionListener(this);
       hotel.add(reception);
       
       JMenu admin=new JMenu("ADMIN");
       admin.setForeground(Color.BLUE);
       mb.add(admin);
       
       JMenuItem employee=new JMenuItem("ADD EMPLOYEE");
       employee.addActionListener(this);
       admin.add(employee);
       
       JMenuItem addroom=new JMenuItem("ADD ROOMS");
       addroom.addActionListener(this);
       admin.add(addroom);
       
       JMenuItem adddriver=new JMenuItem("ADD DRIVER");
       adddriver.addActionListener(this);
       admin.add(adddriver);
       
       
       
       
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        if(ae.getActionCommand().equals ("ADD EMPLOYEE")){
           
         new addEmployee();
                 
        
            
        } else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms();
                 
        }
        else if(ae.getActionCommand().equals("ADD DRIVER")){
            new AddDriver();
            
        }else if(ae.getActionCommand().equals("RECEPTION")){
            new Reception();
        }
}
    
    
    public static void main(String[] args){
       new Dashboard();
    }
    
}
