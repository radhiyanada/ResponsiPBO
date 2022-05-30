/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import java.awt.*;
import responsipbo.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import responsipbo.*;

/**
 *
 * @author Nada
 */

public class Input extends JFrame {
    JLabel ljudul = new JLabel("Input Karyawan");
    
    JLabel lnama = new JLabel("Nama");
   public JTextField tnama = new JTextField(50);
    
    JLabel lusia = new JLabel("Usia");
   public JTextField tusia = new JTextField(50);
    
    JLabel lgaji = new JLabel("Gaji");
   public JTextField tgaji = new JTextField(50);
    
    public JButton bsubmit = new JButton("Submit");
    public JButton breset = new JButton("Reset");
    public JButton bkembali = new JButton("Kembali");
    
    public Input(){
        setTitle("Input Karyawan");
        setSize(300,230);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(tnama);
        add(lusia);
        add(tusia);
        add(lgaji);
        add(tgaji);  
        add(bsubmit);
        add(breset); 
        add(bkembali);
        
        ljudul.setBounds(92,5,200,20);
        lnama.setBounds(15,30,120,20);
        tnama.setBounds(55,30,200,20);
        
        lusia.setBounds(15,60,120,20);
        tusia.setBounds(55,60,200,20);
        
        lgaji.setBounds(15,90,120,20);
        tgaji.setBounds(55,90,200,20);
        
        bsubmit.setBounds(10,130,125,20);
        bsubmit.setBackground(Color.green);
        bsubmit.setForeground(Color.white);
        breset.setBounds(140,130,125,20);
        breset.setBackground(Color.red);
        breset.setForeground(Color.white);
        bkembali.setBounds(10,165,260,20);
        bkembali.setBackground(Color.blue);
        bkembali.setForeground(Color.white);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public String getNama(){
        return tnama.getText();
    }
    
    public String getUsia(){
        return tusia.getText();
    }
    
    public String getGaji(){
        return tgaji.getText();
    }
    
}
    

