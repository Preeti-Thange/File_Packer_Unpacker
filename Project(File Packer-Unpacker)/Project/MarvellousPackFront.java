import javax.swing.*;

//import javafx.scene.control.Label;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarvellousPackFront extends Template implements ActionListener
{
    JButton SUBMIT, PREVIOUS;
    JLabel label1, label2, title;
    final JTestField text1, text2;

    public MarvellousPackFront()
    {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); 
        
        title = new JLabel("Preeti's Packing Portal");
        Dimension size = title.getPreferredSize();
        ti.setBounds(40,50, size.width + 60, size.height);
        title.setFont(new Font("Century", Font.BOLD,17));
        title.setForeground(Color.blue);

        466
        Label1 = new JLabel(); 
        label1.setText("Directory name");
        label1.setForeground(Color.white);
        label1.setBounds(r);
    }
}