import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.List;

public class Numbers {

    public static void Number() throws IOException {

        File file = new File("C:\\Users\\nasss\\java.csv");
        List<String> list = Files.readAllLines(file.toPath());
        DecimalFormat phoneNum = new DecimalFormat("###-###-####");

        int i = 1;

        for (String line : list)
        {
            System.out.println("Номер телефона №" + i++ + ": " + String.valueOf(line).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
        }

    }
}
