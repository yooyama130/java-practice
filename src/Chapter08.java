public class Chapter08 {
	public static void main(String[] args) {
		//1.�uwhile�v��
		//�E1�ȏ�5�����̐���2����o��
		System.out.println("--------1.�uwhile�v��-------");
		int num1 = 1;
		while(num1 < 5) {
			//2�悷��ipow(x,y)��x��y����v�Z����j�������^�ɂȂ�̂ŁAint�^��
			System.out.println((int)Math.pow(num1, 2));
			num1++;
		}
		//2. �ʏ�ufor�v��
		//�v�f����4�́uint�v�z���������	
		System.out.println("--------2.�ʏ�ufor�v��-------");		
		int[] array = {1, 2, 3, 4};
		//�E�z��̃T�C�Y�����[�v���āA�v�f���o��
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//3. �g���ufor�v��
		System.out.println("--------3.�g���ufor�v��-------");				
		//�E�u2.�v�̔z������[�v�A�v�f�̒l�������̏ꍇ�́Acontinue���ŏ������X�L�b�v�A��̏ꍇ�͏o��
		for(int num3 : array) {
			if (num3 % 2 == 0) {
				continue;
			}
			System.out.println(num3);
		}
		
		

	}
}
