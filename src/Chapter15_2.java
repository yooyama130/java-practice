import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Chapter15_2 {
    public static void main(String[] args) throws IOException {
        FileSystem fs = FileSystems.getDefault();
        // PathクラスのインスタンスをFileSystem.getPathメソッドで生成
        Path inputPath = fs.getPath("resources/input.txt");
        Path outputPath = fs.getPath("resources/output.txt");

        // Java7以降に追加された「try-with-resources」文で処理
        // Filesクラスを使用して、BufferedReaderクラスのインスタンスを生成
        BufferedReader br = new BufferedReader(new FileReader("resources/input.txt"));
        // Filesクラスを使用して、BufferedWriterクラスのインスタンスを生成
        BufferedWriter bw = new BufferedWriter(new FileWriter("resources/output.txt"));
        try (br; bw;) {

            String line = null;
            // BufferedReader.readLineメソッドを使用して、1行づつ処理
            // 読み込む行がなくなるまでループ
            while ((line = br.readLine()) != null) {
                // 文字数が5以外の場合はスキップ
                if (line.length() != 5) {continue;}
                // 読み込んだ1行を出力
                bw.write(line);
                // 改行がついてないので改行を出力
                bw.newLine();
            }

        // 例外処理を記述
        // printStackTraceで例外を出力
        } catch (IOException e)  {
        	e.printStackTrace();  // スタックトレースを出力する
        } finally {
            System.out.println("出力処理終了");
        }
    }
}