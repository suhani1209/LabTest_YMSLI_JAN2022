package com.traineeMgmt.model.service;

import java.util.List;

import com.traineeMgmt.model.persistance.trainee.Trainee;
import com.traineeMgmt.model.persistance.trainee.TraineeDao;
import com.traineeMgmt.model.persistance.trainee.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService{

	private TraineeDao traineeDao;
	public TraineeServiceImpl(){
		traineeDao=new TraineeDaoImpl();
	}
	

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public List<Trainee> getAll() {
		return traineeDao.getAll();
	}
	
	
	

}
