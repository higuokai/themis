package themis.terminal.console;

import themis.terminal.model.Brush;

import java.io.PrintStream;

/**
 *  控制台输出
 * @author guokai
 * @version 1.0
 */
public class ConsoleBrush implements Brush {

    private PrintStream printStream;

    public ConsoleBrush() {
        this.printStream = System.out;
    }

    @Override
    public void println(String message) {
        printStream.println(message);
    }
}
