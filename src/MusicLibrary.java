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

    public int findTitle(String title){
        for(int i = 0; i < library.length; i++){
            if(library[i].getTitle().equals(title) && library[i] != null){
                return i;
            }
        }
        System.out.println("This title doesn't exist in this library");
        return -1;
    }

    public int findArtist(String artist){
        for(int i = 0; i < library.length; i++){
            if(library[i].getArtist().equals(artist) && library[i] != null){
                return i;
            }
        }
        System.out.println("This artist doesn't exist in this library");
        return -1;
    }

    public Album getAlbum(int index){
       if(index >= 0 && index < library.length){
           return library[index];
       }else {
           System.out.println("Index is out of bounds");
           return null;
       }
    }

    public void sortByTitle(){
        Album temp;
        int min;
        for (int i = 0; i < library.length - 1; i++) {
            min = i;
            for (int scan = i + 1; scan < library.length; scan++) {
                if(library[scan].getTitle().compareTo(library[min].getTitle()) < 0);
                    min = scan;
            }
            temp = library[min];
            library[min] = library[i];
            library[i] = temp;
        }
    }
}
