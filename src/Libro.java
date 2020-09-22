
public class Libro {
	
	private String Titulo;
	private String Autor;
	private String Fecha;
	private String Disponible;
	public Libro() {
		super();
	}
	public Libro(String titulo, String autor, String fecha, String disponible) {
		super();
		Titulo = titulo;
		Autor = autor;
		Fecha = fecha;
		Disponible = disponible;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getDisponible() {
		return Disponible;
	}
	public void setDisponible(String disponible) {
		Disponible = disponible;
	}
	@Override
	public String toString() {
		return "Libro [Titulo=" + Titulo + ", Autor=" + Autor + ", Fecha=" + Fecha + ", Disponible=" + Disponible + "]";
	}
	
	
}
