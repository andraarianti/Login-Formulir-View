package login_form_view;

import javax.swing.*;

public class View extends JFrame {
    String nama, jk, agama, hobby;
    
    JLabel lnama = new JLabel(" Nama Lengkap  ");
    JLabel ljk = new JLabel(" Jenis Kelamin   ");
    JLabel lagama = new JLabel(" Agama        ");
    JLabel lhobby = new JLabel(" Hobi         ");
    JLabel saveNama= new JLabel();
    JLabel saveJK= new JLabel();
    JLabel saveAgama= new JLabel();
    JLabel saveHobby= new JLabel();
    
    public View(String nama, String jk, String agama, String hobby){
        setTitle("View");
	setDefaultCloseOperation(3);
	setSize(350,180);
        setLocation(750,400);

        this.nama= nama;
        this.jk=jk;
        this.agama=agama;
        this.hobby=hobby;
        saveNama.setText(nama);
        saveJK.setText(jk);    
        saveAgama.setText(agama); 
        saveHobby.setText(hobby);
        
        setLayout(null);
        add(lnama);
        add(ljk);
        add(lagama);
        add(lhobby);
        add(saveNama);
        add(saveJK);
        add(saveAgama);
        add(saveHobby);

        lnama.setBounds(10,10,120,20);
	ljk.setBounds(10,35,120,20);
        lagama.setBounds(10,60,120,20);
        lhobby.setBounds(10,90,120,20);
        saveNama.setBounds(110,10,120,20);
	saveJK.setBounds(110,35,120,20);
        saveAgama.setBounds(110,60,120,20);
        saveHobby.setBounds(110,90,150,20);

        setVisible(true);
    }
}
