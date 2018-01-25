# WebDevQuiz Android App

This is a small Quiz App that tests your knowledge on Web Development concepts. This was made for the Google Developer Challenge 2017-2018 as an assignment to practice with Java.

I took a minimalistic approach, following the project's rubric (https://review.udacity.com/#!/rubrics/158/view) and everything that was covered in the lessons so far, and came up with this short quiz.

It consists of a scrollable area that includes 7 questions about web technologies. The questions where inspired by the quizzes in the https://www.w3schools.com/ website, a perfect place to start learning web development. 

After the 7 questions, there is a button that, when pressed, displays a message (in a Toast, as per the rubric's requirement) that displays the total score of the quiz. Several messages are displayed, according to the score.

This is how the App behaves: (short video on Youtube)

[![WebDevQuiz App](http://img.youtube.com/vi/qUqUGlbBtgY/0.jpg)](https://youtu.be/qUqUGlbBtgY "WebDevQuiz App")

This is what the UI looks like on my device (Lenovo tablet Lollipop API22)

Portrait
![Udacity WebDevQuiz App Portrait](https://github.com/elisavetTriant/WebDevQuiz/blob/master/screenshots/Screenshot_Quiz_portrait.png "Udacity WebDevQuiz App Portrait")

Landscape
![Udacity WebDevQuiz App Landscape](https://github.com/elisavetTriant/WebDevQuiz/blob/master/screenshots/Screenshot_Quiz_landscape.png "Udacity WebDevQuiz App Landscape")

And here is what the layout xml code looks like (file app/src/main/res/layout/activity_main.xml, or https://github.com/elisavetTriant/WebDevQuiz/blob/master/app/src/main/res/layout/activity_main.xml):
```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorPrimaryLight"
    android:fillViewport="true"
    android:paddingBottom="@dimen/root_layout_padding_bottom"
    android:paddingTop="@dimen/root_layout_padding_top"
    tools:context="co.elisavet.quiz.MainActivity">

    <LinearLayout
        android:id="@+id/linear_layout_1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center_horizontal"
        android:orientation="vertical">

        <TextView
            style="@style/MessagesStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@string/welcome_message" />

        <!-- Question 1 -->
        <android.support.v7.widget.CardView
            android:id="@+id/card_view_question1"
            style="@style/CardViewStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <LinearLayout
                android:id="@+id/linear_layout_question1"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/question1_text_view"
                    style="@style/QuestionsStyle"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="@string/question1" />

                <RadioGroup
                    android:id="@+id/radio_group_1"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content">

                    <RadioButton
                        android:id="@+id/question1Answer1_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question1_answer1" />

                    <RadioButton
                        android:id="@+id/question1Answer2_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question1_answer2" />

                    <RadioButton
                        android:id="@+id/question1Answer3_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question1_answer3" />
                </RadioGroup>
            </LinearLayout>
        </android.support.v7.widget.CardView>

        <!-- Question 2 -->
        <android.support.v7.widget.CardView
            android:id="@+id/card_view_question2"
            style="@style/CardViewStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <LinearLayout
                android:id="@+id/linear_layout_question2"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/question2_text_view"
                    style="@style/QuestionsStyle"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="@string/question2" />

                <RadioGroup
                    android:id="@+id/radio_group_2"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content">

                    <RadioButton
                        android:id="@+id/question2Answer1_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question2_answer1" />

                    <RadioButton
                        android:id="@+id/question2Answer2_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question2_answer2" />

                    <RadioButton
                        android:id="@+id/question2Answer3_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question2_answer3" />

                    <RadioButton
                        android:id="@+id/question2Answer4_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question2_answer4" />
                </RadioGroup>
            </LinearLayout>
        </android.support.v7.widget.CardView>

        <!-- Question 3 -->
        <android.support.v7.widget.CardView
            android:id="@+id/card_view_question3"
            style="@style/CardViewStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <LinearLayout
                android:id="@+id/linear_layout_question3"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/question3_text_view"
                    style="@style/QuestionsStyle"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="@string/question3" />

                <RadioGroup
                    android:id="@+id/radio_group_3"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content">

                    <RadioButton
                        android:id="@+id/question3Answer1_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question3_answer1" />

                    <RadioButton
                        android:id="@+id/question3Answer2_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question3_answer2" />

                    <RadioButton
                        android:id="@+id/question3Answer3_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question3_answer3" />

                    <RadioButton
                        android:id="@+id/question3Answer4_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question3_answer4" />
                </RadioGroup>
            </LinearLayout>
        </android.support.v7.widget.CardView>

        <!-- Question 4 -->
        <android.support.v7.widget.CardView
            android:id="@+id/card_view_question4"
            style="@style/CardViewStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <LinearLayout
                android:id="@+id/linear_layout_question4"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/question4_text_view"
                    style="@style/QuestionsStyle"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="@string/question4" />

                <RadioGroup
                    android:id="@+id/radio_group_4"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content">

                    <RadioButton
                        android:id="@+id/question4Answer1_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question4_answer1" />

                    <RadioButton
                        android:id="@+id/question4Answer2_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question4_answer2" />

                    <RadioButton
                        android:id="@+id/question4Answer3_radio"
                        style="@style/AnswersStyle"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/question4_answer3" />
                </RadioGroup>
            </LinearLayout>
        </android.support.v7.widget.CardView>

        <!-- Question 5 -->
        <android.support.v7.widget.CardView
            android:id="@+id/card_view_question5"
            style="@style/CardViewStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <LinearLayout
                android:id="@+id/linear_layout_question5"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/question5_text_view"
                    style="@style/QuestionsStyle"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="@string/question5" />

                <CheckBox
                    android:id="@+id/question5Answer1_checkbox"
                    style="@style/AnswersStyle"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/question5_answer1" />

                <CheckBox
                    android:id="@+id/question5Answer2_checkbox"
                    style="@style/AnswersStyle"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/question5_answer2" />

                <CheckBox
                    android:id="@+id/question5Answer3_checkbox"
                    style="@style/AnswersStyle"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/question5_answer3" />

                <CheckBox
                    android:id="@+id/question5Answer4_checkbox"
                    style="@style/AnswersStyle"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/question5_answer4" />


            </LinearLayout>
        </android.support.v7.widget.CardView>

        <!-- Question 6 -->
        <android.support.v7.widget.CardView
            android:id="@+id/card_view_question6"
            style="@style/CardViewStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <LinearLayout
                android:id="@+id/linear_layout_question6"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/question6_text_view"
                    style="@style/QuestionsStyle"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="@string/question6" />

                <CheckBox
                    android:id="@+id/question6Answer1_checkbox"
                    style="@style/AnswersStyle"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/question6_answer1" />

                <CheckBox
                    android:id="@+id/question6Answer2_checkbox"
                    style="@style/AnswersStyle"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/question6_answer2" />

                <CheckBox
                    android:id="@+id/question6Answer3_checkbox"
                    style="@style/AnswersStyle"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/question6_answer3" />

                <CheckBox
                    android:id="@+id/question6Answer4_checkbox"
                    style="@style/AnswersStyle"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/question6_answer4" />


            </LinearLayout>
        </android.support.v7.widget.CardView>

        <!-- Question 7 -->
        <android.support.v7.widget.CardView
            android:id="@+id/card_view_question7"
            style="@style/CardViewStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <LinearLayout
                android:id="@+id/linear_layout_question7"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/question7_text_view"
                    style="@style/QuestionsStyle"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="@string/question7" />

                <EditText
                    android:id="@+id/question7Answer_edittext"
                    style="@style/EditTextAnswersStyle"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:hint="@string/question7_answer_hint" />


            </LinearLayout>
        </android.support.v7.widget.CardView>

        <Button
            android:id="@+id/submit_button"
            style="@style/ButtonStyle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:onClick="submitQuiz"
            android:text="@string/submit_button" />

    </LinearLayout>
</ScrollView>
```
Don't forget to take a look at the resources folder ( /app/res/values ) and take a look at the code there also. For instance the styles.xml code looks like this:
```xml
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

    <style name="MessagesStyle">
        <item name="android:textSize">@dimen/messages_font_size</item>
        <item name="android:padding">@dimen/messages_padding</item>
        <item name="android:layout_margin">@dimen/messages_margin</item>
        <item name="android:gravity">center</item>
        <item name="android:fontFamily">sans-serif</item>
        <item name="android:textColor">@color/colorPrimaryText</item>
        <item name="android:background">@color/colorIcons</item>
    </style>

    <style name="CardViewStyle" parent="CardView">
        <item name="android:layout_margin">@dimen/card_margin</item>
        <item name="cardCornerRadius">@dimen/card_radius</item>
        <item name="cardElevation">@dimen/card_elevation</item>
        <item name="cardBackgroundColor">@color/colorIcons</item>
    </style>

    <style name="QuestionsStyle">
        <item name="android:gravity">center</item>
        <item name="android:textSize">@dimen/questions_font_size</item>
        <item name="android:padding">@dimen/questions_padding</item>
        <item name="android:background">@color/colorPrimary</item>
        <item name="android:textColor">@color/colorIcons</item>
    </style>

    <style name="AnswersStyle">
        <item name="android:textColor">@color/colorPrimaryText</item>
        <item name="android:buttonTint">@color/colorPrimaryText</item>
        <item name="android:textSize">@dimen/answers_font_size</item>
        <item name="android:padding">@dimen/answers_padding</item>
        <item name="android:layout_marginLeft">@dimen/answers_margin</item>
    </style>

    <style name="EditTextAnswersStyle">
        <item name="android:background">@color/colorIcons</item>
        <item name="android:textColor">@color/colorPrimaryText</item>
        <item name="android:textSize">@dimen/answers_font_size</item>
        <item name="android:padding">@dimen/answers_padding</item>
        <item name="android:layout_margin">@dimen/answers_margin</item>
    </style>

    <style name="ButtonStyle">
        <item name="android:gravity">center</item>
        <item name="android:textSize">@dimen/questions_font_size</item>
        <item name="android:padding">@dimen/questions_padding</item>
        <item name="android:layout_margin">@dimen/card_margin</item>
        <item name="android:background">@color/colorPrimaryDark</item>
        <item name="android:textColor">@color/colorIcons</item>
    </style>

</resources>
```
And the strings.xml looks like this:
```xml
<resources xmlns:xliff="urn:oasis:names:tc:xliff:document:1.2">
    <string name="app_name">Web Development Quiz</string>
    <string name="welcome_message">Welcome to the Web Development Quiz!</string>
    <string name="question1">1. What does HTML stand for?</string>
    <string name="question1_answer1">Hyper Text Markup Language</string>
    <string name="question1_answer2">Hyperlinks and Text Markup Language</string>
    <string name="question1_answer3">Home Tool Markup Language</string>
    <string name="question2">2. Who is making the Web standards?</string>
    <string name="question2_answer1">Google</string>
    <string name="question2_answer2">The World Wide Web Consortium</string>
    <string name="question2_answer3">Microsoft</string>
    <string name="question2_answer4">Mozilla</string>
    <string name="question3">3. What does CSS stand for?</string>
    <string name="question3_answer1">Creative Style Sheets</string>
    <string name="question3_answer2">Cascading Style Sheets</string>
    <string name="question3_answer3">Computer Style Sheets</string>
    <string name="question3_answer4">Colorful Style Sheets</string>
    <string name="question4">4. Where in an HTML document is the correct place to refer to an external style sheet?</string>
    <string name="question4_answer1">At the end of the document</string>
    <string name="question4_answer2"><![CDATA[In the <body> section]]></string>
    <string name="question4_answer3"><![CDATA[In the <head> section]]></string>
    <string name="question5">5. What does PHP stand or stood for?</string>
    <string name="question5_answer1">Personal Hypertext Processor</string>
    <string name="question5_answer2">PHP: Hypertext Preprocessor</string>
    <string name="question5_answer3">Private Home Page</string>
    <string name="question5_answer4">Personal Home Page</string>
    <string name="question6">6. PHP server scripts are surrounded by delimiters, which?</string>
    <string name="question6_answer1"><![CDATA[<?php...?>]]></string>
    <string name="question6_answer2"><![CDATA[<?php>...</?>]]></string>
    <string name="question6_answer3"><![CDATA[<script>...</script>]]></string>
    <string name="question6_answer4"><![CDATA[<?...?>]]></string>
    <string name="question7">7. How do you write \"Hello World\" in PHP?</string>
    <string name="question7_correct_answer1">echo \"Hello World\";</string>
    <string name="question7_correct_answer2">echo \'Hello World\';</string>
    <string name="question7_answer_hint">Your Code Here</string>
    <string name="submit_button">Submit!</string>
    <string name="result_good_job">Your score is <xliff:g id="score1" example="60">%d</xliff:g>%%! You rock!</string>
    <string name="result_try_harder">Your score is <xliff:g id="score2" example="20">%d</xliff:g>%%! Try Harder!</string>
    <string name="result_ninja">Your score is <xliff:g id="score3" example="100">%d</xliff:g>%%! Wow you got everything right! You are a Ninja!</string>
</resources>
```

The java code looks like this (https://github.com/elisavetTriant/WebDevQuiz/blob/master/app/src/main/java/com/example/android/webdevquiz/MainActivity.java
```java
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
        }

        if (score >= 40 && score <= 90){
            displayToastMessage(getString(R.string.result_good_job, score));
        }

        if (score == 100){
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
         if (q7aEdit.getText().toString().equals(getString(R.string.question7_correct_answer1)) || q7aEdit.getText().toString().equals(getString(R.string.question7_correct_answer2))) {
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
```
