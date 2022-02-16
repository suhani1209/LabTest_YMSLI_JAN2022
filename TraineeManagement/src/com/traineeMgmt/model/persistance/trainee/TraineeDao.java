package com.traineeMgmt.model.persistance.trainee;

import java.util.List;

public interface TraineeDao {
	public List<Trainee> getAll();
	public Trainee addTrainee(Trainee trainee);
}
