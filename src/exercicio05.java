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

public class exercicio05 extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3,  exibir, exibir1,exibir2;
    JTextField texto1, texto2;
    JButton calcular, limpar, sair;

    public exercicio05() {
        super("Calculadora de IMC");
        Container tela = getContentPane();
            
        setLayout(null);
 
        
        tela.setBackground(Color.white);

        rotulo1 = new JLabel("Veja o seu IMC:");
        rotulo1.setFont(new Font("Calisto MT", Font.BOLD, 24));

        rotulo2 = new JLabel("Digite sua altura:");
        rotulo2.setFont(new Font("Calisto MT", Font.BOLD, 12));

        
        rotulo3 = new JLabel("Digite seu peso:");
        rotulo3.setFont(new Font("Calisto MT", Font.BOLD, 12));

       

        exibir =  new JLabel("");
          exibir.setFont(new Font("Calisto MT", Font.BOLD, 12));
        
          exibir1 = new JLabel("");
                     exibir1.setFont(new Font("Calisto MT", Font.BOLD, 12));

           ImageIcon imc2 = new ImageIcon("imc2.png");
          exibir2= new JLabel(imc2);
           exibir2.setBounds(60, 220, 300,200);
           exibir2.setVisible(false);

          
       

        calcular = new JButton("calcular");
        limpar = new JButton("limpar");
        sair = new JButton("sair");
        
        
          texto1 = new JTextField(5);
          texto2 = new JTextField(5);
        
          
         
        
        rotulo1.setBounds(60, 10, 400, 40);
        rotulo1. setForeground(Color.black);
        
        rotulo2.setBounds(50, 60, 100, 20);
         rotulo2. setForeground(Color.black);
         
         
        rotulo3.setBounds(50, 100, 100, 20);
         rotulo3. setForeground(Color.black);
        
        
      
         
        calcular.setBounds(60, 140, 80, 20);
        calcular.setBackground(Color.gray);
        
        limpar.setBounds(160, 140, 80, 20);
         limpar.setBackground(Color.gray);
         
        sair.setBounds(260, 140, 80, 20);
         sair.setBackground(Color.gray);
         
        texto1.setBounds(160, 60, 80, 20);
        texto2.setBounds(160, 100, 80, 20);
     
      
        
        exibir.setBounds(60, 180, 130, 20);
            exibir.setForeground(Color.blue);
          
               
            exibir1.setBounds(60, 200, 300, 20);
                      exibir1.setForeground(Color.blue);

        
        calcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       
            double a = Double.parseDouble(texto1.getText());
            double b = Double.parseDouble(texto2.getText());
           
           double imc =  b/(a*a);

            
          
            if (imc<=18) {
          
                exibir.setText("O seu IMC é de : "+imc);
                  exibir1.setText("E é considerado abaixo do peso ideal!:( ");
                  exibir2.setVisible(true);

              
            } 
            else if(imc>=18.5 && imc<=24.99){
       exibir.setText("O seu IMC é de : "+imc);
                  exibir1.setText("E é considerado no peso ideal!:) ");
                                    exibir2.setVisible(true);


            }
            else if(imc>=25){
           exibir.setText("O seu IMC é de : "+imc);
                 exibir1.setText("E é considerado acima do peso!:(");
                                   exibir2.setVisible(true);


            }
            else{
                exibir.setText("Digite valores validos!!");

            }
       
    }
});

        

          limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                       
                        texto1.setText(null);
                        texto2.setText(null);
                      
                     
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
        tela.add(rotulo3);
      
        tela.add(exibir);
        tela.add(exibir1);
        tela.add(exibir2);
        tela.add(calcular);
        tela.add(limpar);
        tela.add(sair);
      
        tela.add(texto1);
        tela.add(texto2);
       
      
       
        
        setSize(400, 450);
        setVisible(true);
                setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        exercicio05 app = new exercicio05();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


     
    


