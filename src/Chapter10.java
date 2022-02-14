import java.sql.SQLException;

public class Chapter10 {
    public static void main(String[] args) {

        try {
            int array[] = { 1, 3, 5 };
            validIndex(array, 2);
            validIndex(array, 3);

            System.out.println("validIndex�̌Ăяo���I��");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException���������܂���");
            e.printStackTrace();
        }

        // try-catch�����L�q
        // �EthrowSQLException���\�b�h���Ăяo��
        // �ESQLException���L���b�`���āA���b�Z�[�W�ƃX�^�b�N�g���[�X���o��
        // �E"throwSQLException�̌Ăяo���I��"�̃��b�Z�[�W���o��
        try {
        	throwSQLException(); 	
        }catch (SQLException e) {
            System.out.println("SQLException���������܂���");
            e.printStackTrace();    
        } finally {
            // ��O�������Ă��o�͂��邽�߁Afinally�u���b�N�ɋL�q
            System.out.println("throwSQLException�̌Ăяo���I��");
        }
        
        System.out.println("main���\�b�h�I��");
    }

    // validIndex���\�b�h���쐬
    // �Eindex��array�̃T�C�Y�͈͓̔��Ȃ�A�C���f�b�N�X�̗v�f���o��
    // �E�T�C�Y�͈̔͊O�Ȃ�AIllegalArgumentException���X���[
    public static void validIndex (int[] array, int index) {
    	if (index >= array.length) {
    		throw new IllegalArgumentException(index + "�̓T�C�Y�͈̔͊O�ł�");
    	}
    	System.out.println("�C���f�b�N�X" + index + "�̗v�f��"+ array[index] +"�ł�");
    	System.out.println(array.length);   	
    }

    public static void throwSQLException() throws SQLException {
        throw new SQLException("SQL�G���[�ł�");
    }
}