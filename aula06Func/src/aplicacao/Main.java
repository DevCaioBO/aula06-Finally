package aplicacao;

import java.util.Scanner;

import entidade.Clt;
import entidade.Funcionario;
import entidade.Pj;
import entidade.enums.Cargo;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Colocar o nome: ");
		String name = scn.next();
		System.out.println("Colocar seu salário");
		double salary = scn.nextDouble();
//		System.out.println("Colocar seu cargo pj ou clt");
//		String cargo = scn.next();
		
		System.out.println("Digite sua profissão [P]Professor, [C]Contador, [D]DEV: ");
		
		String choose = scn.next();
		
//		if(choose.contains("p") || choose.contains("P"))  {
////			Pj pj = new Pj(name,salary,Cargo.PROFESSOR);
////			Clt clt = new Clt(name,salary,Cargo.PROFESSOR);
//			System.out.println("Clt ou Pj");
//			String cargos = scn.next();			
//			if(cargos.contains("Clt")) {
//				System.out.println( clt + " CLT = " + clt.receber(salary));
//			}else if(cargos.contains("Pj")) {
//				System.out.println(pj + " = " + pj.receber1(salary));
//			}
		 if(choose.contains("c") || choose.contains("C")) {
			
			
			System.out.println("Clt ou Pj");
			String cargos = scn.next();		
			if(cargos.contains("Clt")) {
				System.out.println("Digite o adicional");
				double convenio = scn.nextDouble();
				Pj clt = new Pj(name,salary,Cargo.CONTADOR,convenio);
				System.out.println(clt + " = " + clt.receber());
			}else if(cargos.contains("Pj")) {
				System.out.println("Digite o adicional");
				double addMoney = scn.nextDouble();
				Pj pj = new Pj(name,salary,Cargo.CONTADOR,addMoney);
				System.out.println(pj + " = " + pj.receber());
			}
		}
		
	 if(choose.contains("d") || choose.contains("D")) {
			System.out.println("Clt ou Pj");
			String cargos = scn.next();		
			if(cargos.contains("Clt")) {
				System.out.println("Digite o adicional");
				double convenio = scn.nextDouble();
				Pj clt = new Pj(name,salary,Cargo.DEV,convenio);
				System.out.println(clt + " = " + clt.receber());
			}else if(cargos.contains("Pj")) {
				System.out.println("Digite o adicional");
				double addMoney = scn.nextDouble();
				Pj pj = new Pj(name,salary,Cargo.DEV,addMoney);
				System.out.println(pj + " = " + pj.receber());
			}
		}
	 if(choose.contains("p") || choose.contains("P")) {
			System.out.println("Clt ou Pj");
			String cargos = scn.next();		
			if(cargos.contains("Clt")) {
				System.out.println("Digite o adicional");
				double convenio = scn.nextDouble();
				Pj clt = new Pj(name,salary,Cargo.PROFESSOR,convenio);
				System.out.println(clt + " = " + clt.receber());
			}else if(cargos.contains("Pj")) {
				System.out.println("Digite o adicional");
				double addMoney = scn.nextDouble();
				Pj pj = new Pj(name,salary,Cargo.PROFESSOR,addMoney);
				System.out.println(pj + " = " + pj.receber());
			}
		}

		

		
		
	}

}
