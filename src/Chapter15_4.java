
public class Chapter15_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            // ThreadSample�N���X�̃C���X�^���X�𐶐�
            Chapter15_ThreadSample ts = new Chapter15_ThreadSample(i);
            // Thread�N���X�̃C���X�^���X���쐬
            Thread thread = new Thread(ts);
            // Thread�N���X��start���\�b�h���Ăяo��
            thread.start();
        }

        for (int i = 1; i <= 3; i++) {
            try {
                // Thread.sleep�́A�w�肵���~���b�ԃX���[�v���郁�\�b�h
                Thread.sleep(1000);
                // 1000�~���b�i1�b�j�ԃX���[�v���ă��b�Z�[�W��\��
                System.out.println("Chapter15_4�̃X���b�h : " + i + "���");
            // Thread.sleep�̗�O����
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
