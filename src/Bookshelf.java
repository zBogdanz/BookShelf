import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Bookshelf {

    ArrayList<Book> carti= new ArrayList<>();

    public Bookshelf(ArrayList<Book> carti) {
        this.carti = carti;
    }


    public boolean contains(Book book) {

        return carti.contains (book);

    }

    public void addBook(Book newBook){
        carti.add (newBook);
    }

    public void removeBook(Book newBook){
        carti.remove (newBook);
    }

    public void afiseaza(int i){
        System.out.println (carti.get (i));
    }

    public void selecteazaCarte(){
        Random r = new Random ();
        System.out.println ("Va sugeram cartea:");
        afiseaza(r.nextInt (3));
    }

    public void existingAutor(String autor){
        int j = 0;
        for (int i=0;i<carti.size ();i++){
            if(carti.get (i).getAutor().equals(autor)){
                System.out.println ("Exista o carte de acest autor");
                afiseaza(i);
                break;
            } else{
                j++;
                if (j== carti.size ()){
                    System.out.println ("Nu exista nicio carte de acest autor");
                }
            }

        }
    }
    public int nrCartiAutor(String autor) {
        int suma = 0;
        for (int i = 0; i < carti.size (); i++) {
            if (carti.get (i).getAutor ().equals (autor)) {
                suma++;
            }
        }
        return suma;
    }

    public ArrayList<Book> cartiDeAutor(String autor){
        ArrayList<Book> sir = new ArrayList<> ();
        for (int i = 0; i < carti.size (); i++) {
            if (carti.get (i).getAutor ().equals (autor)) {
                sir.add (carti.get (i));
            }
        }
        return sir;
    }

    public ArrayList<String> cartiGen(){
        ArrayList<String> sir = new ArrayList<> ();
        for (int i = 0; i < carti.size (); i++) {
            if (sir.contains (carti.get (i).getGen ())) {
                continue;
            }
                else{
                sir.add (carti.get (i).getGen ());
            }
        }
        return sir;
    }

}

