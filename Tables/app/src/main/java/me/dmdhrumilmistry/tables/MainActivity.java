package me.dmdhrumilmistry.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare variables
        EditText number;
        Button calculate_btn;
        TextView table;

        // get variable using their ids
        calculate_btn = findViewById(R.id.calculate);
        number = findViewById(R.id.number);
        table = findViewById(R.id.table);

        // Perform computation when button pressed
        calculate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num = Integer.parseInt(number.getText().toString());

                    String table_values = "";
                    for (int i = 1; i <= 10; i++){
                        String row = String.format("%d x %d = %d\n", num, i, num*i);
                        table_values += row;
                    }

                    table.setText(table_values);

                }catch (Exception e){
                    table.setText("The entered value is not supported!\nPlease enter valid number");
                }
            }
        });
    }
}