package aplicacao;

import java.text.ParseException;

import modelo.dao.DaoFabrica;
import modelo.dao.VendedorDao;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		VendedorDao vdao = DaoFabrica.criarVendedorDao();
		
		Vendedor v = vdao.findById(3); 
		
		System.out.println(v);

	}

}
