package flow.pkg4;

/**
 *
 * @author Christopher
 */
public class WordPair 
{
    private String question, guess;
    
    public WordPair(String question, String guess)
    {
        this.question = question;
        this.guess = guess;
    }

    @Override
    public String toString()
    {
        return question + "," + guess;
    }
    
    /*
    public String getQuestion()
    {
        return this.question;
    }
    
    public String getGuess()
    {
        return this.guess;
    }
    */
    
    
    
    
}
