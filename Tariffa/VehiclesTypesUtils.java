package Tariffa;

public class VehiclesTypesUtils {
	public static final String Vehicle_A = "A";
	public static final String Vehicle_B = "B";
	public static final String Vehicle_3 = "3";
	public static final String Vehicle_4 = "4";
	public static final String Vehicle_5 = "5";
	
	public static boolean isValidClass ( String vehicleClass ) {
		switch ( vehicleClass.toUpperCase() ) {
			case VehiclesTypesUtils.Vehicle_A:
			case VehiclesTypesUtils.Vehicle_B:
			case VehiclesTypesUtils.Vehicle_3:
			case VehiclesTypesUtils.Vehicle_4:
			case VehiclesTypesUtils.Vehicle_5:
				return true;
		}
		return false;
	}
}