package com.example.demo.entity;
 
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="payload", schema = "public")
@Entity()

public class Payload {

	@Id
	@Column(name = "shipperId")
	private int shipperId;
	@Column(name = "loadingPoint")
	private String loadingPoint;
	@Column(name = "unloadingPoint")
	private String unloadingPoint;
	@Column(name = "productType")
	private String productType;
	@Column(name = "truckType")
	private String truckType;
	@Column(name="noOfTrucks")
	private int noOfTrucks;
	@Column(name="weight")
	private int weight;
	@Column(name="date")
	private Timestamp date;
	
	
	
	public Payload() {
		
		// TODO Auto-generated constructor stub
	}
	public Payload(int shipperId, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, int weight, Timestamp date) {
		super();
		this.shipperId = shipperId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.date = date;
	}
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Payload [shipperId=" + shipperId + ", loadingPoint=" + loadingPoint + ", unloadingPoint="
				+ unloadingPoint + ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks="
				+ noOfTrucks + ", weight=" + weight + ", date=" + date + "]";
	}

	
}
