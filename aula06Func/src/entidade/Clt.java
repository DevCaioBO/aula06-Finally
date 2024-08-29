package entidade;

import entidade.enums.Cargo;

//import entidade.Funcionario;
public class Clt extends Funcionario {

	private double convenio;



	
	public Clt(String nome, double salario, Cargo cargo, double convenio) {
		super(nome, salario, cargo);
		this.convenio = convenio;
	}




	public double receber() {
		
		return   super.receber(salario) -convenio   ;
	}
}
