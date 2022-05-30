/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import responsipbo.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import responsipbo.Karyawan;


/**
 *
 * @author Nada
 */
public class Menu extends JFrame implements ActionListener{
    
    JLabel ljudul = new JLabel("Main Menu");
    JButton btambah = new JButton("Tambah Karyawan");
    JButton blihat = new JButton("Lihat Karyawan");
    
    
    public Menu(){
        setSize(200,120);
        setLayout(null);
        add(ljudul);
        add(blihat);
        add(btambah);
        
        ljudul.setBounds(70,5,200,20);
        
         
        btambah.setBounds(0,30,200,20);
        blihat.setBounds(0,60,200,20);
        
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btambah){
           Lihat lh = new Lihat();
           lh.dispose();
           dispose();
           Input ik = new Input();
           Edit ed = new Edit();
           ed.dispose();
           Karyawan md = new Karyawan();
           controller ct = new controller(lh, md,ik,ed);
           
        }
        if(e.getSource() == blihat){
           Lihat lh = new Lihat();
           Input ik = new Input();
           ik.dispose();
           Edit ed = new Edit();
           ed.dispose();
           Karyawan md = new Karyawan();
           controller ct = new controller(lh, md,ik,ed);
        }
    }
}  
