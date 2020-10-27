package model;

public class Empreiteiro extends Funcionario {
	public float valorEmpreita;

	public Empreiteiro(String nome, int numRegistro, float valorEmpreita) {
		super(nome, numRegistro);
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	// TODO Auto-generated method stub
	public double calcularSalario() {
		   return valorEmpreita;
	}
	
	@Override
	public String exibirRecibo () {
		return "Recibo de Empreitada: "+super.nome+"\n"+
				"Total a Receber R$: "+calcularSalario();
	
	}
	
		
}
