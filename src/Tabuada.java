import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Tabuada extends JFrame implements  WindowListener {
   JLabel lB;
   JButton botaoCalc;
   JButton botaoLimp;
   JButton botaoClose;
   JTextArea aAreaTexto;

    private JTextField fTexto = new JTextField(15);
    private JTextArea areaTexto = new JTextArea(5,20);
 
 public Tabuada() { 
     JFrame tela = new JFrame();
     setTitle("Tabuada");
     this.setResizable(false);
     getContentPane().setLayout(new BorderLayout()); 

    JLabel lB = new JLabel("Informe o número a calcular a tabuada:");
    JButton botaoCalc = new JButton("Calcular");
    JButton botaoLimp = new JButton("Limpar");
     fTexto.setText("0");
     fTexto.setForeground(Color.blue);
     areaTexto.setEditable(true);
     areaTexto.setLineWrap(true);
      JPanel pTopo = new JPanel();
          pTopo.add("East", lB);
          pTopo.add("West", fTexto);
      JPanel pCentro = new JPanel();
          pCentro.add("Center", areaTexto);
      JPanel pBotoes = new JPanel();
        pBotoes.setLayout(new FlowLayout()); 
        pBotoes.add(botaoCalc); 
        pBotoes.add(botaoLimp);

  //evento do botão para calcular
       ActionListener listAdd = new CalcularListner();     
         botaoCalc.addActionListener(listAdd);
      //botão limpar:
      ActionListener listLimp = new EventLimp();
         botaoLimp.addActionListener(listLimp);
         //botao sair
       getContentPane().add(pTopo, BorderLayout.NORTH);
       getContentPane().add(pCentro, BorderLayout.CENTER);
       getContentPane().add(pBotoes, BorderLayout.SOUTH);
    }    
  class CalcularListner implements ActionListener {
     public void actionPerformed(ActionEvent e) {
       int valor;
       int cont;
       String num;          
       String resultado = ""; 
        try {       
       num = fTexto.getText();   
        valor = Integer.parseInt(num);   
        for(int i = 1; i <= 10; i ++) {
        resultado += "\n" + i +"x" + valor + "=" + i * valor;   
        }
      areaTexto.append("Tabuada: \n" + resultado + "\n");
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Valor Inválido!",
           "Informações",JOptionPane.INFORMATION_MESSAGE);
        areaTexto.append("Valor inválido \n");
        }
        }
       }
  class EventLimp implements ActionListener {
      public void actionPerformed(ActionEvent e) {    
           fTexto.setText("");
           areaTexto.setText("");       
}
}
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public static void main(String[] args) {
            Tabuada tab = new Tabuada();
            tab.setSize(500,300);
            tab.setLocation(300,150);
            tab.setVisible(true);
            }
    }
