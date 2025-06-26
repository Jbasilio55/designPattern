import Canvas.Canvas;
import Canvas.SelectionTool;
import Canvas.BrushTool;
import Canvas.EraserTool;

public class Main {
    public static void main(String[] args) {
//        State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
//        It appears as if the object changed its class.

        var canvas = new Canvas(); //create canvas

        canvas.setCurrentTool(new SelectionTool()); //switch tool to selection tool
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println();

        canvas.setCurrentTool(new BrushTool()); //switch tool to brush tool
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println();

        canvas.setCurrentTool(new EraserTool()); //switch tool to eraser tool
        canvas.mouseDown();
        canvas.mouseUp();

        //------------------------------------------------
    }
}
