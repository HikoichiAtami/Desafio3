import java.util.ArrayList;
import java.util.List;

public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibroVO vo = new LibroVO();
		Libro libro = new Libro();
		libro.setTitulo("Gola");
		libro.setDisponible("si");
		libro.setAutor("H");
		libro.setFecha("a");
		Libro libro1 = new Libro();
		libro1.setTitulo("Gol2a");
		libro1.setDisponible("si2");
		libro1.setAutor("H2");
		libro1.setFecha("a2");
		List<List<Libro>> l = new ArrayList<List<Libro>>();
		List<Libro> a = new ArrayList<Libro>();
		List<Libro> b = new ArrayList<Libro>();
		a.add(libro);
		b.add(libro1);
		l.add(a);
		l.add(b);
		vo.setLibrovo(l);
		System.out.println(vo.getLibrovo().get(0));
	}

}
