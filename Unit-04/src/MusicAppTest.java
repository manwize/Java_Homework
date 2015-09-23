public class MusicAppTest {

	public static void main(String[] args) {

		// Define Album
		Album Album = new Album();

		// Songs
		Song song1 = new Song();
		Song song2 = new Song();
		Song song3 = new Song();

		// Song attributes
		song1.setTitle("Sweetest Taboo");
		song1.setArtist("Sade");
		song1.setMinutes(4);

		song2.setTitle("Midnight Melody");
		song2.setArtist("Miles Davis");
		song2.setMinutes(7);

		song3.setTitle("Purple Rain");
		song3.setArtist("Prince");
		song3.setMinutes(6);

		// Add songs to album
		Album.add(song1);
		Album.add(song2);
		Album.add(song3);

		// Output
		System.out.println("The longest song: " + Album.getLongest());
		System.out.println("The shortest song: " + Album.getShortest());
		System.out.println();

		System.out.println(Album.toString());
		System.out.println();

		System.out.println(song1);
		System.out.println(song2);
		System.out.println(song3);

	}
}
