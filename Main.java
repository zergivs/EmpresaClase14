
public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("13213234", "1", "28", "Juan", "Perez", "56987658765", "Habitat", "Quillota 980",
				"Vina");
		Cliente cliente2 = new Cliente("12123123", "2", "32", "Maria", "Gonzalez", "56909870987", "modelo", "Quillota 980",
				"Vina");

		Usuario usuario1 = new Usuario("Marge Simpson", "17 diciembre 1989", "11222333");
		Usuario usuario2 = new Usuario("Walter White", "7 septiembre 1958", "10123123");

		Capacitacion capacitacion1 = new Capacitacion(14, 4, "11234234", "5 de enero", "6pm", "Unab", "4");
		Capacitacion capacitacion2 = new Capacitacion(15, 4, "10234234", "24 de mayo", "6pm", "Unab", "4");

		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		System.out.println(usuario1.toString());
		System.out.println(usuario2.toString());
		System.out.println(capacitacion1.toString());
		System.out.println(capacitacion2.toString());

		cliente1.setNombre("Pedro");
		System.out.println(cliente1.getNombre());

		usuario1.setNombre("Lisa Simpson");
		System.out.println(usuario1.getNombre());

		capacitacion2.setCantidadAsistentes(9);
		System.out.println(capacitacion2.getCantidadAsistentes());

		System.out.print(cliente1.getNombre());
		System.out.print(", " + cliente1.getApellido());
		System.out.print(", " + cliente1.getRut());
		System.out.print(", " + cliente1.getEdad());
		System.out.print(", " + cliente1.getSistemaSalud());
		System.out.print(", " + cliente1.getTelefono());
		System.out.print(", " + cliente1.getAfp());
		System.out.print(", " + cliente1.getDireccion());

	}

}
