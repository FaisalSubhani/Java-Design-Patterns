import java.util.ArrayList;
import java.util.Iterator;

public class MusicLibrary implements Container {
    public ArrayList<Playlist> musicList = new ArrayList<>();
    @Override
    public Iterator getIterator() {
        return new PlaylistIterator();
    }


    private class PlaylistIterator implements Iterator<Playlist> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < musicList.size();
        }

        @Override
        public Playlist next() {
            if (hasNext()) {
                return musicList.get(currentIndex++);
            }
            return null;
        }
    }

    public void addPlaylist(Playlist playlist) {
        musicList.add(playlist);
    }

    public void deletePlaylist(Playlist playlist) {
        musicList.remove(playlist);
    }
}
