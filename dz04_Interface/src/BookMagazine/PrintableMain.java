package BookMagazine;

public class PrintableMain {
    public static void main(String[] args)
    {
     Book _book1 = new Book(" Potok");
     Book _book2 = new Book(" YTEYU");
     Magazine _magazine1 = new Magazine("Пушкин");
     Magazine _magazine2 = new Magazine("фафафа");

     Printable[] printables = {_book1,_book2,_magazine1,_magazine2};
     for( Printable printable:printables)
     {
         printable.print();
     }
     Magazine.printMagazines(printables);
    }
}