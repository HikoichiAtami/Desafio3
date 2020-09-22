import java.util.List;

public class LibroVO {

	private List<List<Libro>> librovo;

	public LibroVO(List<List<Libro>> librovo) {
		super();
		this.librovo = librovo;
	}

	public LibroVO() {
		super();
	}

	public List<List<Libro>> getLibrovo() {
		return librovo;
	}

	public void setLibrovo(List<List<Libro>> librovo) {
		this.librovo = librovo;
	}

	@Override
	public String toString() {
		return "LibroVO [librovo=" + librovo + "]";
	}



	
	
	
}
