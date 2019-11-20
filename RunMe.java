import Autostrada.Autostrada;
import Casello.Casello;
import Pedaggio.PedaggioStandard;
import Tariffa.Tariffa;
import Tariffa.VehiclesTypesUtils;
import Veicolo.Veicolo;

public class RunMe {

	public static void main(String[] args) throws Exception {
		Veicolo v = new Veicolo ("ROMA 44482", "BMW", "E30", 1993, 4, VehiclesTypesUtils.Vehicle_A );
		
		Tariffa t = new Tariffa ( );
		t.addRate( VehiclesTypesUtils.Vehicle_A , 0.1 );
		
		Autostrada a = new Autostrada ("A24", 22, t, new PedaggioStandard() );
		
		Casello c1 = new Casello ( "Pescara", 100 );
		Casello c2 = new Casello( "Roma", 310 );
		
		a.addExit( c1 );
		a.addExit( c2 );
		
		System.out.println( a.calculate( v, c1, c2 ));
		
	}

}
