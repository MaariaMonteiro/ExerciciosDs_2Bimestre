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
import java.awt.event.*;//importando as classes

public class exercicio04 extends JFrame //extende o jFrame
{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4,  exibir, exibir1, exibir2, exibir3;
    JTextField texto1, texto2, texto3;
    JButton calcular, limpar, sair;

    public exercicio04() {
        super("Triângulos");//Titulo de cima  da página
        Container tela = getContentPane();

            
        setLayout(null);
                 tela.setBackground(Color.black);

                 //adiciona uma imagem ao icone
        ImageIcon tel = new ImageIcon("triangulo.jpg");
                setIconImage(tel.getImage());



         
         //da nomes ao rotulos
        rotulo1 = new JLabel("Digite as medidas para ver o tipo do triâgulo:");

        rotulo2 = new JLabel("lado a:");

        rotulo3 = new JLabel("lado b:");

        
        rotulo4= new JLabel("lado c:");

       
        //define as caracteristicas dos elementos
        exibir =  new JLabel("");
          exibir.setFont(new Font("Calisto MT", Font.BOLD, 12));
                      exibir.setForeground(Color.cyan);

                      
           //imagem dos tipos de triângulos
        ImageIcon equilatero = new ImageIcon("equilatero.png");
          exibir1= new JLabel(equilatero);
           exibir1.setBounds(60, 240, 300,200);
           exibir1.setVisible(false);
           
           ImageIcon isoceles = new ImageIcon("isoceles.png");
           exibir2= new JLabel(isoceles);
           exibir2.setBounds(60,260,300,200);
           exibir2.setVisible(false);
           
           ImageIcon escaleno = new ImageIcon("escaleno.png");
           exibir3= new JLabel (escaleno);
           exibir3.setBounds(60,280,300,200);
           exibir3.setVisible(false);
        

           //nome dos botoões
        calcular = new JButton("calcular");
        limpar = new JButton("limpar");
        sair = new JButton("sair");
        
        
          texto1 = new JTextField(5);
          texto2 = new JTextField(5);
          texto3 = new JTextField(5);
          
         
        //posicionamento
        rotulo1.setBounds(70, 10, 400, 20);
        //cor do rotulo
                rotulo1. setForeground(Color.white);
        
        rotulo2.setBounds(50, 60, 100, 20);
                rotulo2. setForeground(Color.gray);
         
         
        rotulo3.setBounds(50, 100, 100, 20);
                rotulo3. setForeground(Color.gray);
        
        rotulo4.setBounds(50,140, 100, 20);
                rotulo4. setForeground(Color.gray);
      
         
        calcular.setBounds(60, 180, 80, 20);
        calcular.setBackground(Color.gray);
        
        limpar.setBounds(160, 180, 80, 20);
         limpar.setBackground(Color.gray);
         
        sair.setBounds(260, 180, 80, 20);
         sair.setBackground(Color.gray);
         
        texto1.setBounds(120, 60, 80, 20);
        texto2.setBounds(120, 100, 80, 20);
        texto3.setBounds(120, 140, 80, 20);
      
        
        exibir.setBounds(60, 220, 300, 30);
            exibir.setForeground(Color.magenta);
            
               
              
          //função do botão
        calcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(texto1.getText());
            double b = Double.parseDouble(texto2.getText());
            double c = Double.parseDouble(texto3.getText());

            if (a==b && b==c) {
               
                exibir.setText("Tipo do triângulo: equilatero");
                //mostra a foto do triângulo de acordo com as medidas informadas
                exibir1.setVisible(true);
                exibir2.setVisible(false);
                exibir3.setVisible(false);
                
            }
            else if(a==b || b==c || c==a){
            exibir.setText("Tipo do triângulo : isóceles");
            exibir2.setVisible(true);
            exibir1.setVisible(false);
            exibir3.setVisible(false);
          
            
            }
            else if(a!=b && b!=c && c!=a){
               exibir.setText("Tipo do triângulo: Escaleno");
               exibir3.setVisible(true);
               exibir1.setVisible(false);
               exibir2.setVisible(false);
            }
            
            else {
                exibir.setText("triangulo inexistente!");
               
            }
        } catch (NumberFormatException ex) {
            exibir.setText("Erro: Por favor, insira apenas números válidos.");
        
        }
    }
});

        //funcao no botão de limpar

          limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                       
                        texto1.setText(null);
                        texto2.setText(null);
                        texto3.setText(null);
                     
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


        //adicionando os elementos na tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(exibir);
        tela.add(exibir1);
        tela.add(exibir2);
        tela.add(exibir3);
        tela.add(calcular);
        tela.add(limpar);
        tela.add(sair);
      
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
       
        
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        exercicio04 app = new exercicio04();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


     
    

