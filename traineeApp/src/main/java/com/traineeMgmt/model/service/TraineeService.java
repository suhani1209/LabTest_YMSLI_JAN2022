package com.traineeMgmt.model.service;

import java.util.List;

import com.traineeMgmt.model.persistance.trainee.Trainee;

public interface TraineeService {
	public Trainee addTrainee(Trainee trainee);
	public List<Trainee> getAll();
}
