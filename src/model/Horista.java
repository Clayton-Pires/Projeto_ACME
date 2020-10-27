package model;

public class Horista extends Funcionario {
	
	public float valorHora;
	public int numeroHoras;
	
		
	public Horista(String nome, int numRegistro, float valorHora, int numeroHoras) {
		super(nome, numRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	@Override
	// TODO Auto-generated method stub
	public double calcularSalario() {
		   return  valorHora * numeroHoras;
	}
	
	@Override
	public String exibirRecibo () {
		return "Recibo de Horista: "+super.nome+"\n"+
				"Valor Hora: "+this.valorHora+"\n"+
				"Horas Trabalhadas: "+this.numeroHoras+"\n"+
				"Total a Recebe R$: "+calcularSalario();
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	
}
