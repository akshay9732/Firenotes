package com.firenotes.firenotes.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.firenotes.firenotes.R;
import com.firenotes.firenotes.models.Note;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by WIN 10 on 6/24/2017.
 */

public class NotesAdapter extends ArrayAdapter<Note> {

    public NotesAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Note> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(getContext(), R.layout.list_item_notes, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvShortNote.setText(getItem(position).getNote());
        holder.tvDate.setText(getContext().getString(R.string.last_edited_on)+" "+getItem(position).getDate());
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.ivNote)
        ImageView ivNote;
        @BindView(R.id.tvShortNote)
        TextView tvShortNote;
        @BindView(R.id.tvDate)
        TextView tvDate;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
