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

public class exercicio02 extends JFrame {
   //criando os elementos
    JLabel rotulo1, rotulo2, rotulo3, rotulo4,  exibir, exibir2, exibir3;
    JTextField texto1, texto2, texto3;
    JButton calcular, limpar, sair;

    public exercicio02() {
        super("Fórmula de bhaskara");//titulo de cima da página
        Container tela = getContentPane();
            
        setLayout(null);
         
        tela.setBackground(Color.white);//cor de fundo da tela

        //Titulo dentro da página
        rotulo1 = new JLabel("FÓRMULA DE BHASKARA: \n AX² + BX + C = 0");
        rotulo2 = new JLabel("valor de a:");
        rotulo3 = new JLabel("valor de b:");
        rotulo4= new JLabel("valor de c:");
       

        exibir =  new JLabel("");//onde vão aparecer as saidas
          exibir.setFont(new Font("Calisto MT", Font.BOLD, 12));
        
        exibir2 = new JLabel("");
           exibir2.setFont(new Font("Calisto MT", Font.BOLD, 12));
              
        exibir3 = new JLabel("");
           exibir3.setFont(new Font("Calisto MT", Font.BOLD, 12));

           //botões
        calcular = new JButton("calcular");
        limpar = new JButton("limpar");
        sair = new JButton("sair");
        
        //onde o usuario coloca as informações
          texto1 = new JTextField(5);
          texto2 = new JTextField(5);
          texto3 = new JTextField(5);
          
         
        //tamanho e cor
        rotulo1.setBounds(60, 10, 400, 20);
        rotulo1. setForeground(Color.black);
        
        rotulo2.setBounds(50, 40, 100, 20);
         rotulo2. setForeground(Color.black);
         
         
        rotulo3.setBounds(50, 80, 100, 20);
         rotulo3. setForeground(Color.black);
        
        rotulo4.setBounds(50,120, 100, 20);
         rotulo4. setForeground(Color.black);
      
         
        calcular.setBounds(60, 180, 80, 20);
        calcular.setBackground(Color.gray);
        
        limpar.setBounds(160, 180, 80, 20);
         limpar.setBackground(Color.gray);
         
        sair.setBounds(260, 180, 80, 20);
         sair.setBackground(Color.gray);
         
        texto1.setBounds(120, 40, 80, 20);
        texto2.setBounds(120, 80, 80, 20);
        texto3.setBounds(120, 120, 80, 20);
      
        
        exibir.setBounds(60, 220, 300, 20);
            exibir.setForeground(Color.blue);
            
            exibir2.setBounds(60, 250, 150, 20);
               exibir2.setForeground(Color.magenta);
               
               exibir3.setBounds(60, 280, 150, 20);
               exibir3.setForeground(Color.pink);
               
              
//funções do botão
        calcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(texto1.getText());
            double b = Double.parseDouble(texto2.getText());
            double c = Double.parseDouble(texto3.getText());

            double delta = b * b - 4 * a * c;
            exibir.setText("O valor de delta é de: "+delta);
            if (delta >0) {
                double X1 = (-b + Math.sqrt(delta)) / (2 * a);
                double X2 = (-b - Math.sqrt(delta)) / (2 * a);

                exibir2.setText("O valor de x¹ é de: " + X1);
                exibir3.setText("O valor de x² é de: " + X2);
            } else {
                exibir.setText("Não existem raízes reais, pois delta é negativo.");
                exibir2.setText(null);
                exibir3.setText(null);
            }
        } catch (NumberFormatException ex) {
            exibir.setText("Erro: Por favor, insira apenas números válidos.");
            exibir2.setText("");
            exibir3.setText("");
        }
    }
});

        

          limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                       
                        texto1.setText(null);
                        texto2.setText(null);
                        texto3.setText(null);
                     
                        exibir.setText(null);
                        exibir2.setText(null);
                        exibir3.setText(null);
                        limpar.requestFocus();
                    }
                }
        );
        
    

     
   sair.addActionListener(
        
            new ActionListener(){
             
                public void actionPerformed(ActionEvent e){
                    
                   //sai da tela]
                   System.exit(0);
                }
            }
        );
       

      

        exibir.setVisible(true);
           exibir2.setVisible(true);


        //mostra os elementos na tela
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
         tela.add(exibir2);
         tela.add(exibir3);
       
        
        setSize(400, 390);
        setVisible(true);
       
    //centraliza a tela
       setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        exercicio02 app = new exercicio02();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


     
    

