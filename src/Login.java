import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame  {
    public Login(){
        JFrame j=new JFrame("");
        j. setLayout(null);
        j.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Computer\\Document\\Backgroundimg.png")));
        JPanel p1 = new JPanel();
        JLabel jl=new JLabel("Username");
        p1.add(jl);
        JTextField ja=new JTextField(10);
        p1.add(ja);
        JPanel p2=new JPanel();
        JLabel jl1=new JLabel("Password");
        p2.add(jl1);
        JPasswordField ja1=new JPasswordField(8);
         p2.add(ja1);
            
       JPanel p3=new JPanel();
        JButton jb=new JButton("Sign Up");
        p3.add(jb);
        JButton jb1=new JButton("Login");
        p3.add(jb1);
      
       
       p1.setBounds(450,50,250,40);
       p2.setBounds(450,150,250,40);
       p3.setBounds(450,250,250,40);
       j.setVisible(true);
       
       jb1 .addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               j.dispose();
              
               StudentProfile s1=new StudentProfile();
               s1.setSize(400, 300);
               
               
               s1.setVisible(true);
               
           }
           });
       
       jb .addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               j.dispose();
              
               Signup s1=new Signup();
               s1.setSize(400, 300);
               
               
               s1.setVisible(true);
               
           }
           });
       
       
        j.add(p1);
        j.add(p2);
        j.add(p3);
        j.setSize(400,400);
                
 }
   
    public static void main(String a[]){
       new Login();
        
    }
    
    
    
}
