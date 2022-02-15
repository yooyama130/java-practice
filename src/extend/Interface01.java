package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

        System.out.println("ìdòbî‘çÜÇÕç≈ëÂ" + MobilePhone.MAX_NUMBER_DIGITS + "åÖÇ≈Ç∑ÅB");
        mobilePhone.call("99-8888-7777");
        Interface01.classTakePicture(mobilePhone);
    }

    public static void classTakePicture(Camera camera) {
        camera.takePicture();
    }
}
