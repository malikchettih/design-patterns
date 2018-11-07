package textfile;

/***
 * <b></b>The command interface</b>
 * A command is an object whose role is to store all the information required for executing an action, including the method to call, the method arguments, and the object (known as the receiver) that implements the method.
 */
@FunctionalInterface
public interface TextFileOperation {

    String execute();
}
