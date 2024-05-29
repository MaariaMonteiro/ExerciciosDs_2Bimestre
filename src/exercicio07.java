import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class exercicio07 extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5,rotulo6,rotulo7,rotulo8,rotulo9,rotulo10,rotulo11,rotulo12;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6;
    JFormattedTextField formattedCep, formattedCel,formattedTel, formattedData, formattedData2;
    MaskFormatter mascara_cep, mascaraCel, mascara_tel , mascara_data, mascara_data2;
    JButton incluir, limpar, sair;

    public exercicio07() {
        super("Sistema de cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
         ImageIcon tela1= new ImageIcon("cadastro.png");
                setIconImage(tela1.getImage());
        
        tela.setBackground(Color.white);

        rotulo1 = new JLabel("Faça seu cadastro:");
        rotulo1.setFont(new Font("Calisto MT", Font.BOLD, 28));

        rotulo2 = new JLabel("Codigo do cliente:");
        rotulo2.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo3 = new JLabel("Nome do cliente:");
        rotulo3.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo4 = new JLabel("Endereço:");
        rotulo4.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo5 = new JLabel("Bairro:");
        rotulo5.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo6 = new JLabel("Cidade:");
        rotulo6.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo7 = new JLabel("Estado:");
        rotulo7.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo8 = new JLabel("Cep:");
        rotulo8.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo9 = new JLabel("Celular:");
        rotulo9.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo10 = new JLabel("Telefone:");
        rotulo10.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo11 = new JLabel("Data de nascimento:");
        rotulo11.setFont(new Font("Calisto MT", Font.BOLD, 12));

        rotulo12 = new JLabel("Data de cadastro:");
        rotulo12.setFont(new Font("Calisto MT", Font.BOLD, 12));

        try {
            mascara_cep = new MaskFormatter("#####-###");
            mascara_tel = new MaskFormatter("##)####-####");
           mascaraCel = new MaskFormatter("## #####-####");
            mascara_data = new MaskFormatter("##/##/####");
            mascara_data2 = new MaskFormatter("##/##/####");

            mascara_cep.setPlaceholderCharacter('_');
            mascara_tel.setPlaceholderCharacter('_');
            mascaraCel.setPlaceholderCharacter('_');
            mascara_data.setPlaceholderCharacter('_');
            mascara_data2.setPlaceholderCharacter('_');

        } catch(ParseException excp) {}

        formattedCep = new JFormattedTextField(mascara_cep);
        formattedTel = new JFormattedTextField(mascara_tel);
        formattedCel = new JFormattedTextField(mascaraCel);
        formattedData = new JFormattedTextField(mascara_data);
        formattedData2 = new JFormattedTextField(mascara_data2);

        incluir = new JButton("Incluir");
        limpar = new JButton("Limpar");
        sair = new JButton("Sair");

        texto1 = new JTextField(5);
        texto2 = new JTextField(20);
        texto3 = new JTextField(20);
        texto4 = new JTextField(20);
        texto5 = new JTextField(20);
        texto6 = new JTextField(20);

        rotulo1.setBounds(110, 5, 500, 50);
        rotulo2.setBounds(50, 60, 200, 20);
        rotulo3.setBounds(50, 100, 200, 20);
        rotulo4.setBounds(50, 140, 200, 20);
        rotulo5.setBounds(50, 180, 200, 20);
        rotulo6.setBounds(50, 220, 200, 20);
        rotulo7.setBounds(50, 260, 200, 20);
        rotulo8.setBounds(50, 300, 200, 20);
        rotulo9.setBounds(50, 340, 200, 20);
        rotulo10.setBounds(50, 380, 200, 20);
        rotulo11.setBounds(50, 420, 200, 20);
        rotulo12.setBounds(50, 460, 200, 20);

        incluir.setBounds(80, 520, 80, 20);
        limpar.setBounds(190, 520, 80, 20);
        sair.setBounds(300, 520, 80, 20);

        texto1.setBounds(200, 60, 80, 20);
        texto2.setBounds(200, 100, 200, 20);
        texto3.setBounds(200, 140, 200, 20);
        texto4.setBounds(200, 180, 200, 20);
        texto5.setBounds(200, 220, 200, 20);
        texto6.setBounds(200, 260, 200, 20);
        formattedCep.setBounds(200, 300, 200, 20);
        formattedCel.setBounds(200, 340,200,20);
        formattedTel.setBounds(200, 380, 200, 20);
        formattedData.setBounds(200, 420, 200, 20);
        formattedData2.setBounds(200, 460, 200, 20);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        tela.add(rotulo9);
        tela.add(rotulo10);
        tela.add(rotulo11);
        tela.add(rotulo12);

        tela.add(incluir);
        tela.add(limpar);
        tela.add(sair);

        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(formattedCep);
        tela.add(formattedCel);
        tela.add(formattedTel);
        tela.add(formattedData);
        tela.add(formattedData2);

        setSize(400, 600);
        setVisible(true);

        incluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int cod = Integer.parseInt(texto1.getText());
                    String nome = texto2.getText();
                    String endereco= texto3.getText();
                    String bairro = texto4.getText();
                    String cidade = texto5.getText();
                    String estado = texto6.getText();
                    String cep = formattedCep.getText();
                    String cel = formattedCel.getText();
                    String tel = formattedTel.getText();
                    String dataNascimento = formattedData.getText();
                    String datacadastro = formattedData2.getText();
                    
                    
JOptionPane.showMessageDialog(null, "Veja os dados \n Nome:" + nome + "\n Endereço: " + endereco + "\n bairro: " + bairro + "\n Cidade: " + cidade + "\n estado: " + estado + "\n Cep: " + cep + "\n celular: " + cel + "\n telefone: " + tel + "\n Data de nascimento: " + dataNascimento + "\n Data de cadastro: " + datacadastro);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: Cadastro do cliente inválido.");
                }
            }
        });

        limpar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto1.setText("");
                texto2.setText("");
                texto3.setText("");
                texto4.setText("");
                texto5.setText("");
                texto6.setText("");
                formattedCep.setText("");
                formattedTel.setText("");
                formattedData.setText("");
               formattedData2.setText("");

                
            }
        });

        sair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
           setSize(450, 600);
                   setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        exercicio07 app = new exercicio07();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
