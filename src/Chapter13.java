import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13 {
    public static void main(String[] args) {
        // MobilePhone�C���X�^���X�𐶐�
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
        mobilePhone.takePicture();
        Chapter13.staticCall(mobilePhone, "99-8888-7777");
        mobilePhone.powerOff();

        // flyingPhone�C���X�^���X�𐶐�
        Chapter13_FlyingPhone flyingPhone = new Chapter13_FlyingPhone(5);
        flyingPhone.fly();
        Chapter13.staticCall(flyingPhone, "000-1111-2222");
        flyingPhone.powerOff();
    }

    public static void staticCall(Phone phone, String number) {
        phone.call(number);
    }
}