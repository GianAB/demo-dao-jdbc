package aplicacao;

import java.text.ParseException;
import java.util.Date;

import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Departamento dpt = new Departamento(1, "Livros");
		Vendedor vd = new Vendedor(1, "Gian", "gian@gmail.com", new Date(), 200.0, dpt);
		
		System.out.println(dpt);
		
		System.out.println(vd);

	}

}
