package com.example.quze2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText salary;
    Spinner option;
    ListView list;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        salary = findViewById(R.id.salary);
        option = findViewById(R.id.spinner);
        list = findViewById(R.id.list1);
        add = findViewById(R.id.addButton);
        add.setOnClickListener(v -> addEmployees());

    }


    public void addEmployees() {
//        Employee e = new Employee();
        String nameE= name.getText().toString();
        String salaryE = salary.getText().toString();
        float salaryE1 =  Float.parseFloat(salaryE);
        ArrayList<String> s = new ArrayList<>();
        s.add("Full Time");
        s.add("Part Time");
        ArrayAdapter<String> a = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,s);
        option.setAdapter(a);
        String timeE = option.getSelectedItem().toString();
        Employee e = new Employee(nameE,salaryE1,timeE);

    }
}