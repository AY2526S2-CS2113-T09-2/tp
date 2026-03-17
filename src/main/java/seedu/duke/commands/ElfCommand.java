//@@author Kiri
package seedu.duke.commands;

import seedu.duke.data.child.Name;
import seedu.duke.data.elf.Elf;
import seedu.duke.data.exception.IllegalValueException;

/**
 * Represents a command to add an elf to the list.
 * Coding refers to ChildCommand part
 */
public class ElfCommand extends Command {
    public static final String MESSAGE_SUCCESS = "Ho ho ho! New elf added: %1$s";
    private final Elf toAdd;
    
    /**
     * @param name Name of the elf to be created.
     * @throws IllegalValueException If the name is invalid.
     */
    public ElfCommand(String name) throws IllegalValueException {
        this.toAdd = new Elf(new Name(name));
    }
    
    /**
     * Adds the elf to the list and returns success message.
     * @return Success feedback string.
     */
    @Override
    public String execute() {
        elfList.add(toAdd);
        return String.format(MESSAGE_SUCCESS, toAdd);
    }
}
//@@Kiri
