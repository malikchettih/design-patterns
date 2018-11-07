package textfile;

import org.junit.Test;

public class TextFileOperationTestCase {

    @Test
    public void test(){
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(
                textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt"))));
        System.out.println(
                textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt"))));
    }
}
