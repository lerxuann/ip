package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.exception.DukeException;
import duke.task.Task;

public class ListCommand extends Command {
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        for (int i = 1; i <= taskList.getLength(); i++) {
            Task t = taskList.getTask((i-1));
            System.out.format("%d. " + t.toString() + "\n", i);
        }
    }
}