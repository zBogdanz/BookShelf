import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Book book1 = new Book ("Dune","Frank Herbert","SF");
        Book book2 = new Book ("Ion","Marin Preda","drama");
        Book book3 = new Book("I.T.","Marin Preda","S.F.");
        ArrayList<Book> books = new ArrayList<> ();

        Bookshelf raftSf = new Bookshelf(books);
        raftSf.addBook (book2);
        if (raftSf.contains (book1)){
            System.out.println ("Cartea este deja in raft");
        } else{
            //System.out.println ("Cartea nu e in raft");
            raftSf.addBook (book1);

        }
        raftSf.addBook (book3);

        raftSf.selecteazaCarte ();

        raftSf.existingAutor (book1.getAutor ());

        int nrCarti=raftSf.nrCartiAutor("Marin Preda");
        System.out.print(nrCarti);
        System.out.println(" carti de acest autor");
        ArrayList<Book> cartiMP = raftSf.cartiDeAutor ("Marin Preda");
        System.out.println ();
        System.out.println (cartiMP);

        //sf.afiseaza (0);
        //sf.afiseaza (1);
        //sf.removeBook (book1);


    }
}
