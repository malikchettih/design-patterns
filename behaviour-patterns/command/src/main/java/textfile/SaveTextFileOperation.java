package textfile;

/**
 * <b>Concrete Command implementation</b>
 * @See TextFileOperation
 */
public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return this.textFile.save();
    }
}
