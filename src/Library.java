import java.util.HashMap;
import java.util.ArrayList;
import java.util.function.IntBinaryOperator;

/**
 * Created by adam on 19.11.16.
 */
public class Library {

    public static void main(String[] args){

        System.out.println(createBooksCounter());
        System.out.println(findWhiteRavens(createBooksCounter()));
    }

    private static String[] BOOKS = {"Priests Of Dawn",
            "Chicken Abroad",
            "Lord With Sins",
            "Chicken Abroad",
            "Fish And Horses",
            "Mistress Of Devotion",
            "Bandit Of The Void",
            "Lord With Sins",
            "Guardians And Gangsters",
            "Lions Of Dread",
            "Chicken Abroad",
            "Future Of Fire",
            "Priests Of Dawn",
            "Fish And Horses",
            "Chicken Abroad",
            "Fish And Horses",
            "Guardians And Gangsters",
            "Inception Of Heaven",
            "Lord With Sins",
            "Future Of Fire",
            "Driving Into The Depths",
            "Starting The Demons",
            "Maid With Blue Eyes",
            "Mistress Of Devotion",
            "Lovers In The Forest",
            "Fish And Horses",
            "Maid With Blue Eyes",
            "Destruction Of The Faceless Ones",
            "Guardians And Gangsters",
            "Chicken Abroad"};

    public static HashMap<String, Integer> createBooksCounter() {
        HashMap<String, Integer> books = new HashMap<>();
        for(int i=0;i<BOOKS.length;i++){
            if (books.containsKey(BOOKS[i])){
                books.put(BOOKS[i], books.get(BOOKS[i]) + 1);
            }
            else{
                books.put(BOOKS[i],1);
            }
        }


        return books;
    }

    public static void countBook(HashMap<String, Integer> booksCounter, String book) {
    }

    public static ArrayList<String> findWhiteRavens(HashMap<String, Integer> booksCounter) {
        ArrayList<String> whiteRavens = new ArrayList<>();
        for(String title : booksCounter.keySet()){
            if(booksCounter.get(title)==1){
                whiteRavens.add(title);
            }
        }
        return whiteRavens;
    }

    public static void printWhiteRavens(ArrayList<String> whiteRavens) {
    }
}
