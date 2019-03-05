import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Book book1 = new Book ("Dune","Frank Herbert","SF");
        Book book2 = new Book ("Ion","Marin Preda","drama");
        Book book3 = new Book("I.T.","Stephen King","SF");
        ArrayList<Book> books = new ArrayList<> ();

        Bookshelf raft = new Bookshelf(books);
        raft.addBook (book2);
        if (raft.contains (book1)){
            System.out.println ("Cartea este deja in raft");
        } else{
            //System.out.println ("Cartea nu e in raft");
            raft.addBook (book1);

        }
        raft.addBook (book3);

        raft.selecteazaCarte ();

        raft.existingAutor (book1.getAutor ());

        int nrCarti=raft.nrCartiAutor("Marin Preda");
        System.out.print(nrCarti);
        System.out.println(" carti de acest autor");

        ArrayList<Book> cartiMP = raft.cartiDeAutor ("Marin Preda");
        System.out.println ();
        System.out.println ("Avem urmatoarele carti de acest autor ");
        System.out.println (cartiMP);

        ArrayList<String> genuri = raft.cartiGen ();
        System.out.println ();
        System.out.println ("Avem urmatoarele genuri de carti ");
        System.out.println (genuri);

        //sf.afiseaza (0);
        //sf.afiseaza (1);
        //sf.removeBook (book1);


    }
}
