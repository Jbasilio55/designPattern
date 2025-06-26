import Editor.Editor;
import Editor.History;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Memento is a behavioral design pattern that lets you save and restore the previous state of an object without
        // revealing the details of its implementation.

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.restore(history.pop()); //removes b from history
        System.out.println(editor.getContent()); // return b

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}