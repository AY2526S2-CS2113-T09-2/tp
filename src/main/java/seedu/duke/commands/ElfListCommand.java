//@@author Kiri
package seedu.duke.commands;

/**
 * Represents a command to list all elves in the elf list.
 */
public class ElfListCommand extends Command {
    
    /**
     * Executes the command to display all elves.
     * * @return A formatted string of all elves or an empty list message.
     */
    @Override
    public String execute() {
        
        if (elfList == null || elfList.isEmpty()) {
            return "The elf list is empty!";
        }
        StringBuilder sb = new StringBuilder("Here are all elf:\n");
        for (int i = 0; i < elfList.size(); i++) {
            sb.append((i + 1)).append(". ").append(elfList.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
    
}
//@@Kiri
