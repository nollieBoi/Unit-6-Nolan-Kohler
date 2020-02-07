public class MusicLibrary {
    private Album[] library;

    public MusicLibrary(){
        library = new Album[10];
    }

    //looks for spot that is null, adds album to its location
    //then return true
    //if no null spots, don't add return false
    public boolean add(Album album){
        for(int i = 0; i < library.length - 1; i++) {
            if (library[i] == null) {
                library[i] = album;
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < library.length) {
            if (library[index] != null) {
                library[index] = null;
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String result = "";
        for(Album a: library){
            if(a != null) {
                result += a.toString() + "\n";
            }
        }
        return result;
    }
}
