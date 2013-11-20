package flow.pkg4;

public class Start {
    public static void main(String[] args) {
        WordPairControlIF control = new WordPairControl();
        WordPairGUI program = new WordPairGUI();
        program.setVisible(true);
    }
}
