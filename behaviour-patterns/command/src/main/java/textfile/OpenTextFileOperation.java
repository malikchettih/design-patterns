package textfile;

/**
 * <b>Concrete Command implementation</b>
 * @See TextFileOperation
 */
public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return this.textFile.open();
    }
}
