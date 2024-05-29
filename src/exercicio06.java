/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */

 
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exercicio06 extends JFrame {
    JLabel rotulo1, rotulo2,  exibir, exibir1;
    JTextField texto1;
    JButton calcular, limpar, sair;

    public exercicio06() {
        super("Calculadora de temperatura");
        Container tela = getContentPane();
            
        setLayout(null);
        
        ImageIcon tela1= new ImageIcon("nuvem.png");
                setIconImage(tela1.getImage());
 
        
        tela.setBackground(Color.white);

        rotulo1 = new JLabel("Converta a temperatura:");
        rotulo1.setFont(new Font("Calisto MT", Font.BOLD, 24));

        rotulo2 = new JLabel("Digite a temperatura em °C:");
        rotulo2.setFont(new Font("Calisto MT", Font.BOLD, 12));

        
       

       

        exibir =  new JLabel("");
          exibir.setFont(new Font("Calisto MT", Font.BOLD, 12));
        
          exibir1 = new JLabel("");
                     exibir1.setFont(new Font("Calisto MT", Font.BOLD, 12));


          
       

        calcular = new JButton("calcular");
        limpar = new JButton("limpar");
        sair = new JButton("sair");
        
        
          texto1 = new JTextField(5);
        
          
         
        
        rotulo1.setBounds(50, 10, 500, 50);
        rotulo1. setForeground(Color.black);
                rotulo1.setFont(new Font("Ebrima", Font.BOLD, 24));

        
        rotulo2.setBounds(50, 70, 200, 20);
         rotulo2. setForeground(Color.black);
                 rotulo1.setFont(new Font("Ebrima", Font.BOLD, 24));

         
         
        
        
        
      
         
        calcular.setBounds(60, 110, 80, 20);
        calcular.setBackground(Color.magenta);
           calcular.setFont(new Font("Calisto MT", Font.BOLD, 11));

        
        limpar.setBounds(150, 110, 80, 20);
         limpar.setBackground(Color.magenta);
          limpar.setFont(new Font("Calisto MT", Font.BOLD, 11));

         
        sair.setBounds(240, 110, 80, 20);
         sair.setBackground(Color.magenta);
          sair.setFont(new Font("Calisto MT", Font.BOLD, 11));

         
        texto1.setBounds(210, 70, 80, 20);
     
      
        
        exibir.setBounds(60, 160, 250, 20);
            exibir.setForeground(Color.blue);
          
               
            exibir1.setBounds(60, 190, 250, 20);
                      exibir1.setForeground(Color.pink);

        
        calcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       
            double a = Double.parseDouble(texto1.getText());
               double conversaoF= a * 1.8 + 32;

            double conversaoK = a + 237.15;
            
            exibir.setText("A temperatura em fahrenheit é de: " +conversaoF+"°F");
             exibir1.setText("A temperatura em kelvin é de : " +conversaoK+"K");

            
    }
});

        

          limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                       
                        texto1.setText(null);
                      
                     
                        exibir.setText(null);
                     
                        limpar.requestFocus();
                    }
                }
        );
        
    

     
   sair.addActionListener(
        
            new ActionListener(){
             
                public void actionPerformed(ActionEvent e){
                    
                    System.exit(0);
                }
            }
        );
       

      

        exibir.setVisible(true);


        
        tela.add(rotulo1);
        tela.add(rotulo2);
      
        tela.add(exibir);
        tela.add(exibir1);
        tela.add(calcular);
        tela.add(limpar);
        tela.add(sair);
      
        tela.add(texto1);
       
      
       
        
        setSize(400, 350);
        setVisible(true);
                setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        exercicio06 app = new exercicio06();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


     
    


