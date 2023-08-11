import java.util.*;

public class CommandInvoker {

    Queue<Commands> commandQueue = new PriorityQueue<>();

    public void addCommand(Commands command) {
        commandQueue.add(command);
    }

    public void executeCommand() {
        int queueSize = commandQueue.size();
        for (int i = 0; i < queueSize; i++) {
            Commands command = commandQueue.poll();
            try {
                command.execute();
            } catch (Exception e) {
                command.redo();
                break;
            }
        }
    }

}