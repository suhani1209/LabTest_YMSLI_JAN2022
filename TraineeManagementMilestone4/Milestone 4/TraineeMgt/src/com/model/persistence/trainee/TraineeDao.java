package com.model.persistence.trainee;

import java.util.List;
import java.util.Optional;

import com.model.exceptions.DataAccessException;
import com.model.exceptions.TraineeNotFoundException;

public interface TraineeDao {
	public Trainee addTrainee(Trainee trainee);
	public void deleteTrainee(int id);
	public Trainee updateTrainee(int id,Trainee trainee);
	public List<Trainee> getAll() throws DataAccessException;
	public Optional<Trainee> getById(int id) throws TraineeNotFoundException;
}
