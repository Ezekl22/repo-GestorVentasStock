package productos;
import javax.swing.*;

public class MainProductos extends JFrame {

	  private JTextField textfield1;
	  private JScrollPane scrollpane1;
	  private JTextArea textarea1;
	  
	  public MainProductos(){
	    setLayout(null);
	    textfield1 = new JTextField();
	    textfield1.setBounds(10,10,200,30);
	    add(textfield1);

	    textarea1 = new JTextArea();
	    scrollpane1 = new JScrollPane(textarea1);
	    scrollpane1.setBounds(10,50,400,300);
	    add(scrollpane1);
	  }
	  public static void main(String args[]){
		MainProductos formulario1 = new MainProductos();
	    formulario1.setBounds(0,0,740,700);
	    formulario1.setVisible(true);
	    formulario1.setResizable(false);
	    formulario1.setLocationRelativeTo(null);
	  }
}