import Canvas.Canvas;
import Canvas.SelectionTool;
import Canvas.BrushTool;
import Canvas.EraserTool;
import DirectionService.DirectionService;
import DirectionService.Walking;

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

//        -----Exercise------

//        In the Exercises project, look at the code in the state/
//        DirectionService class. This is the class that powers our mapping app.
//              It provides two methods for calculating the estimated time of
//        arrival (ETA) and the direction between two points.
//        Identify the problems in this implementation. Then, refactor the code
//        to use the state pattern. What are the benefits of the new
//        implementation?

        var service = new DirectionService(new Walking());
        service.getETA();
        service.getDirections();
    }
}
