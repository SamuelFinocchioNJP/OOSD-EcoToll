package Pedaggio;

import java.util.List;

import Autostrada.Autostrada;
import Casello.Casello;
import Tariffa.VehiclesTypesUtils;
import Veicolo.Veicolo;

public class PedaggioStandard implements IPedaggio {
	
	public double calculateToll ( Veicolo veicolo, Autostrada autostrada, Casello start, Casello end ) throws Exception {
		if ( VehiclesTypesUtils.isValidClass( veicolo.getVehicleClass() ) ) {
			int distance = Math.abs( start.getKm() - end.getKm() );
			double cost = distance * autostrada.getTax().getPayment( veicolo );
			double ivaTax = cost * autostrada.getIva();
			return cost + ivaTax;
		} else {
			throw new Exception ( "Invalid vehicle" );
		}
	}
}
