import java.awt.*;  
import java.awt.event.*;  

public class DialogExample {  

    private static Dialog d;  
    DialogExample() {  
        
        Frame f= new Frame();  
        d = new Dialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        Button b = new Button ("OK");  
        b.addActionListener ( new ActionListener() 

        {  
            public void actionPerformed( ActionEvent e )  
            {  
                DialogExample.d.setVisible(false);  
            }  
        });  
        
        d.add( new Label ("Click on the button to continue."));  
        d.add(b);   
        d.setSize(350,350);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new DialogExample();  
    }  
}  