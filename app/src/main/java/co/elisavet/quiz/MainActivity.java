package co.elisavet.quiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //UI objects
    private RadioButton q1a1Radio;
    private RadioButton q2a2Radio;
    private RadioButton q3a2Radio;
    private RadioButton q4a3Radio;
    private CheckBox q5a1Check;
    private CheckBox q5a2Check;
    private CheckBox q5a3Check;
    private CheckBox q5a4Check;
    private CheckBox q6a1Check;
    private CheckBox q6a2Check;
    private CheckBox q6a3Check;
    private CheckBox q6a4Check;
    private EditText q7aEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize
        //question 1 - Multiple choice, one right answer
        q1a1Radio = (RadioButton) findViewById(R.id.question1Answer1_radio);
        //question 2 - Multiple choice, one right answer
        q2a2Radio = (RadioButton) findViewById(R.id.question2Answer2_radio);
        //question 3 - Multiple choice, one right answer
        q3a2Radio = (RadioButton) findViewById(R.id.question3Answer2_radio);
        //question 4 - Multiple choice, one right answer
        q4a3Radio = (RadioButton) findViewById(R.id.question4Answer3_radio);
        //question 5 - Multiple choice, more than one right answers
        q5a1Check = (CheckBox) findViewById(R.id.question5Answer1_checkbox);
        q5a2Check = (CheckBox) findViewById(R.id.question5Answer2_checkbox);
        q5a3Check = (CheckBox) findViewById(R.id.question5Answer3_checkbox);
        q5a4Check = (CheckBox) findViewById(R.id.question5Answer4_checkbox);
        //question 6 - Multiple choice, more than one right answers
        q6a1Check = (CheckBox) findViewById(R.id.question6Answer1_checkbox);
        q6a2Check = (CheckBox) findViewById(R.id.question6Answer2_checkbox);
        q6a3Check = (CheckBox) findViewById(R.id.question6Answer3_checkbox);
        q6a4Check = (CheckBox) findViewById(R.id.question6Answer4_checkbox);
        //question 7 - free text response
        q7aEdit = (EditText) findViewById(R.id.question7Answer_edittext);

    }

    /* This method is called when the submit quiz button is pressed
     * @params view
    */
    public void submitQuiz(View view) {
        int score = handleGrading();

        if ( score <= 30) {
            displayToastMessage(getString(R.string.result_try_harder, score));
        } else if (score >= 40 && score <= 90){
            displayToastMessage(getString(R.string.result_good_job, score));
        } else {
            displayToastMessage(getString(R.string.result_ninja, score));
        }

    }

    /*
     * This method handles the Grading Logic
     * Return total points
    */
     private int handleGrading(){
        //Declare and initialize var. If no question is answered the total score will be 0
         int points = 0;

         //Question 1 Correct answer: Answer1
         if (q1a1Radio.isChecked()){
             //award +1 point!
             points +=1;
         }
         //Question 2 Correct answer: Answer2
         if (q2a2Radio.isChecked()){
             //award +1 point!
             points +=1;
         }
         //Question 3 Correct answer: Answer2
         if (q3a2Radio.isChecked()){
             //award +1 point!
             points +=1;
         }
         //Question 4 Correct answer: Answer3
         if (q4a3Radio.isChecked()){
             //award +1 point!
             points +=1;
         }
         //Question 5 Correct answers: Answer2, Answer4
         if (!q5a1Check.isChecked() && q5a2Check.isChecked() && !q5a3Check.isChecked() && q5a4Check.isChecked()){
             //award +2 points!
             points +=2;
         }
         //Question 6 Correct answers: Answer1, Answer4
         if (q6a1Check.isChecked() && !q6a2Check.isChecked() && !q6a3Check.isChecked() && q6a4Check.isChecked()){
             //award +2 points!
             points +=2;
         }
         //Question 7 Correct answer: echo "Hello World"; OR echo 'Hello World';
         if (q7aEdit.getText().toString().trim().equals(getString(R.string.question7_correct_answer1)) || q7aEdit.getText().toString().trim().equals(getString(R.string.question7_correct_answer2))) {
             //award +2 points!
             points +=2;
         }
         //Will display in percentage
         points *= 10;

         return points;
     }

    //https://developer.android.com/guide/topics/ui/notifiers/toasts.html
    private void displayToastMessage(String message) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

}