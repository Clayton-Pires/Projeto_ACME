package model;

public class Comissionado extends Funcionario {
	public float salarioBase;
	public float comissao;

	public Comissionado(String nome, int numRegistro, float salarioBase, float comissao) {
		super(nome, numRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	@Override
	// TODO Auto-generated method stub
	public double calcularSalario() {
		return salarioBase + (salarioBase * comissao/100);

	}
	
	@Override
	public String exibirRecibo () {
		return "Recibo de Comisionado: "+super.nome+"\n"+
				"Valor Salario Base: "+this.salarioBase+"\n"+
				"Valor Comissão: "+this.comissao +"\n"+
				"Total a Receber R$: "+calcularSalario();
	}
	
	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	
}