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

public class exercicioo01 extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, exibir, exibir2, exibir3, exibir4;
    JTextField texto1, texto2, texto3, texto4;
    JButton calcular, limpar, sair;

    public exercicioo01() {
        super("media dos alunos");
        Container tela = getContentPane();
            
        setLayout(null);
         
        //colocando cor de fundo na tela
        tela.setBackground(Color.black);

       //instanciando e dando nomes ao rotulos
        rotulo1 = new JLabel("1° nota");
        rotulo2 = new JLabel("2° nota");
        rotulo3 = new JLabel("3° nota");
        rotulo4 = new JLabel("4° nota");

        exibir =  new JLabel("");
        exibir2 = new JLabel("");
        exibir3 = new JLabel("");
        exibir4 = new JLabel("");

        calcular = new JButton("calcular");
        limpar = new JButton("limpar");
        sair = new JButton("sair");
        
        
          texto1 = new JTextField(5);
          texto2 = new JTextField(5);
          texto3 = new JTextField(5);
          texto4 = new JTextField(5);
          
         
        
        rotulo1.setBounds(50, 20, 100, 20);
       //definindo as cores
       rotulo1. setForeground(Color.cyan);
        
        rotulo2.setBounds(50, 60, 100, 20);
         rotulo2. setForeground(Color.cyan);
         
         
        rotulo3.setBounds(50, 100, 100, 20);
         rotulo3. setForeground(Color.cyan);
        
        rotulo4.setBounds(50,140, 100, 20);
         rotulo4. setForeground(Color.cyan);
      
        
        calcular.setBounds(60, 180, 80, 20);
        calcular.setBackground(Color.cyan);
        
        limpar.setBounds(160, 180, 80, 20);
         limpar.setBackground(Color.magenta);
         
        sair.setBounds(260, 180, 80, 20);
         sair.setBackground(Color.pink);
         
         
         //definindo tamanhos
        texto1.setBounds(120, 20, 80, 20);
        texto2.setBounds(120, 60, 80, 20);
        texto3.setBounds(120, 100, 80, 20);
        texto4.setBounds(120, 140, 80, 20);
        
        exibir.setBounds(60, 220, 300, 20);
            exibir.setForeground(Color.cyan);
            
            exibir2.setBounds(60, 250, 300, 20);
               exibir2.setForeground(Color.magenta);
               
               exibir3.setBounds(60, 280, 300, 20);
               exibir3.setForeground(Color.pink);
               
               exibir4.setBounds(60, 310, 300, 20);
               exibir4.setForeground(Color.cyan);

               
               //dando funçao ao botão
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(texto1.getText());
                double numero2 = Double.parseDouble(texto2.getText());
                double numero3 = Double.parseDouble(texto3.getText());
                double numero4 = Double.parseDouble(texto4.getText());
                
                //condicoes para definir os valores maior e menor
               if (numero1 >= numero2 && numero1 >= numero3 && numero1 >= numero4) {
                        double valmaior = numero1;
                        exibir.setText("-O valor maior é  : " + valmaior);
                    } 
               else if (numero2 >= numero1 && numero2 >= numero3 && numero2 >=  numero4) {
                        double valmaior = numero2;
                        exibir.setText("-O valor maior é : " + valmaior);
                    } 
               else if (numero3 >= numero1 && numero3 >= numero2 && numero3 >= numero4) {
                        double valmaior = numero3;
                        exibir.setText("-O valor maior é : " + valmaior);
                    }
               else if (numero4 >= numero1 && numero4 >= numero2 && numero4 >= numero3) {
                        double valmaior = numero4;
                        exibir.setText("-O valor maior é  : " + valmaior);
                    }

                    if (numero1 <= numero2 && numero1 <= numero3 && numero1 <= numero4) {
                        double valmenor = numero1;
                        exibir2.setText("-O valor menor é : " + valmenor);
                    } 
                    else if (numero2 <= numero1 && numero2 <= numero3 && numero2 <= numero4) {
                        double valmenor = numero2;
                        exibir2.setText("-O valor menor é : " + valmenor);
                    } 
                    else if (numero3 <= numero1 && numero3 <= numero2 && numero3 <= numero4) {
                        double valmenor = numero3;
                        exibir2.setText("-O valor menor é : " + valmenor);
                    } 
                    else if (numero4 <= numero1 || numero4 <= numero2 || numero4 <= numero3) {
                        double valmenor = numero4;
                        exibir2.setText("-O valor menor é : " + valmenor);
                    }

                    //calculando a media
                double media = (numero1 + numero2 + numero3 + numero4)/4;
                exibir3.setText("-A media é: " + media);
                
                if(media>=7.5){
                    exibir4.setText("-Parabéns!! Você foi aprovado!");
                }
                else{
                    exibir4.setText("-Ah, que pena! Você foi reprovado!:(");
                }
            }
        });

        
        //dando função ao botão de limpar
          limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                       
                        texto1.setText(null);
                        texto2.setText(null);
                        texto3.setText(null);
                        texto4.setText(null);
                        exibir.setText(null);
                        exibir2.setText(null);
                        exibir3.setText(null);
                        exibir4.setText(null);
                        limpar.requestFocus();
                    }
                }
        );
        
    

     //dando função ao botão de sair
   sair.addActionListener(
        
            new ActionListener(){
             
                public void actionPerformed(ActionEvent e){
                    
                    System.exit(0);
                }
            }
        );
       

      

        exibir.setVisible(true);
           exibir2.setVisible(true);


        //adicionando rotulos á tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(exibir);
        tela.add(calcular);
        tela.add(limpar);
        tela.add(sair);
      
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
         tela.add(exibir2);
         tela.add(exibir3);
         tela.add(exibir4);
        
        setSize(400, 390);
        setVisible(true);
                setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        exercicioo01 app = new exercicioo01();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


     
    

