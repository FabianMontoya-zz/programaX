package paquete;
import java.awt.event.*;
import javax.swing.*;

public class inicio extends JFrame implements ActionListener{
    JLabel titlemenu,t1,t2,t3;
    JButton b1,b2,b3,b4,b5;
    /////////////////////////////////////////////////////////
    public inicio(){
        super("Programa X V1.0");
        setLayout(null); 
        textos();
        botones();
    }
    /////////////////////////////////////////////////////////
    public void textos(){
    titlemenu = new JLabel("MENÚ INICIO");
    titlemenu.setBounds(120,10,130,50);
    add(titlemenu);
    //
    t1 =new JLabel ("Seleccione la opcion que desea ejecutar");
    t1.setBounds(45, 30, 300, 100);
    add(t1);
    }
    ////////////////////////////////////////////////////////
    public void botones(){
        b1 = new JButton("Potencia");
        b1.setBounds (35, 120, 100, 30);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Raiz");
        b2.setBounds(175, 120, 100, 30);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("Grados");
        b3.setBounds (35, 170, 100, 30);
        add(b3);
        b3.addActionListener(this);
        
        b4 = new JButton("Entero");
        b4.setBounds(175, 170, 100, 30);
        add(b4);
        b4.addActionListener(this);
        
        b5 = new JButton("Logaritmo");
        b5.setBounds(105, 215, 100, 30);
        add(b5);
        b5.addActionListener(this);
    }
    ////////////////////////////////////////////////////////////
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==b1){
            potencia form2 = new potencia();
            form2.setBounds(620, 240, 400, 200);
            form2.setSize(300, 300);
            form2.setVisible(true);
        }
        if (ae.getSource()==b2){
            raiz form3 = new raiz();
            form3.setBounds(610, 245, 400, 200);
            form3.setSize(300, 300);
            form3.setVisible(true);
        }
        if (ae.getSource()==b3){
            grados form4 = new grados();
            form4.setBounds(630, 235, 400, 200);
            form4.setSize(310, 300);
            form4.setVisible(true);
        }
        if (ae.getSource()==b4){
            entero form5 = new entero();
            form5.setBounds(620, 240, 400, 200);
            form5.setSize(300, 300);
            form5.setVisible(true);
        }
        if (ae.getSource()==b5){
            log form5 = new log();
            form5.setBounds(630, 235, 400, 200);
            form5.setSize(300, 300);
            form5.setVisible(true);
        }
    
    }
    ///////////////////////////////////////////////////////////
    public static void main(String[] args) {
       JFrame ventana = new inicio();
      ventana.setBounds(600, 250, 400, 600);
      ventana.setSize(340, 300);
      ventana.setVisible(true);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
