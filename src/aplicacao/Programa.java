package aplicacao;

import java.text.ParseException;
import java.util.List;

import modelo.dao.DaoFabrica;
import modelo.dao.VendedorDao;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		VendedorDao vdao = DaoFabrica.criarVendedorDao();
		
		System.out.println("teste 1: vendedor findById");
		Vendedor v = vdao.findById(3); 
		System.out.println(v);
		
		System.out.println("teste 2: vendedor findByDepartment");
		List<Vendedor> dpto = vdao.findByDepartment(new Departamento(2, null));
		dpto.forEach(System.out::println);
		
		System.out.println("teste 3: vendedor findAll");
		dpto = vdao.findAll();
		dpto.forEach(System.out::println);
		
		
	}

}
