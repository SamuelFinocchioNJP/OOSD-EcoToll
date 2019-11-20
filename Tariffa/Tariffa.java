package Tariffa;

import java.util.HashMap;
import java.util.Map;

import Veicolo.Veicolo;



public class Tariffa {
	
	private Map <String, Double> paymentRate;
	
	public Tariffa ( ) {
		paymentRate = new HashMap<String, Double> ( );
	}
	
	public Map <String, Double > getPayments ( ) {
		return this.paymentRate;
	}
	
	public double getPayment ( Veicolo vehicle ) {
		return this.paymentRate.get( vehicle.getVehicleClass() );
	}
	
	public void addRate ( String name, double rate ) throws Exception {
		switch ( name.toUpperCase() ) {
		case VehiclesTypesUtils.Vehicle_A:
			paymentRate.put( VehiclesTypesUtils.Vehicle_A, rate );
			break;
			
		case VehiclesTypesUtils.Vehicle_B:
			paymentRate.put( VehiclesTypesUtils.Vehicle_B, rate );
			break;
			
		case VehiclesTypesUtils.Vehicle_3:
			paymentRate.put( VehiclesTypesUtils.Vehicle_3, rate );
			break;
			
		case VehiclesTypesUtils.Vehicle_4:
			paymentRate.put( VehiclesTypesUtils.Vehicle_4, rate );
			break;
			
		case VehiclesTypesUtils.Vehicle_5:
			paymentRate.put( VehiclesTypesUtils.Vehicle_5, rate );
			break;
			
		default:
			throw new Exception ( "Invalid vehicle category" );
		}
	}
	
}
