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

public class exercicio03 extends JFrame {
    //criando os rotulos
    JLabel rotulo1, rotulo2, rotulo3,  exibir;
    
    //caixa de texto
    JTextField texto1, texto2;
    
    //botões
    JButton calcular, limpar, sair;

    public exercicio03() {
       //titulo de cima da pagina
       super("Teorema de pitagoras");
        Container tela = getContentPane();
            
        setLayout(null);
        
        //adicionando imagem ao icone no canto da tela
        ImageIcon icone = new ImageIcon("triangulo.jpg");
        setIconImage(icone.getImage());
 
        
        tela.setBackground(Color.white);

        //dando valor aos rotulos
        rotulo1 = new JLabel("TEOREMA DE PITAGORAS \n C²=A²+B²");
        rotulo2 = new JLabel("valor do cateto a:");
        rotulo3 = new JLabel("valor do cateto b:");
      
       

        exibir =  new JLabel("");
        //definindo fonte e tamanho dela
        exibir.setFont(new Font("Calisto MT", Font.BOLD, 12));
        
           

          
        //nome dos botões
        calcular = new JButton("calcular");
        limpar = new JButton("limpar");
        sair = new JButton("sair");
        
        
          texto1 = new JTextField(5);
          texto2 = new JTextField(5);
        
          
         
        //posicionamento, cor, fonte e tamanho da fonte
        rotulo1.setBounds(60, 10, 400, 20);
        rotulo1. setForeground(Color.black);
        rotulo1.setFont(new Font("Calisto MT", Font.BOLD, 12));

        
        rotulo2.setBounds(50, 50, 100, 20);
         rotulo2. setForeground(Color.black);
         rotulo2.setFont(new Font("Calisto MT", Font.BOLD, 12));

         
         
        rotulo3.setBounds(50, 90, 100, 20);
         rotulo3. setForeground(Color.black);
         rotulo3.setFont(new Font("Calisto MT", Font.BOLD, 12));

        
        
      
         
        calcular.setBounds(60, 140, 80, 20);
        calcular.setBackground(Color.gray);
          calcular.setFont(new Font("Calisto MT", Font.BOLD, 12));

        
        limpar.setBounds(160, 140, 80, 20);
         limpar.setBackground(Color.gray);
          limpar.setFont(new Font("Calisto MT", Font.BOLD, 12));

         
        sair.setBounds(260, 140, 80, 20);
         sair.setBackground(Color.gray);
         sair.setFont(new Font("Calisto MT", Font.BOLD, 12));

         
        texto1.setBounds(160, 50, 80, 20);
        texto2.setBounds(160, 90, 80, 20);
     
      
        
        exibir.setBounds(50, 200, 400, 20);
            exibir.setForeground(Color.blue);
           exibir.setFont(new Font("Calisto MT", Font.BOLD, 12));

          
               
          
        //função do botão
        calcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(texto1.getText());
            double b = Double.parseDouble(texto2.getText());
           
           

            
          
            if (a>0 && b>0) {
                //calculos
            double c1 = a*a + b*b; 
            double c2= Math.sqrt(c1);
            
            
            //mostra o texto na tela
                exibir.setText("O valor da hipotenusa é de "+c2);
              
            } else {
                //caso o usuario digite zero na caixa de entrada
                exibir.setText("Triângulo inexistente, insira um valor valido para os catetos!");
               
            }
        } catch (NumberFormatException ex) {
            exibir.setText("Erro: Por favor, insira apenas números válidos.");
      
        }
    }
});

        
          //metodo para limpar
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
        
    

     //metodo para sair
   sair.addActionListener(
        
            new ActionListener(){
             
                public void actionPerformed(ActionEvent e){
                    
                    System.exit(0);
                }
            }
        );
       

      

        exibir.setVisible(true);


        //coloca os elementos na tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
      
        tela.add(exibir);
        tela.add(calcular);
        tela.add(limpar);
        tela.add(sair);
      
        tela.add(texto1);
        tela.add(texto2);
       
      
       
        
        setSize(400, 300);
        setVisible(true);
                setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        exercicio03 app = new exercicio03();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


     
    


