package com.firenotes.firenotes.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.firenotes.firenotes.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddNotesActivity extends AppCompatActivity {

    @BindView(R.id.etNote)
    EditText etNote;
    @BindView(R.id.tvDate)
    TextView tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notes);
        ButterKnife.bind(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
