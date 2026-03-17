//@@Kiri
package seedu.duke.data.elf;
// similar to child class,

public class ElfTask {
    private String task;
    // no specific constrains to elf task
    public ElfTask(String task) {
        this.task = task;
    }
    
    public String getTask() {
        return task;
    }
    
    public void editTask(String newtask) {
        this.task = newtask;
    }
    
}
//@@Kiri
