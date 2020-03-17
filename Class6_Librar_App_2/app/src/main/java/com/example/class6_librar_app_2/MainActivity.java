package com.example.class6_librar_app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.class6_librar_app_2.model.BooksDataAccess;

public class MainActivity extends AppCompatActivity {
    private Spinner sprLangs;
    private TextView txtBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sprLangs = findViewById(R.id.sprLangs);
        txtBooks=findViewById(R.id.txtBooks);

    }

    public void btnGetBooks(View view) {
        String lang = sprLangs.getSelectedItem().toString();
        BooksDataAccess bda= new BooksDataAccess();

        txtBooks.setText( bda.getBookByLang(lang));

    }
}
