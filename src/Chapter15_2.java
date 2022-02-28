import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter15_2 {
    public static void main(String[] args) throws IOException {
        FileSystem fs = FileSystems.getDefault();
        // Path�N���X�̃C���X�^���X��FileSystem.getPath���\�b�h�Ő���
        Path inputPath = fs.getPath("resources/input.txt");
        Path outputPath = fs.getPath("resources/output.txt");

        // Java7�ȍ~�ɒǉ����ꂽ�utry-with-resources�v���ŏ���
        // Files�N���X���g�p���āABufferedReader�N���X�̃C���X�^���X�𐶐�
        BufferedReader br = Files.newBufferedReader(inputPath);
        // Files�N���X���g�p���āABufferedWriter�N���X�̃C���X�^���X�𐶐�
        BufferedWriter bw = Files.newBufferedWriter(outputPath);
        try (br; bw;) {

            String line = null;
            // BufferedReader.readLine���\�b�h���g�p���āA1�s�Â���
            // �ǂݍ��ލs���Ȃ��Ȃ�܂Ń��[�v
            while ((line = br.readLine()) != null) {
                // ��������5�ȊO�̏ꍇ�̓X�L�b�v
                if (line.length() != 5) {continue;}
                // �ǂݍ���1�s���o��
                bw.write(line);
                // ���s�����ĂȂ��̂ŉ��s���o��
                bw.newLine();
            }

        // ��O�������L�q
        // printStackTrace�ŗ�O���o��
        } catch (IOException e)  {
        	e.printStackTrace();  // �X�^�b�N�g���[�X���o�͂���
        } finally {
            System.out.println("�o�͏����I��");
        }
    }
}