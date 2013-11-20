package flow.pkg4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class ControlClass implements WordPairControlIF
{
    //Attributes
    public ArrayList<WordPair> wordpairs;

    @Override
    public void add(String question, String answer)
    {
        //We initialize the PrintWriter pw, Scanner scan and PrintWriter out to "null".
        PrintWriter pw = null;
        Scanner scan = null;
        PrintWriter out = null;
        //The same "try-catch" method as before.
        try
        {
            //it reads from the file, and makes it possible to write in the file.
            out = new PrintWriter(new BufferedWriter(new FileWriter("words.txt", true)));
        } catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        } catch (Exception e)
        {
            System.out.println("Some error: " + e.getMessage());
        }

        //it adds the string from the input-parameter to the txt-file on a new line. 
        out.println(question + "," + answer);
        //allways important to close the PrintWriter in the end of the method.
        out.close();
    }

    @Override
    public boolean delete(String question)
    {
        //a boolean that indicates if a wordpair has been deleted or not. 
        boolean delete = false;

        for (int index = 0; index < wordpairs.size(); index++)
        {
            String[] tokens = wordpairs.get(index).toString().split(",");
            if (question.equals(tokens[0]) || question.equals(tokens[1]))
            {
                delete = true;
                wordpairs.remove(index);
            }
        }

        emptyTxt();
        addString(wordpairs);

        return delete;
    }

    //------------------------------------------------------------------------//
    //private methods that assists the "delete"-method
    private static void emptyTxt()
    {
        //empties the txt file
        PrintWriter pw = null;
        PrintWriter out = null;
        try
        {
            pw = new PrintWriter(new File("words.txt"));
        } catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        } catch (Exception e)
        {
            System.out.println("Some error: " + e.getMessage());
        }

        //Her ændrer jeg tekstdokumentet med ny tekst
        //Vigtigt uden ln, da der skal kunne printes på første linje
        pw.print("");
        pw.close();
    }

    private static void addString(ArrayList<WordPair> array)
    {
        //We initialize the PrintWriter pw, Scanner scan and PrintWriter out to "null".
        PrintWriter pw = null;
        Scanner scan = null;
        PrintWriter out = null;
        //The same "try-catch" method as before.
        try
        {
            //it reads from the file, and makes it possible to write in the file.
            out = new PrintWriter(new BufferedWriter(new FileWriter("words.txt", true)));
        } catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        } catch (Exception e)
        {
            System.out.println("Some error: " + e.getMessage());
        }

        for (int i = 0; i < array.size(); i++)
        {
            out.println(array.get(i));
        }
        out.close();
    }
    //------------------------------------------------------------------------//

    @Override
    public int size()
    {
        return wordpairs.size();
    }

    @Override
    public String getRandomQuestion()
    {
        //we create a string-array "words" from the wordpairs-arraylist. 
        String[] words = new String[wordpairs.size() * 2];

        int wordsindex = 0;

        for (int i = 0; i < wordpairs.size(); i++)
        {
            String[] tokens = wordpairs.get(i).toString().split(",");
            words[wordsindex] = tokens[0];
            words[wordsindex + 1] = tokens[1];
            wordsindex = wordsindex + 2;
        }

        //we generate a random generated string from the "words"-array
        Random r = new Random();
        int generatedindex = r.nextInt(words.length);
        //returns the word that is to be translated.
        //the word was on the generated number's index. 
        return words[generatedindex];
    }

    @Override
    public boolean checkGuess(String question, String quess)
    {
        boolean correct = false;

        for (int i = 0; i < wordpairs.size(); i++)
        {
            String[] tokens = wordpairs.get(i).toString().trim().split(",");
            if (question.equalsIgnoreCase(tokens[0].trim()) && quess.equalsIgnoreCase(tokens[1].trim()))
            {
                correct = true;
            }
            if (question.equalsIgnoreCase(tokens[1].trim()) && quess.equalsIgnoreCase(tokens[0].trim()))
            {
                correct = true;
            }
        }
        return correct;
    }

    @Override
    public String lookup(String question)
    {
        String guess = null;

        for (int i = 0; i < wordpairs.size(); i++)
        {
            String[] tokens = wordpairs.get(i).toString().split(",");
            if (question.equalsIgnoreCase(tokens[0].trim()))
            {
                guess = tokens[1].trim();
            }
            if (question.equalsIgnoreCase(tokens[1].trim()))
            {
                guess = tokens[0].trim();
            }
        }
        return guess;
    }

    @Override
    public boolean load()
    {
        boolean succesfull = false;
        //We initialze the Scanner scan to "null".
        Scanner scan = null;
        //Important to use the "try-catch" method when we read from files.
        try
        {
            scan = new Scanner(new File("words.txt"));
        } //catch = it seeks for the error "file not found"-
        //because the Scanner is throwing a FileNotFoundException back
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        } //cathces all the other errors. (cowboy trick) ;-)
        catch (Exception e)
        {
            System.out.println("Some error: " + e.getMessage());
        }

        wordpairs = new ArrayList<WordPair>();

        //This while-loop executes for every line in the txt-file.
        while (scan.hasNext())
        {

            //The Scanner scans a line, and we initialize it with the String-variable "str".
            String str = scan.nextLine().trim(); //optional trim required
            //We split the line into an array, called "tokens".
            //each index gets a string, with the text, there is between each comma in a right order.
            String[] tokens = str.split(",");

            WordPair wp = new WordPair(tokens[0].trim(), tokens[1].trim());

            succesfull = true;

            wordpairs.add(wp);
        }
        return succesfull;
    }

    @Override
    public boolean save()
    {
        emptyTxt();
        addString(wordpairs);
        return true;
    }

    @Override
    public void clear()
    {
        emptyTxt();
        for(int index = 0; index < wordpairs.size(); index++)
        {
            wordpairs.remove(index);
        }
    }
}
