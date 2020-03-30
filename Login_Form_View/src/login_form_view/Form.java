package login_form_view;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class Form extends JFrame{
    String nama, jk, agama, hobby;

    final JTextField fnama = new JTextField(20);

    JLabel lnama = new JLabel(" Nama Lengkap ");
    JLabel ljk = new JLabel(" Jenis Kelamin ");
    JRadioButton rbPria = new JRadioButton("Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("Perempuan ");
    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama =
        {"Islam", "Katolik", "Kristen", "Budha", "Hindu"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    JLabel lhobby = new JLabel(" Hobi ");
    JCheckBox cbBola = new JCheckBox("Sepakbola ");
    JCheckBox cbBasket = new JCheckBox("Basket ");
    JButton btnSave = new JButton("Save");

    JLabel hnama = new JLabel();
    JLabel hjk = new JLabel();
    JLabel hagama = new JLabel();
    JLabel hhobby = new JLabel();

        public Form(){
            setTitle ("FORMULIR");
            setDefaultCloseOperation(3);
            setSize(350,400);
            setLocation(750,250);

            ButtonGroup group = new ButtonGroup();
            group.add(rbPria);
            group.add(rbWanita);

            setLayout (null);
            add(lnama);
            add(fnama);
            add(ljk);
            add(rbPria);
            add(rbWanita);
            add(lagama);
            add(cmbAgama);
            add(lhobby);
            add(cbBola);
            add(cbBasket);
            add(btnSave);
         
            add(hnama);
            add(hjk);
            add(hagama);
            add(hhobby);

            lnama.setBounds(10,15,120,20);
            fnama.setBounds(130,15,150,20);
            ljk.setBounds(10,40,120,20);
            rbPria.setBounds(125,40,100,20);
            rbWanita.setBounds(225,40,100,20);
            lagama.setBounds(10,60,150,20);
            cmbAgama.setBounds(130,60,150,20);
            lhobby.setBounds(10,85,120,20);
            cbBola.setBounds(125,85,100,20);
            cbBasket.setBounds(225,85,150,20);
            btnSave.setBounds(110,125,120,20);
            
            btnSave.addActionListener((ActionEvent e) -> {
                if(fnama.getText().length() == 0){
                    JOptionPane.showMessageDialog(null, "Nama belum diisi!");
                } else{
                    nama = fnama.getText();
                    
                    if(rbPria.isSelected()){
                        jk = rbPria.getText();
                    } else if(rbWanita.isSelected()){
                        jk = rbWanita.getText();
                    }
                    agama = (String) cmbAgama.getSelectedItem();
                    
                    if(cbBola.isSelected() && cbBasket.isSelected())
                    {
                        hobby = cbBola.getText() + " dan " +cbBasket.getText();
                    } else if(cbBola.isSelected()){
                        hobby = cbBola.getText();
                    } else if(cbBasket.isSelected()){
                        hobby = cbBasket.getText();
                    }
                    View s = new View(nama, jk, agama, hobby);
                    s.setVisible(true);
                } dispose();
            });
            
            setVisible(true);
        }
    }    

