import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<> ();
        ArrayList<Book> books2 = new ArrayList<> ();

        Book book1 = new Book ("Dune", "Frank Herbert", "SF");
        Book book2 = new Book ("Ion", "Marin Preda", "drama");
        Book book3 = new Book ("I.T.", "Stephen King", "SF");
        Book book4 = new Book ("Christine", "Stephen King", "SF");
        Book book5 = new Book ("Ion", "Marin Preda", "drama");
        Book book6 = new Book ("Dune", "Frank Herbert", "SF");

        Bookshelf raft = new Bookshelf (books);
        Bookshelf raft2 = new Bookshelf (books2);

        raft2.addBook (book4);
        raft2.addBook (book5);
        raft2.addBook (book6);

        raft.addBook (book2);
        raft.addBook (book1);
        raft.addBook (book3);

        raft.selecteazaCarte ();

        raft.existingAutor (book1.getAutor ());

        int nrCarti = raft.nrCartiAutor ("Marin Preda");
        System.out.print (nrCarti);
        System.out.println (" carti de acest autor");

        ArrayList<Book> cartiMP = raft.cartiDeAutor ("Marin Preda");
        System.out.println ();
        System.out.println ("Avem urmatoarele carti de acest autor ");
        System.out.println (cartiMP);

        ArrayList<String> genuri = raft.cartiGen ();
        int[] nrGenuri = raft.booksCountGenre ();
        System.out.println ();
        System.out.println ("Avem urmatoarele genuri de carti ");
        for (int i = 0; i < genuri.size (); i++) {
            System.out.println ("Exista " + nrGenuri[i] + " carti de genul " + genuri.get (i));
        }

        ArrayList<Book> sameBooks = raft.compareTo (raft2);
        System.out.println ("Cartile comune sunt " +sameBooks);
    }
}