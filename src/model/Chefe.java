package model;

public class Chefe extends Funcionario {
	
	public float salarioBase;
	public float adicionalFuncao;
	public float beneficioTerno;
	
	public Chefe(String nome, int numRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	@Override
	// TODO Auto-generated method stub
	public double calcularSalario() {
		return (salarioBase + (salarioBase * adicionalFuncao/100) + beneficioTerno);
	}	
	
	@Override
	public String exibirRecibo () {
		return "Recibo de Chefe: "+super.nome+"\n"+
				"Valor Salario Base R$: "+this.salarioBase+"\n"+
				"Valor Adicinal Função R$: "+this.adicionalFuncao +"\n"+
				"Total a Receber R$: "+calcularSalario();
	}
	
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getAdcionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public float getBeneficioTerno() {
		return beneficioTerno;
	}
	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

		

}
