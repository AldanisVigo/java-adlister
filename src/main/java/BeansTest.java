import model.Album;
import model.Author;
import model.Quote;

import java.util.ArrayList;

public class BeansTest {
    public static void main(String[] args){
        //Create a class, BeanTest, and include a main method that instantiates a few
        // instances of Album, Author and Quote.

        //Few instances of Author
        Author authorOne = new Author(0,"Jose","Vigo-Tomaseviche");
        Author authorTwo = new Author(1,"Isaac","Newton");
        Author authorThree = new Author(2,"Linus","Torvalds");

        //Few instances of Album
        Album albumOne = new Album(0,"VigoBeatz","Sometimes I'm Clover","2009",500000,"Trap");
        Album albumTwo = new Album(1,"Jhakari Neptune, VigoBeatz","Double it Up","2020",210000,"Trap");
        Album albumThree = new Album(2,"Pine Straw","Lemon Pepper","2021",430000,"Trap");


        //Few instances of Quote
        Quote quoteOne = new Quote(0,"Talk is Cheap, Show me the code.",authorThree);
        Quote quoteTwo = new Quote(1,"Tact is the knack of making a point without making an enemy.",authorTwo);
        Quote quoteThree = new Quote(2,"La vida es corta, vivela con toda la pasion que puedas dar. Y al final, sera suficiente.",authorOne);

        //In BeanTest, experiment with storing multiple instances of Quote in an arraylist
        // and iterating over it to print out the content and author name of multiple quotes.
        ArrayList quotes = new ArrayList<Quote>();
        quotes.add(quoteOne);
        quotes.add(quoteTwo);
        quotes.add(quoteThree);

        //Iterate through with a for loop and show the data from the javabeans
        for(Object q : quotes){
            Quote currQuote = (Quote) q;
            int curQuoteId = currQuote.getId();
            System.out.print("Quote: " + currQuote.getContent());
            System.out.println(" - Author: " + currQuote.getAuthor().getFirstName() + " " + currQuote.getAuthor().getLastName());
        }
    }
}