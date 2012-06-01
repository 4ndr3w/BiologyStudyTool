package lobos.andrew.science;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author andrew
 */
public class AnswerField implements ActionListener {
    private JTextField field = null;
    private final String correctAnswer;
    private final String infoText;
    private final TeachingToolGUI parentwindow;
    private int timesWrong = 0;
    private static int MAX_TIMES_WRONG = 5;
    
    public AnswerField(JTextField field, String correctAnswer, String infoText, TeachingToolGUI parentwindow)
    {
        this.field = field;
        this.correctAnswer = correctAnswer;
        this.infoText = infoText;
        this.parentwindow = parentwindow;      
        field.setText("");

        field.addActionListener(this);

        
    }
    
    public void reset()
    {
        field.setText("");
        field.setEnabled(true);
    }
    
    private void giveAnswer()
    {
        field.setText(correctAnswer);
        field.setEnabled(false);
        parentwindow.setHelpText("You have given the wrong answer "+timesWrong+" times.\n"
                + "The correct answer is "+correctAnswer+"\n"
                + infoText);
    }
    
    @Override
   public void actionPerformed(ActionEvent evt) 
   {
       if ( field.getText().equals(correctAnswer.toLowerCase()) )
       {
           parentwindow.setHelpText("Correct!\n"+infoText);
           field.setEnabled(false);
       }
       else
       {
           parentwindow.setHelpText(field.getText()+" is not correct.");
           field.setText("");
           timesWrong++;
           if ( timesWrong >= MAX_TIMES_WRONG )
               giveAnswer();
       }
   }
}
