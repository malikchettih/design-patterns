package textfile;

/**
 * <b>The receiver class</b>
 * A receiver is an object that performs a set of cohesive actions. It’s the component that performs the actual action
 * when the command’s execute() method is called.
 */
public class TextFile {

    private String name;

    public TextFile(String name){
        this.name = name;
    }

    public String open(){
        return "Opening file " + name;
    }

    public String save(){
        return "Saving file " + name;
    }
}
