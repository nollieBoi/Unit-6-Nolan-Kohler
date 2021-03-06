public class MusicLibrary {
    private Album[] library;

    public MusicLibrary() {
        library = new Album[10];
    }

    //looks for spot that is null, adds album to its location
    //then return true
    //if no null spots, don't add return false
    public boolean add(Album album) {
        for (int i = 0; i < library.length - 1; i++) {
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

    public String toString() {
        String result = "";
        for (Album a : library) {
            if (a != null) {
                result += a.toString() + "\n";
            }
        }
        return result;
    }

    public int findTitle(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i].getTitle().equals(title) && library[i] != null) {
                return i;
            }
        }
        System.out.println("This title doesn't exist in this library");
        return -1;
    }

    public int findArtist(String artist) {
        for (int i = 0; i < library.length; i++) {
            if (library[i].getArtist().equals(artist) && library[i] != null) {
                return i;
            }
        }
        System.out.println("This artist doesn't exist in this library");
        return -1;
    }

    public Album getAlbum(int index) {
        if (index >= 0 && index < library.length) {
            return library[index];
        } else {
            System.out.println("Index is out of bounds");
            return null;
        }
    }

    public void sortByTitle() {
        Album temp;
        int min;
        for (int i = 0; i < library.length - 1; i++) {
            min = i;
            for (int scan = i + 1; scan < library.length; scan++) {
                if (library[scan] != null && library[i] != null) {
                    if (library[scan].getTitle().compareTo(library[min].getTitle()) < 0) {
                        min = scan;
                    }
                }
            }
            temp = library[min];
            library[min] = library[i];
            library[i] = temp;
        }

    }

    public void sortByArtist(){
        for(int i = 1; i < library.length; i++){
            Album key = library[i];
            int position = i;

            while (position > 0 && library[position - 1] != null && key != null && library[position - 1].getArtist().compareTo(key.getArtist()) > 0){
                library[position] = library[position - 1];
                position--;
            }
            library[position] = key;
        }

    }

    public void doubleSize(){
        Album[] temp = new Album[library.length*2];
        for (int i = 0; i < library.length; i++) {
            temp[i] = library[i];
        }
        library = temp;
    }

    public int binarySearchByTitle(String target){
        int low = 0, high = library.length - 1, middle = (low + high)/2;

        while(!library[middle].getTitle().equals(target) && low <= high){
                if (target.compareTo(library[middle].getTitle()) < 0)
                    high = middle - 1;
                else
                    low = middle + 1;
                middle = (low + high)/2;
            }

            if (library[middle].getTitle().equals(target))
                return middle;
            else
                return -1;

        }
    }

