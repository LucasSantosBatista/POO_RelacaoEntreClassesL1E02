/**
 * 
 */
package model;

import model.Musica;
import java.util.List;

/**
 * @author Lucas Batista 24 de mar. de 2024
 */
public class Playlist {
	private List<Musica> listaMusicas;
	private String dono;

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public void adicionarMusica(Musica musica) {
		this.listaMusicas.add(musica);
	}

	public void tocarMusicaAleatoria() {
		if (listaMusicas.isEmpty()) {
			System.out.println("A playlist está vazia.");
			return;
		}

		int tamanhoLista = listaMusicas.size();
		int indiceAleatorio = (int) (Math.random() * tamanhoLista);

		Musica musicaAleatoria = null;
		int contador = 0;
		for (Musica musica : listaMusicas) {
			if (contador == indiceAleatorio) {
				musicaAleatoria = musica;
				break;
			}
			contador++;
		}

		System.out.println("Tocando música: " + musicaAleatoria.getNome());
	}
}
