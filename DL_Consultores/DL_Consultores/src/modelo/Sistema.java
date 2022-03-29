package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	List<Persona> Lista1 = new ArrayList<Persona>();
	List<Persona> Lista2 = new ArrayList<Persona>();
	List<Persona> ListaCoincidencias = new ArrayList<Persona>();
	List<Persona> Lista1_faltantes2 = new ArrayList<Persona>();
	List<Persona> Lista2_faltantes1 = new ArrayList<Persona>();
	List<Persona> ListaConflictos = new ArrayList<Persona>();

	public Sistema() {
		// TODO Auto-generated constructor stub
	}

	public List<Persona> getLista1() {
		return Lista1;
	}

	public List<Persona> getLista2() {
		return Lista2;
	}

	public List<Persona> getListaCoincidencias() {
		System.out.println("---------Listado de coincidencias --------------");
		return ListaCoincidencias;
	}

	public List<Persona> getLista1_faltantes2() {
		System.out.println("---------Listado de presentes en la lista 1 y faltantes en la lista 2 --------------");
		return Lista1_faltantes2;
	}

	public void setLista1_faltantes2(List<Persona> lista1_faltantes2) {
		Lista1_faltantes2 = lista1_faltantes2;
	}

	public List<Persona> getLista2_faltantes1() {
		System.out.println("---------Listado de presentes en la lista 2 y faltantes en la lista 1--------------");
		return Lista2_faltantes1;
	}

	public void setLista2_faltantes1(List<Persona> lista2_faltantes1) {
		Lista2_faltantes1 = lista2_faltantes1;
	}

	public List<Persona> getListaConflictos() {
		System.out.println("---------Listado de conflictos --------------");
		return ListaConflictos;
	}

	public void AgregarPersona(Integer idPersona, String nombre) {
		Persona persona = new Persona(idPersona, nombre);
		this.Lista1.add(persona); // agrego persona en la lista 1
	}

	public void AgregarPersona2(Integer idPersona, String nombre) {
		Persona persona = new Persona(idPersona, nombre);
		this.Lista2.add(persona); // agrego personas en la lista 2
	}

	// control shif f

	// 1. Listado de coincidencias.
	// PRE: Debe existir 2 listas con sus datos cargados .
	// POST: Compara las listas y agrega a la << ListaCoincidencias >> los elementos
	// que sean iguales en ambas listas.
	public void comparaListaCoincidencia(List<Persona> Lista1, List<Persona> Lista2) {

		for (int i = 0; i < Lista1.size(); i++) {
			for (int j = 0; j < Lista2.size(); j++) {
				if (Lista1.get(i).getIdPersona() == (Lista2.get(j).getIdPersona())) {
					if (Lista1.get(i).getNombre() == (Lista2.get(j).getNombre())) {
						Persona per = Lista1.get(i);
						this.ListaCoincidencias.add(per);
					}

				}
			}
		}

	}

	// 2. Listado de elementos presentes en la Lista1 y faltantes de la Lista2.

	// PRE: Debe existir 2 listas con sus datos cargados.
	// POST: Compara las lista y agrega a la << lista1_faltantes2 >> los elementos
	// que no contengan ningun elemento null en la lista1 y falten en la lista 2.

	public void comparaLista1Presentes(List<Persona> Lista1, List<Persona> Lista2) {
		boolean repetido = false;
		int i = 0;

		while (i < this.Lista1.size()) {

			if (this.Lista1.get(i).getIdPersona() != null && this.Lista1.get(i).getNombre() != null) {

				Persona elemento = this.Lista1.get(i); // elemento de la lista1 sin ningun atributo null

				for (int j = 0; j < Lista2.size(); j++) {

					if ((elemento.getIdPersona() == this.Lista2.get(j).getIdPersona())
							&& (elemento.getNombre() == this.Lista2.get(j).getNombre())) {

						repetido = true; // se encontró el mismo elemento en la lista2
					}

				}
				if (repetido == false) {
					this.Lista1_faltantes2.add(elemento); // agrega el elemento que no se encontró o no se repitió en la
															// lista2.

				}

			}
			i++;
			repetido = false;
		}

	}

	// 3. Listado de elementos presentes en la Lista2 y faltantes de la Lista1.

// PRE: Debe existir 2 listas con sus datos cargados .
// POST: Compara las lista y agrega a la << lista2_faltantes1 >> los elementos que no contengan ningun elemento null en la lista2 y falten en la lista 1.

	public void comparaLista2Presentes(List<Persona> Lista1, List<Persona> Lista2) {

		boolean repetido = false;
		int i = 0;

		while (i < this.Lista2.size()) {

			if (this.Lista2.get(i).getIdPersona() != null && this.Lista2.get(i).getNombre() != null) {

				Persona elemento = this.Lista2.get(i); // elemento de la lista2 sin ningun atributo null

				for (int j = 0; j < Lista1.size(); j++) {

					if ((elemento.getIdPersona() == this.Lista1.get(j).getIdPersona())
							&& (elemento.getNombre() == this.Lista1.get(j).getNombre())) {

						repetido = true; // se encontró el mismo elemento en la lista1
					}

				}
				if (repetido == false) {
					this.Lista2_faltantes1.add(elemento); // agrega el elemento que no se encontró o no se repitió en la
															// lista1.

				}

			}
			i++;
			repetido = false;

		}

	}

	// 4. Elementos en conflicto, es decir, elementos con mismo id pero con distinto
	// nombre

	public void comparaListaConflictos(List<Persona> Lista1, List<Persona> Lista2) {

		for (int i = 0; i < Lista1.size(); i++) {
			for (int j = 0; j < Lista2.size(); j++) {
				if (Lista1.get(i).getIdPersona() == (Lista2.get(j).getIdPersona())) {
					if (Lista1.get(i).getNombre() != (Lista2.get(j).getNombre())) {
						Persona per = Lista1.get(i);
						Persona per2 = Lista2.get(j);
						this.ListaConflictos.add(per);
						this.ListaConflictos.add(per2);
					}

				}
			}
		}

	}

}// fin clase
