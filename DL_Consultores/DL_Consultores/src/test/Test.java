package test;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		Sistema sis = new Sistema();

		sis.AgregarPersona(1, "Raul");
		sis.AgregarPersona(2, "Martin");
		sis.AgregarPersona(3, null);
		sis.AgregarPersona(4, "Nora");
		sis.AgregarPersona(5, "Claudio");
		sis.AgregarPersona(6, "Marta");
		sis.AgregarPersona(7, "Anna");
		sis.AgregarPersona(8, null);
		sis.AgregarPersona(9, null);
		sis.AgregarPersona(10, null);
		sis.AgregarPersona(11, "Ramon");
		sis.AgregarPersona(12, "Carla");
		sis.AgregarPersona(13, "Valeria");
		
		
		sis.AgregarPersona2(1, null);
		sis.AgregarPersona2(2, "Martin");
		sis.AgregarPersona2(3, null);
		sis.AgregarPersona2(4, "Nora");
		sis.AgregarPersona2(5, "Claudio");
		sis.AgregarPersona2(6, "Sandra");
		sis.AgregarPersona2(null, "Anna");
		sis.AgregarPersona2(8, "Juan");
		sis.AgregarPersona2(9, "Hernan");
		sis.AgregarPersona2(10, "Cesar");
		sis.AgregarPersona2(11, "Romina");
		//sis.AgregarPersona2(12, "Gustavo");
		//sis.AgregarPersona2(13, "Alejandra");
		

		sis.comparaListaCoincidencia(sis.getLista1(), sis.getLista2());
		sis.comparaLista1Presentes(sis.getLista1(), sis.getLista2());
		sis.comparaLista2Presentes(sis.getLista1(), sis.getLista2());
		sis.comparaListaConflictos(sis.getLista1(), sis.getLista2());
		System.out.println(sis.getListaConflictos());
		System.out.println(sis.getListaCoincidencias());
		System.out.println(sis.getLista1_faltantes2());
		System.out.println(sis.getLista2_faltantes1());

	}

}
