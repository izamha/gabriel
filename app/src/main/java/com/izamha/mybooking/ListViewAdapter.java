package com.izamha.mybooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.izamha.mybooking.model.Student;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<Student> {

    // invoke the suitable constructor of the ArrayAdapter class
    public ListViewAdapter(@NonNull Context context, ArrayList<Student> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView which is recyclable view
        View currentItemView = convertView;

        // of the recyclable view is null then inflate the custom layout for the same
        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.student_item,
                    parent, false);
        }

        // get the position of the view from the ArrayAdapter
        Student currentStudentPosition = getItem(position);

        // then according to the position of the view assign the desired image for the same
        ImageView image = currentItemView.findViewById(R.id.image);
        assert currentStudentPosition != null;

        // Load in the student Image
        Glide.with(getContext())
                .load(currentStudentPosition.getStudentImageId())
                .circleCrop()
                .into(image);

        // then according to the position of the view assign the desired TextView 1 for the same
        TextView studentId = currentItemView.findViewById(R.id.student_id);
        studentId.setText(String.valueOf(currentStudentPosition.getStdId()));

        // then according to the position of the view assign the desired TextView 2 for the same
        TextView studentName = currentItemView.findViewById(R.id.student_name);
        studentName.setText(currentStudentPosition.getStdName());


        // then return the recyclable view
        return currentItemView;
    }

}
