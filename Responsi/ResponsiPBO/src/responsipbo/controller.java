/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import responsipbo.Main;
import responsipbo.Karyawan;
import responsipbo.Edit;
import responsipbo.Menu;
import responsipbo.Lihat;
import responsipbo.*;

/**
 *
 * @author Nada
 */
public class controller {
    Karyawan model;
    Lihat tampil;
    Input input;
    Edit edit;
    
    public controller(Lihat tampilview, Karyawan modell,Input inputk, Edit editt){
        this.model = modell;
        this.tampil = tampilview;
        this.input = inputk;
        this.edit = editt;
        
        if(model.getBanyakData()!=0){
            String dataKaryawan[][] = model.readContact();
            tampil.tabel.setModel((new JTable(dataKaryawan, tampil.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        input.bsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = input.getNama();
                String usia = input.getUsia();
                String gaji =input.getGaji();
                model.insert(nama, usia, gaji);
         
                String dataKaryawan[][] = model.readContact();
                tampil.tabel.setModel((new JTable(dataKaryawan, tampil.namaKolom)).getModel());
            }
        });
         input.bkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                Menu m = new Menu();
                   
            }
        });
         
        input.breset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.tnama.setText(null);
                input.tusia.setText(null);  
                input.tgaji.setText(null);
            }
        });
        edit.bkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edit.dispose();
                

            }
        });
        tampil.bkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampil.dispose();

            }
        });
        edit.bupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = edit.getNama();
                String cek = edit.getCek();
                String usia = edit.getUsia();
                String gaji =edit.getGaji();
                model.update(nama,cek, usia, gaji);
                edit.dispose();
            }
        });
        edit.bhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cek = edit.getCek();
                model.delete(cek);
                edit.dispose();
            }
        });
              tampil.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = tampil.tabel.getSelectedRow();
                
                String id = tampil.tabel.getValueAt(baris, 0).toString();
                String nama = tampil.tabel.getValueAt(baris, 1).toString();
                String usia = tampil.tabel.getValueAt(baris, 2).toString();
                String gaji = tampil.tabel.getValueAt(baris, 3).toString();
                
                tampil.dispose();
                Edit ed = new Edit();
                ed.fnama.setText(nama);
                ed.fcek.setText(id);
                ed.fusia.setText(usia);
                ed.fgaji.setText(gaji);
                Lihat lh = new Lihat();
                lh.dispose();
                Input ik = new Input();
                ik.dispose();
                Karyawan md = new Karyawan();
                controller ct = new controller(lh,md,ik,ed);
                System.out.println("");
                        
            }
        }
        );
    }
}
