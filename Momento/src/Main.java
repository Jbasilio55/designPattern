import Document.Document;
import Document.History2;
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


//        Exercise
//        In the Exercises project, look at the code in the memento/Document
//        class. This class represents a document in a word processor like MS
//                Word or Apple Pages.
//        Our Document class has three attributes:
//                - content
//                - fontName
//                - fontSize
//        We should allow the user to undo the changes to any of these
//        attributes. In the future, we may add additional attributes in this
//        class and these attributes should also be undoable.
//        Implement the undo feature using the memento pattern.

        var document = new Document("hello", "ariel", 2.2);
        var history2 = new History2();
        history2.push(document.createState());

        document.setContent("hows it going");
        document.setFontName("roboto");
        document.setFontSize(3.2);
        history2.push(document.createState());

        document.setContent("hows it going");
        document.setFontName("sans-sariff");
        document.setFontSize(5);

        document.restore(history2.pop());
        System.out.println(document);

        document.restore(history2.pop());
        System.out.println(document);

    }
}