package me.dmdhrumilmistry.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button submit_button;
    private TextView result_text_view;
    private EditText kg_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit_button = findViewById(R.id.button);
        result_text_view = findViewById(R.id.textView);
        kg_value = findViewById(R.id.kgValueEditText);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Computing Values", Toast.LENGTH_SHORT).show();
                String kg_str_value = kg_value.getText().toString();
                Integer int_kg_value = Integer.parseInt(kg_str_value);
                Double pound_value = int_kg_value * 2.205;
                result_text_view.setText("Value in Pound : " + pound_value);
            }
        });
    }
}