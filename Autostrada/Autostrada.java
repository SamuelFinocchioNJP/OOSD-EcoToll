package Autostrada;

import java.util.ArrayList;
import java.util.List;

import Casello.Casello;
import Pedaggio.PedaggioStandard;
import Tariffa.Tariffa;
import Veicolo.Veicolo;

public class Autostrada {
	private String name;
	private Tariffa tax;
	private int iva;
	private PedaggioStandard pedaggio;
	private List<Casello> exitsList;
	
	public Autostrada ( String name, int iva ) {
		this.name = name;
		tax = new Tariffa();
	}
	
	public Autostrada ( String name, int iva, Tariffa tax, PedaggioStandard pedaggio) {
		this.name = name;
		this.tax = tax;
		this.pedaggio = pedaggio;
		this.exitsList = new ArrayList <Casello>();
	}
	
	public double calculate ( Veicolo vehicle, Casello start, Casello end ) throws Exception {
		
		if ( this.exitsList.contains( start ) && this.exitsList.contains( end ) )
			
			return this.pedaggio.calculateToll(vehicle, this, start, end );
		
		throw new Exception ( "Cant calculate toll" );
	}
	
	public void setPedaggio ( PedaggioStandard pedaggio ) {
		this.pedaggio = pedaggio;
	}
	
	public void addExit ( Casello c ) {
		this.exitsList.add( c );
	}
	
	public void setExits ( ArrayList<Casello> l ) {
		this.exitsList = l;
	}
	
	public int getIva() {
		return this.iva;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tariffa getTax() {
		return tax;
	}
	
	public void setIva ( int iva ) {
		if ( iva >= 0 )
			this.iva = iva;
	}
	
	public void setTax(String name, double rate) throws Exception {
		this.tax.addRate(name, rate);
	}

	public List<Casello> getExitsList() {
		return exitsList;
	}

	public void setExitsList(ArrayList<Casello> exitsList) {
		this.exitsList = exitsList;
	}
}
