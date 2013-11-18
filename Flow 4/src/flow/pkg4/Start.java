package flow.pkg4;

public class Start {
    public static void main(String[] args) {
        WordPairControlIF control = new WordPairControl();
        Flow4GUI program = new Flow4GUI(control);
        program.setVisible(true);
    }
}
