import java.io.File;

public class DeleteCommand implements Commands {

    String fileName;

    DeleteCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        File file = new File(fileName);
        file.delete();
    }

    @Override
    public void redo() {

    }
}