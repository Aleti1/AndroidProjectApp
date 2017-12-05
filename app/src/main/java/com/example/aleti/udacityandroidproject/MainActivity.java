package com.example.aleti.udacityandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        description_page();
        products_Page();
        contact_Page();
    }

    // i needed to learn java so i can make buttons work on my app.
    //link with java courses: https://classroom.udacity.com/courses/ud282#


    /** When button in app is clicked on, will open a new page
     *  takes no input parameters
     *  @return opens a new xml page in android app
     */
    public Button description_text;
    public void description_page(){
        description_text = (Button)findViewById(R.id.description_text);
        description_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first_page = new Intent(MainActivity.this,DescriptionActivity.class);
                startActivity(first_page);
            }
        });
    }
    public Button product_text;
    public void products_Page(){
        product_text = (Button)findViewById(R.id.product_text);
        product_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second_page = new Intent (MainActivity.this,products.class);
                startActivity(second_page);
            }
        });
    }
    public Button contact_text;
    public void contact_Page(){
        contact_text = (Button)findViewById(R.id.contact_text);
        contact_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent third_page = new Intent (MainActivity.this,contact.class);
                startActivity(third_page);
            }
        });
    }
}
