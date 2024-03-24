/**
 * 
 */
package view;

import model.Musica;
import model.Playlist;

/**
 * @author Lucas Batista 24 de mar. de 2024
 */
public class Main {
	public static void main(String[] args) {
		Musica musica1 = new Musica();
		musica1.setNome("Música 1");
		musica1.setAutor("Autor 1");
		musica1.setGravadora("Gravadora 1");

		Musica musica2 = new Musica();
		musica2.setNome("Música 1");
		musica2.setAutor("Autor 1");
		musica2.setGravadora("Gravadora 1");

		Musica musica3 = new Musica();
		musica3.setNome("Música 1");
		musica3.setAutor("Autor 1");
		musica3.setGravadora("Gravadora 1");

		Playlist playlist = new Playlist();
		playlist.setDono("João");

		playlist.adicionarMusica(musica1);
		playlist.adicionarMusica(musica2);
		playlist.adicionarMusica(musica3);

		// Tocar uma música aleatória
		playlist.tocarMusicaAleatoria();
	}
}