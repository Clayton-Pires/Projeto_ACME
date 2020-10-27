package userinterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaPagamento {
	public static void main(String[] args) {
		ArrayList<Funcionario> lista;
		
		lista = new ArrayList<Funcionario>();
			
		lista.add (new Chefe("Jony",1111,5000,10,0));
		lista.add (new Comissionado("Lino",222,2500,10));
		lista.add (new Horista("Hinderson",333,30,160));
		lista.add (new Empreiteiro("Jose",444,1500));
		
		//System.out.println("REG  NOME                SALÁRIO");
			
		for (Funcionario f: lista ) {
			//System.out.printf("%5d %=30s R$ %8.2f\n", f.getNumRegistro(), f.getNome(), f.calcularSalario());
			System.out.println(f.exibirRecibo());
			System.out.println(".........................................");
		}
	
			
	}

}
