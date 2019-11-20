package Pedaggio;

import java.util.List;

import Autostrada.Autostrada;
import Casello.Casello;
import Veicolo.Veicolo;

public interface IPedaggio {
	public double calculateToll ( Veicolo veicolo, Autostrada autostrada, Casello start, Casello end ) throws Exception;
}
