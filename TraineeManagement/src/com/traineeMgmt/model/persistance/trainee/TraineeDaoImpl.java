package com.traineeMgmt.model.persistance.trainee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.traineeMgmt.model.persistance.factory.ConnectionFactory;

public class TraineeDaoImpl implements TraineeDao{

	private Connection connection=null;
	
	public TraineeDaoImpl() {
		connection=ConnectionFactory.getConnection();
	}
	@Override
	public List<Trainee> getAll() {
		List<Trainee> allTrainees=new ArrayList<Trainee>();
		try {
			PreparedStatement pstmt= connection.prepareStatement("select * from trainee;");
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				allTrainees.add(new Trainee(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getDouble(4)));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return allTrainees;
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		try {
			PreparedStatement pstmt= connection.prepareStatement("insert into trainee(trainee_id,trainee_name,branch,Percentage) values(?,?,?,?);");
			pstmt.setInt(1, trainee.getTrainee_id());
			pstmt.setString(2, trainee.getTrainee_name());
			pstmt.setString(3,trainee.getBranch());
			pstmt.setDouble(4, trainee.getPercentage());
		
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return trainee;
	}

}
