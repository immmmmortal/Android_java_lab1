package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView selectedOptionTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectedOptionTextView = findViewById(R.id.selected_option_textview);
    }


    public void showOptions(View view) {
        final String[] options = {"Dark", "Light", "Filtered"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select an option");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedOption = options[which];
                if(selectedOption=="Light")
                    selectedOptionTextView.setText("Light");
                else if (selectedOption=="Dark")
                    selectedOptionTextView.setText("Dark");
                else if (selectedOption=="Filtered")
                    selectedOptionTextView.setText("filtered");
            }
        });
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }


}