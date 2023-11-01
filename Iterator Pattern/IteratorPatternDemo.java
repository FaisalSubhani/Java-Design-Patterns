public class IteratorPatternDemo {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        Playlist songsRepository = new Playlist();
        Playlist songsRepository2 = new Playlist();

        songsRepository.addSong("Song P1");
        songsRepository.addSong("Song P2");
        songsRepository.addSong("Song P3");
        songsRepository2.addSong("Song 2P1");
        songsRepository2.addSong("Song 2P2");
        songsRepository2.addSong("Song 2P3");
        System.out.println("\n----------Playlist Songs--------:");
        for (Iterator iter = songsRepository.getIterator(); iter.hasNext(); ) {
            String song = (String) iter.next();

            System.out.println("Name of song : " + song);
        }
        // Deleting a song from the playlist
        songsRepository.deleteSong("Song P1");

        System.out.println("\nAfter deleting 'Song P1':");
        System.out.println("\n----------Playlist Songs--------:");
        for (Iterator iter = songsRepository.getIterator(); iter.hasNext(); ) {
            String song = (String) iter.next();
            System.out.println("Name of song : " + song);
        }
        musicLibrary.addPlaylist(songsRepository2);

        musicLibrary.deletePlaylist(songsRepository);
        System.out.println("\n---------- Music Library Playlists----------");
        for (Playlist playlist : musicLibrary.musicList) {
            System.out.println("\nPlaylist Songs:");
            for (Iterator iter = playlist.getIterator(); iter.hasNext(); ) {
                String song = (String) iter.next();
                System.out.println("Name of song: " + song);
            }
        }

        // Print the updated list of playlists
        System.out.println("\n---------- Music Library Playlists (After Deleting Playlist 1) ----------");
        for (Playlist playlist : musicLibrary.musicList) {
            System.out.println("\nPlaylist Songs:");
            for (Iterator iter = playlist.getIterator(); iter.hasNext(); ) {
                String song = (String) iter.next();
                System.out.println("Name of song: " + song);
            }
        }
    }
}