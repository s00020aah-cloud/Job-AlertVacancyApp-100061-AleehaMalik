package com.example.jobalertvacancyapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jobalertvacancyapp.R;
import com.example.jobalertvacancyapp.activities.JobDetailActivity;
import com.example.jobalertvacancyapp.models.Job;

import java.util.ArrayList;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    private final ArrayList<Job> jobList;
    private final Context context;

    public JobAdapter(ArrayList<Job> jobList, Context context) {
        this.jobList = jobList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_job, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Job job = jobList.get(position);

        holder.title.setText(job.getTitle());
        holder.company.setText(job.getCompany());
        holder.description.setText(job.getDescription());
        holder.location.setText(job.getLocation());
        holder.salary.setText(job.getSalary());

        holder.applyButton.setOnClickListener(v -> {
            Toast.makeText(context, "Applied for: " + job.getTitle(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(context, JobDetailActivity.class);
            intent.putExtra("title", job.getTitle());
            intent.putExtra("company", job.getCompany());
            intent.putExtra("description", job.getDescription());
            intent.putExtra("location", job.getLocation());
            intent.putExtra("salary", job.getSalary());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return jobList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, company, description, location, salary;
        Button applyButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.jobTitle);
            company = itemView.findViewById(R.id.jobCompany);
            description = itemView.findViewById(R.id.jobDescription);
            location = itemView.findViewById(R.id.jobLocation);
            salary = itemView.findViewById(R.id.jobSalary);
            applyButton = itemView.findViewById(R.id.btnApply);
        }
    }
}
