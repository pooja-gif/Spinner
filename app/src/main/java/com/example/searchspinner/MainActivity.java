package com.example.searchspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner_search);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.mobile_manufacturers,android.R.layout.select_dialog_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getSelectedItem().toString();
        switch (selectedItem){
            case "Select one Item":
                break;
            case "Samsung":
                Toast.makeText(getApplicationContext(), selectedItem + " in Korean means 3 Stars!", Toast.LENGTH_SHORT).show();
                break;
            case "Foxconn":
                Toast.makeText(getApplicationContext(), selectedItem + " is world's largest contract electronics manufacturer", Toast.LENGTH_SHORT).show();
                break;
            case "Apple":
                Toast.makeText(getApplicationContext(), selectedItem + " was founded in 1976!", Toast.LENGTH_SHORT).show();
                break;
            case "Oppo":
                Toast.makeText(getApplicationContext(), selectedItem + " made first phone that can make 50MP photos", Toast.LENGTH_SHORT).show();
                break;
            case "Nokia":
                Toast.makeText(getApplicationContext(), selectedItem + " was founded 151 years ago!", Toast.LENGTH_SHORT).show();
                break;
            case "LYF":
                Toast.makeText(getApplicationContext(), selectedItem + " is an Indian Mobile Handset company", Toast.LENGTH_SHORT).show();
                break;
            case "Xiaomi":
                Toast.makeText(getApplicationContext(), selectedItem + " is world's 4th largest smartphone maker!", Toast.LENGTH_SHORT).show();
                break;
            case "Huawei":
                Toast.makeText(getApplicationContext(), selectedItem + " is largest telecommunications equipment manufacturer in the World! ", Toast.LENGTH_SHORT).show();
                break;
            case "Asus":
                Toast.makeText(getApplicationContext(), selectedItem + " name came from word PEGASUS", Toast.LENGTH_SHORT).show();
                break;
            case "Lenovo":
                Toast.makeText(getApplicationContext(), selectedItem + " is largest PC vendor by unit sales", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
