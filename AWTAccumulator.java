import java.awt.*;        // S? d?ng các kho ch?a AWT và các thành ph?n 
import java.awt.event.*;  // S? d?ng các l?p s? ki?n AWT và giao di?n ngu?i nghe
 

public class AWTAccumulator extends Frame implements ActionListener {
   private Label lblInput;    
   private Label lblOutput;   
   private TextField tfInput;  
   private TextField tfOutput; 
   private int sum = 0;        
 
   
   public AWTAccumulator() {
      setLayout(new FlowLayout());
         
 
      lblInput = new Label("Enter an Integer: "); 
      add(lblInput);              
 
      tfInput = new TextField(10); 
      add(tfInput);               
 
      tfInput.addActionListener(this);
         
 
      lblOutput = new Label("The Accumulated Sum is: ");  
      add(lblOutput);              
 
      tfOutput = new TextField(10); 
      tfOutput.setEditable(false);  
      add(tfOutput);                
 
      setTitle("AWT Accumulator");  
      setSize(350, 120);  
      setVisible(true);  
   }
 
  
   public static void main(String[] args) {
      
      new AWTAccumulator();
   }
 
   // ActionEvent handler - Called back upon hitting "enter" key on TextField
   @Override
   public void actionPerformed(ActionEvent evt) {
     
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      
      tfInput.setText("");  
      tfOutput.setText(sum + ""); 
                                  
   }
}