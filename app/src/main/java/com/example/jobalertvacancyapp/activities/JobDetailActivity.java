package com.example.jobalertvacancyapp.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jobalertvacancyapp.R;

public class JobDetailActivity extends AppCompatActivity {

    TextView title, company, description, location, salary;
    Button applyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);

        // Find Views
        title = findViewById(R.id.detailTitle);
        company = findViewById(R.id.detailCompany);
        description = findViewById(R.id.detailDescription);
        location = findViewById(R.id.detailLocation);
        salary = findViewById(R.id.detailSalary);
        applyButton = findViewById(R.id.detailApplyButton);

        // Set Data from Intent
        title.setText(getIntent().getStringExtra("title"));
        company.setText(getIntent().getStringExtra("company"));
        description.setText(getIntent().getStringExtra("description"));
        location.setText(getIntent().getStringExtra("location"));
        salary.setText(getIntent().getStringExtra("salary"));

        // Apply button click
        applyButton.setOnClickListener(v -> {
            Toast.makeText(this, "You have applied for: " + title.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}
