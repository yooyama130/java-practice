public class Chapter09_Car {
    // �R��iKm/L�j
    private double fuelCost;
    // �c�ʁiL�j
    private double fuelAmount;

    // �R���X�g���N�^���쐬
    public Chapter09_Car(double fuelCost, double fuelAmount){
    	this.fuelCost = fuelCost;
    	this.fuelAmount = fuelAmount;
    }

    // move���\�b�h
    // �E"xx km ����܂�"���o��
    // �E�c�ʂ��v�Z
    public void move(double kilometer) {
    	// --------------------��蕶�Ŏw�肳��Ă��炸�A�Ǝ��ŋL�q��������------------------------------------
    	// ����R���ƔR���c�ʂ��r���A�R���c�ʂ�����ꍇ�́u����܂���v�Əo��
    	if (kilometer / this.fuelCost > fuelAmount) {
    		System.out.println("�R�������肸�A���邱�Ƃ��o���܂���");
    		return;
    	}
    	// --------------------��蕶�Ŏw�肳��Ă��炸�A�Ǝ��ŋL�q�������́i�����܂Łj------------------------------------
    	System.out.println(kilometer + "km ����܂�");
    	this.fuelAmount -=  kilometer / this.fuelCost; 
    }

    // fuelAmount���擾���郁�\�b�h���쐬
    public double getFuelAmount(){
    	return this.fuelAmount;
    }
}