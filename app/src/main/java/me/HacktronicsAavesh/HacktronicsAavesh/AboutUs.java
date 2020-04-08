package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import me.HacktronicsAavesh.bottomnavbar.R;

public class AboutUs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        ImageButton FirstMail = (ImageButton) findViewById(R.id.mail1);

        FirstMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, "coronavirus@gmail.com" );
                intent.putExtra(Intent.EXTRA_SUBJECT, "");
                intent.putExtra(Intent.EXTRA_STREAM, "");

                startActivity(intent);


            }
        });

        ImageButton SecondMail = (ImageButton) findViewById(R.id.mail2);
        SecondMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, "coronavirus@gmail.com" );
                intent.putExtra(Intent.EXTRA_SUBJECT, "");
                intent.putExtra(Intent.EXTRA_STREAM, "");

                startActivity(intent);



            }
        });

        ImageButton FirstContact = (ImageButton) findViewById(R.id.Phone1);
        FirstContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String number = "9521747405";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9521747405"));
                startActivity(callIntent);
            }
        });
        ImageButton SecondContact = (ImageButton)findViewById(R.id.Phone2);
        SecondContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   String number = "9521747405";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9521747405"));
                startActivity(callIntent);
            }
        });

    }
}
