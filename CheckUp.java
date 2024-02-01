public class CheckUp{
    public static void main(String[] args){
        System.out.println("---- part 1, Strings ----");
        
        // TODO Modify the calls to substring so that the program below will print true.
        String word1 = "motorcycle";
        String word2 = "recycle";
        String word1part2 = word1.substring(5);
        String word2part2 = word2.substring(5);
        System.out.println(word1part2.equals(word2part2));


        String s1 = "Avocados are a fruit, not a vegetable.";
        String s2 = "Venus is the only planet to spin clockwise.";
        // TODO Use substring and length methods to get the first half of s1. (No hard coded string lengths.)
        // TODO Use substring and length methods to get the second half of s2. (No hard coded string lengths.)
        // TODO Concatenate the two substrings together and display the concatenated result.
        String s3 = s1.substring(0, s1.length()/2);
        String s4 = s2.substring(s2.length()/2);
        String ans = s3+s4;
        System.out.println(ans);



        String embedCode = "<iframe src='https://docs.google.com/document/d/e/2PACX-1vQ4vbItFgdRQ-KmgfxGlknEta7Zgvp__irD6yxhnLhurF_2P6OtoItUbpKy_yCG-szEwK3jgHd7G6_/pub?embedded=true' width='800' height='600'></iframe>";
        // TODO get the text from inside the <iframe> tag. Your answer should begin after the first '<' and continue until the first '>'

        // TODO get the web address, between the ' and '





        System.out.println("---- part 2, Objects ----");        
        // TODO create 2 book objects

        // TODO complete the TODO in the Book constructor

        // TODO call the showContents method

        // TODO call the getNumPages method, display the results in a sentence

        // TODO Modify the statement below so that the print statement provides the information found in the toString method of the Book class
        System.out.println("Here's the info about one book: ");


    } // close main
} // close Main



class Book{
    private String author, title;
    private int numPages;

    public Book(String a, String t){
        this.author = a;
        this.title = t;
        // TODO a book should have a random number of pages between 50 and 1000 inclusive
        this.numPages = (int)(Math.random()*951)+50;
    }

    public String toString(){
        return this.title + " by " + this.author + " has " + this.numPages + " pages.";
    }

    public void showContents(){
        System.out.println("Once upon a time...");
    }

    public int getNumPages(){
        return this.numPages;
    }

} // close Book