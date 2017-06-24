package com.firenotes.firenotes.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.firenotes.firenotes.R;
import com.firenotes.firenotes.models.Note;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotesDetailActivity extends AppCompatActivity {

    @BindView(R.id.tvDate)
    TextView tvDate;
    @BindView(R.id.tvNote)
    TextView tvNote;
    Note mNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_detail);
        ButterKnife.bind(this);
        mNote = getIntent().getExtras().getParcelable("note");
        putValues(mNote);
    }

    private void putValues(Note note){
        tvNote.setText(note.getNote());
        tvDate.setText(note.getDate());
    }
}
