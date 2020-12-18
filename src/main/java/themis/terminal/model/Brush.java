package themis.terminal.model;

/**
 * 打印
 */
public interface Brush {

    public void println(String message);

    public static enum Mode {

        OFF,
        CONSOLE,
        FILE;

        private Mode() {}

    }

}
