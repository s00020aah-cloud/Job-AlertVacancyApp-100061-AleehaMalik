package com.example.jobalertvacancyapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jobalertvacancyapp.R;
import com.example.jobalertvacancyapp.adapters.JobAdapter;
import com.example.jobalertvacancyapp.models.Job;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Job> jobList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        jobList = new ArrayList<>();

        // JOBS ADD
        jobList.add(new Job("Android Developer", "Tech Solutions", "Android app development", "Lahore", "PKR 50,000"));
        jobList.add(new Job("Web Developer", "Soft House", "HTML, CSS, JS required", "Karachi", "PKR 45,000"));
        jobList.add(new Job("Java Developer", "IT Company", "Java and OOP concepts", "Islamabad", "PKR 60,000"));
        jobList.add(new Job("React Developer", "Code Labs", "ReactJS and Redux", "Multan", "PKR 55,000"));
        jobList.add(new Job("Python Developer", "Tech World", "Python & Django", "Faisalabad", "PKR 50,000"));

        JobAdapter adapter = new JobAdapter(jobList, this);
        recyclerView.setAdapter(adapter);
    }
}
