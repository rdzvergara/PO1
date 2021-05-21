import javax.swing.*;
import java.awl.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora implements ActionListener{

    private JFrame janela;
    private JPanel painel;
    private JLabel lbltitulo;
    private JLabel lblNum1;
    private JLabel lblNum2;
    private JLabel lblResult;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSomar;
    private JButton btnDiv;
    private JButton btnMult;
    private JButton btnSub;

    public Calculadora(){
        janela= new JFrame();
        painel= new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        painel.setLayout(new FlowLayout(0,1));

        lbltitulo= new JLabel("Calculadora");
        lbltitulo.setFont(new Font("Arial",Font.BOLD,20));
        painel.add(lbltitulo);

        lblNum1 = new JLabel("Numero 1:");
        painel.add(lblNum1);
        txtNum1= new JTextField("0");
        painel.add(txtNum1);
        lblNum2 = new JLabel("Numero 2:");
        painel.add(lblNum2);
        txtNum2= new JTextField("0");
        painel.add(txtNum2);

        btnSomar= new JButton("Somar");
        btnSomar.addActionListener(this);
        painel.add(btnSomar);
        btnDiv= new JButton("Dividir");
        btnDiv.addActionListener(this);
        painel.add(btnDiv);
        btnMult= new JButton("Multiplicar");
        btnMult.addActionListener(this);
        painel.add(btnMult);
        btnSub= new JButton("Subtrair");
        btnSub.addActionListener(this);
        painel.add(btnSub);
        lblResult= new JLabel("Resultado = ");
        lblResult.setFont(new Font("Arial",Font.BOLD,20));
        lblResult.setForeground(Color.MAGENTA);
        painel.add(lblResult);

        janela.add(painel, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Calculadora Digital");
        janela.size(300,300);
        janela.pack();
        janela.setVisible(true);
    }
        public static void main(String[] args){
            new Calculadora();
        }
        @Override
        public void actionPerformed(ActionEvent e){
            Matematica mat= new Matematica();

            try{
            Integer num1= Integer.parseInt(txtNum1.getText());
            Integer num2= Integer.parseInt(txtNum2.getText());
            if(e.getActionCommand().equals("somar")){
            lblResult.setText("Resultado = "+ mat.somar(num1,num2));
            } else if (e.getActionCommand().equals("dividir")){
            lblResult.setText("Resultado = "+ mat.dividir(num1,num2));
            } else if (e.getActionCommand().equals("multiplicar")){
            lblResult.setText("Resultado = "+ mat.mult(num1,num2));
            }else{
            lblResult.setText("Resultado = "+ mat.subt(num1,num2));
            }
            }catch (NumberFormatException e1){
                lblResult.setText("Digite apenas números");
                System.out.println(e1.getMessage());
            } catch (Exception e2){
                System.out.println(e2.getMessage());
            }


    
}
}