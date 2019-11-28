package co.edu.konradlorenz.ukolapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TasksFragment extends Fragment implements View.OnClickListener {

    private FloatingActionButton createTask;
    private Intent connection;

    public void setCreateTask(FloatingActionButton button){
        createTask = button;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tasks, container, false);
    }

    @Override
    public void onClick(View view){
        openCreate(view);
    }

    public void openCreate(View view){
    }

}