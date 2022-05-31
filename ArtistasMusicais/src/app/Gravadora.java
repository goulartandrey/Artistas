package app;
import java.util.ArrayList;

public class Gravadora {

	public ArrayList<Artista> lista = new ArrayList<Artista>();
	
	public Gravadora() {
		
	}

	public ArrayList<Artista> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Artista> lista) {
		this.lista = lista;
	}
	public void armazenar (Artista a1) {
		lista.add(a1);
	}
	public void apagarLista() {
		lista.clear();
	}
	public int qtdArtistas() {
		return lista.size();
	}
	
}
