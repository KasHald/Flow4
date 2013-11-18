package flow.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordPairControl implements WordPairControlIF {
    
    private static PrintWriter pw;
    private static StringBuilder strBuilder = new StringBuilder();
    private static Random r = new Random();
    private static Scanner s;
    private static ArrayList<String[]> wordList = new ArrayList<>();
    private String path;

    @Override
    public void add(String question, String answer) {
        String[] temp = {question, answer};
        wordList.add(temp);
    }

    @Override
    public boolean delete(String question) {
        for (int x = 0; x < wordList.size(); x++){
            String[] temp = wordList.get(x);
            if (temp[0].equals(question)){
                wordList.remove(x);
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return wordList.size();
    }

    @Override
    public String getRandomQuestion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkGuess(String question, String quess) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String lookup(String question) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean load() {
        strBuilder.append(System.getProperty("user.dir"));
        strBuilder.append("/wordlist");
        String dir = strBuilder.toString();
        File file;
        try {
            file = new File(dir);
            if (!file.exists()) {
                file.mkdir();
                this.path = dir;
            } else {
                this.path = dir;
            }
            return buildList();
        } catch (Exception e) {
        }
        try {
            strBuilder.append("/wordlist.txt");
            file = new File(strBuilder.toString());
            file.createNewFile();
            this.path = strBuilder.toString();
            return buildList();
        } catch (Exception e) {
            return false;
        }
    }
    
    private boolean buildList(){
        try {
            wordList = new ArrayList();
            s = new Scanner(new File(path));
            while (s.hasNext()) {
                String tmp = s.nextLine();
                String[] words = tmp.split(",");
                wordList.add(words);
            }
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (Exception e) {
            return false;
        }
    } 

    @Override
    public boolean save() {
        try {
            pw = new PrintWriter(path);
            for (int x = 0; x < wordList.size(); ++x) {
                String[] temp = wordList.get(x);
                pw.write(temp[0] + "," + temp[1]);
                pw.println("\n");
            }
            pw.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
