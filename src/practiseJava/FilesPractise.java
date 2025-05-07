package practiseJava;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FilesPractise {

    public static void main(String[] args) {
        File file=new File("/tmp/tariff-tales");
       List<String> files= List.of(file.list());


    }
}
