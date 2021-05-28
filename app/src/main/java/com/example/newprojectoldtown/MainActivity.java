package com.example.newprojectoldtown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton(); // вызов функции(перезод нановую активность, страницу)
    }
    public void addListenerOnButton() {  // Функия
        // Находим кнопки по ID
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        // по нажатию накнопку происходит переход на след активность(страницу), используем Intent(Намерение (Intent) - это механизм для описания одной операции перейти по указанному адресу.)
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(".SecondActivity");
            startActivity(intent);
        });
        btn2.setOnClickListener(view -> {
            Intent intent = new Intent(".ThirdActivity");
            startActivity(intent);
        });
    }
    }
