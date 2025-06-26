package Document;

import java.util.ArrayList;
import java.util.List;

public class History2 {
    private List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state){
        states.add(state);
    }

    public DocumentState pop(){
        var lastIndex = states.size() - 1;
        var lastState = states.remove(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
