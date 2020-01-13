package aplicacao;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import modelo.dao.DaoFabrica;
import modelo.dao.VendedorDao;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		VendedorDao vdao = DaoFabrica.criarVendedorDao();
		
		System.out.println("\n=== teste 1: vendedor findById");
		Vendedor v = vdao.findById(3); 
		System.out.println(v);
		
		System.out.println("\n=== teste 2: vendedor findByDepartment");
		List<Vendedor> dpto = vdao.findByDepartment(new Departamento(2, null));
		dpto.forEach(System.out::println);
		
		System.out.println("\n=== teste 3: vendedor findAll");
		dpto = vdao.findAll();
		dpto.forEach(System.out::println);
		
		/*
		 * System.out.println("\n=== teste 4: vendedor inset"); Vendedor vendedor = new
		 * Vendedor(null, "Giliard", "giliard@gmail.com", new Date(), 5000.0, new
		 * Departamento(2, null)); vdao.insert(vendedor); System.out.println("Insert: "
		 * + vendedor.getId());
		 */
		System.out.println("\n=== teste 5: vendedor update");
		v = vdao.findById(9);
		v.setNome("Giliard Antonio");
		vdao.update(v);
		
		System.out.println("Update completo!");
		System.out.println("Novo valor:\n "+v);
	}

}
