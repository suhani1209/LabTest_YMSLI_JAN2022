package com.traineeMgmt.model.persistance.trainee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainee")
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trainee_id;
	private String trainee_name;
	private String branch;
	private Double percentage;

	public Trainee() {
	}

	public Trainee(String trainee_name, String branch, Double percentage) {
		super();
		this.trainee_name = trainee_name;
		this.branch = branch;
		this.percentage = percentage;
	}

	public int getTrainee_id() {
		return trainee_id;
	}

	public Trainee(int trainee_id, String trainee_name, String branch, Double percentage) {
		super();
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
		this.branch = branch;
		this.percentage = percentage;
	}

	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}

	public String getTrainee_name() {
		return trainee_name;
	}

	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trainee [trainee_id=").append(trainee_id).append(", trainee_name=").append(trainee_name)
				.append(", branch=").append(branch).append(", percentage=").append(percentage).append("]");
		return builder.toString();
	}

}