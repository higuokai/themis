package themis.terminal.readline;

import themis.terminal.console.ConsoleBrush;
import themis.terminal.model.Brush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author guokai
 * @version 1.0
 */
public class ReadLineProcessor {

    public void readLine() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Brush brush = new ConsoleBrush();
        String line = "";
        while ((line = br.readLine()) != null) {
            // 将line给后续处理线程处理,  记录再次输入,但不响应
            if ("telnet".equals(line)) {
                brush.println("telnet >");
            } else if ("ssh".equals(line)) {
                brush.println("~root:> ");
            } else if ("exit".equals(line)) {
                break;
            } else {
                brush.println(line);
            }
        }


    }

    public static void main(String[] args) throws Exception {
        ReadLineProcessor readLineProcessor = new ReadLineProcessor();
        readLineProcessor.readLine();
    }

}
