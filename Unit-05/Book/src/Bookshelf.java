public class Bookshelf  {

    public static void main(String[] args) {
    	// Variables
       final int year1 = 2015;
       final int year2 = 2014;
       final int year3 = 2008;   
       String title1 = "Title: \t\tJava Softawre Solutions 8th edition \n";
       String title2 = "Title: \t\tVisual C# 2012 \n";
       String title3 = "Title: \t\tGuide to Unix Using Linux  \n";
       String pub1 = "Publisher: \tPearson \nCopyright: \t";
       String pub2 = "Publisher: \tDeitel \nCopyright: \t";
       String pub3 = "Publisher: \tCourse Technology - Cengage Learning\nCopyright: \t";
       String author1 = "Authors: \tLouis & Loftus \n";
       String author2 = "Authors: \tPaul Deitel & Harvey Deitel \n";
       String author3 = "Authors: \tMichael Palmer \n";
       
       // Instances of Book object
       Book name1 = new Book(title1, author1, pub1, year1);
       Book name2 = new Book(title2, author2, pub2, year2);      
       Book name3 = new Book(title3, author3, pub3, year3);

       // Output
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }
}