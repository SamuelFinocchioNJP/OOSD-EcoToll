package Veicolo;

public class Veicolo {
	private String licencePlate;
	private String brand;
	private String model;
	private int matriculationYear;
	private int axesAmount;
	private String vehicleClass;
	
	
	public Veicolo(String licencePlate, String brand, String model, int matriculationYear, int axesAmount, String vehicleClass) {
		this.licencePlate = licencePlate;
		this.brand = brand;
		this.model = model;
		this.matriculationYear = matriculationYear;
		this.axesAmount = axesAmount;
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleClass () {
		return this.vehicleClass;
	}
	
	public String getLicencePlate() {
		return this.licencePlate;
	}
	
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setVehicleClass ( String vehicleClass ) {
		
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMatriculationYear() {
		return matriculationYear;
	}
	
	public void setMatriculationYear(int matriculationYear) {
		this.matriculationYear = matriculationYear;
	}
	
	public int getAxesAmount() {
		return axesAmount;
	}
	
	public void setAxesAmount(int axesAmount) {
		this.axesAmount = axesAmount;
	}
}
