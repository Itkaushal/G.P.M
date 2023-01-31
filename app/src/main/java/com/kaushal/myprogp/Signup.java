package com.kaushal.myprogp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Signup extends AppCompatActivity {
    EditText sname,semail,smobile,senrollment,sprofession,sgender;
    FirebaseDatabase firebaseDatabase;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        sname=findViewById(R.id.txt_1);
        semail=findViewById(R.id.txt_2);
        smobile=findViewById(R.id.txt_3);
        senrollment=findViewById(R.id.txt_4);
        sprofession=findViewById(R.id.txt_5);
        sgender=findViewById(R.id.txt_6);
        button=findViewById(R.id.btn_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=sname.getText().toString().trim();
                String uemail=semail.getText().toString().trim();
                String umobile=smobile.getText().toString().trim();
                String uenrollment=senrollment.getText().toString().trim();
                String uprofession=sprofession.getText().toString().trim();
                String ugender=sgender.getText().toString().trim();
                String ubutton=button.getText().toString().trim();
                 firebaseDatabase= FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = firebaseDatabase.getReference("user");
                Gatter gatter=new Gatter(uname,uemail,umobile,uenrollment,uprofession,ugender);
                databaseReference.child(uname).setValue(gatter);
                getSupportActionBar().hide();
                Toast.makeText(Signup.this, "successfull", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),login.class);
                startActivity(i);

                //--------------------------------------------------
//                Query ashish=databaseReference.child(uemail).child("email").equalTo(uemail);
//               ashish.addListenerForSingleValueEvent(new ValueEventListener() {
//                   @Override
//                   public void onDataChange(@NonNull DataSnapshot snapshot) {
//                       if (snapshot.exists()){
//                           String pass=snapshot.child("password").getValue(String.class);
//                           Intent intent=new Intent();
//                           intent.putExtra("pass",pass);
                //--------------------------------------------
//                           String passs=intent.getStringExtra("pass");
//                       }
//                  }
//
//                   @Override
//                   public void onCancelled(@NonNull DatabaseError error) {
//
//                   }
//               });
                //========================================================
            }
        });

    }

}