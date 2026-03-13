package seedu.ClausControl;

//@@author shrabasti-c-reused
//Reused from https://www.geeksforgeeks.org/advance-java/unit-testing-of-system-out-println-with-junit/
// with minor modifications
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreSystemOut() {
        System.setOut(originalOut);
    }

    @Test
    public void main_displaysWelcomeAtBeginning_True() {
        // Call the method that uses System.out.println()
        Main.main(new String[]{});

        // Capture and verify the output
        String expectedOutput = Main.LOGO + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}
//@@author
