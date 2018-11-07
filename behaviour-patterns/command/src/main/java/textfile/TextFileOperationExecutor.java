package textfile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <b>Invoker object</b>
 * An invoker is an object that knows how to execute a given command but doesn’t know how the command has been implemented.
 * It only knows the command’s interface.
 *
 * In some cases, the invoker also stores and queues commands, aside from executing them. This is useful for implementing
 * some additional features, such as macro recording or undo and redo functionality.
 */
public class TextFileOperationExecutor {

    private List<TextFileOperation> textFileOperations = new LinkedList<>();

    public String executeOperation(TextFileOperation textFileOperation){
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }

}
