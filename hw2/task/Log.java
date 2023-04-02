package hw2.task;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    static {
        try (FileInputStream in = new FileInputStream("log.config")) { // полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param className
     * @return
     */
    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
