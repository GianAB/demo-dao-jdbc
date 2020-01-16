package aplicacao;

import java.util.List;
import java.util.Scanner;

import modelo.dao.DaoFabrica;
import modelo.dao.DepartamentoDao;
import modelo.entidades.Departamento;

public class Programa2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DepartamentoDao depDf = DaoFabrica.criarDepartamentoDao();
		Departamento dep;
		int id;

		System.out.println("=== Departamento Insert");
		dep = new Departamento(null, "Dança");
		depDf.insert(dep);
		System.out.println("Departamento inserido!");
		System.out.println("Insert: " + dep.toString());

		System.out.println("\n=== Departamento Update");

		System.out.print("Entre com o Id do campo para atualizar: ");
		id = scan.nextInt();
		scan.nextLine();

		System.out.print("Entre com o novo nome para o departamento: ");
		String nome = scan.nextLine();

		dep = new Departamento(id, nome);

		depDf.update(dep);

		System.out.println("Atualizado com sucesso!");
		System.out.println("Update: " + dep.toString());

		System.out.println("\n=== Departamento Delete");

		System.out.print("Entre com o Id do campo para deletar: ");
		id = scan.nextInt();
		scan.nextLine();
		depDf.deleteById(id);
		System.out.println("Campo deletado com sucesso!");

		System.out.println("\n=== Departamento finById");

		System.out.print("Entre com o Id do campo para pesquisar: ");
		id = scan.nextInt();
		scan.nextLine();

		System.out.println(depDf.findById(id));
		scan.close();

		System.out.println("\n=== Departamento findAll");
		List<Departamento> list = depDf.findAll();

		list.forEach(System.out::println);

	}

}
