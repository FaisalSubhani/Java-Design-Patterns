import java.util.ArrayList;

public class Playlist implements Container {
 public ArrayList<String> songs=new ArrayList<String>(){};

         @Override
 public Iterator getIterator() {
         return new PlaylistIterate() ;
         }
 private class PlaylistIterate implements Iterator{
 int i;
 @Override
 public boolean hasNext() {
             if (i<songs.size()){
                 return true;
                 }
             return false;
             }

 @Override
 public Object next() {
             if(this.hasNext()){
                 return songs.get(i++);
                 }
             return null;
             }
 }
    public void addSong(String sng) {
        songs.add(sng); //Will add song at the end of the list
    }
    public void deleteSong(String sng) {
        songs.remove(sng);
    }
}
