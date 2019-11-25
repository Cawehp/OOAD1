import java.util.Stack;

public class CommandManager {
    private static CommandManager instance = null;
    private Stack<Command> stackNormal;
    private Stack<Command> stackReverse;

    static CommandManager getInstance() {
        if (instance != null)
            return instance;
        return new CommandManager();
    }

    private CommandManager() {
        stackNormal = new Stack<>();
        stackReverse = new Stack<>();
    }

    void execute(Command command) {
        command.execute();
        stackNormal.push(command);
    }

    void undo() {
        var action = stackNormal.pop();
        action.undo();
        stackReverse.push(action);
    }

    void redo() {
        var action = stackReverse.pop();
        action.execute();
        stackNormal.push(action);
    }
}
