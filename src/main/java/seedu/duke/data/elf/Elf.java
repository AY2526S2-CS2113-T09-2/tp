//@@author Kiri
package seedu.duke.data.elf;

import seedu.duke.data.child.Name;

/**
 * Represents an Elf in the system with a name and an optional task.
 * Coding refers to Child part
 */
public class Elf implements ReadOnlyElf {
    private Name name;
    private ElfTask task;
    
    /**
     * @param name The name of the elf.
     */
    public Elf(Name name) {
        this.name = name;
        this.task = null;
    }
    
    @Override
    public Name getName() {
        return name;
    }
    
    @Override
    public ElfTask getTask() {
        return task;
    }
    
    @Override
    public String toString() {
        String taskStatus = (task == null) ? "no task" : task.toString();
        return name.toString() + " (Task: " + taskStatus + ")";
    }
    
    /**
     * Assigns a specific task to the elf.
     * @param task The task to be assigned.
     */
    public void setTask(ElfTask task) {
        this.task = task;
    }
}
//@@Kiri
