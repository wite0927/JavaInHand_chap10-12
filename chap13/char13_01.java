package chap13;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class char13_01 {
    // p.268 예외처리 예제
    public static void main(String[] args) {
        /*
            main

            FileReader file = new FileReader("a");

            FileNotFoundException 발생
        */
        try {
            FileReader file = new FileReader("a");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
