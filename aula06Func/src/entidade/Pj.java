package entidade;

import entidade.enums.Cargo;

//import entidade.Funcionario;
public class Pj extends Funcionario {

	private double adicional;


	
	public Pj(String nome, double salario, Cargo cargo, double adicional) {
		super(nome, salario, cargo);
		this.adicional = adicional;
	}



	public  double receber( ) {
		
		return super.receber(salario) + adicional;
	}
}
