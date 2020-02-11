public class MusicLibraryClient {
        public static void main(String[] args) {
            MusicLibrary myLibrary = new MusicLibrary();

            Album a1 = new Album("First", "one Guy", 10, 42.5);
            Album a2 = new Album("This Music", "Some Band", 9, 36);
            Album a3 = new Album("Play", "People", 12, 39.1);
            Album a4 = new Album("g", "ew", 8, 45);
            Album a5 = new Album("a", "y", 8, 45);
            Album a6 = new Album("m", "u", 8, 45);
            Album a7 = new Album("e", "c", 8, 45);
            Album a8 = new Album("r", "k", 8, 45);
            Album a9 = new Album("um", "awk", 8, 45);
            Album a10 = new Album("ok", "umm", 8, 45);

            System.out.println(a1);

            myLibrary.add(a1);
            myLibrary.add(a2);
            myLibrary.add(a3);
            myLibrary.add(a4);
            myLibrary.add(a5);
            myLibrary.add(a6);
            myLibrary.add(a7);
            myLibrary.add(a8);
            myLibrary.add(a9);
            myLibrary.add(a10);

            System.out.println(myLibrary);

            System.out.println("+++++++++++++++++++++++++++++++++++++++");

            //myLibrary.doubleSize();

            //System.out.println(myLibrary);

            //System.out.println("+++++++++++++++++++++++++++++++++++++++");

            System.out.println("Test selection sort");

            myLibrary.sortByTitle();

            System.out.println(myLibrary);

            System.out.println("+++++++++++++++++++++++++++++++++++++++");

            int loc = myLibrary.findTitle("First");
            System.out.println("Found 'First' at index: " + loc);
            System.out.println(myLibrary.getAlbum(loc));

        }
    }
