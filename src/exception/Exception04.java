package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
    public static void main(String[] args) {
        try {
            Exception04.readFile("exception.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException��O������");
        }
        System.out.println("�v���O�����I��");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        System.out.println("�t�@�C���̓ǂݍ��݊J�n");
        FileReader fr = new FileReader(fileName);
        System.out.println(fileName + "�̓ǂݍ��݊���");
    }
}