
public class Chapter15_ThreadSample implements Runnable {
    int num;

    // �R���X�g���N�^
    public Chapter15_ThreadSample(int num) {
        this.num = num;
    }

    // run���\�b�h���쐬
    // Chapter15_4�Ɠ����悤�Ƀ��[�v���Ƃ�1�b�ԃX���[�v���ĕ\��
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                // Thread.sleep�́A�w�肵���~���b�ԃX���[�v���郁�\�b�h
                Thread.sleep(1000);
                // 1000�~���b�i1�b�j�ԃX���[�v���ă��b�Z�[�W��\��
                System.out.println("ThreadSample "+ this.num +"�̃X���b�h : " + i + "���");
            // Thread.sleep�̗�O����
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}