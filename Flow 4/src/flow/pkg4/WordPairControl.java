package flow.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordPairControl implements WordPairControlIF {
    
//    private static StringBuilder strBuilder = new StringBuilder();
    private static PrintWriter pw;
    private static Random r = new Random();
    private static Scanner s;
    private static ArrayList<String[]> wordList = new ArrayList<>();
//    private String path;

    @Override
    public void add(String question, String answer) {
        String[] temp = {question, answer};
        wordList.add(temp);
    }

    @Override
    public boolean delete(String question) {
        for (int x = 0; x < wordList.size(); x++){
            String[] temp = wordList.get(x);
            if (temp[0].equalsIgnoreCase(question)){
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
        if (wordList.size() > 0){
            String[] temp = wordList.get(r.nextInt(wordList.size()));
            return temp[1];
        }
        return null;
    }

    @Override
    public boolean checkGuess(String question, String quess) {
        for (int x = 0; x < wordList.size(); x++){
            String[] temp = wordList.get(x);
            if (temp[1].equalsIgnoreCase(question) && temp[0].equalsIgnoreCase(quess)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String lookup(String question) {
       for (int x = 0; x < wordList.size();x++){
           String[] temp = wordList.get(x);
           if (question.equalsIgnoreCase(temp[0])){
               return temp[1];
           } else if (question.equalsIgnoreCase(temp[1])){
               return temp[0];
           }
       }
        return null;
    }

    @Override
    public boolean load() {
        try {
            wordList = new ArrayList();
            s = new Scanner(new File("wordlist.txt"));
            while (s.hasNextLine()) {
                String tmp = s.next();
                String[] words = tmp.split(",");
                wordList.add(words);
            }
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (Exception e) {
            return false;
        }
//        strBuilder.append(System.getProperty("user.dir"));
//        strBuilder.append("\\wordlist");
//        String dir = strBuilder.toString();
//        File file;
//        try {
//            file = new File(dir);
//            if (!file.exists()) {
//                file.mkdir();
//                this.path = dir;
//            } else {
//                this.path = dir;
//            }
//            System.out.println(path);
//            return buildList();
//        } catch (Exception e) {
//        }
//        try {
//            strBuilder.append("\\wordlist.txt");
//            file = new File(strBuilder.toString());
//            file.createNewFile();
//            this.path = strBuilder.toString();
//            return buildList();
//        } catch (Exception e) {
//            return false;
//        }
    }
    
//    private boolean buildList(){
//        try {
//            wordList = new ArrayList();
//            s = new Scanner(new File("wordlist.txt"));
//            while (s.hasNext()) {
//                String tmp = s.nextLine();
//                String[] words = tmp.split(",");
//                wordList.add(words);
//            }
//            return true;
//        } catch (FileNotFoundException ex) {
//            return false;
//        } catch (Exception e) {
//            return false;
//        }
//    }
    
    public ArrayList<String[]> getList(){
        return wordList;
    }

    @Override
    public boolean save() {
        try {
            pw = new PrintWriter("wordlist.txt");
            for (int x = 0; x < wordList.size(); ++x) {
                String[] temp = wordList.get(x);
                pw.write(temp[0] + "," + temp[1]);
                if (x != wordList.size() - 1){
                    pw.println("\n");
                }
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
     wordList.clear();
     save();
    }
    
}
