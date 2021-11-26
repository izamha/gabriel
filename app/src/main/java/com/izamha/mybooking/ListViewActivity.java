package com.izamha.mybooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.izamha.mybooking.model.Student;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;

    String[] students = {
            "Gabriel Uwanyirigira",
            "Christian Nyirinkindi",
            "Eric Misigaro",
            "Gilbert Izamha",
            "Josua Mugisha",
            "Joe Rugaba",
            "Gabriel Karusisi",
            "Mulefu Izamha",
            "Jules Ndisanze",
            "Robert Mahoro",
            "Robert Mahoro",
            "Robert Mahoro",
            "Robert Mahoro",
            "Robert Mahoro",
            "Mukiza",
            "Mukiza",
            "Mukiza",
            "Mukiza",
    };

    // Amafoto
    int [] studentImages = {
            R.drawable.profile1,
            R.drawable.profile2,
            R.drawable.profile3,
            R.drawable.profile4,
            R.drawable.profile5,
            R.drawable.profile5,
            R.drawable.profile4,
            R.drawable.profile3,
            R.drawable.profile5,
            R.drawable.profile2,
            R.drawable.profile1,
            R.drawable.profile1,
            R.drawable.profile2,
            R.drawable.profile3,
            R.drawable.profile4,
            R.drawable.profile5,
            R.drawable.profile5,
            R.drawable.profile4,
            R.drawable.profile3,
            R.drawable.profile5,
            R.drawable.profile2,
            R.drawable.profile1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.list_view);



        // Here we are going to create Student objects to display
        final ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student(1, "Gabriel Uwanyirigira", R.drawable.profile1));
        arrayList.add(new Student(2, "Christian Nyirinkindi", R.drawable.profile2));
        arrayList.add(new Student(3, "Eric Misigaro", R.drawable.profile3));
        arrayList.add(new Student(4, "Gilbert Izamha", R.drawable.profile4));
        arrayList.add(new Student(5, "Josua Mugisha", R.drawable.profile5));
        arrayList.add(new Student(6, "Joe Rugaba", R.drawable.profile1));
        arrayList.add(new Student(7, "Gabriel Karusisi", R.drawable.profile4));
        arrayList.add(new Student(8, "Mulefu Izamha", R.drawable.profile4));
        arrayList.add(new Student(9, "Jules Ndisanze", R.drawable.profile2));
        arrayList.add(new Student(10, "Robert Mahoro", R.drawable.profile3));
        arrayList.add(new Student(11, "Robert Mahoro", R.drawable.profile3));
        arrayList.add(new Student(12, "Robert Mahoro", R.drawable.profile3));
        arrayList.add(new Student(13, "Robert Mahoro", R.drawable.profile3));
        arrayList.add(new Student(14, "Robert Mahoro", R.drawable.profile3));
        arrayList.add(new Student(15, "Robert Mahoro", R.drawable.profile3));
        arrayList.add(new Student(16, "Robert Mahoro", R.drawable.profile3));

        ListViewAdapter studentArrayAdapter = new ListViewAdapter(this, arrayList);


        listView.setAdapter(studentArrayAdapter);

        Bundle extra = new Bundle();
        extra.putSerializable("objects", arrayList);

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            Intent intent = new Intent(getApplicationContext(), StudentDetailActivity.class);
            intent.putExtra("student", students[position]);
            intent.putExtra("studentImage", studentImages[position]);
            startActivity(intent);
        });

    }
}