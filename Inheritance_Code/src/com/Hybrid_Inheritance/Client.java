package com.Hybrid_Inheritance;

public class Client extends Person{
	
	private int AppointmentNm;

	public Client(long adharNm, long mobile, String name,int AppointmentNm) {
		super(adharNm, mobile, name);
		this.AppointmentNm=AppointmentNm;
		
	}

	@Override
	public String toString() {
		return "Client [AppointmentNm=" + AppointmentNm + ", " + super.toString() +"]";
	}
	
	
	

}