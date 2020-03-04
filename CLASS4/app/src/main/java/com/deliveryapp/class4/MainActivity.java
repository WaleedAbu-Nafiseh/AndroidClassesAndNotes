package com.deliveryapp.class4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchClicked(View view) {
        Switch swt = (Switch) view ;
        if (swt.isChecked()){
            printInfo("Switch is on");
        }
        else{
            printInfo("Switch is off");
        }

    }

    private void printInfo(String message) {
        Toast.makeText(this,message ,Toast.LENGTH_LONG).show();
    }

    public void btnClicked(View view) {
        printInfo("You clicked the NORMALLL BUTTONN");
    }

    public void imgBtnClicked(View view) {
        printInfo("You clicked the IMAGEEE BUTTONN");
    }

    public void chkBox1isClicked(View view) {
        CheckBox checkBox1 = (CheckBox)view;
        if(checkBox1.isChecked()){
            printInfo("Check box option 1 is clicked");
        }
        else{
            printInfo("CHeckbox1 is not checkled");
        }
    }
    public void chkBox2isClicked(View view) {
        CheckBox checkBox2 = (CheckBox)view;
        if(checkBox2.isChecked()){
            printInfo("Check box option 2 is clicked");
        }
        else{
            printInfo("CHeckbox2 is not checkled");
        }
    }

    public void rdioBtnOption1(View view) {
        RadioButton radioButton =(RadioButton) view;
        if(radioButton.isChecked()){
            printInfo("RadioButton option 1 is clicked");
        }else{
            printInfo("RadioButton option 1 is NOT  clicked");
        }
    }
    public void rdioBtnOption2(View view) {
        RadioButton radioButton =(RadioButton) view;
        if(radioButton.isChecked()){
            printInfo("RadioButton option 2 is clicked");
        }else{
            printInfo("RadioButton option 2 is NOT  clicked");
        }
    }
}
