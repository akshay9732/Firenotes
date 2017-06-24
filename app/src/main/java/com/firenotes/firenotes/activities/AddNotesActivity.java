package com.firenotes.firenotes.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firenotes.firenotes.R;
import com.firenotes.firenotes.models.Note;
import com.firenotes.firenotes.utils.Helper;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddNotesActivity extends AppCompatActivity {

    @BindView(R.id.etNote)
    EditText etNote;
    @BindView(R.id.tvDate)
    TextView tvDate;
    DatabaseReference database;
    @BindView(R.id.btSave)
    Button btSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notes);
        database = FirebaseDatabase.getInstance().getReference();
        ButterKnife.bind(this);
        btSave.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNote.getText().toString().trim())){
                    return;
                }
                Note note = new Note();
                String token =database.child("notes").push().getKey();
                note.setNote(etNote.getText().toString());
                note.setDate(Helper.getCurrentDate());
                database.child("notes").child(token).setValue(note);
                finish();
            }
        });
    }

}
